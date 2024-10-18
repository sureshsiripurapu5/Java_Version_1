class NestedLoopsP03WithTwoForLoopsVer3
{
    public static void main(String[] args)
	{
		int i=0,j=0;   // C-STYLE of declaration
		
		
        for(i=1;i<=3;i=i+1)
			for(j=1;j<=3;j=j+1)
				System.out.println(j);
		System.out.println("NOW i = " + i);
		System.out.println("NOW j = " + j);
		
		
    }
}
