import java.util.*;
public class stack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        printStack(stack);
        stack.push("Middle");
        printStack(stack);
        stack.push("Top");
        printStack(stack);
        
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        stack.pop();
        printStack(stack);
        //int x = 5 8 +;
        
    }
    static void printStack(Stack<String> s)
    {
        if(s.isEmpty())
            System.out.println("You have nothing in your stack.");
        else{
            System.out.printf("%s TOP\n",s);
        }
    }
    
    
}
 