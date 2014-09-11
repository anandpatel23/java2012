public class PairOfDiceDriver{
  public static void main(String args[]){
    int amount = 0;
    AnandPatelPairofDice p = new AnandPatelPairofDice();
    for(int x=0; x<100; x++){
      amount = p.roll();
      System.out.println("You rolled a " + amount + " SNAKE EYES: " + p.isSnakeEyes() + " IS SEVEN " + p.isSeven());
      

    }
  
  }
}