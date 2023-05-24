package Test;
import hello.Hello;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    Hello sut = new Hello();

 @ParameterizedTest //en test som kan köras med olika parametrar
    @ValueSource(strings = {"Alice", "Bob", "Carol"}) //en lista med parametrar
    void testSayHello(String name) {
        String expected = "Hello, " + name + "!";
        String actual = sut.sayHello(name);
        assertEquals(expected, actual);
    }
}