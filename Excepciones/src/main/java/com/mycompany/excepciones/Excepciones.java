/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.excepciones;

import com.mycompany.excepciones.Modelos.BoletosCine;
import com.mycompany.excepciones.Modelos.Alumnos;
import com.mycompany.excepciones.Modelos.IVA;
import com.mycompany.excepciones.Modelos.Enlace;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
/**
 *
 * @author Benkei
 */
public class Excepciones {

    public static void main(String[] args) throws MalformedURLException, IOException {
        BoletosCine a = new BoletosCine(); 
        Alumnos buscarA = new Alumnos();
        //Enlace E = new Enlace();
        //URL link = new URL( "https://www.w3schools.com/" );
        IVA I = new IVA();
        
        
        a.compraBoletos(12);
        buscarA.rellenar();
        buscarA.busqueda("127");
        I.calcularIva(100, "Basico");
        //E.verificarURL( link );
    }
}
