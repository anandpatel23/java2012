public class AnandPatelChapter3Exam{
  public static void main(String args[]){ 
    //Ask the user to guess a number between 1 and 20, if the number is outside 
    // of the range, give them a message and end the program
    //if the guess is in range
    //generate a random integer between 1 and 20, inclusive
    // if the random number EXACTLY matches the user's guest,
    //     tell them they won $10, use their name
    // BUT if the random number is at MOST 2 away from the user's guest,
    //     tell the user they won $5, use their name
    // if the user doesn't win any money tell them they lost, use name

   EasyReader e = new EasyReader();
    
   System.out.println("Type in a number between 1 and 20");
    int x = e.readInt(); // (int)(Math.random()*20+1);
   
    if (x<20 && x >1){
      int computer = 7;// (int)(Math.random()*20+1);
   
      System.out.println("The number the computer generated is " + computer);
    if (x == computer)
           System.out.println("You've won $10!");
         else if (computer - 2 == x  || computer + 2 ==x || computer -1 == x || computer +1 == x)
           System.out.println("You've won $5!");
         else 
           System.out.println("You've won nothing and you lost.");
    }
    else 
      System.out.println("The number is outside the range.");
  
  }
}