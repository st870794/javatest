package ch03;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hit = 0, total = 0;
		
		while(true){
			/*float x = (float)Math.random()
			 *����random�d��b0~1����
			 */
			float x = (float)Math.random() * 2 - 1; // �ܦ�-1~1����
			float y = (float)Math.random();
			if(x * x + y * y <= 1){//��(x^2+y^2)<1�Y�b���ꤺ
				hit++;
			}
			total++;
			System.out.println((float)hit / (float)total *4.0f + ", �`���禸�ơG[" + total + "]");
				
		}
	}

}
