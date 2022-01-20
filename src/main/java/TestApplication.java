import test.TestScene2D;
import test.TestScene3D;
import ui.GenericCGApplication;

/**
 * This application can be used to test the UI functionality.
 */
public class TestApplication extends GenericCGApplication {
  public TestApplication() {
    super("Test-Application");
    //addScene2D(new TestScene2D(600, 600));
    setScene3D(new TestScene3D());
    addScene2D(new TestScene2D(600, 600));
  }

  public static void main(String[] args) {
    new TestApplication();
  }
}
