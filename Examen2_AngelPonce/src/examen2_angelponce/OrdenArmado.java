package examen2_angelponce;

public class OrdenArmado {
    
    private Vehiculo vehiculo;
    private String tecnico;

    public OrdenArmado() {
    }

    public OrdenArmado(Vehiculo vehiculo, String tecnico) {
        this.vehiculo = vehiculo;
        this.tecnico = tecnico;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public String toString() {
        return "OrdenArmado{" + "vehiculo=" + vehiculo + ", tecnico=" + tecnico + '}';
    }
    
    
    
}
