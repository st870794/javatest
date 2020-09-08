package ch03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float number = (float)Math.random();
		number *= 1000.0f;
		
		int num = (int)number;
		
		Scanner scanner = new Scanner(System.in);

		while(true)
			{			
			int guess = scanner.nextInt();
	
			if(guess > num){
				System.out.println("too large!");
			}
			else if(guess < num){
				System.out.println("too small!");
			}
			else{
				System.out.print("correct!");
				break;
			}
		}		
	}

}
