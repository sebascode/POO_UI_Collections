package cl.duoc.casometro.DTO;

public class Estacion {
    private static int idstatic = 100;
    
    private int id;
    private String nombre;
    private String comuna;
    private int capacidad;
    private boolean abierta;

    public Estacion(String nombre, String comuna, int capacidad, boolean abierta) {
        this.id = idstatic;
        idstatic++;
        this.nombre = nombre;
        this.comuna = comuna;
        this.capacidad = capacidad;
        this.abierta = abierta;
    }
    
    public Estacion() {
        this.id = idstatic;
        idstatic++;
        this.nombre = "";
        this.comuna = "";
        this.capacidad = 0;
        this.abierta = false;
    }

    public static int getIdstatic() {
        return idstatic;
    }

    public static void setIdstatic(int idstatic) {
        Estacion.idstatic = idstatic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
    
    @Override
    public String toString(){
        return 
                "La estación " +
                this.nombre +
                "(" + this.comuna +")"+
                " se encuentra " +
                (this.abierta ? "disponible" : "cerrada") + ".";
    }
}
