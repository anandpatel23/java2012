public class AnandPatelSurvey{
  public static void main(String [] args){
     
    EasyReader e = new EasyReader();
     
    String[] ans = new String[5];
    int[] tally = new int[5];
    ans[0] = "0-a";
    ans[1] = "1-b";
    ans[2] = "2-c";
    ans[3] = "3-d";
    ans[4] = "4-e";
    
    //Use while loop to ask question and fill in answer
    //array
    tally[0] = 0;
    tally[1] = 0;
    tally[2] = 0;
    tally[3] = 0;
    tally[4] = 0;
    
    System.out.println("What kind of candy is your favorite?");
    for(int x = 0; x < ans.length; x++)
      System.out.println(ans[x]);
   
   int choice = e.readInt();

    
    while( choice >=0 && choice <=4 ){
      //tally here using choice
      tally[choice]++;
      
      
      // provide options (array) display
  for(int x = 0; x < ans.length; x++)
      System.out.println(ans[x]);
   
  //ask the question
         System.out.println("What kind of candy is your favorite?");
          choice = e.readInt();
      
      
    }
    
    //display the contents of your answers, choices
    //tell how many of each option (answer)
    
 
      for(int x = 0; x<tally.length;x++)
      System.out.println(ans[x] + " " + tally[x]);
    }
     
    
  }