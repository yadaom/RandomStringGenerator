package org.om.util;

import java.util.HashSet;

/**
 * User: om
 * Date: 16/08/17
 * Time: 8:46 PM
 */
public class TestRandomStringGenerator {
  public static void main(String[] args) throws InterruptedException {
    final RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
    HashSet<String> ids = new HashSet<>();
    for (int i = 1; i < 1000; i++) {
      final String randomString = randomStringGenerator.randomString();
      System.out.println(String.valueOf(i) + ". ID: " + randomString);
      if (!ids.add(randomString)) {
        System.out.println("\t\tDuplicate id: " + randomString);
        System.exit(1);
      }
    }
  }
}
