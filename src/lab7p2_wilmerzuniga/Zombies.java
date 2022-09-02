
package lab7p2_wilmerzuniga;

public class Zombies {
    private String Nombre;
    private double Ataque;
    private double Vida;

    public Zombies() {
    }

    public Zombies(String Nombre, double Ataque, double Vida) {
        this.Nombre = Nombre;
        this.Ataque = Ataque;
        this.Vida = Vida;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getAtaque() {
        return Ataque;
    }

    public void setAtaque(double Ataque) {
        this.Ataque = Ataque;
    }

    public double getVida() {
        return Vida;
    }

    public void setVida(double Vida) {
        this.Vida = Vida;
    }

    @Override
    public String toString() {
        return "Zombies{" + "Nombre=" + Nombre + ", Ataque=" + Ataque + ", Vida=" + Vida + '}';
    }
 
    
}
