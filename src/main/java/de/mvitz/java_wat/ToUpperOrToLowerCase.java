package de.mvitz.java_wat;

import org.apache.commons.lang3.RandomStringUtils;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Locale;

import static java.util.concurrent.TimeUnit.NANOSECONDS;
import static org.openjdk.jmh.annotations.Mode.AverageTime;
import static org.openjdk.jmh.annotations.Scope.Thread;

@BenchmarkMode(AverageTime)
@OutputTimeUnit(NANOSECONDS)
@Fork(1)
@Warmup(iterations = 1, time = 1)
@Measurement(iterations = 5, time = 5)
@Threads(5)
@State(Thread)
public class ToUpperOrToLowerCase {

    public static void main(String[] args) throws Exception {
        final Options opt = new OptionsBuilder()
            .include(ToUpperOrToLowerCase.class.getSimpleName())
            .build();
        new Runner(opt).run();
    }

    private String string = RandomStringUtils.randomAlphabetic(32);

    @Benchmark
    public String toLowerCase() {
        return string.toLowerCase();
    }

    @Benchmark
    public String toUpperCase() {
        return string.toUpperCase();
    }

    private static final Locale TR = Locale.forLanguageTag("tr");

    @Benchmark
    public String toLowerCaseTr() {
        return string.toLowerCase(TR);
    }

    @Benchmark
    public String toUpperCaseTr() {
        return string.toUpperCase(TR);
    }
}
