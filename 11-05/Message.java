package L17_Activity;

import java.util.LinkedList;
import java.util.Queue;

class Message {
    private Queue<String> messageQueue = new LinkedList<>();

    public Message() {
        // Adding messages in the specified order
        messageQueue.add("Hello");
        messageQueue.add("My name is JavaBot.");
        messageQueue.add("Nice to meet you!");
    }

    public void sendMessages() {
        while (!messageQueue.isEmpty()) {
            String message = messageQueue.poll();
            System.out.println("Sending a message: \"" + message + "\"");
            try {
                Thread.sleep(1000); // Pause for 1 second to simulate sending
            } catch (InterruptedException e) {
                System.out.println("Message sending interrupted");
            }
            System.out.println("\"" + message + "\" sent\n");
        }
    }
}

class MessageTask extends Thread {
    private Message messagingSystem;

    public MessageTask(Message messagingSystem) {
        this.messagingSystem = messagingSystem;
    }

    @Override
    public void run() {
        messagingSystem.sendMessages();
    }
}