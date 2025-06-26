package org.sa.console.app;

import org.sa.console.Colors;

import java.util.Arrays;

public class TestColors {
  public static void main(String[] args) {
    printAllColors();
  }
  static void printAllColors() {
    var fields = Colors.class.getDeclaredFields();
    Arrays.stream(fields)
        .filter(f -> f.getType() == String.class)
        .forEach(f -> {
          try {
            var colorCode = (String) f.get(null);
            System.out.println(colorCode + f.getName() + Colors.RESET);
          } catch (IllegalAccessException ignored) {}
        });
  }
}
