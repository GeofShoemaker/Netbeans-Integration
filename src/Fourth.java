import java.util.*;
public class Fourth {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Input");
        String e =reader.nextLine();
        e=e.replaceAll("\\s+","");
        String[] l = e.split("");
        System.out.println();
        System.out.println(post(l));
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
        String full= nums.pop();
        for(int i=0;i<s.length;i++){
            if(isLetter(s[i]))
                nums.push(s[i]);
            else {
                String a = nums.pop();
                String b = nums.pop();
                String c = s[i];

                if(doesNeedPar(s,i))
                    nums.push("("+b+c+a+")");
                else
                    nums.push(b+c+a);
            }
        }
        return full+"\n"+nums.pop();
    }

    static boolean doesNeedPar(String[] s,int p){
        if(isAS(s[p]))
            if(isMD(findNext(s,p)))
                    return true;
        return false;
    }

    static boolean isLetter(String s){
        char c = s.charAt(0);
        return (c>='a'&&c<='z')||(c>='A'&&c<='Z');
    }
    static String findNext(String[] s, int p){
        for(int i=p+2;i<s.length;i++)
            if(!isLetter(s[i]))
                return s[i];
        return "";
    }
    static boolean isMD(String s){
        return s.equals("*")||s.equals("/");
    }
    static boolean isAS(String s){
        return s.equals("+")||s.equals("-");
    }
}



