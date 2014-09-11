import java.util.*;
public class AnandPatelPostFixCalc{
  public static void main(String agrs[]){ 
    
    EasyReader e = new EasyReader();
    ArrayList<String> stack = new ArrayList<String>();
 

   //get the expression from the user, NNNOOO spaces guys
   String exp = e.readWord();
   for(int x=0; x < exp.length(); x++){
     
    String c = exp.substring(x,x+1); 
     
    //if c is + , then pop, pop + push
    if(c.equals("+")){
      
     String first = stack.remove(stack.size()-1);
     String second = stack.remove(stack.size()- 1);
     int ans = Integer.parseInt(first) + Integer.parseInt(second);
     stack.add(ans + "");
     
    } else if(c.equals("-")){
    String first = stack.remove(stack.size()-1);
     String second = stack.remove(stack.size()- 1);
     int ans = Integer.parseInt(second) - Integer.parseInt(first);
     stack.add(ans + "");
    }
    else if(c.equals("*")){
    String first = stack.remove(stack.size()-1);
     String second = stack.remove(stack.size()- 1);
     int ans = Integer.parseInt(first) * Integer.parseInt(second);
     stack.add(ans + "");
    }
    else if(c.equals("/")){
     String first = stack.remove(stack.size()-1);
     String second = stack.remove(stack.size()- 1);
     int ans = Integer.parseInt(second) / Integer.parseInt(first);
     stack.add(ans + "");
    }
    
   else{
    //you are a number
     stack.add(c);
     
   }
   }
   //after loop is done, get answer from the stack
   System.out.println("The answer to " + exp + " is " + stack.get(0));
  
  
   }}