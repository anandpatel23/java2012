public class Ayro332 {
  public static void main(String[] args){
   EasyReader e = new EasyReader();
   System.out.println("Type in your?");
   int length = e.readInt();
   
   int Area = length*4;
   
   if (Area >81)
     System.out.println("Your Area is greater than 81");
   else if (Area <=81)
     System.out.println("Your Area is not greater than or equal to 81");
    
  }
  
}