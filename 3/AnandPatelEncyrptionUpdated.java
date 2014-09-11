public class AnandPatelEncyrptionUpdated{
  public static void main(String[] args){
   EasyReader e = new EasyReader();
   String message = e.readLine(); //"ABCDEFGHIJ";
   String out = "";
   
   int m = message.length();
   int h = m%5;
   int amount = 5-h;
   
   if(amount !=5) {
     for(int d=0; d<amount; d++){
      message = message +"$"; 
       
     }
     
   }
    String chunk = "";
    for(int x=0; x<message.length(); x=x+5){
     chunk = message.substring(x,x+5);
     
     for(int i = chunk.length()-1; i>=0;i--)
       out = out + chunk.substring(i,i+1);
    }
    System.out.println(out);
  }
  
}