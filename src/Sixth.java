import java.util.*;
public class Sixth {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        String num = r.nextLine();
        if(num.startsWith("0"))
            System.out.println("INVALID");
        else{
            int x = Integer.valueOf(num,2);
            System.out.println(x%3==0?"YES":"NO");
        }
    }
}
