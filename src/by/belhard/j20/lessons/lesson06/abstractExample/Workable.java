package by.belhard.j20.lessons.lesson06.abstractExample;

public interface Workable {

  int a = 5;

  void doWork();

  void notDoWork();

  static void printName(String name) {
    System.out.println(name);

  }

  default String objToString() {

    privateMethod();

    return "q";
  }

  private void privateMethod() {
    System.out.println("private");
  }
}
