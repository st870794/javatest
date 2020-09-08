package ch03;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=2;
		while(j < 10){
			for(int i = 1; i <10; i ++){//for(1;2;3)1放初始條件2放繼續執行條件3執行後行為
				System.out.print(j + "X" + i + "=" + j*i + " ");
			
			}
			System.out.println(); // 換行
			j++; // J遞增才能跳出迴圈
		}
		
	}

}
