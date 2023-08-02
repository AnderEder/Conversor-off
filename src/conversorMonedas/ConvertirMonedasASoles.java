package conversorMonedas;

import javax.swing.JOptionPane;

/**
 * 
 * - Convertir de Dólar a la moneda de tu país
 * - Convertir de Euros a la moneda de tu país
 * - Convertir de Libras Esterlinas a la moneda de tu país
 * - Convertir de Yen Japonés a la moneda de tu país
 * - Convertir de Won sul-coreano a la moneda de tu país
 */

public class ConvertirMonedasASoles {

    public void DolarSoles(double valor) {

        double Moneda = valor * 3.59;
        Moneda = (double) Math.round(Moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes  " + Moneda + "Soles");
    }

    public void EurosSoles(double valor) {
        double Moneda = valor * 3.97;
        Moneda = (double) Math.round(Moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes  " + Moneda + "Soles");

    }

    public void LibrasEsterlinasSoles(double valor) {
        double Moneda = valor * 4.63;
        Moneda = (double) Math.round(Moneda * 100d) / 100;

        JOptionPane.showMessageDialog(null, "Tienes  " + Moneda + "Soles");

    }

    public void YenSoles(double valor) {
        double Moneda = valor * 0.0026;
        Moneda = (double) Math.round(Moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes  " + Moneda + "Soles");
    }

    public void WonASoles(double valor) {
        double Moneda = valor * 0.0028;
        Moneda = (double) Math.round(Moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes  " + Moneda + "Soles");

    }

}
