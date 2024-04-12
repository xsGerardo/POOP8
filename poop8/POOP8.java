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
        
        // Creación de objetos
        pol = new Triangulo(10, 10);
        System.out.println(pol.area());
       
        pol = new Cuadrilatero(10, 10);
        System.out.println(pol.area());
        System.out.println(pol);
       
        identificadorDePoligonos(pol);
        Object obj = pol;
        System.out.println(obj.toString());

        Poligono pol1;
        pol1 = (Poligono)obj;
        System.out.println(pol1.area());
       
        int a = 10;
        int b = 2;
        int c = a/b;
        System.out.println(c);
       
    }

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
