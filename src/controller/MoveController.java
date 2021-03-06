package controller;

import java.awt.Point;



import model.exception.AlreadyOccupiedException;
import model.exception.InvalidPointException;
import model.Field;
import model.Figure;

public class MoveController {
	public void applyFigure(final Field field,
			final Point point,
			final Figure figure) throws InvalidPointException,
										AlreadyOccupiedException {
if (field.getFigure(point) != null) {
	throw new AlreadyOccupiedException();
	}
	field.setFigure(point, figure);
	}
	
	
	/*private boolean check(final Field field, final Point currentPoint, final IPointGenerator pointGenerator){
		final Figure currentFigure;
		final Figure nextFigure;
		
		
		try {
		//	if(field.getFigure(point))
		} catch (InvalidPointException e) {
			e.printStackTrace();
		}
	}*/
	
	private interface IPointGenerator {
		public Point next(final Point point);
	}
}
