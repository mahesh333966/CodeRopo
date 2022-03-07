package Starting1.Starting1;

public class corejavabasics {

	public static void main(String[] args) {
		
		int myNum = 5;
		String website = "Vinod Acadamey";
		char letter = 'V';
		double dec = 6.66;
		boolean myname = true;
		
		System.out.println(website+" is belong to vinod naidu");
		
		// Arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,3,4,6,8,10,122};
		
		System.out.println(arr[3]);
		
		// for loop
		for(int i = 0; i< arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		
		String[] name = {"vinod", "naidu", "academy",};
		
		for(int i = 0; i< name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for(String s: name)
		{
			System.out.println(s);
		}
	
	
			
	}

}
