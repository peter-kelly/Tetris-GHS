
public class Lblock extends Tetromino {

	public Lblock() 
	{
		//Default to upright
		matrix[0][0] = false;
		matrix[0][1] = true;
		matrix[0][2] = false;
		matrix[0][3] = false;

		matrix[1][0] = false;
		matrix[1][1] = true;
		matrix[1][2] = false;
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

			matrix[1][0] = false;
			matrix[1][1] = true;
			matrix[1][2] = false;
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
		else if(state == 1) //To the right
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
			matrix[3][1] = true;
			matrix[3][2] = false;
			matrix[3][3] = false;
		}
		else if(state == 2) //Down
		{
			matrix[0][0] = false;
			matrix[0][1] = true;
			matrix[0][2] = true;
			matrix[0][3] = false;
			
			matrix[1][0] = false;
			matrix[1][1] = false;
			matrix[1][2] = true;
			matrix[1][3] = false;
			
			matrix[2][0] = false;
			matrix[2][1] = false;
			matrix[2][2] = true;
			matrix[2][3] = false;
			
			matrix[3][0] = false;
			matrix[3][1] = false;
			matrix[3][2] = false;
			matrix[3][3] = false;
		}
		else if(state == 3) //To the left
		{
			matrix[0][0] = false;
			matrix[0][1] = false;
			matrix[0][2] = false;
			matrix[0][3] = true;
			
			matrix[1][0] = false;
			matrix[1][1] = true;
			matrix[1][2] = true;
			matrix[1][3] = true;
			
			matrix[2][0] = false;
			matrix[2][1] = false;
			matrix[2][2] = false;
			matrix[2][3] = false;
			
			matrix[3][0] = false;
			matrix[3][1] = false;
			matrix[3][2] = false;
			matrix[3][3] = false;
		}

	}

}

/*


} else {
state = 3;
// now to the left (to the left)


}

} else if (state == 1) {
if (direction) {
state = 2;
// now upside down
matrix[0][0] = false;// row1
matrix[0][1] = false;
matrix[0][2] = false;
matrix[0][3] = false;

matrix[1][0] = false;// row2
matrix[1][1] = true;
matrix[1][2] = true;
matrix[1][3] = false;

matrix[2][0] = false;// row3
matrix[2][1] = true;
matrix[2][2] = false;
matrix[2][3] = false;

matrix[3][0] = false;// row4
matrix[3][1] = true;
matrix[3][2] = false;
matrix[3][3] = false;

} else {
state = 0;
// now upright
matrix[0][0] = false;// row1
matrix[0][1] = false;
matrix[0][2] = false;
matrix[0][3] = false;

matrix[1][0] = false;// row2
matrix[1][1] = false;
matrix[1][2] = true;
matrix[1][3] = false;

matrix[2][0] = false;// row3
matrix[2][1] = false;
matrix[2][2] = true;
matrix[2][3] = false;

matrix[3][0] = false;// row4
matrix[3][1] = true;
matrix[3][2] = true;
matrix[3][3] = false;

}

} else if (state == 2) {
if (direction) {
state = 3;
// now to the left (to the left)
matrix[0][0] = false;// row1
matrix[0][1] = false;
matrix[0][2] = false;
matrix[0][3] = false;

matrix[1][0] = false;// row2
matrix[1][1] = true;
matrix[1][2] = true;
matrix[1][3] = true;

matrix[2][0] = false;// row3
matrix[2][1] = false;
matrix[2][2] = false;
matrix[2][3] = true;

matrix[3][0] = false;// row4
matrix[3][1] = false;
matrix[3][2] = false;
matrix[3][3] = false;

} else {
state = 1;
// now right
matrix[0][0] = false;// row1
matrix[0][1] = false;
matrix[0][2] = false;
matrix[0][3] = false;

matrix[1][0] = false;// row2
matrix[1][1] = true;
matrix[1][2] = false;
matrix[1][3] = false;

matrix[2][0] = false;// row3
matrix[2][1] = true;
matrix[2][2] = true;
matrix[2][3] = true;

matrix[3][0] = false;// row4
matrix[3][1] = false;
matrix[3][2] = false;
matrix[3][3] = false;

}

} else if (state == 3) {
if (direction) {
state = 0;
// now upright
matrix[0][0] = false;// row1
matrix[0][1] = false;
matrix[0][2] = false;
matrix[0][3] = false;

matrix[1][0] = false;// row2
matrix[1][1] = false;
matrix[1][2] = true;
matrix[1][3] = false;

matrix[2][0] = false;// row3
matrix[2][1] = false;
matrix[2][2] = true;
matrix[2][3] = false;

matrix[3][0] = false;// row4
matrix[3][1] = true;
matrix[3][2] = true;
matrix[3][3] = false;

} else {
state = 2;
// now upside down
matrix[0][0] = false;// row1
matrix[0][1] = false;
matrix[0][2] = false;
matrix[0][3] = false;

matrix[1][0] = false;// row2
matrix[1][1] = true;
matrix[1][2] = true;
matrix[1][3] = false;

matrix[2][0] = false;// row3
matrix[2][1] = true;
matrix[2][2] = false;
matrix[2][3] = false;

matrix[3][0] = false;// row4
matrix[3][1] = true;
matrix[3][2] = false;
matrix[3][3] = false;
*/