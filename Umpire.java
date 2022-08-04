import java.util.Arrays;

public class Umpire {
	
	public static void main(String[] args) {
		int maxNum = 10;
		Guesser g = new Guesser();
		int magicNum = g.provideMagicNumbers(maxNum);
		System.out.println("Magic Number is : " + magicNum);
		Player manoj = new Player();
		Player naveen = new Player();
		Player hyder = new Player();
		Player nitin = new Player();
		int manojScore,naveenScore,hyderScore,nitinScore = 0;
		
		int manojGuess = manoj.provideYourGuess("Manoj",maxNum);
		System.out.println("Manoj Guesss number is : " + manojGuess);
		manojScore = maxNum-Math.abs(manojGuess-magicNum);
		manoj.name = "Manoj";
		manoj.score = manojScore;
		
		int naveenGuess = naveen.provideYourGuess("Naveen",maxNum);
		System.out.println("Naveen Guesss number is : " + naveenGuess);
		naveenScore = maxNum-Math.abs(naveenGuess-magicNum);
		naveen.name = "Naveen";
		naveen.score = naveenScore;

		int hyderGuess = hyder.provideYourGuess("Hyder", maxNum);
		System.out.println("Hyder Guesss number is : " + hyderGuess);
		hyderScore = maxNum-Math.abs(hyderGuess-magicNum);
		hyder.name = "Hyder";
		hyder.score = hyderScore;
		
		int nitinGuess = nitin.provideYourGuess("Nitin", maxNum);
		System.out.println("Nitin Guesss number is : " + nitinGuess);
		nitinScore = maxNum-Math.abs(nitinGuess-magicNum);
		nitin.name = "Nitin";
		nitin.score = nitinScore;
		
		
		Player[] sortedPlayers = {manoj,naveen,hyder,nitin};
		Arrays.sort(sortedPlayers, (a,b) -> b.score - a.score);
		System.out.println("*******************Leader board is as below ***********************");
		for (Player player : sortedPlayers) {
			System.out.println(player.name + " score is : " + player.score);
		}
		
		System.out.println("*******************First Two players will play Final ***********************");
		
		magicNum = g.provideMagicNumbers(maxNum);
		
		Player[] finalist = {sortedPlayers[0],sortedPlayers[1]};
		Player f0 = finalist[0];
		f0.score = maxNum - Math.abs(f0.provideYourGuess(f0.name, maxNum) - magicNum);
		
		Player f1 = finalist[1];
		f1.score = maxNum - Math.abs(f1.provideYourGuess(f1.name, maxNum) - magicNum);
		
		Player[] winners = {f0,f1};
		Arrays.sort(winners, (a,b) -> b.score - a.score);
		
		System.out.println("*******************Leader board is as below ***********************");
		for (Player player : winners) {
			System.out.println(player.name + " score is : " + player.score);
		}
		
		System.out.println("*******************Winner of this game is ***********************");
		System.out.println(winners[0].name);
		

	}

}
