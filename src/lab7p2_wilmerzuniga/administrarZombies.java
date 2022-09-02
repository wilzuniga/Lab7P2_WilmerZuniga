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

    public ArrayList<Persona> getListaPersonas() {
        return listaZombies;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaZombies = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaZombies;
    }

    //extra mutador
    public void setPersona(Persona p) {
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
            for (Persona t : listaZombies) {
                bw.write(t.getCodigo() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getedad() + ";");
                bw.write(WritteHobbies(t.getHobbies()));
            }
            bw.flush();//pasar al rom
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

//    public void cargarArchivo() {
//        Scanner sc = null;
//        listaZombies = new ArrayList();
//        if (archivo.exists()) {
//            try {
//                sc = new Scanner(archivo);
//                sc.useDelimiter(";");
//                while (sc.hasNext()) {
//                    
//                    listaZombies.add(new Persona(sc.nextInt(),
//                            sc.next(),
//                            sc.nextInt()
//                    )
//                    );
//                }
//            } catch (Exception ex) {
//            }
//            sc.close();
//        }//FIN IF
//    }
//
//    public void escribirArchivoH() throws IOException {
//        FileWriter fw = null;
//        BufferedWriter bw = null;
//        try {
//            fw = new FileWriter(archivo, false);
//            bw = new BufferedWriter(fw);
//            for (Persona t : listaZombies) {
//                bw.write(t.getCodigo() + ";");
//                bw.write(t.getNombre() + ";");
//                bw.write(t.getedad() + ";");
//
//            }
//            bw.flush();//pasar al rom
//        } catch (Exception ex) {
//        }
//        bw.close();
//        fw.close();
//    }
    public void cargarArchivo() {
        Scanner sc = null;
        listaZombies = new ArrayList();
        String coso = "";

        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaZombies.add(new Persona(sc.nextInt(),
                            sc.next(),
                            sc.nextInt(),
                            Hobbies(sc.next())
                    ));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

    public ArrayList Hobbies(String Cosa) {
//        System.out.println(Cosa);

        ArrayList<String> Hobbies = new ArrayList();
        String[] hobbies = Cosa.split("-");

        for (String hobby : hobbies) {

            Hobbies.add(hobby);
        }

        return Hobbies;
    }

    public String WritteHobbies(ArrayList Cosa) {

        String Hobbies = "";

        for (Object object : Cosa) {
            Hobbies += object + "-";
            //System.out.println(Hobbies);
        }
        Hobbies += ";";
        return Hobbies;
    }

}
