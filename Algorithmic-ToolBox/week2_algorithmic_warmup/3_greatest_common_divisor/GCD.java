import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
    int current_gcd = 1;
    for(int d = 2; d <= a && d <= b; ++d) {
      if (a % d == 0 && b % d == 0) {
        if (d > current_gcd) {
          current_gcd = d;
        }
      }
    }

    return current_gcd;
  }

  private static int fast_gcd(int a, int b) {
    int divisor = a>=b?a:b;
    int divident = a<=b?a:b;
    while(divisor != 0) {
      int remainder = divident%divisor;
      divident = divisor;
      divisor = remainder;
    }
    return divident;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(fast_gcd(a, b));
  }
}
