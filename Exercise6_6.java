package ObjectOrientedProgramming;

public class Exercise6_6 {

    static double getDistance(int x, int y, int x1, int y1) {
        // 두 점(x, y)와 (x1, y1)의 거리를 구하는 공식은 ((x - x1)제곱 + (y-y1)제곱)루트이다.
        // 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));

    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }

}
