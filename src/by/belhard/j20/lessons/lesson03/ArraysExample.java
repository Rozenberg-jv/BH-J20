package by.belhard.j20.lessons.lesson03;

public class ArraysExample {

    public static void main(String[] args) {

        int[] array = new int[5];

        /*array[0] = 1;
        array[2] = 41;
        array[3] = -11;
        array[4] = 100;*/

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        System.out.println("123");

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

        System.out.println(array);

        String[] stringsArray = {"one", "two", "three", "four", "five", "six"};

        for (String s : stringsArray) {
            if ("three".equals(s))
                continue;
            System.out.println(s);
        }
    }
}
