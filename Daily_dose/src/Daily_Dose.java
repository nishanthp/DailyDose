
import java.util.ArrayList;
import java.util.Scanner;

public class Daily_Dose {


	public static void main(String[] args)
	
	{
		String s;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the message :");
		s = in.nextLine();
		
		int c;
		
		boolean b;
		ArrayList curseList = new ArrayList();
		curseList.add("fuck");
		curseList.add("fcuk");
		curseList.add("ass");
		curseList.add("arse");
		curseList.add("bitch");
		curseList.add("shit");
		curseList.add("dick");
		curseList.add("cock");
		curseList.add("pussy");
		curseList.add("slut");
		curseList.add("fag");
		curseList.add("slut");
		curseList.add("douche");
		curseList.add("darn");
		
		for(int i=0; i<curseList.size(); i++)
			{
			String temp = (String)curseList.get(i);
			if (s.contains((temp)))
			{
				System.out.println("Please avoid foul language");
				break;
			}
			
			
		
			}
		
	}
	
		

	}


