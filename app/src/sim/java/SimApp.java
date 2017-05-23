/***
 *
 */
public class SimApp extends SimSub {
  public SimApp() {
    super("Hello from SimApp!");
  }

  public static void main(String arg[]) {
    new SimApp().print();
  }
}
