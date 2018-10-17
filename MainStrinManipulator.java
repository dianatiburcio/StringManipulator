/**
 * 
 * @author dianna tiburcio
 *
 */
import java.util.Scanner;

public class MainStrinManipulator 
{
	public static void main(String[] args)
	{
		String wannaPlayAgain = "yes";
		Scanner n = new Scanner(System.in);
		while (wannaPlayAgain.equals("yes"))
		{
			System.out.print("Type \"reverse\" if you would like to rverse and type \"noVowels\" if you would like to remove the vowels: ");
			String response = n.nextLine();
			while (!(response.equals("reverse") || response.equals("noVowels")))
			{
				System.out.print("please type a valid response: ");
				response = n.nextLine();
			}
			System.out.print("please type a sentence: ");
			String str = n.nextLine();
			StringManipulator string = new StringManipulator(str);
			if (response.equals("reverse"))
			{
				System.out.println(string.reverse());
			}
			else
			{
				System.out.println(string.noVowels());
			}
			System.out.print("would you like to play again? type \"yes\" if you do and \"no\" if you don't: ");
			wannaPlayAgain = n.nextLine();
			while (!(wannaPlayAgain.equals("yes") || wannaPlayAgain.equals("no")))
			{
				System.out.print("please type a valid response: ");
				wannaPlayAgain = n.nextLine();
			}
		}
	}
}
