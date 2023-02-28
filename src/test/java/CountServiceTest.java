import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.CountService;

public class CountServiceTest {
    @Test
    public void testCalculateCountMonths1() {
        CountService service = new CountService();
        int countmonths = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(3, countmonths);
    }

    @Test
    public void testCalculateCountMonths2() {
        CountService service = new CountService();
        int countmonths = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(2, countmonths);
    }
}