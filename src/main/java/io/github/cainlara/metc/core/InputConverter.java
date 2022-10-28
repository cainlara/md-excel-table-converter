package io.github.cainlara.metc.core;

import java.util.List;

public class InputConverter {
  private static InputConverter instance;

  private InputConverter() {
    // hide constructor
  }

  public static InputConverter getInstance() {
    if (instance == null) {
      instance = new InputConverter();
    }

    return instance;
  }

  public void saveContent(final List<String> lines, final String outputPath) {
    System.out.println(lines);
    System.out.println(outputPath);

  }

}
