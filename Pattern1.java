import java.util.*;
public class Pattern1
{
	public static void main(String[] args)
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<8;j++)
				if(j<=i||j>=8-i-1){
					System.out.print('*');
				}
				else{
					System.out.print(' ');
			}
			System.out.println();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
				if(j>=10-i-1){
					System.out.print('*');
				}
				else{
					System.out.print(' ');
			}
			System.out.println();
		}
		}
	}
