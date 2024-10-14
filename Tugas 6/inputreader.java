import java.util.Scanner;

class InputReader {
  private Scanner userInput;
  
  public InputReader() {
    userInput = new Scanner(System.in);
  }

  public String input() {
    System.out.print("> ");
    return userInput.nextLine();
  }
}
