import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(101);
          System.out.println("Liczba: " + randomNumber);
            int squaredNumber = randomNumber * randomNumber; 
          System.out.println("Kwadrat liczby: " + squaredNumber);
            sum += squaredNumber;
        }
        System.out.println("Suma kwadratów liczb: " + sum);
    }
}