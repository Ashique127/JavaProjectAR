package dayofsummer;

public class DaySumrOneAy {

	public static void main(String[] args) {
		int a []= {100,200,300,400,500}; //Declare an array without specifying size
		System.out.println("Length of an array is: "+a.length); //print length size
		System.out.println(a[2]); //Read specific value
		/*for(int i=0; i<=a.length-1; i++)
		{
		System.out.println(a[i]);     //100 200 300 400 500
		}*/
		//read values using enhanced for loop
		
		for (int i: a)

		{
			System.out.println(i); //100 200 300 400 500
		}
		
	}

}

