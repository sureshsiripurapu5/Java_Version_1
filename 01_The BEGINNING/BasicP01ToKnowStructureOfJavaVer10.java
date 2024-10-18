/*
DOUBT1: CAN WE Alter order of "public" and "static" keywords???
DOUBT2: CAN WE change "args" with any identifier?
 COMPILE: as
          prompt>javac BasicP01ToKnowStructureOfJavaVer10.java
            IF NO ERROR , THEN  
     RUN: as
	      prompt>java A

DOUBT2:  Will You get output ?? 
*/
	
    class A{    
        static public void main(String[] PVR)  
	    {
		    System.out.printf("My OUTPUT STATEMENT of 'C'...");
            System.out.printf("ALSO working in Java..."); 
			    
        }
    }
	
// SCROLL DOWN 
















	
/*
COMPILED in Version J2SE 5 (jdk1.5.1):-

prompt>javac BasicP01ToKnowStructureOfJavaVer10.java

prompt>java A
My OUTPUT STATEMENT of 'C'...ALSO working in Java...

prompt>_

NOTE: CHECK IT IN ALL VERSIONS , observe are u getting the same Later

Java 6
Java 8
Java 19 (Latest Sep 2022)
*/