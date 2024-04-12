/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author gerar
 */
public class PruebaInstrumento {
    public static void main (String [] args){
        InstrumentoMusical instrumento;
        
        instrumento = (InstrumentoMusical) new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
    }
}
