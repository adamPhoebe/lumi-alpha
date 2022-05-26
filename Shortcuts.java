public class Shortcuts {
  // CLEAR SCREEN
  public void clear(){
    System.out.println("\033[H\033[2J");
    System.out.flush();
  }

  // RESET BOTH COLORS AND FORMATTING
  public String reset(){
    return "\033[0m";
  }

  // GET A 6 VALUE ANSI COMPATIBLE CODE FROM 3 VALUES.
  public int rgb6(int r, int g, int b){
    int output = 0;
    int[] colProc = new int[3];
    colProc[0] = Math.max(0, Math.min(5, r));
    colProc[1] = Math.max(0, Math.min(5, g));
    colProc[2] = Math.max(0, Math.min(5, b));
    output = 16 + ((colProc[0]*36) + (colProc[1]*6) + colProc[2]);
    return output;
  }
  
  // GET ANSI CODE FOR A COLORED FG
  public String getFG(int col){
    return "\033[38;5;"+ col +"m";
  }

  // GET ANSI CODE FOR A COLORED BG
  public String getBG(int col){
    return "\033[48;5;"+ col +"m";
  }

  // GET A COLORED STRING (WITH BOTH FG AND BG)
  public String color(int fg, int bg, String content){
    return "\033[38;5;" + fg + "m" + "\033[48;5;" + bg + "m" + content + "\033[0m";
  }

  // PRINT STRING WITH COLORS
  public void printColor(int fg, int bg, String content){
    System.out.println("\033[38;5;" + fg + "m" + "\033[48;5;" + bg + "m" + content + "\033[0m");
  }

  // PRINT STRING WITH COLORS AND 1 FORMAT
  public void printColor(int fg, int bg, String content, String format){
    int formatInt = 0;
    switch(format){
      case "bold":
        formatInt = 1;
        break;
      case "dim":
        formatInt = 2;
        break;
      case "faint":
        formatInt = 2;
        break;
      case "italic":
        formatInt = 3;
        break;
      case "underline":
        formatInt = 4;
        break;
      case "blinking":
        formatInt = 5;
        break;
      case "blink":
        formatInt = 5;
        break;
      case "under":
        formatInt = 4;
        break;
      case "inverse":
        formatInt = 7;
        break;
      case "reverse":
        formatInt = 7;
        break;
      case "hidden":
        formatInt = 8;
        break;
      case "invisible":
        formatInt = 8;
        break;
      case "clear":
        formatInt = 8;
        break;
      case "strikethrough":
        formatInt = 9;
        break;
      case "line":
        formatInt = 9;
        break;
      case "strike":
        formatInt = 9;
        break;
    }
    System.out.println("\033[38;5;" + fg + "m" + "\033[48;5;" + bg + "m" + "\033[" + formatInt + "m" + content + "\033[0m");
  }

  // PRINT INTEGER
  public void println(int content){
    System.out.println(content);
  }

  // PRINT CHARACTER
  public void println(char content){
    System.out.println(content);
  }

  // PRINT STRING
  public void println(String content){
    System.out.println(content);
  }

  // RETURN SINGLE FORMAT STRING
  public String bold(String c){
    return "\033[1m" + c + "\033[22m";
  }

  public String dim(String c){
    return "\033[2m" + c + "\033[22m";
  }

  public String italic(String c){
    return "\033[3m" + c + "\033[23m";
  }

  public String underline(String c){
    return "\033[4m" + c + "\033[24m";
  }

  public String blink(String c){
    return "\033[5m" + c + "\033[25m";
  }

  public String inverse(String c){
    return "\033[7m" + c + "\033[27m";
  }

  public String hidden(String c){
    return "\033[8m" + c + "\033[28m";
  }

  public String strike(String c){
    return "\033[9m" + c + "\033[29m";
  }

  // RETURN FORMATTED STRING
  public String getFormatBinary(String b){
    String binary = b;
    String ansiOutput = "";
    if(binary.charAt(0) == '1'){
      ansiOutput += "\033[1m";
    } else { ansiOutput += ""; }
    if(binary.charAt(1) == '1'){
      ansiOutput += "\033[2m";
    } else { ansiOutput += ""; }
    if(binary.charAt(2) == '1'){
      ansiOutput += "\033[3m";
    } else { ansiOutput += ""; }
    if(binary.charAt(3) == '1'){
      ansiOutput += "\033[4m";
    } else { ansiOutput += ""; }
    if(binary.charAt(4) == '1'){
      ansiOutput += "\033[5m";
    } else { ansiOutput += ""; }
    if(binary.charAt(5) == '1'){
      ansiOutput += "\033[7m";
    } else { ansiOutput += ""; }
    if(binary.charAt(6) == '1'){
      ansiOutput += "\033[8m";
    } else { ansiOutput += ""; }
    if(binary.charAt(7) == '1'){
      ansiOutput += "\033[9m";
    } else { ansiOutput += ""; }
    return ansiOutput;
    }

  public String getFormat(String b){
    String inputLine = b.toLowerCase();
    String ansiOutput = "";
    if(inputLine.indexOf("bold") != -1){
      ansiOutput += "\033[1m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("fade") != -1 || inputLine.indexOf("dim") != -1 || inputLine.indexOf("faint") != -1){
      ansiOutput += "\033[2m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("italic") != -1){
      ansiOutput += "\033[3m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("under") != -1){
      ansiOutput += "\033[4m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("blink") != -1){
      ansiOutput += "\033[5m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("inverse") != -1 || inputLine.indexOf("reverse") != -1){
      ansiOutput += "\033[7m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("hidden") != -1 || inputLine.indexOf("invisible") != -1 || inputLine.indexOf("clear") != -1){
      ansiOutput += "\033[8m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("strike") != -1){
      ansiOutput += "\033[9m";
    } else { ansiOutput += ""; }
    return ansiOutput;
    }

  public String getFormatChar(String b){
    String inputLine = b.toLowerCase();
    String ansiOutput = "";
    if(inputLine.indexOf("b") != -1){
      ansiOutput += "\033[1m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("f") != -1){
      ansiOutput += "\033[2m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("i") != -1){
      ansiOutput += "\033[3m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("u") != -1){
      ansiOutput += "\033[4m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("k") != -1){
      ansiOutput += "\033[5m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("x") != -1){
      ansiOutput += "\033[7m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("h") != -1){
      ansiOutput += "\033[8m";
    } else { ansiOutput += ""; }
    if(inputLine.indexOf("s") != -1){
      ansiOutput += "\033[9m";
    } else { ansiOutput += ""; }
    return ansiOutput;
    }

  // WAIT SECONDS
  public void wait(int sec){
    try
    {
        Thread.sleep(sec * 1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
  }
}