package tst;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import myJava.xo.Field;
import myJava.xo.Figure;

public class FieldTest {
	@Test
	public void testGetSize() throws Exception {
		final Field field = new Field();
		
		assertEquals(3, field.getSize());
	}

	@Test
	public void testSetFigure() throws Exception {
		final Field field = new Field();
		final Point inputPoint = new Point(0,0);
		final Figure inputFigure = Figure.O;
		
		field.setFigure(inputPoint, inputFigure);
		final Figure actualFigure = field.getFigure(inputPoint);
		
		assertEquals(inputFigure, actualFigure);
	}
	
}
