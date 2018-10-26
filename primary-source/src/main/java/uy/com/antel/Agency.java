package uy.com.antel;

public class Agency {
    private int Id=5;
    private String nombre;

    public Agency() { }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
