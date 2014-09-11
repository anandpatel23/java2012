public class AnandPatelPairofDice{
 private int dice1;
 private int dice2;
  
  
 public AnandPatelPairofDice(){
   roll();   
 }
 
 //Assigne both dice1 and dice2 a random INTEGER ranging from 1 to 6
 //return the SUM of dice1 and dice2
 public int roll(){
   int sum=0;
   dice1= (int)(Math.random()*6+1)  ;
   dice2= (int)(Math.random()*6+1) ;
   sum = dice1+dice2 ;
   
   return sum;
 }
 
 
 //if BOTH dice1 AND dice2 are both ONES, return TRUE, else return FALSE
 public boolean isSnakeEyes(){
   boolean temp = false;
   if (dice1 == 1 && dice2 == 1)
     temp = true;
   else
     temp = false;
     return temp;
 }
  
 
 //find the SUM of dice1 and dice2, DO NOT ROLL AGAIN
 //if the SUM is 7 return true, else return false
 public boolean isSeven(){
   boolean temp = false;
   if (dice1 + dice2 == 7)
     temp = true;
   else
     temp = false;
   
   return temp;
 }
 
  
}