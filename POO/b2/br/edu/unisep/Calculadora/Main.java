package br.edu.unisep.Calculadora;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
          calculadora onde o usuario vai digitar os numeros
          e quando digitar vazio sera pedida a operação e realizar o calculo
        */

        List<Double> values = new ArrayList<>();
        String input = "";

        do {
            input = JOptionPane.showInputDialog("Digite um numero");
            if (!input.isEmpty()) {
                Double num = Double.parseDouble(input);
                values.add(num);
            }
        } while (!input.isEmpty());
        String opt = JOptionPane.showInputDialog("Digite a operação");
        double result = 0;
        switch (opt) {
            case "+":
                for (double value : values) {
                    result += value;
                    break;
                }
            case "-":
                for (double value : values) {
                    result -= value;
                }
                break;
            case "*":
                result = 1;
                for (double value : values) {
                    if (value == 0) {
                        break;
                    }
                    result *= value;
                }
                break;
            case "/":
                result = values.get(0);
                for (int value = 1; value < values.size(); value++) {
                    if (value == 0) {
                        break;
                    }
                    result /= value;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operacao invalida!");
                result = 0;
                break;
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + result);
    }
}