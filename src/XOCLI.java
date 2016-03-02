import model.Field;
import model.Figure;
import model.Game;
import model.Player;
import view.ConsoleView;

public class XOCLI {

	public static void main(String[] args) {
	
		final String name1 = "Olesya";
		final String name2 = "Batman";
		
		final Player[] players = new Player[2];
		players[0]= new Player(name1, Figure.X);
		players[1]= new Player(name2, Figure.O);
		
		final Game gameXO = new Game(players, new Field(3),"XO");
		final ConsoleView consoleView = new ConsoleView();
		consoleView.show(gameXO);
		while (consoleView.move(gameXO)){
			consoleView.show(gameXO);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
