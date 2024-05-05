import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.AverageOfSubarrayOfSizeK;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

@SuppressWarnings("unused")
public class AverageOfSubarrayOfSizeKTest {

    @ParameterizedTest(name = "{0} -- brute({1}) == {2}")
    @DisplayName("brute test")
    @CsvSource(value = {
            "testBrute1 : 5 : 1, 3, 2, 6, -1, 4, 1, 8, 2 : [2.2, 2.8, 2.4, 3.6, 2.8]",
    }, delimiter = ':')
    public void testBrute(String name, int k, String input, String expected) {
        int[] param = Arrays.stream(input.split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        var result = Arrays.toString(AverageOfSubarrayOfSizeK.findAveragesBrute(param, k));

        assertEquals(expected, result);
    }

    @Test
    public void test() {
        int[] param = {1, 3, 2, 6, -1, 4, 1, 8, 2};

        assertArrayEquals(new double[]{2.2, 2.8, 2.4, 3.6, 2.8}, AverageOfSubarrayOfSizeK.findAverages(param, 5));
    }
}
