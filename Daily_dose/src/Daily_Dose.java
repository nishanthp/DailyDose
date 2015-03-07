
import java.util.ArrayList;
import java.util.Scanner;

public class Daily_Dose {


	public static void main(String[] args)
	
	{
		String s;
		Scanner in = new Scanner(System.in);
		
		System.out.println("likh be :");
		s = in.nextLine();
		
		String f = "fuck";
		int c;
		
		boolean b;
		ArrayList curseList = new ArrayList();
		curseList.add("fuck");
		curseList.add("fcuk");
		curseList.add("anus");
		curseList.add("arse");
		
		
		
		for(int i=0; i<curseList.size(); i++)
			{
			String temp = (String)curseList.get(i);
			if (s.contains((temp)))
			{
				System.out.println("gadha kahinka");
				break;
			}
			
			
		
			}
		
	}
	
		

	}


