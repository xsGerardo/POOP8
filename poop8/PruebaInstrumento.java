/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author gerar
 */

// Creación de la clase PruebaInstrumento
public class PruebaInstrumento {
    public static void main (String [] args){
        
        // Creación de una variable
        InstrumentoMusical instrumento;
        
        // Creación del objeto Flauta de tipo instrumento musical
        instrumento = (InstrumentoMusical) new Flauta();
        // Llamado al método tocar
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
    }
}
