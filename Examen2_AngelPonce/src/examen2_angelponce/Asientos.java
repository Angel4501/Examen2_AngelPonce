package examen2_angelponce;

public class Asientos extends Parte{
    
    private String material,eom;//Eléctrico o Manual
    private String masaje; //si o no

    public Asientos() {
    }

    public Asientos(String material, String eom, String masaje, int tiempo) {
        super(tiempo);
        this.material = material;
        this.eom = eom;
        this.masaje = masaje;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getEom() {
        return eom;
    }

    public void setEom(String eom) {
        this.eom = eom;
    }

    public String getMasaje() {
        return masaje;
    }

    public void setMasaje(String masaje) {
        this.masaje = masaje;
    }

    @Override
    public String toString() {
        return "Asientos{" + "material=" + material + ", eom=" + eom + ", masaje=" + masaje + '}';
    }
    
    
    
}
