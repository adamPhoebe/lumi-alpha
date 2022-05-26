public class ScreenRender{
  private int width;
  private int height;
  
  private char[][] charData = new char[255][255];
  private int[][] colorData = new int[255][255];
  private int[][] bgData = new int[255][255];
  private String[][] formatData = new String[255][255];
  private String[][] screenData = new String[255][255];
  
  Shortcuts s = new Shortcuts();
  
  public ScreenRender(int h, int w){
    this.width = w;
    this.height = h;

    for(int i = 0; i < this.width; i++){
      for(int g = 0; g < this.height; g++){
        this.charData[i][g] = ' ';
        this.colorData[i][g] = 16;
        this.bgData[i][g] = 16;
        this.formatData[i][g] = "";
        this.screenData[i][g] = s.getFG(this.colorData[i][g]) + s.getBG(this.bgData[i][g]) + s.getFormatChar(this.formatData[i][g]) + this.charData[i][g] + s.reset();
      }
    }
  }

  public void fillBG(int bg, int fg, char cl){
    for(int i = 0; i < this.width; i++){
      for(int h = 0; h < this.height; h++){
        this.colorData[i][h] = fg;
        this.bgData[i][h] = bg;
        this.charData[i][h] = cl;
        this.screenData[i][h] = s.getFG(this.colorData[i][h]) + s.getBG(this.bgData[i][h]) + s.getFormatChar(this.formatData[i][h]) + this.charData[i][h] + s.reset();
      }
    }
  }

  public void fillBG(int bg, int fg, String fr, char cl){
    for(int i = 0; i < this.width; i++){
      for(int h = 0; h < this.height; h++){
        this.colorData[i][h] = fg;
        this.bgData[i][h] = bg;
        this.charData[i][h] = cl;
        this.formatData[i][h] = s.getFormatChar(fr);
        this.screenData[i][h] = s.getFG(this.colorData[i][h]) + s.getBG(this.bgData[i][h]) + this.formatData[i][h] + this.charData[i][h] + s.reset();
      }
    }
  }

  public void fillBGFormat(int bg, int fg, String fr, char cl){
    for(int i = 0; i < this.width; i++){
      for(int h = 0; h < this.height; h++){
        this.colorData[i][h] = fg;
        this.bgData[i][h] = bg;
        this.charData[i][h] = cl;
        this.formatData[i][h] = s.getFormat(fr);
        this.screenData[i][h] = s.getFG(this.colorData[i][h]) + s.getBG(this.bgData[i][h]) + this.formatData[i][h] + this.charData[i][h] + s.reset();
      }
    }
  }

  public void drawPixel(int x, int y, int bg, int fg, char ch){
    this.colorData[x][y] = bg;
    this.bgData[x][y] = fg;
    this.charData[x][y] = ch;
    this.screenData[x][y] = s.getFG(this.colorData[x][y]) + s.getBG(this.bgData[x][y]) + this.formatData[x][y] + this.charData[x][y] + s.reset();
  }

  public void update(){
    String lineprint = "";
    s.clear();
    for(int i = 0; i < this.width; i++){
      for(int h = 0; h < this.height; h++){
        //+Integer.toString(i)+Integer.toString(h)
        lineprint+=screenData[i][h];
      }
      System.out.println(lineprint);
      lineprint = "";
    }
  }
}