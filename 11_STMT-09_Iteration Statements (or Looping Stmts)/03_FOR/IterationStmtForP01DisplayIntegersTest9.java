class IterationStmtForP01DisplayIntegersTest9
{
    public static void main(String[] args)
    {
                             
        for(int a=1;a<=5;a++) 
            System.out.println(a);
        //System.out.println("From Outside Loop Statement: a="+a); // ERROR
            // The above is ERROR in Java but not in C/C++           
        int b;
        for(b=1;b<=5;b++) 
            System.out.println("b="+b);
        System.out.println("From Outside Loop Statement: b="+b);
 
                     }
 
}
