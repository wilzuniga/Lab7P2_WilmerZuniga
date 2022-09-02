/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_wilmerzuniga;

/**
 *
 * @author wilme
 */
public class Defensa extends Plantas{
    private int Altura;
    private int Dureza;
    private int peso;

    public Defensa() {
    }


    public Defensa(int Altura, int Dureza, int peso, String Nombre, double Ataque, double Vida, String Rango) {
        super(Nombre, Ataque, Vida, Rango);
        this.Altura = Altura;
        this.Dureza = Dureza;
        this.peso = peso;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public int getDureza() {
        return Dureza;
    }

    public void setDureza(int Dureza) {
        this.Dureza = Dureza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Defensa{" + "Altura=" + Altura + ", Dureza=" + Dureza + ", peso=" + peso + '}';
    }
    
    
}
