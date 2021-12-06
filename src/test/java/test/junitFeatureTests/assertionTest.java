package test.junitFeatureTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

//@ExtendWith(TestExceptionHandlerExtension.class)
public class assertionTest {

    @Test
    void assertTest() {
        List<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        int ins1[] = {1, 2, 3};
        int ins2[] = {1, 2, 3};
        Assertions.assertEquals(1, test.get(0));
        Assertions.assertTrue(test.get(0) == (Integer) 1);

        Assertions.assertArrayEquals(ins1, ins2);
        Assertions.assertAll(
                () -> Assertions.assertTrue(test.get(0).equals(1)),
                () -> Assertions.assertNotEquals(test.get(0), 6),
                () -> Assertions.assertFalse(test.get(2).equals(5)));

//        Assertions.assertAll(
//                ()-> Assertions.assertTrue(test.get(0).equals(1)),
//                ()->Assertions.assertNotEquals(test.get(0),1),
//                ()->Assertions.assertFalse(test.get(2).equals(3)));

        int byZero = 1 / 0;
        Assertions.assertThrows(ArithmeticException.class, () -> Assertions.assertEquals(0, byZero));
    }
}