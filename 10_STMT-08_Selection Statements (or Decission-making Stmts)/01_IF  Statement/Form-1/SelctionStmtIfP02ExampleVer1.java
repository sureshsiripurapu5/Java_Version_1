class SelctionStmtIfP02ExampleVer1
{
    public static void main(String[]  args)
    {
        if (2<3) 
			  System.out.println("A");
		      System.out.println("B"); // BECOMES next stmt
		System.out.println("bye"); // next stmt DEFINITELY EXECUTED
		
		if(2>3) 
			System.out.println("C");
		    System.out.println("D");// BECOMES next stmt
		System.out.println("BYEBYE"); // next stmt DEFINITELY EXECUTED
    }
}