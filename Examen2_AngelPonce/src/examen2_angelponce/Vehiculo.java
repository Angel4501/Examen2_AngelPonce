package examen2_angelponce;

public class Vehiculo {
    private String vin;//debe ser único
    private String color;
    private Bateria bateria;
    private Carroceria carroceria;
    private Interior interior;
    private SistemaInfoentretenimiento si;
    private Asientos asientos;

    public Vehiculo() {
    }

    public Vehiculo(String vin, String color, Bateria bateria, Carroceria carroceria, 
            Interior interior, SistemaInfoentretenimiento si, Asientos asientos) {
        this.vin = vin;
        this.color = color;
        this.bateria = bateria;
        this.carroceria = carroceria;
        this.interior = interior;
        this.si = si;
        this.asientos = asientos;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Carroceria getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(Carroceria carroceria) {
        this.carroceria = carroceria;
    }

    public Interior getInterior() {
        return interior;
    }

    public void setInterior(Interior interior) {
        this.interior = interior;
    }

    public SistemaInfoentretenimiento getSi() {
        return si;
    }

    public void setSi(SistemaInfoentretenimiento si) {
        this.si = si;
    }

    public Asientos getAsientos() {
        return asientos;
    }

    public void setAsientos(Asientos asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "vin=" + vin + ", color=" + color + ", bateria=" + bateria + ", carroceria=" + carroceria + ", interior=" + interior + ", si=" + si + ", asientos=" + asientos + '}';
    }

    
    
    
}
