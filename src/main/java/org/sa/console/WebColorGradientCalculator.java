package org.sa.console;

import java.awt.Color;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// for HTML/JS/Leaflet-compatible hex colors
public class WebColorGradientCalculator {

  public List<String> generateGradient(Color startColor, Color endColor, int stepCount) {
    return IntStream.rangeClosed(0, stepCount - 1)
        .mapToObj(step -> toHexColor(
            getChannelGradientByStep(startColor.getRed(), endColor.getRed(), step, stepCount),
            getChannelGradientByStep(startColor.getGreen(), endColor.getGreen(), step, stepCount),
            getChannelGradientByStep(startColor.getBlue(), endColor.getBlue(), step, stepCount)
        ))
        .collect(Collectors.toList());
  }

  public List<String> generateGradient(Color startColor, Color midColor, Color endColor, int numberOfColors) {
    int firstHalf = numberOfColors / 2;
    int secondHalf = numberOfColors - firstHalf + 1;

    List<String> first = generateGradient(startColor, midColor, firstHalf);
    List<String> second = generateGradient(midColor, endColor, secondHalf);

    return Stream.concat(first.stream(), second.stream().skip(1)).collect(Collectors.toList());
  }

  private int getChannelGradientByStep(int start, int end, int step, int steps) {
    return start + (end - start) * step / (steps - 1);
  }

  private String toHexColor(int r, int g, int b) {
    return "#" + toHex(r) + toHex(g) + toHex(b);
  }

  private String toHex(int value) {
    String hex = Integer.toHexString(value).toUpperCase();
    return hex.length() == 1 ? "0" + hex : hex;
  }
}
