package utility.extensionsTests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class TestExceptionHandlerExtension implements TestExecutionExceptionHandler {
    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {

        if (throwable instanceof ArithmeticException) {
            System.out.println("ArithmeticException");
        } else if (throwable instanceof IllegalArgumentException) {
            System.out.println("IllegalArgumentException");
        } else {
            System.out.println(throwable.getMessage());
        }
    }
}
