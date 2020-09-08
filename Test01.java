package ch03;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math = 60, chn = 75;
		int total, average;
		
		total = math + chn;
		average = total / 2;
		System.out.println("總分是:" + total + ", 平均是:" + average);
		
		int salary = 27000;
		double rate = 0.03;
		int tax;
		tax = (int)(salary * rate);
		System.out.println(tax);
	}

}
