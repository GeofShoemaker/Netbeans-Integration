import java.util.*;

public class Second{

    public static void main(String args[]) {
        Scanner r = new Scanner(System.in);
        int[] t = new int[6];
         System.out.println("\nInput\n");
        for (int i = 0; i < 6; i++) {
            t[i] = r.nextInt();
        }
        int i=0;
        for (i = 1; t1(t, i) < t2(t, i); i++) {

        }
       
    }

    static double log2(double a) {
        return Math.log(a) / Math.log(2);
    }

    static double t1(int[] arr, int num) {
        return (arr[0]* Math.pow(num, 2)) + (arr[1]* Math.pow(num, 1)) + (arr[2]* Math.pow(num, 0));
    }

    static double t2(int[] arr, int num) {
        return arr[3] * num * log2(num) + arr[4] * num + arr[5];
    }

}
