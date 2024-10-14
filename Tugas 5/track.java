public class Track {
  public String artist;
  public String title;

  public Track(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public void getDetails() {
    System.out.println("Title: " + getTitle());
    System.out.println("Artist: " + getArtist());
  }
}
