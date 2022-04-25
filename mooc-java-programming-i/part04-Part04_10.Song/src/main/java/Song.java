public class Song {
    private String name;
    private int length;

    public Song(String initialName, int initialLength) {
        this.name = initialName;
        this.length = initialLength;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
