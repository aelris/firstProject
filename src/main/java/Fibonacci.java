public class Fibonacci {

  public int sumEven;
  public int sumOdd;
  public static int biggestOdd(Menu menu) {
    int b = menu.getB();
    int i = b;
    if (i % 2 != 0) {
      System.out.print("Найбільше непарне " + i);
    } else {
      System.out.println("Найбільше непарне " + (i - 1));
    }
    return b;
  }

  public static int biggestEven(Menu menu) {
    int b = menu.getB();
    int i = b;
    if (i % 2 == 0) {
      System.out.print("Найбільше парне " + i);
    } else {
      System.out.println("Найбільше парне " + (i - 1));
    }
    return b;
  }

  public void fibo(Menu menu) {
    int n = Checker.check();

    for (int i = 0; i < n; i++) {
      int f2 = biggestEven(menu);
      int f1 = biggestOdd(menu);
      int f3 = f1 + f2;
      f1 = f2;
      f2 = f3;
    }

  }

  static void percentageFibinacci(int sumEven, int sumOdd) {
    double sum = sumEven + sumOdd;
    double onePercent = sum / 100;
    System.out.println("Відсоток суми парних чисел фібоначі: " + onePercent * sumEven);
    System.out.println("Відсоток суми непарних чисел фібоначі: " + onePercent * sumOdd);
  }
  public int getSumEven() {
    return sumEven;
  }

  public void setSumEven(int sumEven) {
    this.sumEven = sumEven;
  }

  public int getSumOdd() {
    return sumOdd;
  }

  public void setSumOdd(int sumOdd) {
    this.sumOdd = sumOdd;
  }

}
