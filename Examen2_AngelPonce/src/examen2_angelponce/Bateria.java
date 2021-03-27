
package examen2_angelponce;

public class Bateria extends Parte{
    private int autonomia;
    private String material;

    public Bateria() {
    }

    public Bateria(int autonomia, String material, int tiempo) {
        super(tiempo);
        this.autonomia = autonomia;
        this.material = material;
    }
    
    

    public Bateria(int autonomia, String material) {
        this.autonomia = autonomia;
        this.material = material;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    

    @Override
    public String toString() {
        return "Bateria{" + "autonomia=" + autonomia + ", material=" + material + '}';
    }
    
    
}
