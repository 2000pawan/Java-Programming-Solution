/*
Applet:- 
An applet is a Java program that runs in a web browser or applet viewer. Applets are used to provide dynamic and interactive content on web pages.

Applet Life Cycle:

Initialization (init()): Called once when the applet is first loaded.
Start (start()): Called each time the applet is started or restarted.
Paint (paint(Graphics g)): Called to perform graphical operations.
Stop (stop()): Called when the applet is paused or stopped.
Destroy (destroy()): Called when the applet is terminated.
 */

 import java.awt.*;
 
 public class MyApplet{
     // Called when the applet is initialized
     public void init() {
         System.out.println("Applet Initialized!");
     }
 
     // Called when the applet is started
     public void start() {
         System.out.println("Applet Started!");
     }
 
     // Used to draw graphics
     public void paint(Graphics g) {
         g.drawString("Hi, Pawan Yadav", 50, 50);
         g.setColor(Color.RED);
         g.fillOval(100, 100, 50, 50);
     }
 
     // Called when the applet is stopped
     public void stop() {
         System.out.println("Applet Stopped!");
     }
 
     // Called when the applet is destroyed
     public void destroy() {
         System.out.println("Applet Destroyed!");
     }
 }
 