import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

  public int a;
  public int b;

  private Menu() {
  }

  public static void menu() {
    Menu menu = new Menu();
    boolean b = true;
    while (b) {
      System.out.println("Виберіть дію" + "\n" + "1 - Ввести дані" + "\n" + "2 - Непарні і парні"
          + "\n" + "3 - Суми" + "\n" + "4 - Найбільше непарне та парне" + "\n" + "0 - Вихід");
      switch (Checker.check()) {
        case 1:
          menu.putInterval();
          break;
        case 2:
          OddsOperations.outOdds(menu);
          System.out.println();
          EvenOperations.outEven(menu);
          break;
        case 3:
          OddsOperations.outOddsSum(menu);
          System.out.println();
          EvenOperations.outEvenSum(menu);
          break;
        case 4:
          Fibonacci.biggestOdd(menu);
          System.out.println();
          Fibonacci.biggestEven(menu);
          break;
        case 0:
          b = false;
          break;
        default:
          System.out.println("Відсутня опція");
          break;
      }
    }
  }

  private void putInterval() {
    System.out.println("Перше число");
    this.setA(Checker.check());
    System.out.println("Друге число");
    this.setB(Checker.check());
    System.out.println(this.toString());
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  @Override
  public String toString() {
    return "Menu{" +
        "a=" + a +
        ", b=" + b +
        '}';
  }
}

//  public static void outOdds(int a, int b) {
//    int sum = 0;
//    int[] mas = new int[b];
//
//    for (int i = a; i < b; i++) {
//      if (i % 2 != 0) {
//        System.out.println(i + " ");
//        sum += i;
//        System.out.println(sum);
//      }
//    }
//    for (int i = a; i < b; i++) {
//      if (i % 2 == 0) {
//        System.out.print(i + " ");
//        sum += i;
//        System.out.print(sum + " ");
//      }
//    }
//  }

