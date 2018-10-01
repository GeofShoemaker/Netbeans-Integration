import java.util.*;
public class Third {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        //Max int: 2147483647
        //Min int: -2147483648
        Scanner r = new Scanner(System.in);
        String in = r.nextLine();
        String[] n = in.split(" ");
        for(String o:n)
            nums.add(o);
        System.out.println(calculate(nums));
        

        // 10 5 + 2 3 - - 2 *
    }
    
    static int calculate(ArrayList<String> arr) {
        
        while(arr.size()>1){
            int x = Integer.parseInt(arr.get(0));
            int y = Integer.parseInt(arr.get(1));
            String op = arr.get(2);
            if(op.equals("*"))
                x*=y;
            if(op.equals("+"))
                x+=y;
            if(op.equals("-"))
                x-=y;
            arr.set(0,Integer.toString(x));
            arr.remove(1);
            arr.remove(2);
            System.out.println(arr);
        }
        
       return 0;

    }
    
}
