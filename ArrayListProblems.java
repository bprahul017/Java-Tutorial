import java.util.ArrayList;

public class ArrayListProblems {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList();

        food.add("Pizza");
        food.add("Bred");
        food.add("Juice");

        food.set(0,"Jam");
        food.remove(1);

        for (int i = 0; i <food.size() ; i++) {
            System.out.println(food.get(i));
        }

        ArrayList<String> amount= new ArrayList();
        amount.add("100.0 Rs");
        amount.add("200.0 Rs");

        ArrayList<ArrayList<String>> prizeList=new ArrayList();
        prizeList.add(food);
        prizeList.add(amount);

        System.out.println(prizeList);
    }
}
