
public class AnandPatelGCD{
  public static void main(String [] args){
    EasyReader e = new EasyReader();
    
    //Ask the user for two integers, A and B 
    int A = e.readInt();
    int B = e.readInt();
    
     int t = 0;
   while (B!=0){
     t = B;
     B = A%B;
     A = t;
   }
   
   System.out.println("The GCD is " + A);
    
    
    
  }
  
  
}