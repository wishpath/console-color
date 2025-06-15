package org.sa.console;

public class ColoredString {

  public static String red(String s) {
    return color(s, Colors.RED);
  }
  public static String blue(String s) {
    return color(s, Colors.BLUE);
  }
  public static String yellow(String s) {
    return color(s, Colors.YELLOW);
  }
  public static String orange(String s) {
    return color(s, Colors.ORANGE);
  }
  public static String green(String s) {
    return color(s, Colors.GREEN);
  }
  public static String gray(String s) {
    return color(s, Colors.LIGHT_GRAY);
  }

  private static String color(String s, String ansiColorEscapeCode) {
    return ansiColorEscapeCode + s + Colors.RESET;
  }
}
