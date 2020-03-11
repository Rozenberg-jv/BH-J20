package by.belhard.j20.lessons.lesson13.syncExample;

public class Counter {

  private int i = 0;

  public int getI() {

    return i;
  }

  public synchronized void inc() {

    this.i++;
  }
  /*public void inc() {

    synchronized (Counter.class) {
      this.i++;
    }
  }*/
}
