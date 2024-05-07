import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.MinSubArraySum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

@SuppressWarnings("unused")
class MinSubArraySumTest{
    @ParameterizedTest(name = "{0} -- findMinSubArray({1}, [{2}]) == {3}")
    @DisplayName("find min sub array test")
    @CsvSource(value = {
            "test1 : 7 : 2, 1, 5, 2, 3, 2 : 2",
            "test2 : 7 : 2, 1, 5, 2, 8 : 1",
            "test3 : 8 : 3, 4, 1, 1, 6 : 3"
    }, delimiter = ':')
    public void test(String name, int sum, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = MinSubArraySum.findMinSubArray(sum, param); // .toString()

        assertEquals(expected, result);
    }
}
