class SelctionStmtIfP01ExampleVer2
{
    public static void main(String[]  args)
    {
        if (2<3) 
		   {
			System.out.println("Hi");
		   }
		System.out.println("bye");   // next stmt DEFINITELY EXECUTED
		
		if(2>3) 
		   {
			System.out.println("HELLO");
		   }
		System.out.println("BYEBYE"); // next stmt DEFINITELY EXECUTED
    }
}