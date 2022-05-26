public class Warnings {
  Shortcuts s = new Shortcuts();
  public void apPresents(){
    s.printColor(255, 16, "                                        ");
    s.printColor(255, 16, s.getFormatChar("bi") + "    adamPhoebe Productions presents:    ");
    s.printColor(255, 16, "                                        ");
  }

  public void compatibility(){
    s.println("╔Warning══════════════════════════╗\n║ Some terminals do not support   ║\n║ colored ANSI escape codes.      ║\n║                                 ║\n║ The lines below will test your  ║\n║ terminal's ability to display   ║\n║ custom lettering, including     ║\n║ colors and formatting. If you   ║\n║ see something that doesn't seem ║\n║ right, please switch to an Unix ║\n║ based terminal, like Windows    ║\n║ Terminal on Windows 11, or use  ║\n║ the Replit version of this      ║\n║ project.                        ║\n║                                 ║\n║ A monochrome version is         ║\n║ currently in the works.         ║\n║                          -Adam  ║\n╚═════════════════════════════════╝");
  }

  public void colorTestFull(){
    String cl = "";
    for(int i = 16; i < 256; i++){
      for(int h = 16; h < 256; h++){
        cl += s.color(i, h, "#");
      }
    }
    s.println(cl);
  }

  public void colorTest(){
    s.printColor(220, 57, s.getFormat("bold and italic")+"This text should be orangish-yellow on a blueish-purple background.   ");
    s.printColor(255, 16, s.getFormat("bold")+"This text should be bold                                              ");
    s.printColor(255, 16, s.getFormat("fade")+"This text should be slightly faded away.                              ");
    s.printColor(255, 16, s.getFormat("italic")+"This text should be italic.                                           ");
    s.printColor(255, 16, s.getFormat("underline")+"This text should be underlined.                                       ");
    s.printColor(255, 16, s.getFormat("reverse")+"This text should be reversed.                                         ");
    s.printColor(255, 16, s.getFormat("blinking")+"This text should be blinking.                                         ");
    s.printColor(255, 16, "The following text should not be readable: "+s.getFormat("hidden")+"This text should be hidden.");
    s.printColor(255, 16, s.getFormat("strikethrough")+"This text should be strikethrough.                                    ");
  }
}