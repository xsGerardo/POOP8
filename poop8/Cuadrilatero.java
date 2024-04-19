/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author gerar
 */

// Creación de la clase hija "Cuadrilatero", que hereda de Poligono.
public class Cuadrilatero extends Poligono{
    // Creación de atributos
    private int alfa, beta;
    private float base, altura;

    // Creación del constructor vacio
    public Cuadrilatero() {
    }
   
    /**
     * 
     * @param alfa inicialización del atributo alfa
     * @param beta inicialización del atributo beta
     * @param base inicialización del atributo base
     * @param altura inicialización del atributo altura
     */
    public Cuadrilatero(int alfa, int beta, float base, float altura){
        this.alfa = alfa;
        this.beta = beta;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Constructor con atributos que ya se inicializaron, pero como en este caso
     * solo vamos a ocupar estos atributos, se hace un constructor exclusivo.
     * @param base
     * @param altura 
     */
    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * 
     * @return Método que permite obtener el valor de alfa
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * 
     * @param alfa Método que recibe el valor de alfa
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * 
     * @return Método que permite obtener el valor de beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * 
     * @param beta Método que recibe el valor de beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * 
     * @return Método que permite obtener el valor de la base
     */
    public float getBase() {
        return base;
    }

    /**
     * 
     * @param base Método que recibe el valor de la base
     */
    public void setBase(float base) {
        this.base = base;
    }

    /**
     * 
     * @return Método que permite obtener el valor de la altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * 
     * @param altura Método que recibe el valor de la altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Sobreescritura del método perimetro de poligono
     * @return perimetro
     */
    @Override
    public float perimetro() {
        return base*4;
    }

    /**
     * Sobreescritura del método area de poligono
     * @return area
     */
    @Override
    public float area() {
        return base*altura;
    }
   
    /**
     * Método toString que devuelve la cadena de Poligono mediante el operador super,
     * y concatena los valores obtenidos de los atributos de Cuadrilatero.
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", base=" + base + ", altura=" + altura + '}';
    }
}
