package Starting1.Starting1;

import java.util.ArrayList;

public class corejavabasics2 {

	public static void main(String[] args) {
	
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
		
		for(int i = 0; i<arr2.length; i++)
		{
			if(arr2[i] % 2 == 0)
			{
			System.out.println(arr2[i]);
			break;
			
			}
			else
			{
				System.out.println(arr2[i] + "is not multiple of 2");
			}
			
		}
		
		//ArrayList
		ArrayList<String> a = new ArrayList<String>();
		a.add("vinod");
		a.add("naidu");
		a.add("academy");
		
		System.out.println(a.get(2));
		
		String s = "rahul shetty academy";
		String[] splittedstring = s.split("shetty");
		System.out.println(splittedstring [0]);
		System.out.println(splittedstring[1].trim( ));
		
		for(int i = 0; i<s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		for(int i = s.length() -1; i>=0; i--)
		{
			System.out.println(s.charAt(i));
		}
		
		
		
		
	}

}
