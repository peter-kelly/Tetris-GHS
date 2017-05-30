
public abstract class Tetromino 
{
	static boolean[][] matrix;
	static int state;

	public Tetromino() {
		state = 0;
		matrix = new boolean[4][4];
	}

	public abstract void rotate(boolean direction);// direction = true,
													// clockwise
	public abstract boolean getSpot(int row, int column);
}
