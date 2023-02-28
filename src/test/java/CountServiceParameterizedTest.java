import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaqa.CountService;

public class CountServiceParameterizedTest {
    @ParameterizedTest
    @CsvFileSource(files = "csv/test/resources/count.csv")
    public void testCalculateCountMonths(int expected, int income, int expenses, int threshold) {
        CountService service = new CountService();
        int countmonths = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, countmonths);
    }
}
