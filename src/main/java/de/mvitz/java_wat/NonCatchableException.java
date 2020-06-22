package de.mvitz.java_wat;

public class NonCatchableException {

    static <T extends Exception> void throwUnchecked(Exception exception) throws T {
        throw (T) exception;
    }

    public static void throwsCheckedException() {
        throwUnchecked(new Exception());
    }

    public static void main(String[] args) {
        throwsCheckedException();
    }
}
