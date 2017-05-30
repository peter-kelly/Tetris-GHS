
public class Tblock extends Tetromino {
	// mouradov QOTD "What is in my head my sense but I need to convert it into
	// words"

	public Tblock() {
		matrix[0][0] = false;
		matrix[0][1] = true;
		matrix[0][2] = false;
		matrix[0][3] = false;
		
		matrix[1][0] = true;
		matrix[1][1] = true;
		matrix[1][2] = true;
		matrix[1][3] = false;
		
		matrix[2][0] = false;
		matrix[2][1] = false;
		matrix[2][2] = false;
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
		if(direction)
		{
			state++;
			if(state == 4)
			{
				state = 0;
			}
		}
		else
		{
			state--;
			if(state == -1)
			{
				state = 3;
			}
		}
		
		if(state == 0) //Upright
		{
			matrix[0][0] = false;
			matrix[0][1] = true;
			matrix[0][2] = false;
			matrix[0][3] = false;
			
			matrix[1][0] = true;
			matrix[1][1] = true;
			matrix[1][2] = true;
			matrix[1][3] = false;
			
			matrix[2][0] = false;
			matrix[2][1] = false;
			matrix[2][2] = false;
			matrix[2][3] = false;
			
			matrix[3][0] = false;
			matrix[3][1] = false;
			matrix[3][2] = false;
			matrix[3][3] = false;
		}
		else if(state == 1) //To the right
		{
			matrix[0][0] = false;
			matrix[0][1] = false;
			matrix[0][2] = true;
			matrix[0][3] = false;
			
			matrix[1][0] = false;
			matrix[1][1] = false;
			matrix[1][2] = true;
			matrix[1][3] = true;
			
			matrix[2][0] = false;
			matrix[2][1] = false;
			matrix[2][2] = true;
			matrix[2][3] = false;
			
			matrix[3][0] = false;
			matrix[3][1] = false;
			matrix[3][2] = false;
			matrix[3][3] = false;
		}
		else if(state == 2) //Down
		{
			matrix[0][0] = false;
			matrix[0][1] = false;
			matrix[0][2] = false;
			matrix[0][3] = false;
			
			matrix[1][0] = false;
			matrix[1][1] = false;
			matrix[1][2] = false;
			matrix[1][3] = false;
			
			matrix[2][0] = false;
			matrix[2][1] = true;
			matrix[2][2] = true;
			matrix[2][3] = true;
			
			matrix[3][0] = false;
			matrix[3][1] = false;
			matrix[3][2] = true;
			matrix[3][3] = false;
		}
		else if(state == 3) //To the left
		{
			matrix[0][0] = false;
			matrix[0][1] = true;
			matrix[0][2] = false;
			matrix[0][3] = false;
			
			matrix[1][0] = true;
			matrix[1][1] = true;
			matrix[1][2] = false;
			matrix[1][3] = false;
			
			matrix[2][0] = false;
			matrix[2][1] = true;
			matrix[2][2] = false;
			matrix[2][3] = false;
			
			matrix[3][0] = false;
			matrix[3][1] = false;
			matrix[3][2] = false;
			matrix[3][3] = false;
		}

	}

}
