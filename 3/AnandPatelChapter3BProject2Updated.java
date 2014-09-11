public class AnandPatelChapter3BProject2Updated{
  public static void main(String[] args){
   EasyReader e = new EasyReader();
   
   System.out.println("Type in a string ");
   
   String S = e.readLine();
   
   //spaces
   System.out.println(S.length());
   int ctr = 0;
   String sum = "";
   
   //separate lines
   String temp = "";
   for(int x = 0; x < S.length(); x++){
     temp = S.substring(x,x+1);
     System.out.println(temp);
     if(temp.equals(" ")){
       ctr++;
     }
     //backwards
     sum = temp + sum;
   }
   
   System.out.println("the number of spaces is " + ctr);
   System.out.println("the string backwards is -----" + sum);
    
    
    
    
  }
}