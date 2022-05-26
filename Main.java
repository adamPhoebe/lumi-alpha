public class Main {
  public static void main(String[] args) {
    Shortcuts s = new Shortcuts();
    Warnings w = new Warnings();
    ScreenRender c = new ScreenRender(64, 18);
    s.clear();
    w.compatibility();
    w.colorTest();
    s.clear();
    c.fillBG(202,88,'g');
    c.drawPixel(32,9,19,23,'t');
    c.update();
  }
}