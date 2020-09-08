package ch03;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hit = 0, total = 0;
		
		while(true){
			/*float x = (float)Math.random()
			 *此時random範圍在0~1之間
			 */
			float x = (float)Math.random() * 2 - 1; // 變成-1~1之間
			float y = (float)Math.random();
			if(x * x + y * y <= 1){//√(x^2+y^2)<1即在單位圓內
				hit++;
			}
			total++;
			System.out.println((float)hit / (float)total *4.0f + ", 總實驗次數：[" + total + "]");
				
		}
	}

}
