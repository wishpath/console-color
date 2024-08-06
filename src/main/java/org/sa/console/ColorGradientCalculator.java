package org.sa.console;

import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.sa.console.Colors.getANSIEscapeColour;

public class ColorGradientCalculator {

  public List<String> generateGradient(Color startColor, Color endColor, int stepCount) {
    return IntStream.rangeClosed(0, stepCount - 1)
        .mapToObj(step -> getANSIEscapeColour(
            getChannelGradientByStep(startColor.getRed(), endColor.getRed(), step, stepCount),
            getChannelGradientByStep(startColor.getGreen(), endColor.getGreen(), step, stepCount),
            getChannelGradientByStep(startColor.getBlue(), endColor.getBlue(), step, stepCount)
        ))
        .collect(Collectors.toList());
  }

  public List<String> generateGradient(Color startColor, Color midColor, Color endColor, int numberOfColours) {
    int firstHalfNumberOfColoursWithMid = numberOfColours / 2;
    int secondHalfNumberOfColoursWithMid = numberOfColours - firstHalfNumberOfColoursWithMid + 1;

    List<String> firstHalfWithMid = generateGradient(startColor, midColor, firstHalfNumberOfColoursWithMid);
    List<String> secondHalfWithMid = generateGradient(midColor, endColor, secondHalfNumberOfColoursWithMid);

    // Concatenate the two halves ensuring midColor is not duplicated
    return Stream.concat(firstHalfWithMid.stream(), secondHalfWithMid.stream().skip(1))
        .collect(Collectors.toList());
  }

  private int getChannelGradientByStep(int start, int end, int step, int numberOfColours) {
    int amplitude = end - start;
    int amplitudeShareByStep = amplitude * step / (numberOfColours - 1);
    return start + amplitudeShareByStep;
  }
}