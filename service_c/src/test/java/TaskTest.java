import org.example.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TaskTest {
    @Test
    public void MassageExecutingTask(){
        Task task1 = new Task();
        Assertions.assertEquals("Executing service_c task...", Task.getMessage());
    }
}
