package utility.extensionsTests;

import org.junit.jupiter.api.extension.*;

public class LifecycleExtensions implements BeforeAllCallback, AfterAllCallback, BeforeEachCallback, AfterEachCallback {
    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("AfterAllCallback");
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("AfterEachCallback");
    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("BeforeAllCallback");
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("BeforeEachCallback");
    }
}
