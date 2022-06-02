
public class Automovil {

    private int id; //parte en 0 por ser entero
    private String fabricante; //atributo de la clase que le pertenece al objeto
    private String modelo;
    private String color;

    private double cilindrada;
    private int capacidadEstanque = 40;
    private static String colorGeneral = "rosado"; //atributo estático, igual su get y set
    private static int ultimoId; //atributo estático
    public static final Integer VEL_MAX = 10; // atributo estático final, constante,
    public static final Integer VEL_MIN = 60;

    private TipoAutomovil tipo; //otro tipo de atributo

    public Automovil() {
        this.id = ++ultimoId; //inicia en 0, se incrementa, luego asigna al Id
    }

    public Automovil(String fabricante) {
        this();
        this.fabricante = fabricante;
    }


    public Automovil(String fabricante, String modelo) {
        this(fabricante);
        this.modelo = modelo;
    }


    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, String color,TipoAutomovil tipo) {
        this(fabricante, modelo,color);
        this.tipo = tipo;
    }
    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadEstanque) {
        this(fabricante, modelo, color, cilindrada);
        this.capacidadEstanque = capacidadEstanque;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public static String getColorGeneral() {
        return colorGeneral;
    }

    public static void setColorGeneral(String colorGeneral) {
        Automovil.colorGeneral = colorGeneral;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public String detalle() {

        StringBuilder sb = new StringBuilder();

        sb.append("auto.id= " + this.id);
        sb.append("\nauto.fabricante= "+this.getFabricante());
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.cilindrada = " + this.cilindrada);
        sb.append("\nauto.color = " + this.getColor());
        sb.append("\nauto.color general = " + Automovil.colorGeneral); // el atributo estático se llama de la clase
        sb.append("\nauto tipo = " + this.getTipo().getDescripcion());
        return sb.toString();
    }

    public String frenar() {
        return this.fabricante + " " + this.modelo + " frenando";
    }

    public String acelerar(int rpm) {
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String acelerarFrenar(int rpm) {
        String frenar = this.frenar();
        String acelerar = this.acelerar(rpm);
        return frenar + "\n" + acelerar;
    }

    public float calcularConsumo(int km, float porcentajeBencina) {
        return km / (capacidadEstanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina) {
        return km / (capacidadEstanque * porcentajeBencina / 100f);
    }



    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }


}

