package com.pavlo.java.io;

import java.applet.Applet;
import java.awt.Graphics;
/*
 <applet code = "SimpleApplet" widht = 200; height = 60>
 </applet> 
 */
public class SimpleApplet extends Applet {

	public void paint(Graphics g) {
		g.drawString("������� �����", 20, 20);
	}

}
