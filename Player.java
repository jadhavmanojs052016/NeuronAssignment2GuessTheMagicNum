import java.util.Scanner;

public class Player {
	Scanner sc = new Scanner(System.in);
	public int score = 0;
	public String name = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int provideYourGuess(String name, int maxNum) {
		int num = 0;
		while(num == 0) {
			System.out.println("Player " + name + ", Please guess the magic number between 1 to "+ maxNum);
			if(sc.hasNextInt()) {
				num = sc.nextInt();
				if(num > maxNum) {
					num = 0;
				}
			}else {
				if(sc.hasNext() && sc.next().contains("done")) {
					if(num == 0) {
						System.out.println(" Please guess Magic number between 1 to "+ maxNum);
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
