package principal;

import javax.swing.JOptionPane;

import conversorMonedas.function;
import conversorTemperatura.functionTemperatura;
import CalculodeIMC.calculoImc;

public class Principal {
    public static void main(String[] args) {

        function monedas = new function();
        functionTemperatura temperatura = new functionTemperatura();
        calculoImc masaCorporal = new calculoImc();
        while (true) {
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu",
                    JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "Conversor de Moneda", "Conversor de Temperatura", "Calculo de IMC" }, "Seleccion"))
                    .toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        monedas.ConvertiMonedas(Minput);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Selecciona opción Afirmativa");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;

                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if (ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if ((respuesta == 0) && (ValidarNumero(input) == true)) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;
                case "Calculo de IMC":
                    String peso = JOptionPane.showInputDialog(null, "Ingrese peso (en kg):");
                    String talla = JOptionPane.showInputDialog(null, "Ingrese talla (en metros): ");

                    double Minput = Double.parseDouble(peso);
                    double Minput2 = Double.parseDouble(talla);
                    masaCorporal.Imc(Minput, Minput2);

            }
        }

    }

    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0)
                ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
