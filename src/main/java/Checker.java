import java.util.InputMismatchException;
import java.util.Scanner;

public class Checker {

  public static int check() {
    try {
      return new Scanner(System.in).nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Невірний ввід");
      return check();
    }
  }

}