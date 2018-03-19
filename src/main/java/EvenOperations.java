public class EvenOperations {

  public static void outEven(Menu menu) {
    int a = menu.getA();
    int b = menu.getB();
    int sum = 0;
    for (int i = a; i < b; i++) {
      if (i % 2 == 0) {
        System.out.print(i+ "," + " ");
      }
    }

  }
  public static void outEvenSum(Menu menu) {
    int a = menu.getA();
    int b = menu.getB();
    int sum = 0;
    for (int i = a; i < b; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println("Сума парних " + sum);
  }
}

