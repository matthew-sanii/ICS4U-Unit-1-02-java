/*
* The Energy program, just proves you can show print to terminal.
*
* @author  matthew sanii
* @version 1.0
* @since   2020-01-01
*/

import java.util.Scanner;

/**
* This is the standard "Hello, World!" program.
*/

final class Energy {
    /**
    * Variable for speed of light squared.
    */
    public static final double LIGHT = 8.988004;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        try {
            final Scanner potential = new Scanner(System.in);

            System.out.print("Enter mass of object: ");

            final float mass = potential.nextFloat();

            System.out.println("Potential energy of an object with a mass of " + mass + "kg is "
                + mass * LIGHT + "E16 Joules.");
        }
        catch (Exception e) {
            System.out.println("This is not a number");
        }

        System.out.println("\nDone.");
    }
}

