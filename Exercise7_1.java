package ObjectOrientedProgramming;

class YahoDeck {
    final int CARD_NUM = 20;
    YahoCard[] cards = new YahoCard[CARD_NUM];
    // YahoDeck에서 YahoCard를 저장할 공간만 생성한 것
    // 아직 인스턴스(객체)가 생성된 것은 아니다.

    YahoDeck() {

        // YahoDeck을 초기화하여 객체를 불렀을 때 값을 넣어주는 작업
        // 즉, 빈 방만 있는 cards에 값들을 넣어주는 작업
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);

            cards[i] = new YahoCard(num, isKwang);
        }

    }

    void shuffle() {
        // 섞는 횟수를 카드 배열의 2배로해서 충분히 섞는다.
        for (int x = 0; x < cards.length * 2; x++) {
            // (Math.random() * cards.length)는 카드의 범위 내의 임의의 숫자를 뽑는다.
            int i = (int) (Math.random() * cards.length);
            int j = (int) (Math.random() * cards.length);
            // 카드를 섞는다.
            YahoCard temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;

        }
    }

    YahoCard pick(int index) {
//      index의 유효성을 검사해야한다. 
        if (index < 0 || index > CARD_NUM)
            return null;

        return cards[index];
    }

    YahoCard pick() {
//        내가 한 풀이
//        return cards[(int) (Math.random() * 20) + 1];
//        1. index는 0부터 배열의 범위안까지라 +1을 안해줘도 된다.
//        2. 20은 하드코딩! 대신에 card.length를 써준다.

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
