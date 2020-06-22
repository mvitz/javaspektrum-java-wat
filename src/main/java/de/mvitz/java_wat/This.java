package de.mvitz.java_wat;

public class This {

    private final int i;

    public This(int i) {
        this.i = i;
    }

    public void print(This this, int that) {
        System.out.println(this + " " + that);
    }

    @Override
    public String toString() {
        return "This[" + i + "]";
    }

    public static void main(String[] args) {
        new This(42).print(13);
    }
}
