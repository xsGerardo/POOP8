/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author gerar
 */

/**
 * Creación de una clase la clase InstrumentoViento que hereda de objeto, e
 * implementa los metodos de la interfaz Instrumento Musical
 * @author gerar
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{
    
    // Creación del constructor vacio
    public InstrumentoViento() {
    }
    
    // Uso del método tocar que imprime una cadena de texto
    public void tocar(){
        System.out.println("Tocando instrumento de viento");
    }
    
    // Uso del método afinar que imprime una cadena de texto
    public void afinar(){
        System.out.println("Afinando instrumento de viento");
    }
    
    // Uso del método tipoInstrumento que retorna una cadena de texto
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
}
