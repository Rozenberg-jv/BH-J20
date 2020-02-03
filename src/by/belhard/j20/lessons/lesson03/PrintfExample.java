package by.belhard.j20.lessons.lesson03;

public class PrintfExample {

    public static void main(String[] args) {

        String name = "MaximMaximMaximMaxim";

        System.out.printf("I am %d years old. My name is %10.10s.", 30, name);

        System.out.println();


        int n = 9;
        int gap = n - 1;
        String result;

        for (int i = 1; i <= n; i++) {
            result = "";
            for (int g = 0; g < gap; g++) {
                result += " ";
            }
            for (int j = 0; j < i; j++) {
                result += i + " ";
            }
            System.out.println(result);
            gap--;
        }
    }
}
