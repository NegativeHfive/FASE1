
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random =  new Random();
        int randomNumber = random.nextInt(10);
        
        List<Integer> numbers = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            numbers.add(i);
        }

        System.out.println(numbers);


    }
}
