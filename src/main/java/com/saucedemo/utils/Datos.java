package com.saucedemo.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Datos {
    public String [] obtenerDatos(){

        String archivoExcel = "Datos.xlsx";
        String usuario = null;
        String clave = null;

        try {
            FileInputStream file = new FileInputStream(new File(archivoExcel));
            XSSFWorkbook libro = new XSSFWorkbook(file);
            XSSFSheet hoja = libro.getSheet("DatosUsuario");

            Row row;
            Cell cell;

            row = hoja.getRow(1);
            cell = row.getCell(0);
            usuario = cell.toString();
            cell = row.getCell(1);
            clave = cell.toString();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }



        String datosUser[] = { usuario, clave };
        return datosUser;
    }

    public String [] obtenerInformacion(){

        String archivoExcel = "Datos.xlsx";
        String nombre = null;
        String apellido = null;
        String codigoPostal = null;

        try {
            FileInputStream file = new FileInputStream(new File(archivoExcel));
            XSSFWorkbook libro = new XSSFWorkbook(file);
            XSSFSheet hoja = libro.getSheet("Informacion");

            Row row;
            Cell cell;

            row = hoja.getRow(1);
            cell = row.getCell(0);
            nombre = cell.toString();
            cell = row.getCell(1);
            apellido = cell.toString();
            cell = row.getCell(2);
            codigoPostal = cell.toString();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }



        String datosUser[] = { nombre, apellido, codigoPostal };
        return datosUser;
    }

}
