import gui.board;
import input.input;

public class game
{
	public void play()
	{
		String[] cells;
		cells = new String[10];
		String move = " ";
		
		cells[0] = " ";
		cells[1] = " ";
		cells[2] = " ";
		cells[3] = " ";
		cells[4] = " ";
		cells[5] = " ";
		cells[6] = " ";
		cells[7] = " ";
		cells[8] = " ";
		
		board board = new board();
		input input = new input();
		winner winner = new winner();
		
		for( ; winner.decideWinner(cells, move) == "nope"; )
		{
			this.whosMove(move);
			input.dataIn(cells, move);
			board.printBoard(cells);
		}
	}
	
	/*This is a comment I am testing the push configuration*/
	String gumbo = "mush";
	
	
	private String whosMove(String move)
	{
		switch(move)
		{
		case "X": return "O";
		case "O": return "X";
		case " ": return "X";
		default : return " ";
		}
	}

}
