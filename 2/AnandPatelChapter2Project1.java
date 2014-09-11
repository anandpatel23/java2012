public class AnandPatelChapter2Project1 {
  public static void main(String[] args){
   
    EasyReader e = new EasyReader();
    System.out.println("Length?");
    double length = e.readDouble();
    
    System.out.println("Width?");
    double width = e.readDouble();
    
   
    System.out.println("Perimeter:"+(2*length+2*width));
    System.out.println("Diagonal:"+Math.sqrt(length*length+width*width));
    System.out.println("Area:"+(length*width));
    
          
  }
  
}