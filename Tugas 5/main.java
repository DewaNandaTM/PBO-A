import java.util.Scanner;

public class Main {
  public void showCommands() {
    System.out.println("");
    System.out.println("Music Organizer Command:");
    System.out.println("0. Show Music Organizer Command");
    System.out.println("1. Add a track");
    System.out.println("2. List all tracks");
    System.out.println("3. Remove a track using index");
    System.out.println("4. Search a track in the list");
    System.out.println("5. Play a track using index");
    System.out.println("6. Stop playing");
    System.out.println("7. Exit");
    System.out.println("");
  }

  public static void main(String[] args) {
    Main mainCommands = new Main();
    MusicOrganizer musicApp = new MusicOrganizer();
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    mainCommands.showCommands();

    while (!exit) {
      System.out.println();
      System.out.print("Enter command : ");
      int command = scanner.nextInt();

      switch(command) {
        case 0:
          mainCommands.showCommands();
          break;
        case 1:
          scanner.nextLine(); 

          System.out.print("Enter title track: ");
          String title = scanner.nextLine();
          System.out.print("Enter artist track: ");
          String artist = scanner.nextLine();
          
          Track track = new Track(title, artist);
          musicApp.addTrack(track);
          break;
        case 2:
          musicApp.listAllTracks();
          break;
        case 3:
          System.out.print("Enter index to remove a track : ");
          index = scanner.nextInt();  
          
          musicApp.removeTrack(index);        
          break;
        case 4:
          scanner.nextLine(); 

          System.out.print("Enter track title to search: ");
          String pattern = scanner.nextLine();
          
          musicApp.trackSearch(pattern);
          break;
        case 5:
          System.out.print("Enter index to play a track: ");
          index = scanner.nextInt();

          musicApp.playTrack(index);
          break;
        case 6:
          musicApp.stopTrack();
          break;
        case 7:
          exit = true;
          break;
        default:
          System.out.println("Invalid command!");
          break;
      }
    }
  }
}
