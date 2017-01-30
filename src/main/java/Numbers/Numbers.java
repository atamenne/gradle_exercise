package Numbers;

public class Numbers 
{
	public static void main(String[] args)
	{
	
		if(args.length != 2)
		{
			System.out.println("Incorrect number of arguments!");
			System.exit(1);
		}
		
		String type = args[0];
		int n = Integer.parseInt(args[1]);
		
		if(type.equals("triangle"))
			System.out.println("Tri(" + n + ") = " + TriNum(n));
		else if (type.equals("lazy"))
			System.out.println("Lazy(" + n + ") = " + Caterer(n))
		else
		{
			System.out.println("Error with command line args");
			System.exit(1);
		}
	}
	
	public static int TriNum(int n)
	{
		if (n == 1)
			return 1;
			
		return n + TriNum(n - 1);
	}	
	
	public static int Caterer(int n)
	{
		int p = (n*n + n + 2) / 2;
		return p;
	}
}
