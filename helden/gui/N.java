/*
 * Decompiled with CFR 0.152.
 */
package helden.gui;

import helden.framework.held.Object.A;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

public class N
extends Canvas {
    private Image o00000;
    private int \u00d200000;

    public N(int n) {
        A a2 = new A("SPLASH", n);
        this.o00000 = a2.o00000();
        this.\u00d200000 = 0;
        MediaTracker mediaTracker = new MediaTracker(this);
        mediaTracker.addImage(this.o00000, 0);
        try {
            mediaTracker.waitForAll();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        float f2 = this.o00000.getWidth(this);
        float f3 = this.o00000.getHeight(this);
        this.\u00d200000 = (int)(256.0f / f3 * f2);
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.drawImage(this.o00000, 190 - this.\u00d200000 / 2, 44, this.\u00d200000, 256, this);
    }
}

