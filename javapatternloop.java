import java.util.*;

public class javapatternloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number loop pattern :");
        int w = sc.nextInt();
        for (int g = 0; g <= w; g++) {
            for (int h = 0; h < g; h++) {
                System.out.print(h);
            }
            System.out.println(" ");
        }
    }
}
