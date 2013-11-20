/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mousingaround;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ijtaba
 */
public class MousingAround{
    
    /**
     * @param args the command line arguments
     */
    public static boolean work;
    private static double width;
    private static double height;
    
    public static void main(String[] args){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.getWidth();
        height = screenSize.getHeight();
        
        work = true;
        Worker worker = new Worker();
        
        while(work){
            try {
                Thread.sleep(10);
                worker.act(width, height);
                
                 } catch (InterruptedException ex) {
                 Logger.getLogger(MousingAround.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
