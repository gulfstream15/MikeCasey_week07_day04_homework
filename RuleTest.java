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

}