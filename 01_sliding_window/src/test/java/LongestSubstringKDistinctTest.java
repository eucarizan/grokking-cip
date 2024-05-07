import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.LongestSubstringKDistinct;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class LongestSubstringKDistinctTest{
    @ParameterizedTest(name = "{0} -- findLength({1}) == {2}")
    @DisplayName("find length test")
    @CsvSource(value = {
            "test1 : araaci : 2 : 4",
            "test2 : araaci : 1 : 2",
            "test3 : cbbebi : 3 : 5"
    }, delimiter = ':')
    public void test(String name, String input, int k, int expected) {
        var result = LongestSubstringKDistinct.findLength(input, k); // .toString()

        assertEquals(expected, result);
    }
}