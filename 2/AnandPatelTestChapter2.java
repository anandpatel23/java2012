public class AnandPatelTestChapter2 {
  
  public static void main(String[] args){
   
    EasyReader e = new EasyReader();
    System.out.print("Diameter");
    double diameter = e.readDouble();
    System.out.print("Height");
    double height = e.readDouble();
    
    double radius = diameter / 2;
    double volume = 3.14*Math.pow( radius , 2 )* height;
    
    System.out.print("A diameter of " + diameter + " and a height of " + height + " produces a cylinder volume of " + volume);
    
    
  }
  
}