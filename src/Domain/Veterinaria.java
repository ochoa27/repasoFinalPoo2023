package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Veterinaria {
    String nombre;
    private List<Mascota> pacientes = new ArrayList<>();

    public Veterinaria(String nombre) {
        this.nombre = nombre;
    }

    public void añadirmascotaAlista(Mascota mascota) {
        this.pacientes.add(mascota);
    }

    public Mascota revisarMascota(String nombre, String sexo, int edad, boolean esterilizado) {
        if (esterilizado == false) {
            if ((sexo.equals("M")) && (edad >= 12)) {
                Mascota mascotaMasculina = new MascotaApta(nombre, sexo, edad, esterilizado);
                añadirmascotaAlista(mascotaMasculina);
                System.out.println("la mascota es apta para esterilizar");
                return mascotaMasculina;
            } else if ((sexo.equals("F")) && (edad >= 18)) {
                Mascota mascotaFemenina = new MascotaApta(nombre, sexo, edad, esterilizado);
                añadirmascotaAlista(mascotaFemenina);
                System.out.println("la mascota es apta para esterilizar");
                return mascotaFemenina;
            }
            System.out.println("la mascota no es apta para esterilizar por no cumplir el requisito minimo de edad");
            Mascota mascotanoapta = new MascotaNoAPta(nombre, sexo, edad, esterilizado);
            añadirmascotaAlista(mascotanoapta);
            return mascotanoapta;
        } else {
            Mascota mascotaEsterilizada1 = new MascotaEsterilizada(nombre, sexo, edad, esterilizado);
            añadirmascotaAlista(mascotaEsterilizada1);
            return mascotaEsterilizada1;
        }
    }


    public List<MascotaApta> getPacientesAOperar() {
        List<MascotaApta> listaDeAptos = new ArrayList<>();
        List<Mascota> mascotasPacientesFiltrada = this.pacientes.stream()
                .filter(item -> item instanceof MascotaApta)
               .collect(Collectors.toList());
        for (Mascota item: mascotasPacientesFiltrada) {
            if(item.isEsterilizado()==false){
                listaDeAptos.add(new MascotaApta(item.getNombre(),item.getSexo(),item.getEdad(),item.esterilizado));

            }
        }
       return listaDeAptos;

//
//        return listaDeAptos;
//    }
    }
    public void operar() {
//        List<MascotaApta>aptos=getPacientesAOperar();
//        for(MascotaApta item:aptos){
//            item.operar();
//        }
        for (Mascota item:pacientes){
            if(item instanceof MascotaApta){
                ((MascotaApta) item).operar();
            }
        }

    }


    public List<Mascota> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Mascota> pacientes) {
        this.pacientes = pacientes;
    }
}