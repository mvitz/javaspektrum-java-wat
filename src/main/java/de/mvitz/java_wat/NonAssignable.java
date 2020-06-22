package de.mvitz.java_wat;

public class NonAssignable {

    static void method() {
        Object object= new Object() {};
        //var object = new Object() {};

        object = new Object();
    }

    static void method2() {
        var object = new Object() {
            public void print() {
                System.out.println("JavaSpektrum");
            }
        };

        object.print();
    }
}
