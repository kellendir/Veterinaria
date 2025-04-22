package mascotas;

public class Perro extends Mascota {

    private String raza;

    public Perro(String nombre, String dueño, int edad, String fechaRegistro, String raza) {
        super(nombre, dueño, edad, fechaRegistro);
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo: Perro, Raza: " + raza;
    }
}
