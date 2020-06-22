package de.mvitz.java_wat;

import java.lang.reflect.Field;

public class NonFinalString {

    private static final void replaceWith(String target, String replacement) throws Exception {
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);
        value.set(target, replacement.getBytes());
    }

    public static void main(String[] args) throws Exception {
        String javaSpektrum = "JavaSpektrum";
        String javaSpektrum2 = new String(javaSpektrum);

        replaceWith(javaSpektrum, "ObjektSpektrum");

        System.out.println(javaSpektrum);
        System.out.println("JavaSpektrum");
        System.out.println(javaSpektrum2);
    }
}
