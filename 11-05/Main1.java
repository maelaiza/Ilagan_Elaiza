package L17_Activity;

public class Main1 {
    public static void main(String[] args) {
        Message messagingSystem = new Message();
        MessageTask messageTask = new MessageTask(messagingSystem);

        messageTask.start(); 
        try {
            messageTask.join(); 
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
    }
}