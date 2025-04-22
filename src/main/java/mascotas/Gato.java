package mascotas;

public class Gato extends Mascota {

    private boolean esPeludo;

    public Gato(String nombre, String dueño, int edad, boolean esPeludo) {
        super(nombre, dueño, edad);
        this.esPeludo = esPeludo;
    }

    public boolean isEsPeludo() {
        return esPeludo;
    }

    @Override
    public String toString(){
        return  super.toString() + "Tipo: Gato, Peludo: " + (esPeludo? "Sí":"No");
    }
}
