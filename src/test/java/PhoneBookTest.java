import di_rover.PhoneBook;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PhoneBookTest {

    PhoneBook phoneBook;

    @BeforeEach
    public void setPhoneBook() {
        phoneBook = new PhoneBook();
    }

    @AfterEach
    public void tearDown() {
        phoneBook = null;
    }


    public static Stream<Arguments> testAdd() {
        return Stream.of(
                Arguments.of(4, 4),
                Arguments.of(16, 16),
                Arguments.of(32, 34)
        );
    }

    @MethodSource
    @ParameterizedTest
    public void testAdd(int a, int expected) {
        int result = phoneBook.add(a);


        Assertions.assertEquals(expected, result);

        assertThat(expected, is(result)); //hamcrest

    }

}
