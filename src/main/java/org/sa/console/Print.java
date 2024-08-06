package org.sa.console;

import java.awt.*;
import java.util.List;

public class Print {
  private static final List<String> gradientColors = new ColorGradientCalculator().generateGradient(new Color(0, 153, 153), Color.YELLOW, Color.RED, 8);

  public static void nthLightGrayNewline(int nthItemIsColored, String... s) {
    print(true, Colors.LIGHT_GRAY, nthItemIsColored, s);
  }

  public static void darkGreyNewLine(String s) {
    System.out.println(Colors.getANSIEscapeBlackWhite(70) + s + Colors.RESET);
  }

  public static void darkGreyInline(String s) {
    System.out.print(Colors.getANSIEscapeBlackWhite(70) + s + Colors.RESET);
  }

  public static void nthGradientNewline(int gradientIndex, int nthItemIsColored, String... printableAdditives) {
    print(true, gradientIndex, nthItemIsColored, printableAdditives);
  }

  public static void nthGradientInline(int gradientIndex, int nthItemIsColored, String... printableAdditives) {
    print(false, gradientIndex, nthItemIsColored, printableAdditives);
  }
  private static void print(Boolean endWithNewLine, int gradientIndex, int nthItemIsColored, String... printableAdditives) {
    print(endWithNewLine, gradientColors.get(gradientIndex), nthItemIsColored, printableAdditives);
  }

  private static void print(Boolean endWithNewLine, String color, int nthItemIsColored, String... printableAdditives) {
    for (int i = 0; i < printableAdditives.length; i++) {
      if (i == nthItemIsColored) System.out.print(color + printableAdditives[i] + Colors.RESET);
      else System.out.print(printableAdditives[i]);
    }
    if (endWithNewLine) System.out.println("");
  }
}
