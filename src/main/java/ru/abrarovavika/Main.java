package ru.abrarovavika;

import java.io.*;

/**
 * Entry point
 */
public class Main {

  public static void main(String[] args) throws IOException {
    int x;
    int y;

    try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
         BufferedReader reader = new BufferedReader(inputStreamReader)) {
      System.out.print("x = ");
      x = Integer.parseInt(reader.readLine());
      System.out.print("y = ");
      y = Integer.parseInt(reader.readLine());
    }

    if (y != 0) {
      int modulo = x % y;
      System.out.println(x + " % " + y + " = " + modulo);
    } else {
      System.out.println("y should be non-zero");
    }
  }
}