/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author gerar
 */
public class Cuadrilatero extends Poligono{
    private int alfa, beta;
    private float base, altura;

    public Cuadrilatero() {
    }
   
    public Cuadrilatero(int alfa, int beta, float base, float altura){
        this.alfa = alfa;
        this.beta = beta;
        this.base = base;
        this.altura = altura;
    }

    public Cuadrilatero(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getAlfa() {
        return alfa;
    }

    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float perimetro() {
        return base*4;
    }

    @Override
    public float area() {
        return base*altura;
    }
   
   
    @Override
    public String toString() {
        return super.toString() + "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", base=" + base + ", altura=" + altura + '}';
    }
}
