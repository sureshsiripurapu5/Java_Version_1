class SelctionStmtIfP02ExampleVer2
{
    public static void main(String[]  args)
    {
        if (2<3) 
		    {
			  System.out.println("A");
		      System.out.println("B"); 
			}
		System.out.println("bye"); // next stmt DEFINITELY EXECUTED
		
		if (2>3) 
		    {
			 System.out.println("C");
		     System.out.println("D"); 
		    }
		System.out.println("BYEBYE"); // next stmt DEFINITELY EXECUTED
    }
}