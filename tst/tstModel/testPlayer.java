package tstModel;

import static org.junit.Assert.*;




import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Figure;
import model.Player;

public class testPlayer {

	@Test
	public void testGetName()  throws Exception {
		final String inputValue = "Slava";
		final String expectedValue = inputValue;
		
		final Player player= new Player(inputValue, null);
		
		final String actualValue = player.getName();
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testGetFigure()  throws Exception {
	
		final Figure inputValue = Figure.X;
		final Figure expectedValue = inputValue;
		
		final Player player= new Player(null, inputValue);
		
		final Figure actualValue = player.getFigure();
		
		assertEquals(expectedValue, actualValue);
		
		
	}

}
