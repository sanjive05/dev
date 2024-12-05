package core.java.oops.guessgame;

public class Game {
	int expectedGuess;
	Player p1,p2,p3;
	public Game(String name1,String name2 ,String name3) {
		 this.p1 = new Player(name1);
		 this.p2 = new Player(name2);
		 this.p3 = new Player(name3);	
	}
	public boolean checkWinner() {
		if(p1.guess==expectedGuess) {
			System.out.println("p1 is the winner ");
			return true;
		}
		if(p2.guess==expectedGuess) {
			System.out.println("P2 is the winner");
			return true;
		}
		if(p3.guess==expectedGuess) {
			System.out.println("P3 is the winner");
			return true;
		}
		return false;
	}
	public void start() {
		System.out.println("Welcome "+p1.name+ "  "+p2.name+"   "+p3.name );
		expectedGuess = (int)Math.random()*10;
		while(true) {
			p1.makeGuess();
			p2.makeGuess();
			p3.makeGuess();
			boolean someOnewins = checkWinner();
			if(someOnewins) {
				System.out.println("Game over...");
				break;
			}
			else {
				expectedGuess = (int)Math.random()*10;
			}
		}
		
	}

}
