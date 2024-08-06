package org.sa.console;

import java.util.List;

// ANSI color escape codes are special sequences of characters
// used to control the color and formatting of text in terminal or console environments
public class Colors {
  // Reset
  public static final String RESET = "\u001B[0m";

  // Regular Colors
  public static final String BLACK = "\u001B[30m";
  public static final String RED = "\u001B[31m";
  public static final String GREEN = "\u001B[32m";
  public static final String YELLOW = "\u001B[33m";
  public static final String BLUE = "\u001B[34m";
  public static final String PURPLE = "\u001B[35m";
  public static final String CYAN = "\u001B[36m";
  public static final String WHITE = "\u001B[37m";
  public static final String ORANGE = "\u001B[38;5;208m"; // Orange
  public static final String MAGENTA = "\u001B[35m"; // Magenta
  public static final String BROWN = "\u001B[38;5;130m"; // Brown
  public static final String LIGHT_GRAY = "\u001B[37m"; // Light Gray
  public static final String DARK_GRAY = "\u001B[90m"; // Dark Gray
  public static final String LIGHT_RED = "\u001B[91m"; // Light Red
  public static final String LIGHT_GREEN = "\u001B[92m"; // Light Green
  public static final String LIGHT_YELLOW = "\u001B[93m"; // Light Yellow
  public static final String LIGHT_BLUE = "\u001B[94m"; // Light Blue
  public static final String LIGHT_PURPLE = "\u001B[95m"; // Light Purple
  public static final String LIGHT_CYAN = "\u001B[96m"; // Light Cyan

  // Bright Colors
  public static final String BRIGHT_BLACK = "\u001B[90m";
  public static final String BRIGHT_RED = "\u001B[91m";
  public static final String BRIGHT_GREEN = "\u001B[92m";
  public static final String BRIGHT_YELLOW = "\u001B[93m";
  public static final String BRIGHT_BLUE = "\u001B[94m";
  public static final String BRIGHT_PURPLE = "\u001B[95m";
  public static final String BRIGHT_CYAN = "\u001B[96m";
  public static final String BRIGHT_WHITE = "\u001B[97m";

  // Background Colors
  public static final String BG_BLACK = "\u001B[40m";
  public static final String BG_RED = "\u001B[41m";
  public static final String BG_GREEN = "\u001B[42m";
  public static final String BG_YELLOW = "\u001B[43m";
  public static final String BG_BLUE = "\u001B[44m";
  public static final String BG_PURPLE = "\u001B[45m";
  public static final String BG_CYAN = "\u001B[46m";
  public static final String BG_WHITE = "\u001B[47m";


  // Bright Background Colors
  public static final String BG_BRIGHT_BLACK = "\u001B[100m";
  public static final String BG_BRIGHT_RED = "\u001B[101m";
  public static final String BG_BRIGHT_GREEN = "\u001B[102m";
  public static final String BG_BRIGHT_YELLOW = "\u001B[103m";
  public static final String BG_BRIGHT_BLUE = "\u001B[104m";
  public static final String BG_BRIGHT_PURPLE = "\u001B[105m";
  public static final String BG_BRIGHT_CYAN = "\u001B[106m";
  public static final String BG_BRIGHT_WHITE = "\u001B[107m";



  public static final String YELLOW_GREEN = "\u001B[38;5;154m";
  public static final String SLIGHTLY_YELLOWISH_GREEN = "\u001B[38;2;173;255;47m";
  public static final String SLIGHTLY_GREENISH_YELLOW = "\u001B[38;2;225;255;128m";


  public static final String A0_VERY_GREEN = "\u001B[38;2;46;172;102m";
  public static final String A1_GREEN = "\u001B[38;2;126;188;87m";
  public static final String A2_SALAD = "\u001B[38;2;179;205;65m";
  public static final String A3_YELLOW = "\u001B[38;2;223;221;25m";
  public static final String A4_ORANGE = "\u001B[38;2;250;186;11m";
  public static final String A5_VERY_ORANGE = "\u001B[38;2;240;133;60m";

  public static final List<String> greenOrangeGradient0to5 = List.of(A0_VERY_GREEN, A1_GREEN, A2_SALAD, A3_YELLOW, A4_ORANGE, A5_VERY_ORANGE);

  //RGB
  public static String getANSIEscapeColour(int red, int green, int blue) {
    return String.format("\u001B[38;2;%d;%d;%dm", red, green, blue);
  }

  public static String getANSIEscapeBlackWhite(int redGreenBlue){
    return getANSIEscapeColour(redGreenBlue, redGreenBlue, redGreenBlue);
  }
}




