package lesson_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(rezultMath(4, 3, 2, 1));
        System.out.println(rezult10_20(10, 5));
        plusMinus(-54);
        System.out.println(minus0(5));
        printName("Вова");
        System.out.println(kubik());

    }

    public static int rezultMath(int a, int b, int c, int d) {
        int rezult;
        rezult = a * (b + (c / d));
        return rezult;

    }

    public static boolean rezult10_20(int a, int b) {
        int x;
        x = a + b;
        if (x >= 10 && x <= 20) {
            return true;
        } else return false;
    }

    public static void plusMinus(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else System.out.println("Число " + a + " отрицательное");
    }

    public static boolean minus0 (int a) {
        return a < 0;
    }

    public static void printName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static int kubik() {
        int x;
        int a = 1 + (int) (Math.random() * 6);
        int b = 1 + (int) (Math.random() * 6);
        x = a + b;
        return x;


    }

}
