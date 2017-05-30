
public class Square extends Tetromino {

	public Square() {
		matrix[0][0] = false;
		matrix[0][1] = false;
		matrix[0][2] = false;
		matrix[0][3] = false;
		
		matrix[1][0] = false;
		matrix[1][1] = true;
		matrix[1][2] = true;
		matrix[1][3] = false;
		
		matrix[2][0] = false;
		matrix[2][1] = true;
		matrix[2][2] = true;
		matrix[2][3] = false;
		
		matrix[3][0] = false;
		matrix[3][1] = false;
		matrix[3][2] = false;
		matrix[3][3] = false;
	}

	public boolean getSpot(int row, int column)
	{
		return matrix[row][column];
	}
	
	@Override
	public void rotate(boolean direction) {
		return;
	}

}
