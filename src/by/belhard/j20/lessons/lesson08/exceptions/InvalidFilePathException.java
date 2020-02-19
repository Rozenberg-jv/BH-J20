package by.belhard.j20.lessons.lesson08.exceptions;

public class InvalidFilePathException extends Exception {

  public InvalidFilePathException() {
  }

  public InvalidFilePathException(String message) {
    super(message);
  }
}
