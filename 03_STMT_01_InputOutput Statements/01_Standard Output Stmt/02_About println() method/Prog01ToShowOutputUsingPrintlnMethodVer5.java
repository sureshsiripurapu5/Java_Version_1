class Prog01ToShowOutputUsingPrintlnMethodVer5
{
    public static void main(String[] args)
    {
        System.out.println(1+2+3+4+5);
        System.out.println(1+""+2+""+3+""+4+""+5); // as per books
		System.out.println(1+""+2+3+4+5); // suggested
		System.out.println(""+1+2+3+4+5); // the best
    }
}