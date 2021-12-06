package test.junitFeatureTests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
// if define like per_class,dont have to put static word on method and variables
//if you dont per_method,must put static word on method and variables
public class privilegeTest {
    privilegeTest() {
        System.out.println("constructor");
    }

    @BeforeAll
    void beforeAll() {
        System.out.println("beforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }

    @AfterAll
    void afterAll() {
        System.out.println("afterAll");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test
    @RepeatedTest(2)
    void test2() {
        System.out.println("test2");
    }

    @Test
    @EnabledOnJre({JRE.JAVA_9})
    void testOnJRE9() {
    }
}
