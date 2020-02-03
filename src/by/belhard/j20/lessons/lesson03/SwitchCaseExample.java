package by.belhard.j20.lessons.lesson03;

public class SwitchCaseExample {

    public static void main(String[] args) {

        int q = 4;
        String result;

        switch (q) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                /*result = "WEEKENDS";
                break;*/
            case 7:
                result = "WEEKENDS";
                break;
            default:
                result = "bad input";
                break;
        }

        System.out.println(result);
    }
}
