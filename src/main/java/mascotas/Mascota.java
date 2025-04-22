package mascotas;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipo")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Perro.class, name = "perro"),
        @JsonSubTypes.Type(value = Gato.class, name = "gato")
})

public class Mascota {

    private String nombre;
    private String dueño;
    private int edad;
    private String fechaRegistro;

    public Mascota(String nombre, String dueño, int edad) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.edad = edad;
        this.fechaRegistro = java.time.LocalDate.now().toString();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
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
