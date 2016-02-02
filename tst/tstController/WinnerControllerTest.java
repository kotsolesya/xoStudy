package tstController;

import java.awt.Point;


import org.junit.Test;

import controller.WinnerController;
import model.Field;
import model.Figure;;



public class WinnerControllerTest {

	@Test
	public void testGetWinner() throws Exception {
		final WinnerController winnerContriller = new WinnerController();
		final Field field = new Field(3);
		field.setFigure(new Point(0,0), Figure.X );
		field.setFigure(new Point(0,1), Figure.X );
		field.setFigure(new Point(0,2), Figure.X );
		
		
		
	}

}
