public class StringManipulation{
  public static void main(String args[]){ 
    String n = "My name is Mr. Lobur";
    System.out.println(n.length());
    System.out.println(n.substring(6));
    String sum = "";
    for(int x=0; x < n.length(); x++){
      String temp = n.substring(x, x+1 );
      sum = sum + temp;
    }
  System.out.println(sum);
    
    
    
  }
}