package conversorMonedas;
//se importa donde se encuentra la carpeta

import javax.swing.JOptionPane;

public class function {

    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirMonedasASoles soles = new ConvertirMonedasASoles();

    public void ConvertiMonedas(double Minput) {

        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null,
                new Object[] { "De Soles a Dolar", "De Soles a Euro", "De Soles a Libras", "De Soles a Yen",
                        "De Soles a Won Coreano", "De Dolar a Soles", "De Euro a Soles", "De Libras a Soles",
                        "De Yen a Soles", "De Won Coreano a Soles" },
                "Seleccion")).toString();

        switch (opcion) {
            ///////////////////////////////////
            case "De Soles a Dolar":
                monedas.SolesDolares(Minput);
                break;

            case "De Soles a Euro":
                monedas.SolesEuros(Minput);
                break;

            case "De Soles a Libra":
                monedas.SolesLibrasEsterlinas(Minput);
                break;

            case "De Soles a Yen":
                monedas.SolesYenJapones(Minput);
                break;

            case "De Soles a Won Coreano":
                monedas.SolesWonKoreano(Minput);
                break;

            ///////////////////////////////////////
            case "De Dolar a Soles":
                soles.DolarSoles(Minput);
                break;

            case "De Euro a Soles":
                soles.EurosSoles(Minput);
                break;
            case "De Libras a Soles":
                soles.LibrasEsterlinasSoles(Minput);
                break;
            case "De Yen a Soles":
                soles.YenSoles(Minput);
                break;
            case "De Won Coreano a Soles":
                soles.WonASoles(Minput);
                break;

        }

    }

}
