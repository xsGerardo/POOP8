/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poop8;

/**
 *
 * @author gerar
 */

// Creación de la interfaz Meses
public interface Meses {
    // Creación de los atributos de la interfaz, los cuales deben ir en mayusculas
    int UNO = 1, DOS = 2, TRES = 3, CUATRO = 4, CINCO = 5, SEIS = 6;
    int SIETE = 7, OCHO = 8, NUEVE = 9, DIEZ = 10, ONCE = 11, DOCE = 12;
    
    /**
     * Arreglo que contiene el nombre de los meses en su respectiva posición
     * la cual fue dada al crearse los atributos.
     */
    String [] NOMBRES_MESES = {"", "Enero", "Febrero", "Marzo", "Abril", 
        "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", 
        "Noviembre", "Diciembre"};
}
