package Numbers;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int number = 100 + random.nextInt(899);
		System.out.println(number);
	}
}
