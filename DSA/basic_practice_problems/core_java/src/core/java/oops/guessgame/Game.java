package core.java.oops.guessgame;

public class Game {
	int expectedGuess;
	Player p1,p2,p3;
	public Game(String name1,String name2 ,String name3) {
		Player p1 = new Player(name1);
		Player p2 = new Player(name2);
		Player p3 = new Player(name3);	
	}
	public void start() {
		System.out.println("Welcome "+p1.name+ "  "+p2.name+"   "+p3.name );
		expectedGuess = (int)Math.random()*10;
		
	}

}
