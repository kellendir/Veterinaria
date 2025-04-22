package gestion;

import mascotas.Mascota;
import java.util.HashMap;
import java.util.Map;

public class Veterinaria {

    private Map<Integer, Mascota> mascotas;  //La clave es id y el valor será un objeto de tipo mascota
    private int contadorId;

    public Veterinaria(){
        mascotas = new HashMap<>();
        contadorId = 1;
    }

    //Añadir una mascota nueva
    public void añadirMascota(Mascota mascota){
        mascotas.put(contadorId, mascota);
        contadorId++;
    }

    //Eliminar una mascota por ID
    public String eliminarMascota(int id){
        return (mascotas.remove(id) != null)
                ? "Mascota eliminada"
                : "Mascota no encontrada";
    }

    //Mostrar todas las mascotas
    public void listarMascotas(){
        mascotas.forEach((id, mascota) -> System.out.println("ID: " + id + ", " + mascota));
    }
}
