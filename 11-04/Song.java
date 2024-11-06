package L16_Activity;

import java.util.LinkedList;
import java.util.Scanner;

class Song {
    String title, artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return title + " by " + artist;
    }
}

class Playlist {
    private LinkedList<Song> playlist = new LinkedList<>();
    private int currentSongIndex = -1;

    void addSong(String title, String artist) {
        playlist.add(new Song(title, artist));
        System.out.println("Added: " + title);
    }

    void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            playlist.forEach(song -> System.out.println(song));
        }
    }
    void removeSong(String title) {
        playlist.removeIf(song -> song.title.equalsIgnoreCase(title));
        System.out.println("Removed: " + title);
    }

    void displayCurrentSong() {
        if (currentSongIndex >= 0 && currentSongIndex < playlist.size()) {
            System.out.println("Current song: " + playlist.get(currentSongIndex));
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    void displayNextSong() {
        if (++currentSongIndex < playlist.size()) {
            System.out.println("Next song: " + playlist.get(currentSongIndex));
        } else {
            currentSongIndex--;
            System.out.println("End of playlist reached.");
        }
    }
}


	
