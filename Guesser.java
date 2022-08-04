import java.util.Scanner;

public class Guesser {
	
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
	
				

	}
	public int provideMagicNumbers(int maxNum) {
		int num = 0;
		while(num == 0) {
			System.out.println("Guesser Please provide Magic number between 1 to " + maxNum);
			if(sc.hasNextInt()) {
				num = sc.nextInt();
				if(num > maxNum) {
					num = 0;
				}
			}else {
				if(sc.hasNext() && sc.next().contains("done")) {
					if(num == 0) {
						System.out.println("Guesser Please provide Magic number between 1 to "+ maxNum);
					}else {
						return num;
					}
				}
				System.out.println("please enter only numbers");
			}
		}
		return num;
	}

}
