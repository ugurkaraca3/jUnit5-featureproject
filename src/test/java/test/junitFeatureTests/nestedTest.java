package test.junitFeatureTests;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class nestedTest  {


    @BeforeAll
    void beforeAll(){
        System.out.println("beforeAll");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("firstBeforeEach");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Nested
    class nested2 {
        @BeforeEach
        void nested2BeforeEach() {
            System.out.println("nested2BeforeEach");
        }

        @Test
        void nested2Test() {
            System.out.println("nested2Test");
        }

        @Nested
        class nested3 {
            @BeforeEach
            void nested3BeforeEach() {
                System.out.println("nested3BeforeEach");
            }

            @Test
            void nested3Test() {
                System.out.println("nested3Test");
            }
        }
    }

    @Nested
    class nested1 {
        @BeforeEach
        void nested1BeforeEach() {
            System.out.println("nested1BeforeEach");
        }

        @Test
        void nested1Test() {
            System.out.println("nested1Test");
        }
    }

}
