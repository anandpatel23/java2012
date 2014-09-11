public class AnandPatelChapter3Project1 {
  public static void main (String[] args){
   EasyReader e = new EasyReader();
    
    
   System.out.println("Type in the number of questions answered correctly");
   double c = e.readDouble();
   
   System.out.println("Type in the number of questions total");
   double q = e.readDouble();
   
   double grade = (c/q)*100;
   System.out.println(grade);
   
   if (grade >=95)
     System.out.println("You got an A+");
   else if (grade < 95 && grade>= 90)
     System.out.println("You got an A or a "+ grade + " in numbers.");
   else if (grade <90 && grade>=85)
     System.out.println("You got a B+ or a "+ grade+ " in numbers.");
   else if (grade <85 && grade>=80)
     System.out.println("You got a B or a "+grade+" in numbers.");
   else if (grade <80 && grade>=75)
     System.out.println("You got a C+ or a  "+grade+" in numbers.");
   else if (grade <75 && grade>=70)
     System.out.println("You got a C or a "+grade+" in numbers.");
   else if (grade <70 && grade>=65)
     System.out.println("You got a D or a "+grade+" in numbers.");
   else if (grade <65)
     System.out.println("YOU FAIL or a " + grade + " in numbers.");
    
    
    
  }
  
  
  
}