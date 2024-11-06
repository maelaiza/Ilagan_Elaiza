package L18_Activity;

public class Main {
	 public static void main(String[] args) {
	    
	     Printer printer1 = new Printer("Document 1");
	     Printer printer2 = new Printer("Document 2");

	   
	     printer1.start();
	     printer2.start();

	     try {
	         
	         if (printer1.isAlive()) {
	             System.out.println(printer1.getName() + "  Running");
	         }
	         if (printer2.isAlive()) {
	             System.out.println(printer2.getName() + "  Running");
	         }

	        
	         printer1.join();
	         printer2.join();

	      
	         if (!printer1.isAlive()) {
	             System.out.println(printer1.getName() + "  Terminated");
	         }
	         if (!printer2.isAlive()) {
	             System.out.println(printer2.getName() + "  Terminated");
	         }

	     } catch (InterruptedException e) {
	         System.out.println("main thread interrupted");
	     }
	 }
	}