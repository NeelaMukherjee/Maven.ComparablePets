package io.zipcoder;


//
//
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.io.PrintStream;
//import java.util.Scanner;
//
//    public class IOConsole {
//        private final Scanner scanner;
//        private final PrintStream out;
//
//        public IOConsole() {
//            this(System.in, System.out);
//        }
//
//        public IOConsole(InputStream inputStream, OutputStream outputStream) {
//            this(new Scanner(inputStream), new PrintStream(outputStream));
//        }
//
//        public IOConsole(Scanner scanner, PrintStream printStream) {
//            this.scanner = scanner;
//            this.out = printStream;
//        }
//
//        /**
//         * @param val  : text to display on console
//         * @param args : optional arguments to send for string formatting
//         */
//        public void print(String val, Object... args) {
//            out.format(val, args);
//
//            //System.out.print(val);
//        }
//
//        /**
//         * @param val  : text to display on console
//         * @param args : optional arguments to send for string formatting
//         */
//        public void println(String val, Object... args) {
//
//            out.format(val,args);
//            out.println();
//        }
//
//        /**
//         * @param prompt : text to display to user
//         * @param args   : optional arguments to send for string formatting
//         * @return user's input as String
//         */
//        public String getStringInput(String prompt) {
//
//
//            return scanner.next();
//
//        }
//
//        /**
//         * @param prompt : text to display to user
//         * @param args   : optional arguments to send for string formatting
//         * @return user's input as integer
//         */
//        public Integer getIntegerInput(String prompt, Object... args) {
//            return scanner.nextInt();
//        }
//
//        /**
//         * @param prompt : text to display to user
//         * @param args   : optional arguments to send for string formatting
//         * @return user's input as double
//         */
//        public Double getDoubleInput(Double prompt, Object... args) {
//            return scanner.nextDouble();
//        }
//
//        /**
//         * @param prompt : text to display to user
//         * @param args   : optional arguments to send for string formatting
//         * @return user's input as float
//         */
//        public Float getFloatInput(Float prompt, Object... args) {
//            return scanner.nextFloat();
//        }
//
//        /**
//         * @param prompt : text to display to user
//         * @param args   : optional arguments to send for string formatting
//         * @return user's input as long
//         */
//        public Long getLongInput(Long prompt, Object... args) {
//            return scanner.nextLong();
//        }
//    }
//

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class IOConsole {
    private final Scanner scanner;
    private final PrintStream out;

    public IOConsole() {
        this(System.in, System.out);
    }

    public IOConsole(InputStream inputStream, OutputStream outputStream) {
        this(new Scanner(inputStream), new PrintStream(outputStream));
    }

    public IOConsole(Scanner scanner, PrintStream printStream) {
        this.scanner = scanner;
        this.out = printStream;
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void print(String val, Object... args) {
        out.format(val, args);
    }

    /**
     * @param val  : text to display on console
     * @param args : optional arguments to send for string formatting
     */
    public void println(String val, Object... args) {
        out.format(val + "\n", args);
//        out.format(val, args);
//        out.println();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as String
     */
    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return scanner.nextLine();
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as integer
     */
    public Integer getIntegerInput(String prompt, Object... args) {
        println(prompt, args);
        int result = scanner.nextInt();
        scanner.nextLine();
        /* this extra scanner.nextLine() method is included to eat the
        remaining \n character left by the scanner method above it. Without
        this, any following scanner.nextLine() methods will skip. */
        return result;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as double
     */
    public Double getDoubleInput(String prompt, Object... args) {
        println(prompt, args);
        double result = scanner.nextDouble();
        scanner.nextLine();
        /* this extra scanner.nextLine() method is included to eat the
        remaining \n character left by the scanner method above it. Without
        this, any following scanner.nextLine() methods will skip. */
        return result;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as float
     */
    public Float getFloatInput(String prompt, Object... args) {
        println(prompt, args);
        float result = scanner.nextFloat();
        scanner.nextLine();
        /* this extra scanner.nextLine() method is included to eat the
        remaining \n character left by the scanner method above it. Without
        this, any following scanner.nextLine() methods will skip. */
        return result;
    }

    /**
     * @param prompt : text to display to user
     * @param args   : optional arguments to send for string formatting
     * @return user's input as long
     */
    public Long getLongInput(String prompt, Object... args) {
        println(prompt, args);
        long result = scanner.nextLong();
        scanner.nextLine();
        /* this extra scanner.nextLine() method is included to eat the
        remaining \n character left by the scanner method above it. Without
        this, any following scanner.nextLine() methods will skip. */
        return result;
    }
}