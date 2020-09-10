/**
 *guess number
 */
import java.util.Scanner;
public class Test03 {
    public static void main(String[] args){
        float number =(float)Math.random();
        number *= 100.0f;
        int num = (int)number;
        
        // boolean flag =true;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        boolean flag = true;
        while(flag){
            
            int guess = scanner.nextInt();
            if(guess == num){
                    System.out.println("Correct!");
                    flag = !flag; //switch from true to false
                }
            else{
                if(guess < num){
                    System.out.println("Too small!");
                }
                else{
                    System.out.println("Too large!");
                }
                count++;
                System.out.println("already guess: " + count + " times");
            }
        if(count == 10){
            System.out.println("Game Over!!");
            flag = !flag;
        }
        }

    }
    
}
