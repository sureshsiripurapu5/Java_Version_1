class TypeDeclarationP01ExampleVer1
{

    public static void main(String[]  args)
    {
        
		int   rollNumber=21;
		// float age=17.2; // ERROR
		float age=17.2f;
	    float height=5.6F;
		double Height=5.6;
		char grade='A' ;
		boolean passed=true;
		  //C-style COMMENTs (for multiple LINES)
		 System.out.println("AGE="+age);
		 System.out.println("R.No="+rollNumber);
		 System.out.println(height);
		 System.out.println(Height);
		 System.out.println(grade);
		 System.out.println(passed);
		
	// The following display all in the same Line (use // for ONE line)	
	System.out.println(rollNumber+" "+age+" "+height+" "+Height+" "+grade+" "+passed);
				
		
		
    }
}