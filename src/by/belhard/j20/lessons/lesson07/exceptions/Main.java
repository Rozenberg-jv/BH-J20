package by.belhard.j20.lessons.lesson07.exceptions;

public class Main {

  public static void main(String[] args) {

    ExceptionExample exceptionExample = new ExceptionExample();

    int res = 0;

//    try {
      res = exceptionExample.div(5, 0);
    /*} catch (ArithmeticException e) {
      System.err.println("ERROR");
      res = 100;
    }*/

    System.out.println(res);
  }
}
