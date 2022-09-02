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
public class prueba {

    public static void main(String[] args) {
        //String coso = "Ataque=100.0,Vida=400.0,Nombre=Clasico_Clasico:(Experiencia=3;Bandera=[Direccion:DiscoC,Color:Rojo])";
        String coso = "Disparo:(Proyectil=Lechugas;Color=Verde)_Nombre=Lechuga,Vida=400.0,Rango=Medio,Ataque=300.0";

        //coso.split
        String[] cosos = coso.split("_");

        for (int i = 0; i < cosos.length; i++) {
            System.out.println(cosos[i]);
//            if(cosos[i].equals(cosos))
            String[] cososos = cosos[i].split(",");

            for (int j = 0; j < cososos.length; j++) {
                System.out.println(cososos[j] + " atributos");

            }

        }
        
        for (int i = 0; i < cosos.length; i++) {
             String[] cosossos = cosos[i].split(":");

            for (int j = 0; j < cosossos.length; j++) {
                System.out.println(cosossos[j] + " hija");

            }
        }

    }

}
