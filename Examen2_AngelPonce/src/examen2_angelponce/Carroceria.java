package examen2_angelponce;

public class Carroceria extends Parte{
    String tipo;
    int capacidadmaletero;

    public Carroceria() {
    }

    public Carroceria(String tipo, int capacidadmaletero, int tiempo) {
        super(tiempo);
        this.tipo = tipo;
        this.capacidadmaletero = capacidadmaletero;
    }
    
    

    public Carroceria(String tipo, int capacidadmaletero) {
        this.tipo = tipo;
        this.capacidadmaletero = capacidadmaletero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidadmaletero() {
        return capacidadmaletero;
    }

    public void setCapacidadmaletero(int capacidadmaletero) {
        this.capacidadmaletero = capacidadmaletero;
    }

    @Override
    public String toString() {
        return "Carroceria{" + "tipo=" + tipo + ", capacidadmaletero=" + capacidadmaletero + '}';
    }
    
    
    
}
