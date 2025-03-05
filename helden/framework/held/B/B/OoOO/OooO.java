/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.OoOO;

import helden.framework.C.I;
import helden.framework.C.public;
import helden.framework.D.while;
import helden.framework.DruckEinstellungen;
import helden.framework.Einstellungen;
import helden.framework.HeldenMath;
import helden.framework.held.B.B.G;
import helden.framework.held.B.B.J;
import helden.framework.held.B.B.OoOO.M;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.TextAttribute;
import java.io.File;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OooO
extends G {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO \u00d6\u00d60000;
    private DruckEinstellungen \u00d8\u00d60000;

    public OooO(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, 1);
    }

    public OooO(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, int n) {
        this.\u00d6\u00d60000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.\u00d8\u00d60000 = Einstellungen.getInstance().getSeitenEinstellungen(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
    }

    @Override
    public void o00000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        String string = Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6\u00d60000.\u00f4o0000()).getBackgroudPath();
        File file = new File(this.\u00d400000(string + "hshb1.JPG"));
        if (!file.exists()) {
            this.\u00f400000(graphics2D);
        } else {
            try {
                if (file.exists()) {
                    helden.framework.held.B.B.C.Object object = new helden.framework.held.B.B.C.Object(this.\u00d400000(string + "hshb1.JPG"));
                    object.paint(graphics2D);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            file = new File(this.\u00d6\u00d60000.forsuper());
            if (file.exists()) {
                M m = new M(this.\u00d6\u00d60000.forsuper());
                m.paint(graphics2D);
            }
            int n = this.returnnew(graphics2D);
            n = this.\u00d3\u00d30000(graphics2D, n);
            n = this.O\u00d30000(graphics2D, n);
            this.whilenew(graphics2D, n);
        }
    }

    @Override
    public List<G> \u00d500000() {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6\u00d60000.\u00f4o0000()).isDrucken(this.new())) {
            arrayList.add(new OooO(this.\u00d6\u00d60000, 1));
        }
        return arrayList;
    }

    @Override
    public int \u00d800000() {
        return 1;
    }

    @Override
    public String \u00f400000() {
        return "Heldenbogen";
    }

    @Override
    public boolean \u00d400000() {
        return true;
    }

    private int O\u00d30000(Graphics2D graphics2D, int n) {
        int n2;
        int n3 = n;
        int n4 = 36;
        int n5 = 414;
        graphics2D.drawLine(n4, n3 += 63, 172, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.whilewhilesuper)), 108, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper)), 133, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.o00000(b_0.whilewhilesuper)), 158, n3 + 10);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d3\u00f4\u00d2000)), 300, n3 + 10);
        int n6 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper) * 2 + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 1) / 2;
        graphics2D.drawString(this.new("" + n6), 325, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000()), 350, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d3\u00f4\u00d2000)), 375, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().interface(b_0.\u00d3\u00f4\u00d2000)), 400, n3 + 10);
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.newwhilesuper)), 108, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.newwhilesuper)), 133, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.o00000(b_0.newwhilesuper)), 158, n3 + 11);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.thispublicsuper)), 300, n3 + 10);
        int n7 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + 1) / 2;
        graphics2D.drawString("" + n7, 325, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d2O0000()), 350, n3 + 11);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.thispublicsuper)), 375, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().interface(b_0.thispublicsuper)), 400, n3 + 10);
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f8\u00f4\u00d2000)), 108, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000)), 133, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.o00000(b_0.\u00f8\u00f4\u00d2000)), 158, n3 + 10);
        graphics2D.drawLine(190, n3, n5, n3);
        if (this.\u00d6\u00d60000.oo0000()) {
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f5\u00d2000)), 300, n3 + 10);
            n2 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00d5\u00f4\u00d2000) + 1) / 2;
            graphics2D.drawString("" + n2, 325, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().interface()), 350, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f5\u00d2000)), 375, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().interface(b_0.\u00f4\u00f5\u00d2000)), 400, n3 + 10);
        }
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d5\u00f4\u00d2000)), 108, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00d5\u00f4\u00d2000)), 133, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.o00000(b_0.\u00d5\u00f4\u00d2000)), 158, n3 + 11);
        graphics2D.drawLine(190, n3, n5, n3);
        if (this.\u00d6\u00d60000.\u00d8\u00d20000()) {
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d4\u00f5\u00d2000)), 300, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d3O0000()), 350, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d4\u00f5\u00d2000)), 375, n3 + 10);
        }
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.O\u00f5\u00d2000)), 108, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.O\u00f5\u00d2000)), 133, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.o00000(b_0.O\u00f5\u00d2000)), 158, n3 + 10);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d8\u00f5\u00d2000)), 300, n3 + 10);
        n2 = this.\u00f5O0000();
        graphics2D.drawString(this.new("" + n2), 325, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00f800000()), 350, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d8\u00f5\u00d2000)), 375, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().interface(b_0.\u00d8\u00f5\u00d2000)), 400, n3 + 10);
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f4\u00d2000)), 108, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000)), 133, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.o00000(b_0.\u00f4\u00f4\u00d2000)), 158, n3 + 11);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00d8\u00d2000)), 300, n3 + 10);
        int n8 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + 2) / 5;
        graphics2D.drawString(this.new("" + n8), 325, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.OO0000().private()), 350, n3 + 10);
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.returnwhilesuper)), 108, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper)), 133, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.o00000(b_0.returnwhilesuper)), 158, n3 + 10);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f8\u00d8\u00d2000)), 300, n3 + 10);
        int n9 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        graphics2D.drawString(this.new("" + n9), 325, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().int()), 350, n3 + 10);
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.privatedosuper)), 108, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.privatedosuper)), 133, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.o00000(b_0.privatedosuper)), 158, n3 + 11);
        graphics2D.drawLine(190, n3, n5 - 48, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.ifwhilesuper)), 300, n3 + 10);
        int n10 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        graphics2D.drawString(this.new("" + n10), 325, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d600000()), 350, n3 + 11);
        if (this.\u00d6\u00d60000.thissuper().getGPStart() != 0) {
            graphics2D.setFont(this.o00000(8));
            graphics2D.drawString(this.new("GP-Start: " + this.\u00d6\u00d60000.thissuper().getGPStart()), 370, n3 + 10);
            graphics2D.setFont(this.o00000(10));
        }
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.O\u00f4\u00d2000)), 108, n3 + 10);
        graphics2D.drawString(this.new(""), 133, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.OO0000().returnsuper()), 158, n3 + 11);
        graphics2D.drawLine(190, n3, n5 - 48, n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f5\u00f4\u00d2000)), 300, n3 + 10);
        int n11 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.O\u00f5\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        graphics2D.drawString(this.new("" + n11), 325, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00f600000()), 350, n3 + 11);
        if (this.\u00d6\u00d60000.thissuper().getGPStart() != 0) {
            graphics2D.drawString(this.new("GP-Rest: " + this.\u00d6\u00d60000.thissuper().getGPRest()), 370, n3 + 10);
        }
        int n12 = 448;
        int n13 = 580;
        int n14 = 102;
        graphics2D.drawLine(n14, n12, n14, n13);
        graphics2D.drawLine(n14 += 24, n12, n14, n13);
        graphics2D.drawLine(n14 += 24, n12, n14, n13);
        graphics2D.drawLine(++n14, n12, n14, n13);
        graphics2D.drawLine(n14 += 141, n12, n14, n13);
        graphics2D.drawLine(n14 += 25, n12, n14, n13);
        graphics2D.drawLine(n14 += 25, n12, n14, n13);
        graphics2D.drawLine(++n14, n12, n14, n13);
        graphics2D.drawLine(n14 += 23, n12, n14, n13);
        graphics2D.drawLine(++n14, n12, n14, n13);
        graphics2D.drawLine(n14 += 25, n12, n14, n13 - 56);
        graphics2D.setFont(this.o00000(8));
        if (this.\u00d6\u00d60000.new(while.\u00f50o000.toString())) {
            graphics2D.drawString("x", 369, 537);
        }
        if (this.\u00d6\u00d60000.new(while.thisforString.toString())) {
            graphics2D.drawString("x", 369, 530);
        }
        return n3;
    }

    private int o\u00d30000(Graphics2D graphics2D, int n) {
        int n2;
        int n3 = n + 35;
        int n4 = 15;
        int n5 = 435;
        int n6 = n3 - 15;
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("Eigenschaften", n4, n3);
        graphics2D.drawString("Basiswerte", 190, n3);
        int n7 = (n3 += 5) - 7;
        graphics2D.setFont(this.o00000(8));
        this.\u00d400000(graphics2D, "Mut", this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.whilewhilesuper), this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper), this.\u00d6\u00d60000.o00000(b_0.whilewhilesuper), n3);
        int n8 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper) * 2 + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 1) / 2;
        this.new(graphics2D, "Lebenspunkte", "(KO+KO+KK)/2", this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d3\u00f4\u00d2000), n8, this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(), n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d3\u00f4\u00d2000)), 395, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().interface(b_0.\u00d3\u00f4\u00d2000)), 420, n3 + 10);
        this.\u00d400000(graphics2D, "Klugheit", this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.newwhilesuper), this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.newwhilesuper), this.\u00d6\u00d60000.o00000(b_0.newwhilesuper), n3 += 14);
        int n9 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + 1) / 2;
        this.new(graphics2D, "Ausdauer", "(MU+KO+GE)/2", this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.thispublicsuper), n9, this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d2O0000(), n3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.thispublicsuper)), 395, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().interface(b_0.thispublicsuper)), 420, n3 + 10);
        this.\u00d400000(graphics2D, "Intuition", this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f8\u00f4\u00d2000), this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000), this.\u00d6\u00d60000.o00000(b_0.\u00f8\u00f4\u00d2000), n3 += 14);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.drawString("Astralenergie", 190, n3 + 10);
        graphics2D.setFont(this.o00000(6));
        if (this.\u00d6\u00d60000.new(while.\u00d3\u00d5\u00d6000.toString())) {
            graphics2D.drawString("(MU+IN+CH+CH)/2", 250, n3 + 10);
        } else {
            graphics2D.drawString("(MU+IN+CH)/2", 250, n3 + 10);
        }
        graphics2D.setFont(this.o00000(8));
        if (this.\u00d6\u00d60000.oo0000()) {
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f5\u00d2000)), 320, n3 + 10);
            n2 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00d5\u00f4\u00d2000) + 1) / 2;
            graphics2D.drawString("" + n2, 345, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().interface()), 370, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f5\u00d2000)), 395, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().interface(b_0.\u00f4\u00f5\u00d2000)), 420, n3 + 10);
        }
        this.\u00d400000(graphics2D, "Charisma", this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d5\u00f4\u00d2000), this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00d5\u00f4\u00d2000), this.\u00d6\u00d60000.o00000(b_0.\u00d5\u00f4\u00d2000), n3 += 14);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.drawString("Karmaenergie", 190, n3 + 10);
        if (this.\u00d6\u00d60000.\u00d8\u00d20000()) {
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d4\u00f5\u00d2000)), 320, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d3O0000()), 370, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d4\u00f5\u00d2000)), 395, n3 + 10);
        }
        this.\u00d400000(graphics2D, "Fingerfertigkeit", this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.O\u00f5\u00d2000), this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.O\u00f5\u00d2000), this.\u00d6\u00d60000.o00000(b_0.O\u00f5\u00d2000), n3 += 14);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.drawString("Magieresistenz", 190, n3 + 10);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(MU+KL+KO)/5", 250, n3 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d8\u00f5\u00d2000)), 320, n3 + 10);
        n2 = this.\u00f5O0000();
        graphics2D.drawString(this.new("" + n2), 345, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00f800000()), 370, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00d8\u00f5\u00d2000)), 395, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().interface(b_0.\u00d8\u00f5\u00d2000)), 420, n3 + 10);
        this.\u00d400000(graphics2D, "Gewandtheit", this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f4\u00d2000), this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000), this.\u00d6\u00d60000.o00000(b_0.\u00f4\u00f4\u00d2000), n3 += 14);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(MU+MU+IN+GE)/5", 250, n3 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("INI-Basiswert", 190, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00d8\u00d2000)), 320, n3 + 10);
        int n10 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + 2) / 5;
        graphics2D.drawString(this.new("" + n10), 345, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.OO0000().private()), 370, n3 + 10);
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        this.\u00d400000(graphics2D, "Konstitution", this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.returnwhilesuper), this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper), this.\u00d6\u00d60000.o00000(b_0.returnwhilesuper), n3);
        graphics2D.drawLine(190, n3, n5 - 48, n3);
        graphics2D.drawString("AT-Basiswert", 190, n3 + 10);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(MU+GE+KK)/5", 250, n3 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f8\u00d8\u00d2000)), 320, n3 + 10);
        int n11 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        graphics2D.drawString(this.new("" + n11), 345, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().int()), 370, n3 + 10);
        this.\u00d400000(graphics2D, "K\u00f6rperkraft", this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.privatedosuper), this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.privatedosuper), this.\u00d6\u00d60000.o00000(b_0.privatedosuper), n3 += 14);
        graphics2D.drawLine(190, n3, n5 - 48, n3);
        graphics2D.drawString("PA-Basiswert", 190, n3 + 10);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(IN+GE+KK)/5", 250, n3 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.ifwhilesuper)), 320, n3 + 10);
        int n12 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        graphics2D.drawString(this.new("" + n12), 345, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d600000()), 370, n3 + 11);
        if (this.\u00d6\u00d60000.thissuper().getGPStart() != 0) {
            graphics2D.drawString("GP-Start: " + this.\u00d6\u00d60000.thissuper().getGPStart(), 390, n3 + 10);
        }
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        this.\u00d400000(graphics2D, "Geschwindigkeit (GS)", this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.O\u00f4\u00d2000), this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.O\u00f4\u00d2000), this.\u00d6\u00d60000.OO0000().returnsuper(), n3);
        graphics2D.drawLine(190, n3, n5 - 48, n3);
        graphics2D.drawString("FK-Basiswert", 190, n3 + 10);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(IN+FF+KK)/5", 250, n3 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00d200000(b_0.\u00f5\u00f4\u00d2000)), 320, n3 + 10);
        int n13 = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.O\u00f5\u00d2000) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        graphics2D.drawString(this.new("" + n13), 345, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.\u00d3\u00d30000().\u00f600000()), 370, n3 + 11);
        if (this.\u00d6\u00d60000.thissuper().getGPStart() != 0) {
            graphics2D.drawString(this.new("GP-Rest: " + this.\u00d6\u00d60000.thissuper().getGPRest()), 390, n3 + 10);
        }
        int n14 = n3 + 14;
        int n15 = 102;
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Mod", n15 + 6, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawString("Start", (n15 += 24) + 5, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawLine(n15 += 24, n7, n15, n14);
        graphics2D.drawString("Aktuell", ++n15 + 3, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawString("Mod", (n15 += 161) + 6, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawString("Start", (n15 += 25) + 5, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawLine(n15 += 25, n7, n15, n14);
        graphics2D.drawString("Aktuell", ++n15 + 3, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawLine(n15 += 23, n7, n15, n14);
        graphics2D.drawString("Gekauft", ++n15 + 2, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawString("Rest", (n15 += 25) + 6, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14 - 56);
        graphics2D.drawRoundRect(n4 - 5, n6, n5 - n4 + 10, n3 - n6 + 16, 5, 5);
        return n3;
    }

    private void \u00d400000(Graphics2D graphics2D, String string, int n, int n2, int n3, int n4) {
        int n5 = 15;
        graphics2D.drawLine(n5, n4, 172, n4);
        graphics2D.drawString(string, n5, n4 + 10);
        graphics2D.drawString(this.new("" + n), 108, n4 + 10);
        graphics2D.drawString(this.new("" + n2), 133, n4 + 10);
        graphics2D.drawString(this.new("" + n3), 158, n4 + 10);
    }

    private int returnnew(Graphics2D graphics2D) {
        int n;
        String string;
        String[] stringArray;
        float f2;
        int n2 = 92;
        int n3 = 36;
        int n4 = 414;
        graphics2D.setFont(this.o00000(12));
        if (this.o00000(this.\u00d6\u00d60000.toString(), graphics2D) > 324.0f) {
            f2 = this.o00000(this.\u00d6\u00d60000.toString(), graphics2D);
            stringArray = this.\u00d6\u00d60000.toString().split(" ");
            string = "";
            graphics2D.setFont(this.o00000(8));
            n2 -= 4;
            for (n = 0; n < stringArray.length; ++n) {
                if (this.o00000(string, graphics2D) + this.o00000(stringArray[n], graphics2D) > f2 / 2.0f) {
                    graphics2D.drawString(string, 90, n2 - 4);
                    graphics2D.drawLine(90, n2 - 3, n4, n2 - 3);
                    n2 += 8;
                    string = stringArray[n] + " ";
                    continue;
                }
                string = string + stringArray[n] + " ";
            }
            graphics2D.drawString(string, 90, n2 - 4);
            graphics2D.drawLine(n3, n2 - 3, n4, n2 - 3);
            n2 += 13;
        } else {
            graphics2D.drawString(this.\u00d6\u00d60000.toString(), 90, n2 - 4);
            graphics2D.drawLine(n3, n2, n4, n2);
            n2 += 17;
        }
        graphics2D.setFont(this.o00000(12));
        if (this.o00000(this.\u00d6\u00d60000.o\u00d20000().toString(), graphics2D) > 324.0f) {
            f2 = this.o00000(this.\u00d6\u00d60000.o\u00d20000().toString(), graphics2D);
            stringArray = this.\u00d6\u00d60000.o\u00d20000().toString().split(" ");
            string = "";
            graphics2D.setFont(this.o00000(8));
            n2 -= 4;
            for (n = 0; n < stringArray.length; ++n) {
                if (this.o00000(string, graphics2D) + this.o00000(stringArray[n], graphics2D) > f2 / 2.0f) {
                    graphics2D.drawString(string, 90, n2 - 4);
                    graphics2D.drawLine(90, n2 - 3, n4, n2 - 3);
                    n2 += 8;
                    string = stringArray[n] + " ";
                    continue;
                }
                string = string + stringArray[n] + " ";
            }
            graphics2D.drawString(string, 90, n2 - 4);
            graphics2D.drawLine(n3, n2 - 3, n4, n2 - 3);
            n2 += 13;
        } else {
            graphics2D.drawString(this.\u00d6\u00d60000.o\u00d20000().toString(), 90, n2 - 4);
            graphics2D.drawLine(n3, n2, n4, n2);
            n2 += 17;
        }
        graphics2D.setFont(this.o00000(12));
        if (this.o00000(this.\u00d6\u00d60000.\u00f800000().toString(), graphics2D) > 324.0f) {
            f2 = this.o00000(this.\u00d6\u00d60000.\u00f800000().toString(), graphics2D);
            stringArray = this.\u00d6\u00d60000.\u00f800000().toString().split(" ");
            string = "";
            graphics2D.setFont(this.o00000(8));
            n2 -= 4;
            for (n = 0; n < stringArray.length; ++n) {
                if (this.o00000(string, graphics2D) + this.o00000(stringArray[n], graphics2D) > f2 / 2.0f) {
                    graphics2D.drawString(string, 90, n2 - 4);
                    graphics2D.drawLine(90, n2 - 3, n4, n2 - 3);
                    n2 += 8;
                    string = stringArray[n] + " ";
                    continue;
                }
                string = string + stringArray[n] + " ";
            }
            graphics2D.drawString(string, 90, n2 - 4);
            graphics2D.drawLine(n3, n2 - 3, n4, n2 - 3);
            n2 += 13;
        } else {
            graphics2D.drawString(this.\u00d6\u00d60000.\u00f800000().toString(), 90, n2 - 4);
            graphics2D.drawLine(n3, n2, n4, n2);
            n2 += 17;
        }
        graphics2D.setFont(this.o00000(12));
        String string2 = this.\u00d6\u00d60000.\u00d800000().toString();
        if (!this.\u00d6\u00d60000.thissuper().\u00d300000().isEmpty()) {
            string2 = this.\u00d6\u00d60000.thissuper().\u00d300000();
        }
        if (this.o00000(string2, graphics2D) > 324.0f) {
            float f3 = this.o00000(string2, graphics2D);
            String[] stringArray2 = string2.split(" ");
            String string3 = "";
            graphics2D.setFont(this.o00000(8));
            n2 -= 4;
            for (int i2 = 0; i2 < stringArray2.length; ++i2) {
                if (this.o00000(string3, graphics2D) + this.o00000(stringArray2[i2], graphics2D) > f3 / 2.0f) {
                    graphics2D.drawString(string3, 90, n2 - 4);
                    graphics2D.drawLine(90, n2 - 3, n4, n2 - 3);
                    n2 += 8;
                    string3 = stringArray2[i2] + " ";
                    continue;
                }
                string3 = string3 + stringArray2[i2] + " ";
            }
            graphics2D.drawString(string3, 90, n2 - 4);
            n2 -= 4;
        } else {
            graphics2D.drawString(string2, 90, n2 - 4);
        }
        graphics2D.setFont(this.o00000(10));
        graphics2D.drawString(this.\u00d6\u00d60000.\u00d300000().toString(), 90, (n2 += 32) - 3);
        graphics2D.drawLine(n3, n2, 172, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getStand(), 330, n2 - 3);
        graphics2D.drawLine(277, n2, n4, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().super().toString(), 90, (n2 += 14) - 3);
        graphics2D.drawLine(n3, n2, 172, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getTitel(), 330, n2 - 3);
        graphics2D.drawLine(277, n2, n4, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getGroesse() / 2 + " " + "Finger" + " (" + this.\u00d6\u00d60000.thissuper().getGroesse() + " " + "cm" + " )", 90, (n2 += 14) - 3);
        graphics2D.drawLine(n3, n2, 172, n2);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.o00000(b_0.\u00f5\u00f5\u00d2000)), 330, n2 - 3);
        graphics2D.drawLine(277, n2, n4, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getGewicht(this.\u00d6\u00d60000.o00000(I.\u00f8\u00d2o000)) + " " + "Stein", 90, (n2 += 14) - 3);
        graphics2D.drawLine(n3, n2, 172, n2);
        graphics2D.drawLine(277, n2, n4, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getHaarFarbe(), 90, (n2 += 14) - 3);
        graphics2D.drawLine(n3, n2, 172, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[0], 277, n2 - 3);
        graphics2D.drawLine(277, n2, n4, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getAugenFarbe(), 90, (n2 += 14) - 3);
        graphics2D.drawLine(n3, n2, 172, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[1], 277, n2 - 3);
        graphics2D.drawLine(277, n2, n4, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getAussehenText()[0], n3, (n2 += 14) - 3);
        graphics2D.drawLine(n3, n2, 172, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[2], 277, n2 - 3);
        graphics2D.drawLine(277, n2, n4, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getAussehenText()[1], n3, (n2 += 14) - 3);
        graphics2D.drawLine(n3, n2, 172, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[3], 277, n2 - 3);
        graphics2D.drawLine(277, n2, n4, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getAussehenText()[2], n3, (n2 += 14) - 3);
        graphics2D.drawLine(n3, n2, 172, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[4], 277, n2 - 3);
        graphics2D.drawLine(277, n2, n4, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getAussehenText()[3], n3, (n2 += 14) - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[5], 277, n2 - 3);
        return n2 -= 14;
    }

    private int \u00d300000(Graphics2D graphics2D, boolean bl) {
        int n;
        String string;
        Object object;
        int n2 = 30;
        int n3 = 220;
        int n4 = n3 + 10;
        int n5 = 15;
        int n6 = 435;
        if (bl) {
            n3 = 180;
            n4 = n3 + 90;
        }
        graphics2D.setFont(this.o00000(16));
        graphics2D.drawString("Name: ", n5, n2 - 4);
        if (this.o00000(this.\u00d6\u00d60000.toString(), graphics2D) > 345.0f) {
            object = this.\u00d6\u00d60000.toString().split(" ");
            string = "";
            for (n = 0; n < ((String[])object).length; ++n) {
                if (this.o00000(string, graphics2D) + this.o00000(object[n], graphics2D) > 330.0f) {
                    graphics2D.drawString(string, 90, n2 - 4);
                    graphics2D.drawLine(n5, n2, n6, n2);
                    n2 += 17;
                    string = object[n] + " ";
                    continue;
                }
                string = string + object[n] + " ";
            }
            graphics2D.drawString(string, 90, n2 - 4);
            graphics2D.drawLine(n5, n2, n6, n2);
            n2 += 17;
        } else {
            graphics2D.drawString(this.\u00d6\u00d60000.toString(), 90, n2 - 4);
            graphics2D.drawLine(n5, n2, n6, n2);
            n2 += 17;
        }
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("Rasse: ", n5, n2 - 4);
        if (this.o00000(this.\u00d6\u00d60000.o\u00d20000().toString(), graphics2D) > 345.0f) {
            object = this.\u00d6\u00d60000.o\u00d20000().toString().split(" ");
            string = "";
            for (n = 0; n < ((String[])object).length; ++n) {
                if (this.o00000(string, graphics2D) + this.o00000(object[n], graphics2D) > 330.0f) {
                    graphics2D.drawString(string, 90, n2 - 4);
                    graphics2D.drawLine(n5, n2, n6, n2);
                    n2 += 17;
                    string = object[n] + " ";
                    continue;
                }
                string = string + object[n] + " ";
            }
            graphics2D.drawString(string, 90, n2 - 4);
            graphics2D.drawLine(n5, n2, n6, n2);
            n2 += 17;
        } else {
            graphics2D.drawString(this.\u00d6\u00d60000.o\u00d20000().toString(), 90, n2 - 4);
            graphics2D.drawLine(n5, n2, n6, n2);
            n2 += 17;
        }
        graphics2D.drawString("Kultur: ", n5, n2 - 4);
        if (this.o00000(this.\u00d6\u00d60000.\u00f800000().toString(), graphics2D) > 345.0f) {
            object = this.\u00d6\u00d60000.\u00f800000().toString().split(" ");
            string = "";
            for (n = 0; n < ((String[])object).length; ++n) {
                if (this.o00000(string, graphics2D) + this.o00000(object[n], graphics2D) > 330.0f) {
                    graphics2D.drawString(string, 90, n2 - 4);
                    graphics2D.drawLine(n5, n2, n6, n2);
                    n2 += 17;
                    string = (String)object[n] + " ";
                    continue;
                }
                string = string + object[n] + " ";
            }
            graphics2D.drawString(string, 90, n2 - 4);
            graphics2D.drawLine(n5, n2, n6, n2);
            n2 += 17;
        } else {
            graphics2D.drawString(this.\u00d6\u00d60000.\u00f800000().toString(), 90, n2 - 4);
            graphics2D.drawLine(n5, n2, n6, n2);
            n2 += 17;
        }
        graphics2D.drawString("Profession: ", n5, n2 - 4);
        object = this.\u00d6\u00d60000.\u00d800000().toString();
        if (!this.\u00d6\u00d60000.thissuper().\u00d300000().isEmpty()) {
            object = this.\u00d6\u00d60000.thissuper().\u00d300000();
        }
        if (this.o00000((String)object, graphics2D) > 345.0f) {
            String[] stringArray = ((String)object).split(" ");
            String string2 = "";
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                if (this.o00000(string2, graphics2D) + this.o00000(stringArray[i2], graphics2D) > 330.0f) {
                    graphics2D.drawString(string2, 90, n2 - 4);
                    graphics2D.drawLine(n5, n2, n6, n2);
                    n2 += 17;
                    string2 = stringArray[i2] + " ";
                    continue;
                }
                string2 = string2 + stringArray[i2] + " ";
            }
            graphics2D.drawString(string2, 90, n2 - 4);
        } else {
            graphics2D.drawString((String)object, 90, n2 - 4);
        }
        graphics2D.drawRoundRect(10, 10, 430, n2 - 9, 5, 5);
        n2 += 27;
        File file = new File(this.\u00d6\u00d60000.forsuper());
        if (file.exists()) {
            M m = new M(this.\u00d6\u00d60000.forsuper());
            m.o00000(graphics2D, 185, n2 - 14, 79, 140);
            graphics2D.drawRect(185, n2 - 14, 79, 140);
        }
        graphics2D.setFont(this.o00000(10));
        int n7 = n2 - 14;
        graphics2D.drawString("Geschlecht:", n5, n2 - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.\u00d300000().toString(), 90, n2 - 3);
        graphics2D.drawLine(n5, n2, n3, n2);
        graphics2D.drawString("Stand:", n4, n2 - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getStand(), n4 + 40, n2 - 3);
        graphics2D.drawLine(n4, n2, n6, n2);
        graphics2D.drawString("Geburtsdatum:", n5, (n2 += 14) - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().super().toString(), 90, n2 - 3);
        graphics2D.drawLine(n5, n2, n3, n2);
        graphics2D.drawString("Titel:", n4, n2 - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getTitel(), n4 + 40, n2 - 3);
        graphics2D.drawLine(n4, n2, n6, n2);
        graphics2D.drawString("Gr\u00f6\u00dfe:", n5, (n2 += 14) - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getGroesse() / 2 + " Finger (" + this.\u00d6\u00d60000.thissuper().getGroesse() + " cm)", 90, n2 - 3);
        graphics2D.drawLine(n5, n2, n3, n2);
        graphics2D.drawString("Sozialstatus:", n4, n2 - 3);
        graphics2D.drawString(this.new("" + this.\u00d6\u00d60000.o00000(b_0.\u00f5\u00f5\u00d2000)), n4 + 70, n2 - 3);
        graphics2D.drawLine(n4, n2, n6, n2);
        graphics2D.drawString("Gewicht:", n5, (n2 += 14) - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getGewicht(this.\u00d6\u00d60000.o00000(I.\u00f8\u00d2o000)) + " Stein", 90, n2 - 3);
        graphics2D.drawLine(n5, n2, n3, n2);
        graphics2D.drawString("Familie/Herkunft/Hintergrund", n4, n2 - 3);
        graphics2D.drawLine(n4, n2, n6, n2);
        graphics2D.drawString("Haarfarbe:", n5, (n2 += 14) - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getHaarFarbe(), 90, n2 - 3);
        graphics2D.drawLine(n5, n2, n3, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[0], n4, n2 - 3);
        graphics2D.drawLine(n4, n2, n6, n2);
        graphics2D.drawString("Augenfarbe:", n5, (n2 += 14) - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getAugenFarbe(), 90, n2 - 3);
        graphics2D.drawLine(n5, n2, n3, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[1], n4, n2 - 3);
        graphics2D.drawLine(n4, n2, n6, n2);
        graphics2D.drawString("Aussehen:", n5, (n2 += 14) - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getAussehenText()[0], 90, n2 - 3);
        graphics2D.drawLine(n5, n2, n3, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[2], n4, n2 - 3);
        graphics2D.drawLine(n4, n2, n6, n2);
        graphics2D.drawLine(n5, n2 += 14, n3, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getAussehenText()[1], n5, n2 - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[3], n4, n2 - 3);
        graphics2D.drawLine(n4, n2, n6, n2);
        graphics2D.drawLine(n5, n2 += 14, n3, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getAussehenText()[2], n5, n2 - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[4], n4, n2 - 3);
        graphics2D.drawLine(n4, n2, n6, n2);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getAussehenText()[3], n5, (n2 += 14) - 3);
        graphics2D.drawString(this.\u00d6\u00d60000.thissuper().getFamilieText()[5], n4, n2 - 3);
        graphics2D.drawRoundRect(n5 - 5, n7, n6 - n5 + 10, (n2 -= 14) - n7 + 14, 5, 5);
        return n2;
    }

    private void \u00f400000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        File file = new File(this.\u00d6\u00d60000.forsuper());
        int n = this.\u00d300000(graphics2D, file.exists());
        n = this.\u00d5\u00d30000(graphics2D, n);
        n = this.o\u00d30000(graphics2D, n);
        this.\u00d4\u00d30000(graphics2D, n);
    }

    private void new(Graphics2D graphics2D, String string, String string2, int n, int n2, int n3, int n4) {
        int n5 = 435;
        graphics2D.drawLine(190, n4, n5, n4);
        graphics2D.drawString(string, 190, n4 + 10);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString(string2, 250, n4 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString(this.new("" + n), 320, n4 + 10);
        graphics2D.drawString(this.new("" + n2), 345, n4 + 10);
        graphics2D.drawString(this.new("" + n3), 370, n4 + 10);
    }

    private int whilenew(Graphics2D graphics2D, int n) {
        int n2 = n;
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("" + this.\u00d6\u00d60000.o\u00d30000(), 85, n2 += 67);
        graphics2D.drawString("" + this.\u00d6\u00d60000.\u00d400000(), 180, n2);
        graphics2D.drawString("" + (this.\u00d6\u00d60000.o\u00d30000() - this.\u00d6\u00d60000.\u00d400000()), 305, n2);
        graphics2D.drawString(this.new("" + this.Stringsuper()) + " [" + this.\u00f4O0000() + "]", 377, n2);
        return n2;
    }

    private int \u00d4\u00d30000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 15;
        int n4 = 435;
        int n5 = (n2 += 38) - 15;
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("Abenteuerpunkte:", n3, n2);
        this.o00000(graphics2D, "" + this.\u00d6\u00d60000.o\u00d30000(), 150, n2);
        graphics2D.drawString("Verf\u00fcgbar:", 160, n2);
        this.o00000(graphics2D, "" + this.\u00d6\u00d60000.\u00d400000(), 250, n2);
        graphics2D.drawString("Eingesetzt:", 265, n2);
        this.o00000(graphics2D, "" + (this.\u00d6\u00d60000.o\u00d30000() - this.\u00d6\u00d60000.\u00d400000()), 360, n2);
        graphics2D.drawString("Stufe: " + this.new("" + this.Stringsuper()) + " [" + this.\u00f4O0000() + "]", 375, n2);
        graphics2D.drawRoundRect(n3 - 5, n5, n4 - n3 + 10, n2 - n5 + 10, 5, 5);
        graphics2D.drawString("Notizen", n3, (n2 += 15) + 15);
        graphics2D.drawRoundRect(n3 - 5, n2, n4 - n3 + 10, 660 - n2, 5, 5);
        graphics2D.setFont(this.o00000(5));
        graphics2D.drawString(((K)this.\u00d6\u00d60000).o\u00d40000().toString(), n3, 670);
        graphics2D.drawRoundRect(5, 5, 440, 660, 5, 5);
        return n2;
    }

    private int \u00d3\u00d30000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 36;
        int n4 = 414;
        n2 += 62;
        String string = "";
        Iterator<public> iterator = this.\u00d6\u00d60000.\u00d500000().\u00d500000();
        graphics2D.setFont(this.o00000(8));
        AttributedString attributedString = null;
        int n5 = 0;
        int n6 = 0;
        Font font = this.o00000(8);
        Font font2 = font.deriveFont(2);
        ArrayList<J> arrayList = new ArrayList<J>();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.\u00f4O0000().Object()) continue;
            String[] stringArray = new String[]{public_.oO0000()};
            if (public_ instanceof helden.framework.C.M) {
                stringArray = public_.oO0000().split(", ");
            }
            for (String string2 : stringArray) {
                int j2;
                String string3 = ", ";
                n6 = public_.\u00d500000() ? (int)graphics2D.getFontMetrics(font2).getStringBounds(string2 + string3, graphics2D).getWidth() : (int)graphics2D.getFontMetrics(font).getStringBounds(string2 + string3, graphics2D).getWidth();
                if ((n5 += n6) < n4 - n3) {
                    int n7 = string.length();
                    j2 = string.length() + 2 + string2.length();
                    if (public_.\u00d500000()) {
                        arrayList.add(new J(n7, j2, false));
                        string = string + string2 + string3;
                        continue;
                    }
                    arrayList.add(new J(n7, j2, true));
                    string = string + string2 + string3;
                    continue;
                }
                attributedString = new AttributedString(string);
                for (J j3 : arrayList) {
                    if (j3.\u00d300000()) {
                        attributedString.addAttribute(TextAttribute.FONT, font, j3.o00000(), j3.new());
                        continue;
                    }
                    attributedString.addAttribute(TextAttribute.FONT, font2, j3.o00000(), j3.new());
                }
                arrayList = new ArrayList();
                graphics2D.drawString(attributedString.getIterator(), n3, n2 - 2);
                graphics2D.drawLine(n3, n2, n4, n2);
                j2 = 0;
                int n8 = 2 + string2.length();
                if (public_.\u00d500000()) {
                    arrayList.add(new J(j2, n8, false));
                    string = string + string2 + string3;
                    n6 = (int)graphics2D.getFontMetrics(font2).getStringBounds(string2 + string3, graphics2D).getWidth();
                } else {
                    arrayList.add(new J(j2, n8, true));
                    string = string + string2 + string3;
                    n6 = (int)graphics2D.getFontMetrics(font).getStringBounds(string2 + string3, graphics2D).getWidth();
                }
                string = string2 + string3;
                n2 += 11;
                n5 = n6;
            }
        }
        attributedString = new AttributedString(string);
        for (J j4 : arrayList) {
            if (j4.\u00d300000()) {
                attributedString.addAttribute(TextAttribute.FONT, font, j4.o00000(), j4.new());
                continue;
            }
            attributedString.addAttribute(TextAttribute.FONT, font2, j4.o00000(), j4.new());
        }
        arrayList = new ArrayList();
        if (attributedString.getIterator().getEndIndex() > 0) {
            graphics2D.drawString(attributedString.getIterator(), n3, n2 - 2);
        }
        while (n + 115 > n2) {
            graphics2D.drawLine(n3, n2, n4, n2);
            n2 += 11;
        }
        return n + 104;
    }

    private int \u00d5\u00d30000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 15;
        int n4 = 435;
        int n5 = (n2 += 32) - 13;
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("Vorteile und Nachteile", n3, n2);
        n2 += 15;
        String string = "";
        Iterator<public> iterator = this.\u00d6\u00d60000.\u00d500000().\u00d500000();
        graphics2D.setFont(this.o00000(8));
        AttributedString attributedString = null;
        int n6 = 0;
        int n7 = 0;
        Font font = this.o00000(8);
        Font font2 = font.deriveFont(2);
        ArrayList<J> arrayList = new ArrayList<J>();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.\u00f4O0000().Object()) continue;
            String[] stringArray = new String[]{public_.oO0000()};
            if (public_ instanceof helden.framework.C.M) {
                stringArray = public_.oO0000().split(", ");
            }
            for (String string2 : stringArray) {
                int j2;
                String string3 = ", ";
                n7 = public_.\u00d500000() ? (int)graphics2D.getFontMetrics(font2).getStringBounds(string2 + string3, graphics2D).getWidth() : (int)graphics2D.getFontMetrics(font).getStringBounds(string2 + string3, graphics2D).getWidth();
                if ((n6 += n7) < n4 - n3) {
                    int n8 = string.length();
                    j2 = string.length() + 2 + string2.length();
                    if (public_.\u00d500000()) {
                        arrayList.add(new J(n8, j2, false));
                        string = string + string2 + string3;
                        continue;
                    }
                    arrayList.add(new J(n8, j2, true));
                    string = string + string2 + string3;
                    continue;
                }
                attributedString = new AttributedString(string);
                for (J j3 : arrayList) {
                    if (j3.\u00d300000()) {
                        attributedString.addAttribute(TextAttribute.FONT, font, j3.o00000(), j3.new());
                        continue;
                    }
                    attributedString.addAttribute(TextAttribute.FONT, font2, j3.o00000(), j3.new());
                }
                arrayList = new ArrayList();
                graphics2D.drawString(attributedString.getIterator(), n3, n2 - 3);
                graphics2D.drawLine(n3, n2, n4, n2);
                j2 = 0;
                int n9 = 2 + string2.length();
                if (public_.\u00d500000()) {
                    arrayList.add(new J(j2, n9, false));
                    string = string + string2 + string3;
                    n7 = (int)graphics2D.getFontMetrics(font2).getStringBounds(string2 + string3, graphics2D).getWidth();
                } else {
                    arrayList.add(new J(j2, n9, true));
                    string = string + string2 + string3;
                    n7 = (int)graphics2D.getFontMetrics(font).getStringBounds(string2 + string3, graphics2D).getWidth();
                }
                string = string2 + string3;
                n2 += 13;
                n6 = n7;
            }
        }
        attributedString = new AttributedString(string);
        for (J j4 : arrayList) {
            if (j4.\u00d300000()) {
                attributedString.addAttribute(TextAttribute.FONT, font, j4.o00000(), j4.new());
                continue;
            }
            attributedString.addAttribute(TextAttribute.FONT, font2, j4.o00000(), j4.new());
        }
        if (attributedString.getIterator().getEndIndex() > 0) {
            graphics2D.drawString(attributedString.getIterator(), n3, n2 - 3);
        }
        graphics2D.drawLine(n3, n2, n4, n2);
        graphics2D.setFont(this.o00000(10));
        graphics2D.drawRoundRect(n3 - 5, n5, n4 - n3 + 10, n2 - n5 + 14, 5, 5);
        return n2;
    }

    private int \u00f5O0000() {
        int n = (this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.newwhilesuper) + this.\u00d6\u00d60000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper) + 2) / 5;
        return n;
    }

    private int \u00f4O0000() {
        if (this.\u00d8\u00d60000.isDsa40stufe()) {
            return HeldenMath.getStufe40(this.\u00d6\u00d60000.o\u00d30000());
        }
        return HeldenMath.getStufe41(this.\u00d6\u00d60000.o\u00d30000());
    }

    private int Stringsuper() {
        if (this.\u00d8\u00d60000.isDsa40stufe()) {
            return HeldenMath.getStufe40(this.\u00d6\u00d60000.o\u00d30000() - this.\u00d6\u00d60000.\u00d400000());
        }
        return HeldenMath.getStufe41(this.\u00d6\u00d60000.o\u00d30000() - this.\u00d6\u00d60000.\u00d400000());
    }
}

