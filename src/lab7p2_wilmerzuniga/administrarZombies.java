package lab7p2_wilmerzuniga;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class administrarZombies {

    private ArrayList<Zombies> listaZombies = new ArrayList();
    private File archivo = null;

    public administrarZombies(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Zombies> getListaZombies() {
        return listaZombies;
    }

    public void setListaZombies(ArrayList<Zombies> listaZombies) {
        this.listaZombies = listaZombies;
    }

    @Override
    public String toString() {
        return "listaZombies=" + listaZombies;
    }

    //extra mutador
    public void setZombies(Zombies p) {
        this.listaZombies.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String coso = "";

        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Zombies t : listaZombies) {
                bw.write("Nombre=" + t.getNombre() + ",");
                bw.write("Ataque=" + t.getAtaque() + ",");
                bw.write("Vida=" + t.getVida() + "_");

                if (t instanceof Cargado) {
                    bw.write("Cargado:(");
                    bw.write("Edad=" + ((Cargado) t).getEdad() + ";");
                    bw.write("Comidos=" + ((Cargado) t).printArrayl(((Cargado) t).getComidos()) + ";");
                    bw.write("Tamaño=" + ((Cargado) t).getTamaño() + ")");
                } else if (t instanceof Clasico) {
                    bw.write("Clasico:(");
                    bw.write("Experiencia=" + ((Clasico) t).getExperiencia() + ";");
                    bw.write("Bandera=" + "[");
                    bw.write("Direccion:" + ((Clasico) t).getBanderas().getDireccion()+ ",");
                    bw.write("Color:" + ((Clasico) t).getBanderas().getColor()+ "])");
                }
                bw.write("|");
            }
            bw.flush();//pasar al rom
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaZombies = new ArrayList();
        String coso = "";

        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                coso = sc.nextLine();//fucking archivo como texto
                String[] cosos1 = coso.split("\\|");
                for (int i = 0; i < cosos1.length; i++) {
                    String[] cosos2 = cosos1[i].split("_");
                    for (int j = 0; j < cosos2.length; j++) {
                        String[] cosos3 = cosos2[j].split(",");
                    }
                }
                
                
//                sc.useDelimiter("|");
//                while (sc.hasNext()) {
//                    listaZombies.add(new Zombies(sc.nextInt(),
//                            sc.next(),
//                            sc.nextInt(),
//                            Hobbies(sc.next())
//                    ));
//
//                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
