/*
 DO THE SAME PROCESS to COMPILE 
 Showing Error: Could not find or load main class BasicP01ToKnowStructureOfJavaVer06
 NOTE   : in this case ask Java to RUN "A" named class contains main()
 COMPILE: as
          prompt>javac BasicP01ToKnowStructureOfJavaVer07.java
              SUPRISINGLY NO Compiletime Error, So You can RUN
     RUN: as
	      prompt>java A
*/
	
 class A{   
         void main()
	     {
           System.out.println("My Java");  
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

prompt>_

NOTE: CHECK IT IN ALL VERSIONS , observe are u getting the same Later

Java 6
Java 8
Java 19 (Latest Sep 2022)
*/