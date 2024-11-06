package L17_Activity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> searchSong(String artistName) {
        return songs.stream()
                    .filter(song -> song.getArtist().equalsIgnoreCase(artistName))
                    .collect(Collectors.toList());
    }

    public void displaySongsByArtist(String artistName) {
        List<Song> result = searchSong(artistName);
        if (result.isEmpty()) {
            System.out.println("No songs found" + artistName);
        } else {
            System.out.println("Song by " + artistName + ":");
            result.forEach(System.out::println);
        }
    }
}