public class AnandChapter3AssignmentsAnandJoeAyro {
  public static void main(String [] args){
   
    EasyReader e = new EasyReader();
    
    System.out.println("Type in your age");
    int age = e.readInt();
    
    if (age == 17)
      System.out.println("time for your drivers test!");
    else if (age >=62)
      System.out.println("Time to get your social security check!");
    
    
  }
  
  
}