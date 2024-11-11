import java.util.ArrayList;
import java.util.List;

public abstract class Post {
  private User author;
  private List<User> likes;

  public Post(User author) {
    this.author = author;
    this.likes = new ArrayList<>();
  }

  public User getAuthor() {
    return author;
  }

  public List<User> getLikes() {
    return likes;
  }

  public void addLike(User user) {
    if (likes.contains(user)) {
      likes.add(user);
      System.out.println(user.getUsername() + " liked this post");
    }
  }

  public int getLikeCount() {
    return likes.size();
  }

  public abstract void showPost();
}
