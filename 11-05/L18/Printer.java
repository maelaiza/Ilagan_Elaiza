package L18_Activity;


class Printer extends Thread {
 private String documentName;


 public Printer(String documentName) {
     this.documentName = documentName;
 }


 private void printDocuments() {
     try {
         System.out.println(Thread.currentThread().getName() + " Printing " + documentName);
         Thread.sleep(2000); 
         System.out.println(Thread.currentThread().getName() + "  Finished printing: " + documentName);
     } catch (InterruptedException e) {
         System.out.println("printing interrupted for document " + documentName);
     }
 }


 @Override
 public void run() {
     printDocuments();
 }
}



