public class AnandChapter3Assignment2AnandJoeAyro {
  public static void main(String [] args){
   EasyReader e = new EasyReader(); 
   int Type = e.readInt();
   int ans = (Type % 5);

   
   if (ans == 0)
     System.out.println("Your lucky number is a multiple of 5");
   else 
     System.out.println("Your lucky number is not a multiple of 5");
   
  }}