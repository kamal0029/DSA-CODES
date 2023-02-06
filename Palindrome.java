import java.util.*;
public class Palindrome
{
	public static void main(String[] args)
	{
		String s="MALAYALAM";
		int i=0,j=0;
		j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				System.out.println("Not a Palindrome");
				break;
			}
			i++;
			j--;
		}
		
	}
}