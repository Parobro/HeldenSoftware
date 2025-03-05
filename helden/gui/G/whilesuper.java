/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.held.Object.O0OO;
import helden.framework.int.P;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.gui.G.D;
import helden.gui.g.c_0;
import helden.model.profession.Lehrmeister;
import helden.model.profession.Magier;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class whilesuper
extends D {
    private c_0<P> \u00f5o0000;
    private ArrayList<P> privatesuper;
    private P O\u00d20000;
    private int \u00f8o0000;

    public whilesuper(O0OO o0OO2, int n) {
        super(o0OO2);
        Magier magier;
        this.\u00f8o0000 = n;
        if (o0OO2.\u00d800000().\u00d800000().hatProfession(Magier.class) == null && o0OO2.\u00d800000().\u00d800000().hatProfession(Lehrmeister.class) == null) {
            return;
        }
        Magier magier2 = new Magier(this.\u00d300000().\u00d300000(), null, null);
        this.O\u00d20000 = new P("keine Weiterbildung", 0, false);
        this.privatesuper = new ArrayList();
        this.privatesuper.add(this.O\u00d20000);
        if (n == 1) {
            this.privatesuper.add(magier2.getInstitutDerArkanenAnalysen());
        } else {
            this.privatesuper.addAll(magier2.getAlleVarianten());
        }
        Collections.sort(this.privatesuper);
        this.\u00f5o0000 = new c_0();
        P p2 = this.O\u00d20000;
        ArrayList<super> arrayList = this.\u00d300000().\u00d800000().Object(String._o.\u00d800000);
        if (arrayList != null) {
            if (arrayList.size() >= n + 1) {
                p2 = ((Magier)arrayList.get(n)).getKonkreteVariante();
            }
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                if (i2 == n) continue;
                this.super(this.privatesuper, ((Magier)arrayList.get(i2)).getKonkreteVariante());
            }
        }
        if (this.\u00d300000().\u00d4O0000() instanceof Magier && (magier = (Magier)this.\u00d300000().\u00d4O0000()) != null) {
            this.super(this.privatesuper, magier.getKonkreteVariante());
        }
        P p3 = null;
        for (P p4 : this.privatesuper) {
            if (!p2.toString().equals(p4.toString())) continue;
            p3 = p4;
        }
        this.\u00f5o0000.o00000(this.privatesuper, p3);
    }

    @Override
    public String \u00d200000() {
        return "Magische Weiterbildung (" + (this.\u00f8o0000 + 1) + ") :";
    }

    @Override
    public JPanel super() {
        return this.\u00f5o0000;
    }

    @Override
    public void class() {
        this.\u00d300000().\u00d800000().o00000(String._o.\u00d800000, this.\u00f8o0000);
    }

    public void super(ArrayList<P> arrayList, P p2) {
        P p3 = null;
        for (P p4 : arrayList) {
            if (!p4.toString().equals(p2.toString())) continue;
            p3 = p4;
            break;
        }
        this.privatesuper.remove(p3);
    }

    @Override
    public boolean \u00d400000() {
        Magier magier = new Magier(this.\u00d300000().\u00d300000(), this.\u00d300000().\u00d4O0000().getMuttersprache(), this.\u00d300000().\u00d4O0000().getMuttersprachenSchrift());
        if (this.\u00f5o0000.new() != this.O\u00d20000) {
            magier.waehleVariante(this.\u00f5o0000.new());
            this.\u00d300000().\u00d800000().o00000(String._o.\u00d800000, magier, this.\u00f8o0000);
        } else {
            this.\u00d300000().\u00d800000().o00000(String._o.\u00d800000, this.\u00f8o0000);
        }
        return true;
    }
}

