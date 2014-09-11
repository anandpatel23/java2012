public class AnandPatelChapter4AProject1{
  public static void main(String[] args){
   
    int[] numbers = new int[100];
    
    //fill up array
    for(int x =0; x < numbers.length; x++)
    numbers[x] = (int)(Math.random()*20+1);
   
    //sum them up
    double sum = 0;
    for(int x =0; x < numbers.length; x++){
      sum = sum + numbers[ x ];
    }
    double ave = sum / numbers.length ;
    System.out.println("The average is " + ave);
    
    
    //find smallest and largest number in array
      int small = Integer.MAX_VALUE; //largest value an integer can hold
      int big = Integer.MIN_VALUE; //
   
      for(int x =0; x < numbers.length; x++){
      //IF, next number smaller than 'small'
        //then new small is that numebr
       if(numbers[x] < small)
         small = numbers[x];
      }
      System.out.println(small);
      
      for(int x =0; x < numbers.length; x++){
      //IF, next number is bigger than 'big'
      //then new big is that number
        if(numbers[x] > big)
         big = numbers[x];
      }
    System.out.println(big);

    
  }
}