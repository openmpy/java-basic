package extends1;

public class Album extends Item {

    private final String artist;

    public Album(String item, int price, String artist) {
        super(item, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트: " + artist);
    }
}
