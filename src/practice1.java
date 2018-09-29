import java.util.*;
public class practice1 {
    public static void main(String[] args) {

        //Max int: 2147483647
        //Min int: -2147483648
        Scanner r = new Scanner(System.in);
        String in = r.nextLine();
        String[] nums = in.split(" ");
        for (String o : nums) {
            System.out.print(o + " ");
        }
        System.out.println();

        // 10 5 + 2 3 - - 2 *
    }
    
    void calculate(String[] arr) {
        int pot = 0; 
        for(int i= 0;i<arr.length;i+=3){
            if(!arr[i-2].equals("[0-2147483647]")){
                
            }
        }

    }
}
