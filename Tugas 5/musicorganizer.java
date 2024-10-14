import java.util.ArrayList;

public class MusicOrganizer {
    private ArrayList<Track> tracks;
    private MusicPlayer player;
    
    public MusicOrganizer() {
        tracks = new ArrayList<Track>();
        player = new MusicPlayer();
    }

    public void listAllTracks() {
        System.out.println("Track listing: ");
        for (int i = 0; i < tracks.size(); i++) {
            Track track = tracks.get(i);
            System.out.println((i + 1) + ". " + track.getDetails());
        }
        System.out.println();
    }

    public void playTrack(int index) {
        if (indexValid(index)) {
            Track track = tracks.get(index);
            player.startPlaying(track.getFilename());
            System.out.println("Now playing: " + track.getArtist() + " - " + track.getTitle());
            System.out.println("");
        }
    }
    
    public void stopTrack() {
        player.stopPlaying(); 
        System.out.println("");
    }

    public void removeTrack(int index) {
      if (index >= 0 && index < tracks.size()) {
        tracks.remove(index);
        System.out.println("Track removed.");
      } else {
        System.out.println("Error: track not found!");
      }
    }

    public boolean searchTrack(String searchTrack) {
      int index = 0;
      boolean searching = true;

      while (searching && index < tracks.size()) {
        String trackTitle = tracks.get(index).getTitle();
        if (trackTitle.contains(searchTrack)) {
          searching = false;
        } else {
          index++;
        }
      }
    
      if (searching) {
        System.out.println("Track not found");
        return false;
      } else {
        System.out.println("Found track at index " + index);
        return true;
    }
  }
}
