public class MessagePost extends Post {
    private String message;
  
    public MessagePost(User author, String message) {
      super(author);
      this.message = message;
    }
  
    public String getText() {
      return message;
    }
  
    @Override
    public void showPost() {  
      System.out.println(getAuthor().getUsername() + " posted: " + message + " - Likes: " + getLikeCount());
    }
}
