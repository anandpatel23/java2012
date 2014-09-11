public class NestingLoops{
  public static void main(String args[]){ 
     
    for(int y=1; y<=5; y++){
      for(int x=1; x<=y; x++)
        System.out.print(x);
      System.out.println();
    }
  
  }
}