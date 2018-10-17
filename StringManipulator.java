/**
 * 
 * @author diana tiburcio
 *
 */
public class StringManipulator 
{
	private String str;
	private String reverse;
	private String noVowels;
	
	public StringManipulator(String  str1)
	{
		str = str1;
	}
	
	public String reverse()
	{
		reverse = "";
		for (int i = 0; i < str.length(); i++)
		{
			char letter = str.charAt(str.length() - 1 - i);
			reverse += letter;
		}
		return reverse;
	}
	public String noVowels()
	{
		noVowels = "";
		for (int i = 0; i < str.length(); i++)
		{
			char letter = str.charAt(i);
			if (letter == 'a' || letter == 'e' || letter == 'i'|| letter == 'o'|| letter == 'u')
			{
				letter = '*';
			}
			noVowels += letter;
		}
		return noVowels;
	}
}
