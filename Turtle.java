import java.awt.*;
import java.applet.*;

 
public class Turtle extends Applet
{    
    public static void drawShell(Graphics g)
    {   
        Expo.setColor(g,Expo.black);
        Expo.drawArc(g,250,200,50,55,270,90);
        Expo.drawLine(g,200,200,300,200);   
    }

    public static void drawLegs(Graphics g)
    {   
        Expo.setColor(g,Expo.black);
        Expo.drawLine(g,210,200,190,228);
        Expo.drawLine(g,190,228,210,228);  
        Expo.drawLine(g,210,228,230,200);
        Expo.drawLine(g,280,200,290,228);
        Expo.drawLine(g,290,228,306,228);
        Expo.drawLine(g,306,228,295,200);
    }
    
    public static void drawHead(Graphics g)
    { 
        Expo.drawArc(g,215,150,40,40,200,275);
        Expo.drawArc(g,215,150,25,25,200,280);
        Expo.drawOval(g,180,138,18,11);
        Expo.drawArc(g,180,189,70,50,352,368);
        Expo.drawCircle(g,174,132,1);
        Expo.drawCircle(g,184,132,1);
    }    
    
}


  