import java.util.*;
public class practice2 {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int min = r.nextInt();
        int max = r.nextInt();
        for(int i=0;i<Math.pow(2, min);i++){
             String l="%0"+min+"d";
            System.out.printf(l,Integer.valueOf(Integer.toString(i,2)));
            System.out.println();
        }
        if(min!=max){
            for(int i=0;i<Math.pow(2, max);i++){
             String l="%0"+max+"d";
            System.out.printf(l,Integer.valueOf(Integer.toString(i,2)));
            System.out.println();
        }
        }
                
    }
    
}
