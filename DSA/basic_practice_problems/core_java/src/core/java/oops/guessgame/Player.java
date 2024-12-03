package core.java.oops.guessgame;

public class Player {
	String name;
	int guess;
	public Player(String name) {
		this.name = name;
	}
	public void makeGuess() {
		int n=(int) (Math.random()*10);
		System.out.println(name+" is guessing "+n);
	}
}
