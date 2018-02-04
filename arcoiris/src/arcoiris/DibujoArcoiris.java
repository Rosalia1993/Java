
package arcoiris;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ROSSV
 */
public class DibujoArcoiris extends JPanel{
 
/*  pinta arcoiris  
 private final static Color VIOLETA= new Color(128,0,128);
 private final static Color INDIGO= new Color(75,0,130);
  
  private Color[] colores =
  { Color.WHITE,Color.WHITE,VIOLETA,INDIGO,Color.BLUE,
      Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED
  };
  
  public DibujoArcoiris(){
  setBackground(Color.WHITE);
  }
    */
  
  public void paintComponent(Graphics g){
  super.paintComponent(g);
  //pinta arcoiris int radio=20;
  
  //pinta arcoiris int centrox= getWidth()/2;
  //pintaarcoiris int centroy= getHeight()-10;
  /*pinta arcoiris
  for (int contador=colores.length;contador >0; contador --){
  
  g.setColor(colores[contador -1 ] );
  g.fillArc(centrox-contador *radio,centroy-contador*radio , contador*radio*2, 
          contador*radio*2,0, 180);
  }
  }*/
    g.drawLine(0, 0, 50, 50);
 }
}