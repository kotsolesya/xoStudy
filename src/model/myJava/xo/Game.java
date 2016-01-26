package myJava.xo;

public class Game {

	private Player[] players;
	private Field field;
	private String name;
	
public Game(final Player[] players,
			final Field field,
			final String name) {
		this.players = players;
		this.field = field;
		this.name = name;
	}

public Player[] getPlayers() {
	return players;
}

public Field getField() {
	return field;
}

public String getName() {
	return name;
}

}
