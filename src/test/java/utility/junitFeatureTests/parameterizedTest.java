package utility.junitFeatureTests;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;
import utility.enumX;


public class parameterizedTest {
    @BeforeEach
    void beforeEach(){
        System.out.println("beforeEach");
    }

    @ParameterizedTest
    @ValueSource(longs = {1, 2, 3, 4, 5})
    void paramTest(long x) {
        System.out.println(x);
    }

    @ParameterizedTest
    @EnumSource(value = enumX.class)
    void paramEnumTest(enumX x) {
        System.out.println(x);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/product-point-data.csv")
    void discountShouldBeAppliedCsvFileSource(long productId, long points) {
        System.out.println("ProductId= " + productId + " Points= " + points);
    }


}
