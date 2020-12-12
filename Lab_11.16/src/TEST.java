/*
Use inheritance to create an exception superclass
        (called ExceptionA)and exception subclasses ExceptionB and ExceptionC,where ExceptionB inherits from ExceptionA and ExceptionC inherits from ExceptionB.Write a program to demonstrate
        that the catch block for type ExceptionA catches exceptions of types ExceptionB and ExceptionC.

*/

public class TEST {
    public static void main(String[] args) {
        try {
            throw new Exception_A("ExceptionA");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new Exception_B("ExceptionB");
        } catch (Exception_A e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new Exception_C("ExceptionC");
        } catch (Exception_A e) {
            System.out.println(e.getMessage());
        }


    }
}