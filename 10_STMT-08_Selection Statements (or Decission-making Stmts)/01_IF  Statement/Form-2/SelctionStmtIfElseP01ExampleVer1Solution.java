class SelctionStmtIfElseP01ExampleVer1Solution
{
    public static void main(String[]  args)
    {
      if (2<3)System.out.println("A") ; else System.out.println("B");
	  System.out.println("bye");   // next stmt DEFINITELY EXECUTED
		
		if(2>3) 
			System.out.println("C")
		;else 
			System.out.println("D");
		System.out.println("BYEBYE"); // next stmt DEFINITELY EXECUTED
    }
}