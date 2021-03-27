package examen2_angelponce;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClaseHilo extends Thread{
    
    private JLabel parteactual;
    private int tiempo=0;
    private int cont=0;
    private int uno, dos, tres, cuatro, cinco;
    private JTable tabla;
    public ClaseHilo() {
    }

    public ClaseHilo(JLabel parteactual) {
        this.parteactual = parteactual;
    }

    public ClaseHilo(JLabel parteactual, int uno, int dos, int tres, int cuatro, int cinco, JTable tabla) {
        this.parteactual = parteactual;
        this.uno = uno;
        this.dos = dos;
        this.tres = tres;
        this.cuatro = cuatro;
        this.cinco = cinco;
        this.tabla = tabla;
    }
    
    

    public ClaseHilo(JLabel parteactual, int uno, int dos, int tres, int cuatro, int cinco) {
        this.parteactual = parteactual;
        this.uno = uno;
        this.dos = dos;
        this.tres = tres;
        this.cuatro = cuatro;
        this.cinco = cinco;
    }
    
    

    @Override
    public void run() {
        while(cont<5){
            if (cont==0) {
                parteactual.setText("Bateria");
                cont++;
                tiempo=uno;
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                Object[] x = {parteactual.getText(),tiempo};
                modelo.addRow(x);
                tabla.setModel(modelo);
            }//FIN IF
            else if(cont==1){
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.removeRow(0);
                parteactual.setText("Carroceria");
                cont++;
                tiempo=dos;
                modelo = (DefaultTableModel) tabla.getModel();
                //Object[]x=null;
                Object[] x = {parteactual.getText(),tiempo};
                modelo.addRow(x);
                tabla.setModel(modelo);
            }
            else if(cont==2){
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.removeRow(0);
                parteactual.setText("Interior");
                cont++;
                tiempo=tres;
                modelo = (DefaultTableModel) tabla.getModel();
                Object[] x = {parteactual.getText(),tiempo};
                modelo.addRow(x);
                tabla.setModel(modelo);
            }
            else if(cont==3){
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.removeRow(0);
                parteactual.setText("Sistema de Infoentretenimiento");
                cont++;
                tiempo=cuatro;
                modelo = (DefaultTableModel) tabla.getModel();
                //Object[]x=null;
                Object[] x = {parteactual.getText(),tiempo};
                modelo.addRow(x);
                tabla.setModel(modelo);
            }
            else if(cont==4){
                DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
                modelo.removeRow(0);
                parteactual.setText("Asientos");
                cont++;
                tiempo=cinco;
                modelo = (DefaultTableModel) tabla.getModel();
                //Object[]x=null;
                Object[] x = {parteactual.getText(),tiempo};
                modelo.addRow(x);
                tabla.setModel(modelo);
            }
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException ex) {
                System.out.println("algo salió mal");
            }
        }
        JOptionPane.showMessageDialog(null, "Finalizó!");
        JOptionPane.showMessageDialog(null, "Ahora ese ensamblador tiene 1 cantidad de vehiculos ensamblados, revisalo"
                + "en el jlist!");
    }
    
}
