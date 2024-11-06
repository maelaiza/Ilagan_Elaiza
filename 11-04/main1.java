package L16_Activity;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Song  2. Display Playlist  3. Remove Song  4. Play Current Song  5. Play Next Song  6. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = scanner.nextLine();
                    playlist.addSong(title, artist);
                }
                case 2 -> playlist.displayPlaylist();
                case 3 -> {
                    System.out.print("Enter the title of the song to remove: ");
                    String title = scanner.nextLine();
                    playlist.removeSong(title);
                }
                case 4 -> playlist.displayCurrentSong();
                case 5 -> playlist.displayNextSong();
                case 6 -> System.out.println("Exiting playlist...");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}