public class AnandPatelFibonacci{
  public static void main(String args[]){ 
    //Ask the user which fibonacci number he/she would like
    EasyReader e = new EasyReader();
    int pos = e.readInt();
    
    
    

   int A = 0;
    int B = 1;
    //use a while loop to complete the swiching
    //3. Repeat the one less than the number of times given by user
      //  a. Tmp ? B
        //b. B ? A + B
        //c. A ? Tmp
     //4. A contains the correct value
int Temp = 0;
while(pos > 0){
      Temp = B;
      B = A + B;
      A = Temp;
      pos--;
}
      
      System.out.println(A);
    
    
  }
}