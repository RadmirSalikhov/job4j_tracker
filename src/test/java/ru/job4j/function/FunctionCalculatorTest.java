package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCalculatorTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(8, 11, x -> x * x);
        List<Double> expected = Arrays.asList(64D, 81D, 100D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenExponentialFunctionThenExponentialResult() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(3, 5, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(8D, 16D);
        assertThat(result).containsAll(expected);
    }
}