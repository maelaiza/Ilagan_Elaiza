package L17_Activity;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

     
        playlist.addSong(new Song("Song1", "ArtistA"));
        playlist.addSong(new Song("Song2", "ArtistB"));
        playlist.addSong(new Song("Song3", "ArtistA"));
        playlist.addSong(new Song("Song4", "ArtistC"));

   
        playlist.displaySongsByArtist("ArtistB");
    }
}