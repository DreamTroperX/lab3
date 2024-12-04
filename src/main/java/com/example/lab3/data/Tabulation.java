package com.example.lab3.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tabulation {
        private double a;
        private double b;
        private double h;
        private List<double[]> results;

        public double getA() {
                return a;
        }

        public void setA(double a) {
                this.a = a;
        }

        public double getB() {
                return b;
        }

        public void setB(double b) {
                this.b = b;
        }

        public double getH() {
                return h;
        }

        public void setH(double h) {
                this.h = h;
        }

        public List<double[]> getResults() {
                return results;
        }

        public void setResults(List<double[]> results) {
                this.results = results;
        }
}
