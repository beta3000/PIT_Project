package com.mycompany.ws.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fecha {

    public static String obtenerFechaActual() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        return sdf.format(now);
    }
}
