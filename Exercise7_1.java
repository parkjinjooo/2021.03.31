package ObjectOrientedProgramming;

class YahoDeck {
    final int CARD_NUM = 20;
    YahoCard[] cards = new YahoCard[CARD_NUM];
    // YahoDeck���� YahoCard�� ������ ������ ������ ��
    // ���� �ν��Ͻ�(��ü)�� ������ ���� �ƴϴ�.

    YahoDeck() {

        // YahoDeck�� �ʱ�ȭ�Ͽ� ��ü�� �ҷ��� �� ���� �־��ִ� �۾�
        // ��, �� �游 �ִ� cards�� ������ �־��ִ� �۾�
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new YahoCard(num, isKwang);
        }

    }

    void shuffle() {
        // ���� Ƚ���� ī�� �迭�� 2����ؼ� ����� ���´�.
        for (int x = 0; x < cards.length * 2; x++) {
            // (Math.random() * cards.length)�� ī���� ���� ���� ������ ���ڸ� �̴´�.
            int i = (int) (Math.random() * cards.length);
            int j = (int) (Math.random() * cards.length);
            // ī�带 ���´�.
            YahoCard temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;

        }
    }

    YahoCard pick(int index) {
//      index�� ��ȿ���� �˻��ؾ��Ѵ�. 
        if (index < 0 || index > CARD_NUM)
            return null;

        return cards[index];
    }

    YahoCard pick() {
//        ���� �� Ǯ��
//        return cards[(int) (Math.random() * 20) + 1];
//        1. index�� 0���� �迭�� �����ȱ����� +1�� �����൵ �ȴ�.
//        2. 20�� �ϵ��ڵ�! ��ſ� card.length�� ���ش�.

        int index = (int) Math.random() * cards.length;
        return pick(index);
    }

}

class YahoCard {
    int num;
    boolean isKwang;

    YahoCard() {
        this(1, true);
    }

    YahoCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_1 {
    public static void main(String[] args) {
        YahoDeck deck = new YahoDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }

        System.out.println();
        System.out.println(deck.pick(0));

    }
}
