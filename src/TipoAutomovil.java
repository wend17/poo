public enum TipoAutomovil {
    SEDAN ("Sedan","auto mediano",4),
    STATION_WAGON ("Station Wagon","auto grande",4),
    HATCHBACK("Hatchback","auto compacto",4),
    PICKUP ("Pickup","Camioneta",4),
    COUPE ("coupe","auto pequeño",2),
    CONVERTIBLE ("Convertible","deportivo",2),
    FURGON("Furgon","utilitario",4);

    private final String nombre;
    private final String descripcion;
    private final int puertas;

    TipoAutomovil(String nombre, String descripcion, int puertas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.puertas = puertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPuertas() {
        return puertas;
    }
}

