/*
 * Encryption
 * 
 * 1 . Get message
 *       String, 7-15 char
 *  2. normalize message $
 *        Chunks are a multiple of 5
 * 3. Reverse chunks of size 5
 * 4. Spit out encrypted message
 * 
 * 
 * I like ham and cheese.$$$
 * kil Imahe DNA seehc $$$.e
 * 
 * while loop, keep on adding until mod by 5 equals 0
 * 
 * chunk = mess.substring(y,y+5)
 * *\
 *\
 */

public class AnandPatelEncryption{
  public static void main(String [] args){
  
    EasyReader e = new EasyReader();
    String message = e.readLine();
    String out = "";
    
    String chunk = "";
    for(int x = 0; x < message.length(); x=x+5){
      chunk = message.substring(x,x+5);
     //reverse chunk, contatenate it onto the end of OUT 
      
    }
  int x = message.length();
  System.out.println(x);
  while(!(x%5 = 0)){
   int d = "$"; 
  }
  System.out.print(out);
  
  
  
  
  
  
  
  
  
  
  
  
 
  
} 
}