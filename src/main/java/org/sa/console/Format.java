package org.sa.console;

public class Format {
  public static final String RESET = "\033[0m";

  public static final String BOLD = "\033[1m";
  public static final String UNDERLINE = "\033[4m";
  public static final String ITALIC = "\033[3m";
  public static final String STRIKETHROUGH = "\033[9m";
  public static final String DIM = "\033[2m";        // reduces intensity
  public static final String BLINK = "\033[5m";      // makes to blink (may not work on all terminals)
  public static final String REVERSED = "\033[7m";   // inverts foreground and background colors.
}
