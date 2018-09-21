import java.util.*;

public class First{

	public static void main(String[] args) {
		Scanner r= new Scanner(System.in);
		//False = Left, True = Right
		boolean x1= false,x2=false,x3=false;
		System.out.println("\nInput\n");
        String[] seq = r.nextLine().split("");
        int i=0;
        for(i=0;i<seq.length-1;i++){
        	if(seq[i].equals("A")){
        		if(x1)
        			x2=!x2;
        		x1=!x1;
        	}
        	else{
        		if(!x3)
        			x2=!x2;
        		x3=!x3;
        	}
        }
        if(seq[i].equals("A"))
        	System.out.println(x1&&x2?"\nOutput\n\nACCEPTED!":"\nOutput\n\nREJECTED!");
        else
        	System.out.println(x3||(!x3)&&x2?"\nOutput\n\nACCEPTED!":"\nOutput\n\nREJECTED!");
	}
}

