import java.util.Random;
import java.util.Scanner;

/**
 * Created by QAPC3 on 13.05.2017.
 */
public class Lol {
    public static void main(String[] args) {
        int countYar = 0;
        int countMi =0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String secondName = sc.nextLine();
        for(int a=0; a<10; a++) {
            int i = random.nextInt(6) + 1;
            if (i <= 3) {
                countYar++;
                System.out.println(firstName + " Хуй ");
            } else {
                countMi++;
                System.out.println(secondName + " хуй ");
            }

        } if(countMi>countYar){
            System.out.println(firstName + " супер хуй "+ countMi+" раз!");
        }
        else {
            System.out.println(secondName + " супер хуй "+ countYar+" раз!");
        }
    }
}
