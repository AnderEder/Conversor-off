package CalculodeIMC;

import javax.swing.JOptionPane;

public class calculoImc {

    public void Imc(double peso, double altura) {

        double Indice = peso / (Math.pow(altura, altura));
        Indice = Math.round(Indice * 100.0) / 100.0;

        if (Indice < 18.5) {
            String mensaje = "IMC=" + Indice + " BAJO PESO";
            JOptionPane.showMessageDialog(null, mensaje, "CALCULO DE IMC", JOptionPane.INFORMATION_MESSAGE);

        } else if (Indice >= 18.5 && Indice <= 24.9) {
            String mensaje = "IMC=" + Indice + " NORMAL";
            JOptionPane.showMessageDialog(null, mensaje, "CALCULO DE IMC", JOptionPane.INFORMATION_MESSAGE);

        } else if (Indice >= 25 && Indice <= 29.9) {
            String mensaje = "IMC=" + Indice + " SOBREPESO";
            JOptionPane.showMessageDialog(null, mensaje, "CALCULO DE IMC", JOptionPane.INFORMATION_MESSAGE);

        } else if (Indice >= 30 && Indice <= 34.9) {
            String mensaje = "IMC=" + Indice + " OBESIDAD GRADO I";
            JOptionPane.showMessageDialog(null, mensaje, "CALCULO DE IMC", JOptionPane.INFORMATION_MESSAGE);

        } else if (Indice >= 35 && Indice <= 39.9) {
            String mensaje = "IMC=" + Indice + " OBESIDAD GRADO II";
            JOptionPane.showMessageDialog(null, mensaje, "CALCULO DE IMC", JOptionPane.INFORMATION_MESSAGE);

        } else {
            String mensaje = "IMC=" + Indice + " OBESIDAD GRADO III";
            JOptionPane.showMessageDialog(null, mensaje, "CALCULO DE IMC", JOptionPane.INFORMATION_MESSAGE);

        }

    }

}
