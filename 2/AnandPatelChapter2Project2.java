public class AnandPatelChapter2Project2 {
  public static void main(String[] args){
   EasyReader e = new EasyReader();
   
   //Project for converting fahrenheit to celsius
   
   System.out.println("Input temperature in the unit of fahrenheit");
   double f = e.readDouble();
   System.out.println("Temperature in degrees Celsius:"+((f-32)*(5.0/9.0)));
    
    System.out.println("Input temperture in the unit of celsius");
    double c = e.readDouble();
    System.out.println("Temperature in degrees Fahrenheit:"+ (c*1.8+32));
    
   
    
  }
}