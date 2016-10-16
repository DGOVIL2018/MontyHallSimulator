public class MontyHallSim
{

/* Dhruv Govil
   Monty Hall Simulator Game
   Play the classic Monty Hall game with a choice as to how many times you want to play
   
   The algorithm for this simulator game is slightly different from the algorithm
   of the Monty Hall game. For example, a command line argument is used to specify how many times the game is to be run.
   Also, the percent switchWin is calculated along with the percent stayWin.
**/



// Integer.parseInt("3"); --> 3 -- converts String variable to an int variable
// The main method has a string-array argument
	
	public static void main (String[] args)
	{
		String input = args[0]; //obtain command line argument
		
		int numSim = Integer.parseInt(input);
		System.out.println(numSim);
		
		int switchWin = 0;
				
		for (int i = 0; i < numSim; i++)
			switchWin += game();
		
		double percentSwitchWin = format ((double) (switchWin / numSim * 100));
		double percentStayWin = format ((100 - percentSwitchWin));
		System.out.println(percentSwitchWin);
		System.out.println(percentStayWin); //calculate the percent stay win by difference, with proper formatting
		
	}
	
	
	public static double format (double d) //format the SwitchWin percentage into a nice number
	{
		int x = (int) (d * 100);
		return x / 100.0;
		
		
	}

	public static int game() //picks which door number to place the car behind and the user pick, and returns 0 or 1 correspondingly
	{
		int car = (int) (Math.random() * 3 + 1);  //initialize car with int variable between 1 and 3
		int userPick = (int) (Math.random() * 3 + 1); //initialize userPick with int variable between 1 and 3
		
		if (car == userPick)
			return 0;
		else
			return 1;
	
	}

	











}