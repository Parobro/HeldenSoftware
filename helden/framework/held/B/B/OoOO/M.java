/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.OoOO;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class M
extends Canvas {
    private static final long \u00d200000 = 1L;
    private Image super;

    public M(String string) {
        this.super = this.getToolkit().getImage(string);
        MediaTracker mediaTracker = new MediaTracker(this);
        mediaTracker.addImage(this.super, 0);
        try {
            mediaTracker.waitForAll();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void o00000(Graphics graphics, int n, int n2, int n3, int n4) {
        graphics.drawImage(this.super, n, n2, n3, n4, this);
    }
}

