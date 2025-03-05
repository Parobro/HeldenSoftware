/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JOptionPane;

public final class Utils {
    public static Frame getFrame(Component component) {
        return JOptionPane.getFrameForComponent(component);
    }

    public static void setMaxHightAndCenter(Window window, int n) {
        Rectangle rectangle = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        window.setSize(800, rectangle.height);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] graphicsDeviceArray = graphicsEnvironment.getScreenDevices();
        if (graphicsDeviceArray.length > 1) {
            dimension = new Dimension(graphicsDeviceArray[0].getDisplayMode().getWidth(), graphicsDeviceArray[0].getDisplayMode().getHeight());
        }
        window.setLocation((dimension.width - n) / 2, 0);
    }

    public static void zentriere(Window window) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dimension2 = window.getSize();
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] graphicsDeviceArray = graphicsEnvironment.getScreenDevices();
        if (graphicsDeviceArray.length > 1) {
            dimension = new Dimension(graphicsDeviceArray[0].getDisplayMode().getWidth(), graphicsDeviceArray[0].getDisplayMode().getHeight());
        }
        window.setLocation((dimension.width - dimension2.width) / 2, (dimension.height - dimension2.height) / 2);
    }

    private Utils() {
    }
}

