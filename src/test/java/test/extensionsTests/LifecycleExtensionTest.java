package test.extensionsTests;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(LifecycleExtensions.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LifecycleExtensionTest {
    @BeforeAll
    void beforeAll(){
        System.out.println("BeforeAll");
    }
    @AfterAll
    void afterAll(){
        System.out.println("AfterAll");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("BeforeEach");
    }
    @AfterEach
    void afterEach(){
        System.out.println("AfterEach");
    }

    @Test
    void test1(){
        System.out.println("Test1");
    }
}
