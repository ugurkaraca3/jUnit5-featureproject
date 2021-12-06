package test.junitFeatureTests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderTest {
    @Test
    @Order(1)
    @EnabledOnJre({JRE.JAVA_9})
    void a3(){
        System.out.println("c");

    }
    @Test
    @Order(2)
    @DisplayName("testa1")
    void a1(){
        System.out.println("b");
    }
    @Test
    @Order(-1)
    void a2() {
        System.out.println("a");
    }



    //    @Test
//    void c(){
//        System.out.println("c");
//    }
//    @Test
//    void b(){
//        System.out.println("b");
//    }
//    @Test
//    void a() {
//        System.out.println("a");
//    }

}
