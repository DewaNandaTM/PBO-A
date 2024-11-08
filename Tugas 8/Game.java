class Game {
  private Parser parser;
  private Room currentRoom;

  public Game() {
    createRooms();
    parser = new Parser();
  }

  private void createRooms() {
    Room outside, theatre, pub, lab, office;

    outside = new Room("standing outside in the main entrance of the university. You are surrounded by many greenery.");
    theatre = new Room("in the campus theatre. You see rows of seats and a big stage at the front.");
    pub = new Room("in the campus pub. People are chatting and enjoying the foods and drinks here.");
    lab = new Room("in a research lab. You see many advance technology and devices scattered around.");
    office = new Room("in the administry office. Stacks of papers fills an entire table.");
    cafeteria = new Room("in the cafeteria. The smell of foods fills the air around you.");
    gym = new Room("in the campus gym. Many equipments are here to train your body.");
    library = new Room("in the campus library. You see shelves full of books all around you, do not be noisy here!");
    dormitory = new Room("in the dormitory. Lots of rooms for the students to live here.");
    lectureClass = new Room("in a lecture class. The students took their class here.");
    
    outside.setExits(office, null, dormitory, null);
    dorm.setExits(outside, null, null, null);
    office.setExits(theatre, library, outside, lectureClass);
    library.setExits(null, null, null, office);
    lectureClass.setExits(cafeteria, office, null, null);
    theatre.setExits(gym, null, office, cafeteria);
    cafeteria.setExits(pub, theatre, lectureClass, null);
    gym.setExits(null, lab, theatre, pub);
    pub.setExits(null, gym, cafeteria, null);
    lab.setExits(null, null, null, gym);

    currentRoom = outside;
  }

  public void play() {
    printWelcome();
    boolean finished = false;
    while (!finished) {
      Command command = parser.getCommand();
      finished = processCommand(command);
    }
    System.out.println("Thank you for playing. Good bye.");
  }

  private void printWelcome() {
    System.out.println();
    System.out.println("Welcome to World of Zuul!");
    System.out.println("Get ready for an exciting adventure.");
    System.out.println("Type 'help' if you need help.");
    System.out.println();
    System.out.println("You are " + currentRoom.getDescription());

    System.out.print("Exits : ");
    if (currentRoom.northExit != null) {
      System.out.print("north ");
    }
    if (currentRoom.eastExit != null) {
      System.out.print("east ");
    }
    if (currentRoom.southExit != null) {
      System.out.print("south ");
    }
    if (currentRoom.westExit != null) {
      System.out.print("west ");
    }
    System.out.println();
  }

  private boolean processCommand(Command command) {
    boolean wantToQuit = false;

    if (command.isUnknown()) {
      System.out.println("I don't know what you mean...");
      return false;
    }

    String commandWord = command.getCommandWord();
    if (commandWord.equals("help")) {
      printHelp();
    } else if (commandWord.equals("go")) {
      goRoom(command);
    } else if (commandWord.equals("quit")) {
      wantToQuit = quit(command);
    }
    return wantToQuit;
  }

  private void printHelp() {
    System.out.println("You are lost. You are alone. You wander");
    System.out.println("around at the university.");
    System.out.println();
    System.out.println("Your command words are:");
    System.out.println("   go quit help");
  }

  private void goRoom(Command command) {
    if (!command.hasSecondWord()) {
      System.out.println("Go where?");
      return;
    }

    String direction = command.getSecondWord();

    Room nextRoom = null;
    if (direction.equals("north")) {
      nextRoom = currentRoom.northExit;
    }
    if (direction.equals("east")) {
      nextRoom = currentRoom.eastExit;
    }
    if (direction.equals("south")) {
      nextRoom = currentRoom.southExit;
    }
    if (direction.equals("west")) {
      nextRoom = currentRoom.westExit;
    }

    if (nextRoom == null) {
      System.out.println("There is no door!");
    } else {
      currentRoom = nextRoom;
      System.out.println("You are " + currentRoom.getDescription());
      System.out.print("Exits: ");
      if (currentRoom.northExit != null) {
        System.out.print("north ");
      }
      if (currentRoom.eastExit != null) {
        System.out.print("east ");
      }
      if (currentRoom.southExit != null) {
        System.out.print("south ");
      }
      if (currentRoom.westExit != null) {
        System.out.print("west ");
      }
      System.out.println();      
    }
  }

  private boolean quit(Command command) {
    if (command.hasSecondWord()) {
      System.out.println("Quit what?");
      return false;
    } else {
      return true;
    }
  }

  public static void main(String[] args) {
    Game game = new Game();
    game.play();
  }
}
