import  java.util.Scanner;
class InputStmtP01ScannerUsageVer1
{
    public static void main(String[] args)
    {
		
		Scanner    myObj=new Scanner(System.in);
	    int age; 
		System.out.print("Please Enter your age(Years)?");
		age=myObj.nextInt(); //like scanf() in 'C'with %d for int
		System.out.println("You have given :"+age);
    }
}  