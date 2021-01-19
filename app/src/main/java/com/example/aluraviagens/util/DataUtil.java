package com.example.aluraviagens.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

    public static final String DIA_E_MES = "dd/MM";

    public static String periodoEmTexto(int dias) {
        Calendar dataIda = Calendar.getInstance();
        Calendar dataVolta = Calendar.getInstance();
        dataVolta.add(Calendar.DATE, dias);
        SimpleDateFormat formatoBrasileiro = new SimpleDateFormat(DIA_E_MES);
        String dataFormataIda = formatoBrasileiro.format(dataIda.getTime());
        String dataFormatadaVolta = formatoBrasileiro.format(dataVolta.getTime());
        return dataFormataIda + " - "
                + dataFormatadaVolta + " de "
                + dataVolta.get(Calendar.YEAR);
    }
}
