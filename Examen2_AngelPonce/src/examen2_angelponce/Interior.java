package examen2_angelponce;

public class Interior extends Parte{
    
    private String materialmasusado, tipovolante;
    private int cantidadbotnones;

    public Interior() {
    }

    public Interior(String materialmasusado, String tipovolante, int cantidadbotnones, int tiempo) {
        super(tiempo);
        this.materialmasusado = materialmasusado;
        this.tipovolante = tipovolante;
        this.cantidadbotnones = cantidadbotnones;
    }

    
    
    public Interior(String materialmasusado, String tipovolante, int cantidadbotnones) {
        this.materialmasusado = materialmasusado;
        this.tipovolante = tipovolante;
        this.cantidadbotnones = cantidadbotnones;
    }

    public String getMaterialmasusado() {
        return materialmasusado;
    }

    public void setMaterialmasusado(String materialmasusado) {
        this.materialmasusado = materialmasusado;
    }

    public String getTipovolante() {
        return tipovolante;
    }

    public void setTipovolante(String tipovolante) {
        this.tipovolante = tipovolante;
    }

    public int getCantidadbotnones() {
        return cantidadbotnones;
    }

    public void setCantidadbotnones(int cantidadbotnones) {
        this.cantidadbotnones = cantidadbotnones;
    }

    @Override
    public String toString() {
        return "Interior{" + "materialmasusado=" + materialmasusado + ", tipovolante=" + tipovolante + ", cantidadbotnones=" + cantidadbotnones + '}';
    }
    
    
    
}
