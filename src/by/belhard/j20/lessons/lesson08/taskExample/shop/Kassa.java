package by.belhard.j20.lessons.lesson08.taskExample.shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

class Kassa {

  private final Map<String, Integer> assortment;

  private Integer total = 0;

  Kassa(Map<String, Integer> assortment) {

    this.assortment = assortment;
  }

  void start() {

    try (BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in))) {

      String[] line = rdr.readLine().split(" ");

      while (!line[0].equals("buy")) {

        if (assortment.containsKey(line[0])) {
          total += assortment.get(line[0]) * Integer.parseInt(line[1]);
        } else {
          System.out.println("No such good");
        }

        line = rdr.readLine().split(" ");
      }

      System.out.println("Total sum: " + total + " r.");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
