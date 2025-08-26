class Playlist {
    private String[] songs;
    public Playlist(String[] songs) {
        this.songs = songs;
    }

    public Iterator getIterator() {
        return new SongIterator();
    }

    // Inner class as Iterator
    private class SongIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < songs.length;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return songs[index++];
            }
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return index > 0;
        }

        @Override
        public Object previous() {
            if (this.hasPrevious()) {
                return songs[--index];
            }
            return null;
        }
    }
}