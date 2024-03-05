import java.util.ArrayList;


public class Song {
    private String title;
    private String artist;
    private ArrayList<String> people = new ArrayList<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int howMany(ArrayList<String> newPeople) {
        int count = 0;
        for (int i = 0; i < newPeople.size(); i++) {
            if (!people.contains(newPeople.get(i).toLowerCase())) {
                people.add(newPeople.get(i).toLowerCase());
                count++;
            }
        }
        return count;
    }
}
