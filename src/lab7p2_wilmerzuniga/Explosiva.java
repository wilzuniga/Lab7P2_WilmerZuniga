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
public class Explosiva extends Plantas{
    private int Magnitud ;

    public Explosiva() {
    }

    public Explosiva(int Magnitud) {
        this.Magnitud = Magnitud;
    }

    public Explosiva(int Magnitud, String Nombre, double Ataque, double Vida, String Rango) {
        super(Nombre, Ataque, Vida, Rango);
        this.Magnitud = Magnitud;
    }

    public int getMagnitud() {
        return Magnitud;
    }

    public void setMagnitud(int Magnitud) {
        this.Magnitud = Magnitud;
    }

    @Override
    public String toString() {
        return "Explosiva{" + "Magnitud=" + Magnitud + '}';
    }

    
    
}
