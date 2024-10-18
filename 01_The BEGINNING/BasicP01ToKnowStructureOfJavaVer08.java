/*
 NOTE: As error suggested MODIFY main() as follows
 COMPILE: as
          prompt>javac BasicP01ToKnowStructureOfJavaVer08.java
              SUPRISINGLY Compiletime Error, So You can NOT RUN
     RUN: as
	      prompt>java A
 
*/
	
 class A{   
         public static void main(string[] args)
	     {
           System.out.println("My OUTPUT STATEMENT is working...");  
         }
        }
	
// SCROLL DOWN 
















	
/*
COMPILED in Version J2SE 5 (jdk1.5.1):-

prompt>javac BasicP01ToKnowStructureOfJavaVer07.java

prompt>java A
Error: Main method not found in class A, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

C:\Users\pdotv\@PVR\MyJava>javac BasicP01ToKnowStructureOfJavaVer08.java
BasicP01ToKnowStructureOfJavaVer08.java:12: error: cannot find symbol
            public static void main(string[] args)
                                    ^
  symbol:   class string
  location: class A
1 error

prompt>_

NOTE: CHECK IT IN ALL VERSIONS , observe are u getting the same Later

Java 6
Java 8
Java 19 (Latest Sep 2022)
*/