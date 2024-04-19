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
public class Poligono {
    public Poligono() {
    }
   
    public float area(){
        return 0;
    }
   
    public float perimetro(){
        return 0;
    }

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
} */

/**
 * Creación de una clase abstracta, la cual tiene un constructor vacío, y 
 * tiene métodos abstractos, puesto que no devuelven nada.
 * @author gerar
 */
public abstract class Poligono{
    public Poligono() {
    }
    
    public abstract float area();
    
    public abstract float perimetro();

    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
}
