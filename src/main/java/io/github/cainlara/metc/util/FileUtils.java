package io.github.cainlara.metc.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {
  private static FileUtils instance;

  private FileUtils() {
    // hide constructor
  }

  public static FileUtils getInstance() {
    if (instance == null) {
      instance = new FileUtils();
    }

    return instance;
  }

  public boolean fileExists(final String path) {
    File file = new File(path);
    return file.exists();
  }

  public boolean fileCanBeWritten(final String path) {
    File file = new File(path);
    return file.canWrite();
  }

  public String getContainerFolderPath(final String path) {
    File file = new File(path);
    return file.getParent();
  }

  public List<String> readLines(final String path) {
    List<String> lines = null;

    try {
      lines = Files.readAllLines(Paths.get(path));
    } catch (IOException e) {
      e.printStackTrace();
    }

    return lines;
  }

}
