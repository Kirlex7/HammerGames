package modelo;

public class Videojuego {
    private int idVideojuego;
    private String nombre;
    private String fechaLanzamiento;
    private String genero;  // Esto puede ser un Enum si deseas
    private String plataforma;
    private double precio;
    private double calificacion;
    private boolean multijugador;
    private int stock;

    // Constructor
    public Videojuego(int idVideojuego, String nombre, String fechaLanzamiento, String genero, String plataforma, 
                      double precio, double calificacion, boolean multijugador, int stock) {
        this.idVideojuego = idVideojuego;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.plataforma = plataforma;
        this.precio = precio;
        this.calificacion = calificacion;
        this.multijugador = multijugador;
        this.stock = stock;
    }

    // Getters y Setters
    public int getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public boolean isMultijugador() {
        return multijugador;
    }

    public void setMultijugador(boolean multijugador) {
        this.multijugador = multijugador;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

