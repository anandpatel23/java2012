public class AnandPatelChapter2Project4 {
  public static void main(String[] args){
   
    EasyReader e = new EasyReader();
    
    System.out.println("Input x1:");
    double x1 = e.readDouble();
    
    System.out.println("Input y1:");
    double y1 = e.readDouble();
    
    System.out.println("Input x2:");
    double x2 = e.readDouble();
    
    System.out.println("Input y2:");
    double y2 = e.readDouble();
    
    double distance = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
    System.out.println("Distance:"+distance);
    
    double slope = (y1-y2)/(x1-x2);
    System.out.println("Slope:"+slope);
    
    double midpointX = (x1+x2)/2;
    double midpointY = (y1+y2)/2;
    System.out.println("Midpoint:" + midpointX + "," + midpointY);
    
  }
  
}