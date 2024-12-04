package com.example.lab3.functions;

import java.util.ArrayList;
import java.util.List;

public class TabulationFunction {
    public static List<double[]> tabulateFunction(double a, double b, double h) {
        List<double[]> results = new ArrayList<>();
        for (double x = a; x <= b; x += h) {
            double y = Math.exp(Math.log(x) - 1) + Math.sin(x); // Формула для y
            results.add(new double[]{x, y});
        }
        return results;
    }
}
