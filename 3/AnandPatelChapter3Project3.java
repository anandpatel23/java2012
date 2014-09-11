public class AnandPatelChapter3Project3 {
  public static void main(String[] args){
    EasyReader e = new EasyReader();
    
    System.out.println("Type in an integer from -100 to 100");
    int x = e.readInt();
    
    if (x < 100 && x > -100){
     if (x < 0)
      System.out.println("Your number is negative.");
     if (x > 0)
      System.out.println("Your number is positive.");
     if (x  == 0)
      System.out.println("Your number is zero.");
     if (x%2 == 0)
      System.out.println("Your number is even.");
      else 
      System.out.println("Your number is odd.");
    }
    else {
      System.out.println("Your number is not in the qualified range, please use a number that is between -100 and 100.");
      
    }
    
    
   
        
  }
  
}