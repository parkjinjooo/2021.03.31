package ObjectOrientedProgramming;

public class Exercise6_6 {

    static double getDistance(int x, int y, int x1, int y1) {
        // �� ��(x, y)�� (x1, y1)�� �Ÿ��� ���ϴ� ������ ((x - x1)���� + (y-y1)����)��Ʈ�̴�.
        // ������ ����� Math.sqrt(double a)�� ����ϸ� �ȴ�.
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));

    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }

}
