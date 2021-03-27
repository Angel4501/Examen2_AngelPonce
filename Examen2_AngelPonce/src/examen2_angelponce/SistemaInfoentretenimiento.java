package examen2_angelponce;

public class SistemaInfoentretenimiento extends Parte{
    
    private int cantidadpantallas;
    private String visor; //si o no
    private int ancho; //ancho de la pantalla principal

    public SistemaInfoentretenimiento() {
    }

    public SistemaInfoentretenimiento(int cantidadpantallas, String visor, int ancho, int tiempo) {
        super(tiempo);
        this.cantidadpantallas = cantidadpantallas;
        this.visor = visor;
        this.ancho = ancho;
    }

    public int getCantidadpantallas() {
        return cantidadpantallas;
    }

    public void setCantidadpantallas(int cantidadpantallas) {
        this.cantidadpantallas = cantidadpantallas;
    }

    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "SistemaInfoentretenimiento{" + "cantidadpantallas=" + cantidadpantallas 
                + ", visor=" + visor + ", ancho=" + ancho + '}';
    }
    
    
    
}
