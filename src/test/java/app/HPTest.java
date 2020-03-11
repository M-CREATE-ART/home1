package app;


import HW6Package.Family;
import HW6Package.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HPTest {
    private Human human;

    @BeforeEach
    static void beforeAll() {

    }

    @Test
    void test1() {
        int expected= 2;
        int actual=Human.addChild();
        assertEquals(expected, actual);
    }

    @Test
    void test2() {
        int expected= 2;
        int actual= Human.deleteChild(human);
        assertEquals(expected, actual);
    }

    @Test
    void test3() {
        int expected= 1;
        int actual= Human.countFamily();
        assertEquals(expected, actual);
    }

    private void assertEquals(int expected, int actual) {

    }
}
