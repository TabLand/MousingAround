/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mousingaround;

import java.applet.Applet;
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ijtaba
 */
public class Worker extends Applet implements MouseMotionListener{
    private static Robot robot;
     public Worker(){
         try {
            // TODO code application logic here
            robot = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(MousingAround.class.getName()).log(Level.SEVERE, null, ex);
        }
            addMouseMotionListener(this);
    }
    @Override
    public void mouseDragged(MouseEvent me) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void mouseMoved(MouseEvent me) {
            
    }   
    public void act(double width, double height){
            int x = MouseInfo.getPointerInfo().getLocation().x;
            int y = MouseInfo.getPointerInfo().getLocation().y;
            System.out.println(x+","+y);
            if(x==0){
                robot.mouseMove((int)(width-3), y);
            }
            else if(x==width-1){
                robot.mouseMove(1, y);
            }
            else if(y==0){
                robot.mouseMove(x, (int) (height-2));
            }
            else if(y==height-1){
                robot.mouseMove(x,1);
            }
    }
}
