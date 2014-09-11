public class AnandPatelChapter3BProject4redo{
  public static void main(String[] args){
   EasyReader e = new EasyReader();
   
   System.out.println("Type in a number:");
   int x = e.readInt();
   int mod = x % 2;
  
   //even or odd
   if(mod == 0)
     System.out.println(x + " is even.");
   else
     System.out.println(x + " is odd.");
   //finding factors
   int ctr = 0; 
   for(int f = 1; f<=x-1; f++)
   if (x%f == 0){
      ctr+=f;
    System.out.println(f +" is a factor of " + x);
   }
   //prime or not 
   if(ctr==2)
     System.out.println(x + " is prime.");
   else
     System.out.println(x + " is not prime.");
  //perfect number?
   if(ctr == x)
     System.out.println(x + " is a perfect number.");
   else
     System.out.println(x + " is not a perfect number.");
  }
   
  }