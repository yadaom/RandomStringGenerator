package org.om.util;

import java.security.SecureRandom;

/**
 * User: om
 * Date: 16/08/17
 * Time: 8:43 PM
 */
public class RandomStringGenerator {


  private SecureRandom random;
  private int defaultLength;

  public RandomStringGenerator(SecureRandom secureRandom, int defaultLength) {
    this.random = secureRandom;
    this.defaultLength = defaultLength <= 0 ? 16 : defaultLength;
  }


  public RandomStringGenerator() {
    this(new SecureRandom(String.valueOf(System.nanoTime()).getBytes()), 0);
  }

  public String randomString() {
    return randomString(0);
  }

  public String randomString(int length) {
    if (length <= 0) {
      length = 16;
    }

    StringBuilder stringBuilder = new StringBuilder();
    int i = 0;
    boolean lastSame;
    while (i < length) {
      lastSame = false;
      int next = random.nextInt(122);
      next = next < 48 ? next + 48 : next;
      if ((next > 57 && next < 65) || (next > 90 && next < 97)) {
        continue;
      }
      final char nextChar = (char) next;
      if (i > 0) {
        final char lastChar = stringBuilder.charAt(stringBuilder.length() - 1);
        if (lastChar == nextChar) {
          lastSame = true;
        }

      }
      if (i > 1) {
        final char secondLastChar = stringBuilder.charAt(stringBuilder.length() - 2);
        if (secondLastChar == nextChar && lastSame) {
          continue;
        }
      }
      stringBuilder.append(nextChar);
      i++;
    }
    return stringBuilder.toString();
  }
}
