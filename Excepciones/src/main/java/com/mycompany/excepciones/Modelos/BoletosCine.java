/*
*   Usted debe escribir un método que calcula el valor que debe pagar una persona por boletas de
    cine, lo cual depende de la cantidad de boletas que lleva. Si dentro del método encuentra que la
    cantidad de boletas no está dentro de los rangos establecidos, ¿debería lanzar una excepción o
    retornar cero? En caso de lanzar una excepción, ¿sería comprobada o no comprobada? Explique
    brevemente sus respuestas.

R:/ Se debe utilizar una excepcion que le indica al usuario que a superado el numero de voletas o que debe ser mayor
    a cero para que el usuario pueda entender que paso y pueda hacer las correcciones
    

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.excepciones.Modelos;

/**
 *
 * @author Benkei
 */
public class BoletosCine {
    
    
    public void compraBoletos(int cantidad) {
        int valorBoletas = 3000;
        if (cantidad > 10) {
            throw new ArithmeticException("La cantidad de boletas debe ser menor a 10");
        } else if (cantidad < 0) {
            throw new ArithmeticException("La cantidad de boletas debe ser mayor a 0");
        }
        try {
            System.out.println("El valor de " + cantidad + " boletas es de $" + cantidad * valorBoletas);
        }catch(Exception err ){
              System.out.println("Error en el ingreso de datos");
        }
    }
 }
    
