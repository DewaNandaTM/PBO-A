public class Comment {
    private String author;
    private String text;
    private int rating;
    private int votes;

    public Comment(String author, String text, int rating) {
        this.author = author;
        this.text = text;
        this.rating = rating;
        this.votes = 0;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public int getRating() {
        return rating;
    }

    public int getVotes() {
        return votes;
    }

    public void upvote() {
        votes++;
    }

    public void downvote() {
        votes--;
    }

    public String getFullDetails() {
        return "Author: " + author + "\n" +
               "Rating: " + rating + "\n" +
               "Vote Count: " + votes + "\n" +
               "Comment: " + text;
    }
}
