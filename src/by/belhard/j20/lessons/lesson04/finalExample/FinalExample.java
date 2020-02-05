package by.belhard.j20.lessons.lesson04.finalExample;

import by.belhard.j20.lessons.lesson04.objectsExamples.Country;
import by.belhard.j20.lessons.lesson04.objectsExamples.Person;

public class FinalExample {

  public static void main(String[] args) {

    final int a = 5;

    //    a = 10;

    final Person person1 =
        new Person("Vasily", new Country("Belarus", 220113));

//    person1 = new Person("VasilyAnother", person1.getCountry());

    person1.setName("Gennady");
    person1.setCountry(new Country("Khazakhstan", 123));
  }
}
