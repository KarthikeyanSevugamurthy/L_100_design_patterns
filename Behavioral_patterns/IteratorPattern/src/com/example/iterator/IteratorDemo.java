public class IteratorDemo {
    public static void main(String[] args) {
        String[] songs = {"Song A", "Song B", "Song C"};
        Playlist playlist = new Playlist(songs);

        Iterator iterator = playlist.getIterator();

        System.out.println("Playing songs forward:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nPlaying songs backward:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}