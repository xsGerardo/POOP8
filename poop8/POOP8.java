/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

/**
 *
 * @author gerar
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Poligono pol = new Poligono();
        //Poligono pol;
        //System.out.println(pol.area());
        //System.out.println(pol.perimetro());
       
        // Los triangulos son poligonos
        
        // Creación de una variable
        Poligono pol;
        
        // Creación de un objeto, es este caso, triangulo, que es de tipo poligono.
        pol = new Triangulo(10, 10);
        System.out.println(pol.area());
       
        // Creación de un objeto, en este caso, cuadrado, que es de tipo poligono.
        pol = new Cuadrilatero(10, 10);
        System.out.println(pol.area());
        System.out.println(pol);
       
        /**
         * Creacion de un objeto de tipo objeto que se iguala al objeto poligono,
         * despues imprime al objeto con ayuda de un casteo.
         */
        identificadorDePoligonos(pol);
        Object obj = pol;
        System.out.println(obj.toString());

        // Creación de un objeto de tipo poligono que imprime el area del poligono creado
        Poligono pol1;
        pol1 = (Poligono)obj;
        System.out.println(pol1.area());
       
        int a = 10;
        int b = 2;
        int c = a/b;
        System.out.println(c);
       
    }

    // Método que identifica si las figuras se tratan de poligonos
    private static void identificadorDePoligonos(Poligono pol) {
        if (pol instanceof Triangulo){
            System.out.println("El triangulo es un poligono");
        }
       
        else if (pol instanceof Cuadrilatero){
            System.out.println("El cuadrilatero es un poligono");
        }
       
        else {
            System.out.println("Todo lo demas es un poligono");
        }
    }
    
}
