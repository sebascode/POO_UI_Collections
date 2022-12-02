package cl.duoc.casometro.DTO;

public class Vagon {
    private static int idstatic = 10;
    
    private int id;
    private String codigo;
    private String marca;
    private boolean disponible;

    public Vagon(String codigo, String marca, boolean disponible) {
        this.id = idstatic;
        idstatic = idstatic + 10;
        this.codigo = codigo;
        this.marca = marca;
        this.disponible = disponible;
    }
    
    public Vagon() {
        this.id = idstatic;
        idstatic = idstatic + 10;
        this.codigo = "";
        this.marca = "";
        this.disponible = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    @Override
    public String toString(){
        return 
                this.codigo + " " +
                this.marca + " " +
                (this.disponible ? "está" : "no está") +
                " disponible.";
    }
}
