package com.example.lab3.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Math {
    private double x;
    private int n;
    private double e;
    private double seriesSum;
    private double sumAboveE;
    private double exactValue;

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public int getN() { return n; }
    public void setN(int n) { this.n = n; }

    public double getE() { return e; }
    public void setE(double e) { this.e = e; }

    public double getSeriesSum() { return seriesSum; }
    public double getSumAboveE() { return sumAboveE; }
    public double getExactValue() { return exactValue; }
}
