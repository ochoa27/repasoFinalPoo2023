package Domain;

public class MascotaApta extends Mascota implements Operable {

    public MascotaApta(String nombre, String sexo, int edad, boolean esterilizado) {
        super(nombre, sexo, edad, esterilizado);
    }

    @Override
    public void operar() {
        this.setEsterilizado(true);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
