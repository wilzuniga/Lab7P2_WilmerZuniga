/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_wilmerzuniga;

public class Bandera {
    public String Color;
    public String Direccion;

    public Bandera() {
    }

    public Bandera(String Color, String Direccion) {
        this.Color = Color;
        this.Direccion = Direccion;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Bandera{" + "Color=" + Color + ", Direccion=" + Direccion + '}';
    }
    
    
    
}
