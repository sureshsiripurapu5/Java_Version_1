/*
 COMPILE: as
          prompt>javac BasicP01ToKnowStructureOfJavaVer09.java
              SUPRISINGLY NO Compiletime Error l
 Now RUN: as
	      prompt>java A

 FINALLY: You GOT output..RIGHT??? 
*/
	
 class A{    
            public static void main(String[] args) // 'S' is in CAPs
	        {
              System.out.println("My OUTPUT STATEMENT is working..."); 
			    // in the above also 'S' is in CAPs
            }
        }
	
// SCROLL DOWN 
















	
/*
COMPILED in Version J2SE 5 (jdk1.5.1):-

prompt>javac BasicP01ToKnowStructureOfJavaVer09.java

C:\Users\pdotv\@PVR\MyJava>java BasicP01ToKnowStructureOfJavaVer09
Error: Could not find or load main class BasicP01ToKnowStructureOfJavaVer09
                                        (wrong class name given(DO NOT Program Name)
C:\Users\pdotv\@PVR\MyJava>java A
My OUTPUT STATEMENT is working...
prompt>_

NOTE: CHECK IT IN ALL VERSIONS , observe are u getting the same Later

Java 6
Java 8
Java 19 (Latest Sep 2022)
*/