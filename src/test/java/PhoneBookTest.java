import di_rover.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PhoneBookTest {

    static PhoneBook phoneBook = new PhoneBook();;

    public static Stream<Arguments> testAdd() {
        return Stream.of(
                Arguments.of(4, "John", 1),
                Arguments.of(16, "Carl", 2),
                Arguments.of(32, "Stiven", 3),
                Arguments.of(2, "Alan", 4),
                Arguments.of(322, "Alan", 4)
        );
    }

    @MethodSource
    @ParameterizedTest
    public void testAdd(int number, String name, int expected) {
        int result = phoneBook.add(number, name);


        Assertions.assertEquals(expected, result);

        assertThat(expected, is(result)); //hamcrest

    }
}
