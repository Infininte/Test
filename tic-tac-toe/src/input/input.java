package input;

import java.util.Scanner;

public class input 
{
	public void dataIn(String[] cells, String move)
	{

		Scanner reader = new Scanner(System.in);
		int newMove = reader.nextInt();
		//char newMove = (char)startString;
		
		switch (newMove)
		{
		case 7: cells[7] = move;
			break;
		case 8: cells[8] = move;
			break;
		case 9: cells[9] = move;
			break;
		case 4: cells[4] = move;
			break;
		case 5: cells[5] = move;
			break;
		case 6: cells[6] = move;
			break;
		case 1: cells[1] = move;
			break;
		case 2: cells[2] = move;
			break;
		case 3: cells[3] = move;
			break;
		}
		
	}
	

}
