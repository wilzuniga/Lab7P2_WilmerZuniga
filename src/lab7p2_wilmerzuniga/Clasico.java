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
public class Clasico extends Zombies{
    private int Experiencia;
    private Bandera Banderas;

    public Clasico() {
    }

    public Clasico(int Experiencia, Bandera Banderas) {
        this.Experiencia = Experiencia;
        this.Banderas = Banderas;
    }

    public Clasico(int Experiencia, Bandera Banderas, String Nombre, double Ataque, double Vida) {
        super(Nombre, Ataque, Vida);
        this.Experiencia = Experiencia;
        this.Banderas = Banderas;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }

    public Bandera getBanderas() {
        return Banderas;
    }

    public void setBanderas(Bandera Banderas) {
        this.Banderas = Banderas;
    }

    @Override
    public String toString() {
        return "Clasico{" +super.toString() + "Experiencia=" + Experiencia + ", Banderas=" + Banderas + '}';
    }
}
