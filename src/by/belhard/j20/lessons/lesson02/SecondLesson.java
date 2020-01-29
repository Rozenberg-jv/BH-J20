package by.belhard.j20.lessons.lesson02;

public class SecondLesson {

    public static void main(String[] args) {

        byte b1;

        b1 = 127;

        byte b2 = 2;

//        byte b3 = b1 + b2;
        byte b3 = (byte) (b1 + b2);

        System.out.println(b3);

        long l1 = 25000000000L;

        float f1 = 2.1f;

        char c1 = 'A';
        char c2 = 99;

        System.out.println((int) c1);
        System.out.println(c2);
        System.out.println((char) ('a' + 2));

        int a = 1;
        System.out.println(a++);
        System.out.println(a);

        System.out.println(15 / 0.0);

        System.out.println(15 != 15);
        boolean b = 15 == 15;
        System.out.println(b);
    }
}
