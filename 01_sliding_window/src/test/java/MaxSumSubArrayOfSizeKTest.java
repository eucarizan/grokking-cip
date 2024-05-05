import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.MaxSumSubArrayOfSizeK;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("unused")
class SomeParamTest {
    @ParameterizedTest(name = "{0} -- findMaxSumSubArray({1}, [{2}]) == {3}")
    @DisplayName("find max sum sub array test")
    @CsvSource(value = {
            "test1 : 3 : 2, 1, 5, 1, 3, 2 : 9",
            "test2 : 2 : 2, 3, 4, 1, 5 : 7"
    }, delimiter = ':')
    public void test(String name, int k, String input, int expected) {
        int[] param = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();

        var result = MaxSumSubArrayOfSizeK.findMaxSumSubArray(k, param); // .toString()

        assertEquals(expected, result);
    }
}