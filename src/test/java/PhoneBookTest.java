import di_rover.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PhoneBookTest {

    private static PhoneBook phoneBook; // Объект, который создается один раз для всех тестов

    @BeforeAll
    public static void setUp() {
        phoneBook = new PhoneBook(); // Создаем новый объект перед выполнением всех тестов
    }

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


        assertThat(expected, is(result)); //hamcrest
    }


    @Test
    public void testFindByNumber() {
        String expected = "John";
        phoneBook.add(4, expected);
        String result = phoneBook.findByNumber(4);

        assertThat(expected, is(result));
    }

}
