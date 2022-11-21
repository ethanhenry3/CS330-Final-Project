package CS331;

import java.util.Random;

public class SecurityDevice {

	protected int unlock;
	protected int lock;
	
	public SecurityDevice() {
		unlock = 952384;
		lock = 952381;
	}
	public static void main(String[]args) {
		boolean a = true;
		int c = 0;
		Random r = new Random();
		SecurityDevice key = new SecurityDevice();
		
		do {
			try {
			int randNum = r.nextInt(1000000000);
			
			if (Integer.toString(randNum).toLowerCase().contains(Integer.toString(key.lock).toLowerCase())) {
					System.out.println("Locked");
					System.out.println(randNum);
					break;
			}
			if(Integer.toString(randNum).toLowerCase().contains(Integer.toString(key.unlock).toLowerCase())) {
					System.out.println("Unlocked");
					System.out.println(randNum);
					break;
			}
			c++;
			} catch(Exception e) {
				System.out.println("Never Found");
			}
		}while(a);
		System.out.println("It takes " + c + " seconds to crack the pin");
	}
	
}


