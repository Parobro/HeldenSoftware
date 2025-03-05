/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.C.oOOO;

import helden.framework.D.P;
import helden.framework.D.S;
import helden.framework.held.B.B.C.oOOO.super;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.awt.Graphics;
import java.util.Iterator;

public class E
extends super {
    private int \u00f500000 = 0;

    public E(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.\u00d300000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        Iterator<P> iterator = this.\u00d300000.\u00f5O0000().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            P p2 = iterator.next();
            if (p2.\u00d400000() != n && p2.\u00d400000() != 1 || p2.\u00f8O0000()) continue;
            ++this.\u00f500000;
        }
    }

    @Override
    public int o00000() {
        return 36 + this.\u00f500000 + 10;
    }

    @Override
    public void o00000(Graphics graphics, int n, int n2, int n3) {
        String[] stringArray;
        int n4 = n;
        int n5 = n3;
        int n6 = n3 + 210;
        if (this.String) {
            n6 -= 30;
        }
        graphics.setFont(this.o00000(10));
        S s = new S();
        graphics.drawString("Sonderfertigkeiten  (allgemein)", n5, (n4 += 18) - 2);
        graphics.drawLine(n5, n4, n6, n4);
        int n7 = 0;
        n4 += 9;
        String string = "";
        graphics.setFont(this.o00000(7));
        Iterator<P> iterator = this.\u00d300000.\u00f5O0000().iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (iterator.hasNext()) {
            stringArray = iterator.next();
            if (stringArray.\u00d400000() != n7 && stringArray.\u00d400000() != 1 || stringArray.\u00f8O0000()) continue;
            stringBuilder.append(s.o00000(stringArray.toString()));
            stringBuilder.append("; ");
        }
        stringArray = stringBuilder.toString().split(" ");
        String string2 = string;
        for (String string3 : stringArray) {
            if (this.o00000(string2 = string2 + string3 + " ", graphics) < (float)(n6 - n5)) {
                string = string2;
                continue;
            }
            graphics.drawString(string, n5, n4 - 1);
            graphics.drawLine(n5, n4, n6, n4);
            n4 += 9;
            string = string2 = string3 + " ";
        }
        graphics.drawString(string, n5, n4 - 1);
        graphics.drawLine(n5, n4, n6, n4);
        graphics.drawLine(n5, n4 += 9, n6, n4);
    }
}

