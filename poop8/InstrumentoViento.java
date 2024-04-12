/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author gerar
 */

public class InstrumentoViento extends Object implements InstrumentoMusical{
    public InstrumentoViento() {
    }
    
    public void tocar(){
        System.out.println("Tocando instrumento de viento");
    }
    
    public void afinar(){
        System.out.println("Afinando instrumento de viento");
    }
    
    public String tipoInstrumento(){
        return "Instrumento de viento";
    }
}
