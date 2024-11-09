import org.junit.jupiter.api.BeforeEach;  
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;  

public class SalesItemTest {
    private SalesItem item;

    @BeforeEach
    public void init() {
        item = new SalesItem("Test Item", 1000);
    }

    @Test
    public void testAddComment() {
        assertTrue(item.addComment("Alice", "Good product", 5));
        assertTrue(item.addComment("Bob", "Average quality", 3));
        assertEquals(2, item.getNumberOfComments());
    }
        
    @Test
    public void testRemoveComment() {
        item.addComment("Charlie", "Good product", 5);
        item.removeComment(0);
        assertEquals(0, item.getNumberOfComments());
    }
    
    @Test
    public void testUpvoteComment() {
        item.addComment("Alice", "Great product!", 5);
        item.upvoteComment(0);
        assertEquals(1, item.findMostHelpfulComment().getVotes());
    }
    
    @Test
    public void testDownvoteComment() {
        item.addComment("Bob", "Meh", 3);
        item.downvoteComment(0);
        assertEquals(-1, item.findMostHelpfulComment().getVotes());
    }

    @Test
    public void testMostHelpfulComment() {
        item.addComment("Charlie", "Good product", 5);
        item.addComment("Alice", "Average product", 3);
        item.upvoteComment(0);
        item.upvoteComment(0);
        assertEquals("Charlie", item.findMostHelpfulComment().getAuthor());
    }
    
    @Test
    public void testInvalidRating() {
        assertFalse(item.addComment("Bob", "I love this product", 6));
        assertFalse(item.addComment("Alice", "I don't like this product", 0));       
        assertEquals(0, item.getNumberOfComments());
    }
}
