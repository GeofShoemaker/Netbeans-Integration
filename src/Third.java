
import java.util.*;

public class Third {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String e =reader.nextLine();
        System.out.println(eval(e));
    }
    static int eval(String eq) {
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner r = new Scanner(eq);

        while (r.hasNext()) {
            if (r.hasNextInt()) 
                nums.add(r.nextInt());
             else {
                String operator = r.next();
                int x = nums.remove(nums.size()-2);
                int y = nums.remove(nums.size()-1);
                if (operator.equals("*")) 
                    nums.add(x * y);
                 else if (operator.equals("+")) 
                    nums.add(x + y);
                 else if (operator.equals("-")) 
                    nums.add(x - y);
                 else 
                    nums.add(x / y);
            }
        }
        return nums.remove(0);
    }
}
