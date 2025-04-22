package mascotas;

public class Perro extends Mascota {

    private String raza;

    public Perro(String nombre, String dueño, int edad, String raza) {
        super(nombre, dueño, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo: Perro, Raza: " + raza;
    }
}
