/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *  Usted debe escribir un método que consulta las materias que tiene inscritas un estudiante, a partir
    del código del estudiante. Si el estudiante no tiene materias inscritas, ¿debería lanzar una
    excepción o retornar una lista vacía? En caso de lanzar una excepción, ¿sería comprobada o no
    comprobada? Explique brevemente sus respuestas

R:/ En este caso lanzamos una excepcion que le indica al usuario que el alumno al que esta haciendo referencia no 
    se encuentra en el listado 
 */
package com.mycompany.excepciones.Modelos;

/**
 *
 * @author Benkei
 */

import java.util.HashMap;

public class Alumnos {
    
    boolean encontrado = false;
    HashMap<String, String> materias = new HashMap<>();    
    
    public void rellenar(){
        this.materias.put("121", "Matematicas, Quimica, Fisica");
        this.materias.put("122", "Sistemas, Quimica, Dibujo");
        this.materias.put("123", "Matematicas, Religion, Educacion");
        this.materias.put("124", "Quimica, Casino");
        this.materias.put("125", "Matematicas, Quimica, Psicologia");
    }
    
    public void busqueda(String codigo){
        
        for(String i: materias.keySet()){
                if(i.equals(codigo)){
                    encontrado = true;
                    System.out.print("Alumno: "+i+ " Materias: "+materias.get(i));
                }
        }
        if(encontrado == false){
             throw new Error("El Alumno "+codigo+ " no fue encontrado");
         }
    }
}
