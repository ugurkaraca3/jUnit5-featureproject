package utility.junitFeatureTests;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class dynamicTestugur {

    @BeforeEach
    void beforeEach(){
        System.out.println("beforeEach");
    }
    @TestFactory
    Collection<DynamicTest> dynamicTestFromCollection() {
        return Arrays.asList(
                dynamicTest("1st dynamic test", () -> Assertions.assertEquals(1, 1)),
                dynamicTest("2nd dynamic test", () -> Assertions.assertTrue(1 == 1))
        );
    }

    @TestFactory
    Iterable<DynamicTest> dynamicTestFromIterable() {
        return Arrays.asList(
                dynamicTest("1st dynamicTest", () -> Assumptions.assumingThat(1 == 1, () -> System.out.println("1st executed"))),
                dynamicTest("2nd dynamictest", () -> Assumptions.assumingThat(1 == 1, () -> System.out.println("2nd executed")))
        );


    }


}
