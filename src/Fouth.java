import java.util.*;
public class Fouth {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        //String post="";
        System.out.println("Input");
        String e =reader.nextLine();
        String[] l = e.split("");
        System.out.println("\nOutput\n"+post(l));
      
       
    }
    static String post(String[] s){
        
        Stack<String> nums = new Stack<>();
        
        for(int i=0;i<s.length;i++){
            if(isLetter(s[i]))
                nums.push(s[i]);
            else {
                String a = nums.pop();
                String b = nums.pop();
                String c = s[i];
                nums.push("("+b+c+a+")");
            }
            
        }
        return nums.pop();
    }
    static boolean isLetter(String s){
        char c = s.charAt(0);
        return (c>='a'&&c<='z')||(c>='A'&&c<='Z');
    }
    String removePar(String s){
        return s;
    }
}

    

