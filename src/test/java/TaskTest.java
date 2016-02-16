import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

  @Test
  public void Task_instantiatesCorrectly_true() {
    Task myTask =new Task("Do the homework");
    assertEquals(true, myTask instanceof Task);
  }

  @Test
  public void task_instantiatesWithDescription_true() {
    Task myTask = new Task("Do the homework");
    assertEquals("Do the homework", myTask.getDescription());
  }
}
