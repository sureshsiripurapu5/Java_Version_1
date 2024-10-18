class  SelectionStmtIfP03Form3NestedIfWithVer2
{
    public static void  main( String[] args)
	{
		if (2>1)                                  //  NESTED-if
			if (10<5)  ;
	            if (100>10)
				System.out.println("Executed");
	    		
		System.out.println("Last Statement");	 // NEXT STATEMENT
	}
}
	