package by.belhard.j20.lessons.lesson07.exceptions;

public class ExceptionExample {

  public int div(int a, int b) {

    int result = 0;

    result = a / b;
    /*try {
      result = a / b;
//      String[] strings = new String[1];
//      System.out.println(strings[2]);
    } catch (ArithmeticException | NullPointerException e) {
      e.printStackTrace();
//      System.exit(0);
      return -1;
    } catch (Exception e) {
      System.err.println();
    } finally {
      return -2;
    }*/

    return result;
  }
}
