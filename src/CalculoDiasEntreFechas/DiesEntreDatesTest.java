package CalculoDiasEntreFechas;/*
Hecho dia mié. 16/12/2020
Creado por: Juanma
Paquete: CalculoDiasEntreFechas
Descripcion:
*/

public class DiesEntreDatesTest {
    public static void main(String[] args) {
        int ano1 = 2022;
        ano1++;
        int ano2 = 2025;
        ano2--;
        int dias = (ano2 - ano1) * 365;

        System.out.println(dias);

    }
}
