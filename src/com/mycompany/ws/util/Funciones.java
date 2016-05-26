package com.mycompany.ws.util;

import com.mycompany.ws.bean.CuotaBean;
import com.mycompany.ws.bean.ProductoBean;
import com.mycompany.ws.bean.UsuarioBean;
import com.mycompany.ws.service.UsuarioService;
import com.mycompany.ws.service.UsuarioServiceImpl;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

public class Funciones {

    public static String obtenerFechaActual() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        return sdf.format(now);
    }

    public static String obtenerEmailUsuario(String nombre, String apellido) {
        String email = "";
        List<UsuarioBean> listaUsuario = new ArrayList<>();
        UsuarioService usuarioService = new UsuarioServiceImpl();
        try {
            listaUsuario = usuarioService.listarUsuario();
        } catch (Exception e) {
            e.printStackTrace();
        }
        email += listaUsuario.get(listaUsuario.size() - 1).getIdUsuario() + 1;
        email += nombre.substring(0, 3);
        email += apellido.substring(0, 3);
        email += "@pandero.pe";
        return email;
    }

    public static String obtenerPasswordUsuario(String nombre, String apellido) {
        String password = "";
        List<UsuarioBean> listaUsuario = new ArrayList<>();
        UsuarioService usuarioService = new UsuarioServiceImpl();
        try {
            listaUsuario = usuarioService.listarUsuario();
        } catch (Exception e) {
            e.printStackTrace();
        }
        password += listaUsuario.get(listaUsuario.size() - 1).getIdUsuario() + 1;
        password += nombre.substring(0, 3);
        password += apellido.substring(0, 3);
        return password;
    }

    public static byte[] getBytesFromFile(File file) throws IOException {
        if (file != null) {
            InputStream is = new FileInputStream(file);

            byte[] bytes = new byte[(int) file.length()];

            int offset = 0;
            int numRead = 0;
            while (offset < bytes.length
                    && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
                offset += numRead;
            }

            is.close();
            return bytes;
        } else {
            return null;
        }
    }

    public static File getFileFromBytes(byte[] fileBytes, String archivoDestino) {
        File f2 = null;
        try {
            f2 = new File(archivoDestino);
            OutputStream out = new FileOutputStream(f2);
            out.write(fileBytes);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f2;

    }

    public static byte[] obtenerHuella() {
        byte[] huellaBytes = null;
        try {
            ResourceBundle rb = ResourceBundle.getBundle("file");
            File f = new File(rb.getString("file.huellas"));
            File[] files = f.listFiles();
            Path path = Paths.get(files[0].getAbsolutePath());
            huellaBytes = Files.readAllBytes(path);
            for (File x : files) {
                x.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return huellaBytes;
    }

    public static byte[] obtenerFirma() {
        byte[] firmaBytes = null;
        try {
            ResourceBundle rb = ResourceBundle.getBundle("file");
            File f = new File(rb.getString("file.firmas"));
            File[] files = f.listFiles();
            Path path = Paths.get(files[0].getAbsolutePath());
            firmaBytes = Files.readAllBytes(path);
            for (File x : files) {
                x.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return firmaBytes;
    }

    public static String generarStringCodigoQR(String nombre, String apellido, String email, String password) {
        return nombre + ";" + apellido + ";" + email + ":" + password;
    }

    public static List<CuotaBean> generarCuotas(int numeroCuotas, ProductoBean productoBean) {
        List<CuotaBean> listaCuota = new ArrayList<>();
        CuotaBean cuotaBean = null;
        double tasaMensual = (Math.pow((1 + productoBean.getTasaProducto()), (1.0 / 12.0))) - 1;
        double valorCuota = productoBean.getPrecioProducto() * ((tasaMensual * Math.pow((1 + tasaMensual), numeroCuotas)) / (Math.pow((1 + tasaMensual), numeroCuotas) - 1));
        Integer numCuota;
        double deuda = productoBean.getPrecioProducto();
        double interes;
        double capital;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecAct = sdf.format(new Date());

        for (int i = 0; i < numeroCuotas; i++) {
            cuotaBean = new CuotaBean();
            numCuota = i + 1;
            interes = deuda * tasaMensual;
            capital = valorCuota - interes;

            //redondear valorCuota
            valorCuota = redondear(valorCuota, 3);
            capital = redondear(capital, 3);
            interes = redondear(interes, 3);

            cuotaBean.setIdCuota(numCuota);
            cuotaBean.setFechaPagoCuota(fecAct);
            cuotaBean.setMontoCuota(valorCuota);
            cuotaBean.setCapitalCuota(capital);
            cuotaBean.setInteresCuota(interes);

            if (i == 0) {
                cuotaBean.setEstadoCuota("Vencida");
            } else {
                cuotaBean.setEstadoCuota("Pendiente");
            }

            listaCuota.add(cuotaBean);

            fecAct = subeUnMes(fecAct);
            deuda = deuda - capital;
        }
        return listaCuota;
    }

    public static String subeUnMes(String fecha) {
        String salida = "-1";

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(fecha);

            long longDate = date.getTime();
            longDate = longDate + (long) 30 * 24 * 60 * 60 * 1000;

            Date dateSalida = new Date(longDate);

            salida = sdf.format(dateSalida);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return salida;
    }

    public static double redondear(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

}
