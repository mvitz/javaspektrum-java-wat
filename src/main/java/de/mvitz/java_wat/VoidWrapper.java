package de.mvitz.java_wat;

import java.util.function.Function;

public class VoidWrapper {

    public interface VoidSupplier<T> extends Function<Void, T> {}

    public interface VoidConsumer<T> extends Function<T, Void> {}

    public static void main(String[] args) {
        VoidSupplier supplier = v -> "JavaSpektrum";
        VoidConsumer consumer = value -> {
            System.out.println(value);
            return null;
        };

        consumer.apply(supplier.apply(null));
    }
}
