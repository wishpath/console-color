package org.sa.console;

//projects: words-sorter
public class SimpleColorPrint {
  public static void normal(String s) { System.out.println(s); }
  public static void blue(String s) { color(s, Colors.BLUE); }
  public static void yellow(String s) { color(s, Colors.YELLOW); }
  public static void red(String s) { color(s, Colors.RED); }
  public static void color(String s, String colorCode) { System.out.println(colorCode + s + Colors.RESET); }
}
