public class MusicPlayer {
  private boolean isPlaying;

  public MusicPlayer() {
    isPlaying = false;
  }

  public void startPlaying(String trackTitle) {
    if (isPlaying) {
      stopPlaying();
      System.out.println();
    }
    trackPlaying = trackTitle;
    isPlaying = true;
    System.out.println("Playing a track : " + trackPlaying);
  }

  public void stopPlaying() {
    if (isPlaying) {
      System.out.println("Stopping the current track");
      isPlaying = false;
    } else {
      System.out.println("No track is currently playing.");
    }
  }
}
