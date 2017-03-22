import org.junit.*;
import static org.junit.Assert.*;

public class JobTest {

  @Test
  public void newJob_instanceOfJobConstructor(){
  Job newJob = new Job("developer", "a", true);
  assertEquals("developer", newJob.getJobTitle());
  assertEquals("a", newJob.getJobDescription());
  assertEquals(true, newJob.getJobStatus());
  }
}
