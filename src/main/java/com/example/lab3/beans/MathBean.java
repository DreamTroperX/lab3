package com.example.lab3.beans;

import com.example.lab3.data.Math;
import com.example.lab3.functions.MathFunctions;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Named
@Getter
@Setter
@SessionScoped
public class MathBean implements Serializable {
    private Math math = new Math();
    public String calculateSeries() {
        double[] terms = MathFunctions.calculateTerms(math.getX(), math.getN());
        double seriesSum = 0;
        for (double term : terms) {
            seriesSum += term;
        }
        math.setSeriesSum(seriesSum);
        math.setSumAboveE(MathFunctions.sumTermsAboveE(terms, math.getE()));
        math.setExactValue(MathFunctions.exactValue(math.getX()));
        return "results.xhtml";
    }
}
