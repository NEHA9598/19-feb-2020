
public class Exception {

	public static void main(String args[])
	{
		System.out.println("Start the process");
		try{
	
		
		int number =Interger.parseInt(args[0])
				System.out.println("Start the process");
		
		System.out.println("The result is"+result);
		String message=null;
		System.out.println("The message length is:"+message.length());
		System.out.println("End of the process");
	}
		catch(ArithmaticException | NullPointerException| NumberFormatException | ArrayIndexOutoBoundsException ex)
		{
			System.out.println("get.message");
		
		}
		
		finally{
			System.out.println("Finally will always xecute");
		}
}
