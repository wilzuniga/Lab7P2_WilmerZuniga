/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_wilmerzuniga;

public class Disparo extends Plantas {

    private String NombreProyectil;
    private String Color;

    public Disparo() {
    }

    public Disparo(String NombreProyectil, String Color) {
        this.NombreProyectil = NombreProyectil;
        this.Color = Color;
    }

    public Disparo(String NombreProyectil, String Color, String Nombre, double Ataque, double Vida, String Rango) {
        super(Nombre, Ataque, Vida, Rango);
        this.NombreProyectil = NombreProyectil;
        this.Color = Color;
    }

    public String getNombreProyectil() {
        return NombreProyectil;
    }

    public void setNombreProyectil(String NombreProyectil) {
        this.NombreProyectil = NombreProyectil;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Disparo{" + super.toString() + "NombreProyectil=" + NombreProyectil + ", Color=" + Color + '}';
    }

}
