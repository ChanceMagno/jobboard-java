import org.junit.*;
import static org.junit.Assert.*;

public class JobBoardTest {

  @Test
  public void newJob_instantiatesCorrectly() {
    JobBoard newJob = new JobBoard("Portland");
    assertEquals(true, newJob instanceof JobBoard);
  }

  @Test
  public void newCity_instanceOfConstructor(){
  JobBoard newJob = new JobBoard("Portland");
  assertEquals("Portland", newJob.getCity());
  }




}
