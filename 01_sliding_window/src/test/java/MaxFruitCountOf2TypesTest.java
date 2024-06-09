import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.MaxFruitCountOf2Types;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
class MaxFruitCountOf2TypesTest{
    @ParameterizedTest(name = "{0} -- MaxFruitCountOf2Types.findLength({1}) == {2}")
    @DisplayName("param test")
    @CsvSource(value = {
            "test1 : ABCAC : 3",
            "test2 : ABCBBC : 5"
    }, delimiter = ':')
    public void test(String name, String input, int expected) {
//        Character[] param = Arrays.stream(input.split(", ")).map(e -> e.charAt(0))
//                .toArray(Character[]::new);
        char[] param = input.toCharArray();

        var result = MaxFruitCountOf2Types.findLength(param); // .toString()

        assertEquals(expected, result);
    }
}