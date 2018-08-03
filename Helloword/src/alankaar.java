/**
 * 
 */

/**
 * @author Pavi
 *
 */
public class alankaar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] aaroh = {"Sa","Re","Ga","Ma","Pa","Dha","Ni","Sa`","Re`","Ga`","Ma`","Pa`"};
		int [] pattern = {0,1,2,2};
		int index = 0;
		for (int i =0; i<= (aaroh.length - pattern.length+1); i++)
		{
			for(int k=0; k < pattern.length;k++)
			{
				 index = i + pattern[k];
			     System.out.print(aaroh[index] + " " );
			}
			System.out.print(", " );
		}
		
		
		System.out.println();
		for (int i = aaroh.length- 2; i >= (pattern.length-1); i--)
		{
			for(int k=0; k < pattern.length;k++)
			{
				 index = i - pattern[k];
			     System.out.print(aaroh[index] + " " );
			}
			System.out.print(", " );
		}
	
	}
}
