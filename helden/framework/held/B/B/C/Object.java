/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.C;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

public class Object
extends Canvas {
    private static final long \u00d200000 = 7441090651830879324L;
    private Image o00000;

    public Object(String string) {
        this.o00000 = this.getToolkit().getImage(string);
        MediaTracker mediaTracker = new MediaTracker(this);
        mediaTracker.addImage(this.o00000, 0);
        try {
            mediaTracker.waitForAll();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public Dimension getMinimumSize() {
        return this.getPreferredSize();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(this.o00000.getWidth(this), this.o00000.getHeight(this));
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.drawImage(this.o00000, 0, 0, 450, 680, this);
    }

    public void o00000(Graphics graphics) {
        graphics.drawImage(this.o00000, 0, 0, 680, 450, this);
    }
}

