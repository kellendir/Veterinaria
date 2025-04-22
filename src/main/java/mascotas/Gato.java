package mascotas;

public class Gato extends Mascota {

    private boolean esPeludo;

    public Gato(String nombre, String dueño, int edad, String fechaRegistro, boolean esPeludo) {
        super(nombre, dueño, edad, fechaRegistro);
        this.esPeludo = esPeludo;
    }

    @Override
    public String toString(){
        return  super.toString() + "Tipo: Gato, Peludo: " + (esPeludo? "Sí":"No");
    }
}
