/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author gerar
 */

// Creación de la clase hija "Triangulo" que hereda de Poligono.
public class Triangulo extends Poligono{
    //Creación de atributos
    private int alfa, beta, gamma;
    private float a, b, c, base, altura;

    // Creación del constructor vacio
    public Triangulo() {
    }
   
    /**
     * 
     * @param alfa inicialización del atributo alfa
     * @param beta inicialización del atributo beta
     * @param gamma inicialización del atributo gamma
     * @param a inicialización del atributo para el lado a
     * @param b inicialización del atributo para el lado b
     * @param c inicialización del atributo para el lado a
     * @param base inicialización del atributo base
     * @param altura inicialización del atributo altura
     */
    public Triangulo(int alfa, int beta, int gamma, float a, float b, float c, float base, float altura){
        this.alfa = alfa;
        this.beta = beta;
        this.gamma = gamma;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }

    /**
     * Constructor con atributos que ya se inicializaron, pero como nuevamente
     * solo vamos a ocupar estos atributos, se hace un constructor exclusivo.
     * @param base
     * @param altura 
     */
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * 
     * @return Método que permite obtener el valor del angulo alfa
     */
    public int getAlfa() {
        return alfa;
    }

    /**
     * 
     * @param alfa Método que recibe el valor del angulo alfa
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    /**
     * 
     * @return Método que permite obtener el valor del angulo beta
     */
    public int getBeta() {
        return beta;
    }

    /**
     * 
     * @param beta Método que recibe el valor del angulo beta
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }

    /**
     * 
     * @return Método que permite obtener el valor del angulo gamma
     */
    public int getGamma() {
        return gamma;
    }

    /**
     * 
     * @param gamma Método que recibe el valor del angulo gamma
     */
    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    /**
     * 
     * @return Método que permite obtener el valor del lado A
     */
    public float getA() {
        return a;
    }

    /**
     * 
     * @param a Método que recibe el valor del lado A
     */
    public void setA(float a) {
        this.a = a;
    }

    /**
     * Método que permite obtener el valor del lado B
     * @return 
     */
    public float getB() {
        return b;
    }

    /**
     * 
     * @param b Método que recibe el valor del lado B
     */
    public void setB(float b) {
        this.b = b;
    }

    /**
     * 
     * @return Método que permite obtener el valor del lado C
     */
    public float getC() {
        return c;
    }

    /**
     * 
     * @param c Método que recibe el valor del lado C
     */
    public void setC(float c) {
        this.c = c;
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
     * @return 
     */
    @Override
    public float perimetro() {
        return base*3;
    }

    /**
     * Sobreescritura del método area de poligono
     * @return 
     */
    @Override
    public float area() {
        return base*altura/2;
    }
   
    /**
     * Método toString que devuelve la cadena de Poligono mediante el operador super,
     * y concatena los valores obtenidos de los atributos de Triangulo.
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gamma=" + gamma + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
}
