import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Dice dice =new Dice();
    }
}


class Dice{

  Dice(){
      Random random = new Random();
      int number=0;
      number=roll(random,number);
      System.out.printf("%d",number);
  }

  int roll(Random random, int number){
      return number=random.nextInt(6)+1;
  }
}
