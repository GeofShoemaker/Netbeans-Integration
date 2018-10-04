import java.util.*;
public class Sixth {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        String num = r.nextLine();
        if(num.startsWith("0"))
            System.out.println("INVALID");
        else
            System.out.println(Integer.valueOf(num,2)%3==0?"YES":"NO");
    }
}
