package Domain;

public abstract class Mascota {
    private String nombre;
    private String sexo;
    private int edad;
    public boolean esterilizado;



    public Mascota(String nombre, String sexo, int edad, boolean esterilizado) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.esterilizado = esterilizado;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", esterilizado=" + esterilizado +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

}
