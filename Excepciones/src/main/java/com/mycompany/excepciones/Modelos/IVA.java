/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

*Escriba el código en Java de un método llamado “calcularIva”, que recibe el precio de un producto
(double) y el tipo de producto (String). Este método calcula el valor del IVA de la siguiente forma:
es el 19 % para la mayoría de los productos, excepto para los de tipo básico, donde es el 10 % y
los de tipo cultural, donde es 0 %.
Realice algunas pruebas para verificar el funcionamiento del método, y tenga en cuenta las
posibles validaciones que se deben realizar (considere si es pertinente o no usar una excepción).

 */
package com.mycompany.excepciones.Modelos;

/**
 *
 * @author Benkei
 */
public class IVA {
    
    public void calcularIva(double precio, String tipo){
        if(precio>0){
            if(tipo.equals("Cultural")){
                System.out.println("El valor a pagar es: $"+precio);
            }else if(tipo.equals("Basico")){
                precio = precio + (precio*0.10);
                System.out.println("El valor a pagar es: $"+precio);
            }else{
                precio = precio+(precio*0.19);
                System.out.println("El valor a pagar es: $"+precio);
            }
        }else{
            throw new Error("Error a la hora de ingresar la informacion. Intentelo de nuevo");
        }
    }
    
}
