package conversorMonedas;

import javax.swing.JOptionPane;

/**
 * 
 * - Convertir de la moneda de tu país a Dólar
 * - Convertir de la moneda de tu país a Euros
 * - Convertir de la moneda de tu país a Libras Esterlinas
 * - Convertir de la moneda de tu país a Yen Japonés
 * - Convertir de la moneda de tu país a Won sul-coreano
 * 
 */

public class ConvertirMonedas {
    /**
     * 
     * @param valor este variable recepciona el dinero para convertirlo de soles
     *              peruanos a dolares
     *              COMO SOY DE PERU MO MONEDA OFICIAL ES EN SOLES
     * 
     */
    public void SolesDolares(double valor) {
        double Moneda = valor * 0.28;
        Moneda = (double) Math.round(Moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null,
                "Tienes " + Moneda + "$ Dolares");
    }

    public void SolesEuros(double valor) {

        double Moneda = valor * 0.25;
        Moneda = (double) Math.round(Moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null,
                "Tienes " + Moneda + "\u20AC Euros");

    }

    public void SolesLibrasEsterlinas(double valor) {
        double Moneda = valor * 0.22;
        Moneda = (double) Math.round(Moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null,
                "Tienes " + Moneda + "\u00A3 LE");

    }

    // Convertir de la moneda de tu país a Yen Japonés

    public void SolesYenJapones(double valor) {
        double Moneda = valor * 39.05;
        Moneda = (double) Math.round(Moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null,
                "Tienes " + Moneda + "\u00A5 Yenes");
    }

    public void SolesWonKoreano(double valor) {
        double Moneda = valor * 355.28;
        Moneda = (double) Math.round(Moneda * 100d) / 100;
        JOptionPane.showMessageDialog(null,
                "Tienes " + Moneda + "\u20A9 Won");
    }

}
