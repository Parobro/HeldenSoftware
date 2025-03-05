/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B;

import helden.framework.held.B.B.G;
import java.awt.Font;
import java.awt.Graphics2D;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class B {
    public void o00000(Graphics2D graphics2D, String string, int n, int n2, int n3, int n4) {
        int n5 = n4;
        graphics2D.setFont(this.o00000(n5));
        while (this.o00000(string, graphics2D) > (float)(n2 - n) && n5 > 3) {
            graphics2D.setFont(this.o00000(--n5));
        }
        this.o00000(graphics2D, string, n, n2, n3);
    }

    public void new(Graphics2D graphics2D, String string, int n, int n2, int n3, int n4) {
        this.o00000(graphics2D, string, n, n2, n3, n4, 0);
    }

    public void o00000(Graphics2D graphics2D, String string, int n, int n2, int n3, int n4, int n5) {
        int n6 = n4;
        graphics2D.setFont(this.o00000(n6).deriveFont(n5));
        while (this.o00000(string, graphics2D) > (float)(n2 - n) && n6 > 3) {
            graphics2D.setFont(this.o00000(--n6).deriveFont(n5));
        }
        graphics2D.drawString(string, n, n3 - 2);
    }

    protected void o00000(Graphics2D graphics2D, String string, int n, int n2) {
        int n3 = (int)this.o00000(string, graphics2D);
        graphics2D.drawString(string, n - n3, n2);
    }

    protected void o00000(Graphics2D graphics2D, String[] stringArray, int n, int n2, int n3) {
        int n4 = n3 - n;
        float f2 = 0.0f;
        for (String stringArray2 : stringArray) {
            f2 += this.o00000(stringArray2, graphics2D);
        }
        float f3 = ((float)n4 - f2) / (float)(stringArray.length - 1);
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (String string : stringArray) {
            graphics2D.drawString(string, (float)n + f5 + f4, (float)n2);
            f4 += f3;
            f5 = (float)((double)f5 + graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(string, graphics2D).getWidth());
        }
    }

    protected void o00000(Graphics2D graphics2D, String string, int n, int n2, int n3) {
        int n4 = (n2 - n) / 2;
        int n5 = (int)this.o00000(string, graphics2D) / 2;
        graphics2D.drawString(string, n + n4 - n5, n3);
    }

    protected Font o00000(int n) {
        return G.new(n);
    }

    protected float o00000(String string, Graphics2D graphics2D) {
        if (string.isEmpty()) {
            return 0.0f;
        }
        return (float)graphics2D.getFontMetrics(graphics2D.getFont()).getStringBounds(string, graphics2D).getWidth();
    }
}

