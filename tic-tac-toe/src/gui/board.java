package gui;

public class board 
{
	public void printBoard(String[] cells)
	{
		System.out.println(cells[7] + " | " + cells[8] + " | " + cells[9]);
		System.out.println("---------");
		System.out.println(cells[4] + " | " + cells[5] + " | " + cells[6]);
		System.out.println("---------");
		System.out.println(cells[1] + " | " + cells[2] + " | " + cells[3]);
	}
	
}
