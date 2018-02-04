package arcoiris;
import javax.swing.JFrame;

/**
 *
 * @author ROSSV
 */
public class Arcoiris {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*aplicacion de arcoiris
        
        DibujoArcoiris panel = new DibujoArcoiris();
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(400,250);
        aplicacion.setVisible(true);
       */   
        DibujoArcoiris panel= new DibujoArcoiris();
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        //tamaño de la ventana 
        aplicacion.setSize(400,400);
        aplicacion.setVisible(true);
        
        
    }
    
}
