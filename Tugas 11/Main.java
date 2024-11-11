import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Network network = new Network();

    List<String> userNames = new ArrayList<>();
    userNames.add("Galguna");
    userNames.add("Artana");
    userNames.add("Yaso");
    userNames.add("Mahesa");
    List<User> users = new ArrayList<>();

    for (String name : userNames) {
      users.add(network.addUser(name));
    }

    users.get(0).addMessagePost("I Like minecraft");
    users.get(0).addPhotoPost("minecraft.jpg", "Bye enderdragon.");

    users.get(1).addMessagePost("I read a good comics now");
    users.get(1).addPhotoPost("sololevelling.jpg", "Recommended read");

    users.get(2).addMessagePost("I'm tired");
    users.get(2).addPhotoPost("vscode.jpg", "Coding is fun!");

    users.get(3).addMessagePost("Cihuy");

    for (User user : users) {
      for (Post post : user.getPosts()) {
        network.addPost(post);
      }
    }

    network.showAllPost();
  }
}
