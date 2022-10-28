package io.github.cainlara.metc;

import java.io.File;
import java.util.List;

import io.github.cainlara.metc.core.InputConverter;
import io.github.cainlara.metc.util.FileUtils;

public class Application {

  public static void main(final String[] args) {
    if (args != null && args.length == 2) {
      String sourcePath = args[0];
      String outputFileName = args[1];

      if (FileUtils.getInstance().fileExists(sourcePath)) {
        List<String> lines = FileUtils.getInstance().readLines(sourcePath);

        String folderPath = FileUtils.getInstance().getContainerFolderPath(sourcePath);
        String outputPath = folderPath + File.separatorChar + outputFileName;

        InputConverter.getInstance().saveContent(lines, outputPath);
      }
    }
  }
}
