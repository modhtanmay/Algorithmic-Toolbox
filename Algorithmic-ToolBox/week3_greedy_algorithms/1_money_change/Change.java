import java.util.Scanner;
import java.util.Vector;

public class Change {
    static int deno[] = {1,5,10};
    static int n = deno.length;
    private static int getChange(int m) {
        //write your code here
        Vector<Integer> ans = new Vector<>();

        for(int i=n-1;i>=0;i--) {
            while(m>=deno[i]) {
                m = m-deno[i];
                ans.add(deno[i]);
            }
        }
        return ans.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

