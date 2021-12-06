package test.junitFeatureTests;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class assumptionTest {
    @Test
    void assump(){

        Assumptions.assumeTrue(1==2);
        Assumptions.assumingThat(1==1,()-> System.out.println("assumptionpassed"));
    }
}
