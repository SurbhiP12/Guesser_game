package spriya;
import java.util.Scanner;
class Guesser
{
	int gnum;
	int guessingNum()
	{
		System.out.println("Guesser,kindly guess the number!");
		Scanner scan =new Scanner(System.in);
		gnum=scan.nextInt();
		return gnum;
	}
}
class Player
{
	int pnum;
	int predictingNum()
	{
		System.out.println("player,kindly guess the number!");
		Scanner scan =new Scanner(System.in);
		pnum=scan.nextInt();
		return pnum;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessingNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.predictingNum();
		numFromPlayer2=p2.predictingNum();
		numFromPlayer3=p3.predictingNum();
	}
	void compare()
	{
		if(numFromPlayer1==numFromGuesser)
		{
			System.out.println("player1 has won the game.");
		}
		else if(numFromPlayer2==numFromGuesser)
		{
			System.out.println("player2 has won the game.");
		}
		else if(numFromPlayer3==numFromGuesser)
		{
			System.out.println("player3 has won the game.");
		}
		else
		{
			System.out.println("Game Over.Try Again");
		}
	}
}
public class GuesserGameApp {

	public static void main(String[] args) {
	Umpire u=new Umpire();
	u.collectNumFromGuesser();
	u.collectNumFromPlayers();
	u.compare();
	}

}
