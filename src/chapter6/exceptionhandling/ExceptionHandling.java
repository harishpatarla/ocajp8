package chapter6.exceptionhandling;

import java.io.IOException;
import java.util.IllegalFormatCodePointException;

/**
 * Created by harish on 8/15/2016.
 */
public class ExceptionHandling {

    // Runtime exceptions are same thing as unchecked exceptions
    // finally is mandatory when there are no catch blocks in try statement
    // Exceptions thrown by JVM - ArrayIndexOFBException, NPE, ExceptionInInitializer,
    // Exceptions thrown by dev - NumberFormatException, java.io.IOException(thrown by many in java.io package)
    // If there is System.exit(0) in catch block it will not execute finally block if present.
    // You can declare a method with exception as the return type
    // You can declare any subclass of Throwable, Error, Exception, RuntimeException in throws part of method declaration.
    // Errors are allowed to be handled and declared
    // Checked exceptions are required to be handled or declared
    // Runtime exceptions are allowed to be handled or declared

    /**
     11 Unchecked (RuntimeException):
     --------------------------------
     ArithmeticException
     ArrayIndexOutOfBoundsException
     AssertionError
     ExceptionInInitializerError
     ClassCastException
     IllegalArgumentException
     IllegalStateException
     NoClassDefFoundError
     NullPointerException
     NumberFormatException
     StackOverflowError

     10 Checked  :
     -----------------
     Exception
     IOException
     FileNotFoundException
     ParseException
     ClassNotFoundException
     CloneNotSupportedException
     InstantiationException
     InterruptedException
     NoSuchMethodException
     NoSuchFieldException
     */

    public static void main(String[] args) {
        //classCastException();
        //System.out.println(5/0); //java.lang.ArithmeticException: / by zero

        //new DoSomething().go();
        //arithmeticException();


    }

    public void ohNo() throws IOException {
        System.out.println(""); // It does not need to throw an exception
        //throw new IOException(); // It can throw an exception it has declared
        //throw new RuntimeException(); // It can throw any runtime exception i.e subclasses of runtime exceptions.
        //throw new IllegalStateException(); // Any unchecked or runtime exception

    }

    private static void arithmeticException() {
        try {
            System.out.println(0/0);
        } /*catch (  e) {
            Any child of RuntimeException is allowed. Exception, IOException,
        }*/
        catch (RuntimeException e) {
            System.out.println(-1);
        }/* catch (ArithmeticException e) { // does not compile because unreachable code, exception already caught
            System.out.println(0);
        } */finally {
            System.out.println("done");
        }
    }

    private static void classCastException() {
        Object it = new Integer(3);
        String str = (String) it; // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        System.out.println(str);
    }

}

class DoSomething {
    public void go() {
        System.out.println("A");
        try {
            stop();
        } catch (ArithmeticException e) {
            System.out.println("B");
        } finally {  //  key is after the exception is thrown execution should stop and print AE. But finally executes
            // before printing NPE stacktrace.
            System.out.println("C");
        }
        System.out.println("D");
    }

    private void stop() {
        System.out.println("E");
        Object x = null;
        x.toString();
        System.out.println("F");
    }
}

class Hopper {
    public void hop() {
    }
}

class Bunny extends Hopper {
    //public void hop() throws CannotHopException {}  // it cannot throw newer or broader exceptions. This rule
    // is only applicable for checked exceptions.
}

class CannotHopException extends Exception {
}


