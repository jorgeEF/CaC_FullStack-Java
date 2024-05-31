package clase2;

class Vehiculo {            
    // Atributos: son variables en las que cada instancia puede almcacenar
    // sus propios valores.
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    // Metodos            
    // Constructores: metodo llamado al crear una instancia de la clase.
    public Vehiculo(){

    }

    public Vehiculo(String marca, String modelo, int anio, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Metodos getter y setters (para establecer o leer valores)

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // metodos propios de acciones

    public void mostrarDetalles(){
        System.out.println(toString());
    }
    // toString es una funcion de la clase Object
    // que es la superclase de toda las clases en Java.
    
    // le sobreescribimos el metodo toString con los atributos de esta clase
    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", precio=" + precio + '}';
    }
}
