package lab7p2_wilmerzuniga;

import java.util.ArrayList;


public class Cargado extends Zombies {
    private int Tamaño;
    private int Edad;
    private ArrayList Comidos = new ArrayList();

    public Cargado() {
    }

    public Cargado(int Tamaño, int Edad) {
        this.Tamaño = Tamaño;
        this.Edad = Edad;
    }

    public Cargado(int Tamaño, int Edad, String Nombre, double Ataque, double Vida, ArrayList Comidos) {
        super(Nombre, Ataque, Vida);
        this.Tamaño = Tamaño;
        this.Edad = Edad;
        this.Comidos = Comidos;
    }


    

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public ArrayList getComidos() {
        return Comidos;
    }

    public void setComidos(ArrayList Comidos) {
        this.Comidos = Comidos;
    }
    
    
    
    public String printArrayl(ArrayList Comidos){
        String coso = "(";
        for (Object Comido : Comidos) {
            coso+= Comido + ","; 
        }
        
        coso+= ")";
        
        return coso;
    }

    @Override
    public String toString() {
        return "Cargado{" +super.toString() + "Tama\u00f1o=" + Tamaño + ", Edad=" + Edad + ", Comidos=" + Comidos + '}';
    }
}
