import java.util.function.BinaryOperator;
import java.util.Arrays;
import java.util.List;

public class LambdaSample {
  private static final List<String> NAMES = Arrays.asList("Apple", "Orange", "Lemon");

  private static final List<Integer> NUMBERS = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

  public static void main(String[] args) {
    example1();
    example2();
    example3();
    example4();
  }

  // Lambda expression example for forEach
  private static void example1() {
    System.out.println("---- example1 ----");

    NAMES.stream().forEach(e -> {
      System.out.println(e);
    });
  }

  // Method reference example for forEach
  private static void example2() {
    System.out.println("---- example2 ----");

    NAMES.stream().forEach(System.out::println);
  }

  // Lambda expression example for reduce
  private static void example3() {
    System.out.println("---- example3 ----");

    BinaryOperator<Integer> plus = (a, b) -> Integer.sum(a, b);
    int result = NUMBERS.stream().reduce(plus).get();

    System.out.println("result = " + result);
  }

  // Lambda expression example for reduce
  private static void example4() {
    System.out.println("---- example4 ----");

    int result = NUMBERS.stream().reduce(Integer::sum).get();

    System.out.println("result = " + result);
  }
}
