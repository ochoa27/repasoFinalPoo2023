package App;

import Domain.Mascota;
import Domain.MascotaApta;
import Domain.MascotaEsterilizada;
import Domain.Veterinaria;

import java.util.Vector;

public class APPVET {
    public static void main(String[] args) {
        Veterinaria veterinaria1=new Veterinaria("VeterianariaUco");
        veterinaria1.revisarMascota("Neron","M",13,false);
        veterinaria1.revisarMascota("Celia","F",98,true);
        veterinaria1.revisarMascota("Peron","M",10,false);
        veterinaria1.revisarMascota("Teron","M",13,false);
        veterinaria1.revisarMascota("Veron","M",13,false);
        System.out.println("la lista de pacientes es:");
        for (Mascota item:veterinaria1.getPacientes()){
            System.out.println(item.toString());
        }
//        veterinaria1.getPacientesAOperar();
        System.out.println("");
        System.out.println("lista de pacientes aptos :::::::::::.");
        veterinaria1.operar();
        for (Mascota item:veterinaria1.getPacientesAOperar()){
            System.out.println(item.toString());
        }


//        Mascota mascota2=new MascotaEsterilizada("Celia","F",98,true);
    }
}
