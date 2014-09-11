public class AnandPatelChapterProject3{
  public static void main(String[] args){
 EasyReader e = new EasyReader();
 
 System.out.println("What's your principle?");
 double p = e.readDouble();
    
 System.out.println("What's your interest rate?");
 double r = e.readDouble();
 
 System.out.println("What's your number of times the interest is compounded yearly?");
 double n = e.readDouble();
 
 double tenamount = p*(Math.pow((1+(r/n)),(n*10)));
 System.out.println("The amount for 10 years:"+(tenamount));
 
 double fifthteenamount = p*(Math.pow((1+(r/n)),(n*15)));
 System.out.println("The amount for 15 years:"+(fifthteenamount));
 
 double twentyamount = p*(Math.pow((1+(r/n)),(n*20)));
 System.out.println("The amount for 20 years:"+(twentyamount));
  
  
    
  }
}