/**
 *guessnumber
 */
import java.util.Scanner;
public class Test03 {
    public static void main(String[] args){
        float number =(float)Math.random();
        number *= 100.0f;
        int num = (int)number;
        
        // boolean flag =true;
        Scanner scanner = new Scanner(System.in);
        int count = 5;
        while(count > 0){
            
            int guess = scanner.nextInt();
            if(guess == num){
                    System.out.println("Correct!");
                    //flag = !flag; //switch from true to false
                    break;
                }
            else{
                if(guess < num){
                    System.out.println("Too small!");
                    count--;
                    System.out.println("remaining: " + count + " times");
                }
                else{
                    System.out.println("Too large!");
                    count--;
                    System.out.println("remaining: " + count + " times");
                }
            }
        }
        while(count == 0){
            System.out.println("Game Over!!");
            break;
        }
    }
    
}
