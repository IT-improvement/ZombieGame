package game;

public class Game {

	private Game() {

	}

	private static Game instance = new Game();

	public Game getInstance() {
		return instance;
	}
	
	public void run() {
		
	}
}
