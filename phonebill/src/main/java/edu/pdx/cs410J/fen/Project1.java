package edu.pdx.cs410J.fen;

import edu.pdx.cs410J.AbstractPhoneBill;

/**
 * The main class for the CS410J Phone Bill Project
 */
public class Project1 {

  public static void main(String[] args) {
    PhoneCall call = new PhoneCall();  // Refer to one of Dave's classes so that we can be sure it is on the classpath
    System.err.println("Missing command line arguments");
    if (args.length > 7 || args.length < 5)
      System.exit(1);
    for (String arg : args) {
      System.out.println(arg);
    }
    System.exit(1);
  }

}