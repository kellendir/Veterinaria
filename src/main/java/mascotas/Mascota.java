package mascotas;

public class Mascota {

    private String nombre;
    private String dueño;
    private int edad;
    private String fechaRegistro;

    public Mascota(String nombre, String dueño, int edad, String fechaRegistro) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.edad = edad;
        this.fechaRegistro = fechaRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDueño() {
        return dueño;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", dueño='" + dueño + '\'' +
                ", edad=" + edad +
                ", fechaRegistro='" + fechaRegistro + '\'' +
                '}';
    }
}
