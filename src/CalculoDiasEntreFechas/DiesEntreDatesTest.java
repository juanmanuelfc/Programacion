package CalculoDiasEntreFechas;/*
Hecho dia mié. 16/12/2020
Creado por: Juanma
Paquete: CalculoDiasEntreFechas
Descripcion:
*/

public class DiesEntreDatesTest {
    public static void main(String[] args) {
        try {
            DiesEntreDates_JuanManuel_Fernandez d1 = new DiesEntreDates_JuanManuel_Fernandez();
            DataXS fechaInicial = new DataXS("15/06/1998");
            DataXS fechaDestino = new DataXS("25/08/2025");
            System.out.println("Han pasado " + d1.nombreDiesTotals(fechaInicial, fechaDestino) + " dias.");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
