package com.example.lab3.beans;

import com.example.lab3.data.Tabulation;
import com.example.lab3.functions.TabulationFunction;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Named
@Getter
@Setter
@SessionScoped
public class TabulationBean implements Serializable {
    private Tabulation tabulation = new Tabulation();

    public String tabulate() {
        tabulation.setResults(TabulationFunction.tabulateFunction(tabulation.getA(), tabulation.getB(), tabulation.getH()));
        return "table.xhtml";
    }
}
