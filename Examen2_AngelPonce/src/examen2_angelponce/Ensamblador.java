package examen2_angelponce;

public class Ensamblador {
    private String ID, nombre, genero, edad;
    private int cantidadvehiculosensamblados=0;// (0 pordefecto).

    public Ensamblador() {
    }

    public Ensamblador(String ID, String nombre, String genero, String edad) {
        this.ID = ID;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }
    
    

    public Ensamblador(String ID, String nombre, String genero, String edad, int cantidadvehiculosensamblados) {
        this.ID = ID;
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.cantidadvehiculosensamblados = cantidadvehiculosensamblados;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getCantidadvehiculosensamblados() {
        return cantidadvehiculosensamblados;
    }

    public void setCantidadvehiculosensamblados(int cantidadvehiculosensamblados) {
        this.cantidadvehiculosensamblados = cantidadvehiculosensamblados;
    }

    @Override
    public String toString() {
        return "ID=" + ID + ", nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", cantidad vehiculos ensamblados=" + cantidadvehiculosensamblados + '}';
    }
    
    
    
}
