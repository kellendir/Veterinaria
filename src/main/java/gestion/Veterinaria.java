package gestion;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import mascotas.Mascota;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Veterinaria {

    private static final String JSON_FILE = "mascotas.json"; // Nombre del archivo
    private Map<Integer, Mascota> mascotas;  //La clave es id y el valor será un objeto de tipo mascota
    private int contadorId;
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public Veterinaria() {
        this.mascotas = cargarMascotasDesdeJSON(); // Carga los datos al iniciar la aplicación
    }
    // Cargar datos desde JSON
    private Map<Integer, Mascota> cargarMascotasDesdeJSON() {
        try {
            File file = new File(JSON_FILE);
            if (file.exists() && file.length() > 0) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                return objectMapper.readValue(file, new TypeReference<HashMap<Integer, Mascota>>() {});
            }
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo JSON: " + e.getMessage());
        }
        return new HashMap<>();
    }

    // Método para guardar en JSON (incluye todos los campos)
    public void guardarMascotasEnJSON() {
        try {
            objectMapper.writeValue(new File(JSON_FILE), mascotas);
            System.out.println("✅ Datos guardados en " + JSON_FILE);
        } catch (IOException e) {
            System.err.println("❌ Error al guardar JSON: " + e.getMessage());
        }
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
