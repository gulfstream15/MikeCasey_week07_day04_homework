import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class RuleTest {

  Rule rule;

  @Before
    public void before() {
     rule = new Rule ("QUEEN");  
  }

  @Test
  public void canGetRank() {
    rule = new Rule("QUEEN");
    assertEquals("QUEEN", rule.getRank());
  }

  @Test 
  public void checkPlayer1Wins() {
    rule = new Rule (33, 22);
    String result = rule.getResult(33, 22);  
    assertEquals("Player1", result);
  }

  @Test 
  public void checkPlayer2Wins() {
    rule = new Rule (23, 43);
    String result = rule.getResult(23, 43);  
    assertEquals("Player2", result);
  }

  @Test 
  public void checkDraw() {
    rule = new Rule (11, 11);
    String result = rule.getResult(11, 11);  
    assertEquals("Game Drawn", result);
  }


}