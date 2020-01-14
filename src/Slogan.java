public class Slogan implements Lockable {
    private String phrase;
    private static int count;
    private int key;
    private boolean lock;

    public Slogan(String phr) {
        phrase = phr;
        count++;
    }

    public String toString() {
        return phrase;
    }

    public static int getCount() {
        return count;
    }
}



