package lab7p2_wilmerzuniga;

public class Plantas {
    private String Nombre;
    private double Ataque;
    private double Vida;
    private String Rango;

    public Plantas() {
    }

    public Plantas(String Nombre, double Ataque, double Vida, String Rango) {
        this.Nombre = Nombre;
        this.Ataque = Ataque;
        this.Vida = Vida;
        this.Rango = Rango;
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

    public String getRango() {
        return Rango;
    }

    public void setRango(String Rango) {
        this.Rango = Rango;
    }

    @Override
    public String toString() {
        return "Plantas{" + "Nombre=" + Nombre + ", Ataque=" + Ataque + ", Vida=" + Vida + ", Rango=" + Rango + '}';
    }
    
    

}
