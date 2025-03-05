/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.h.super;

import helden.framework.D.P;
import helden.framework.D.oO0O;
import helden.framework.D.public;
import helden.framework.D.while;
import helden.framework.d.oooo_0;
import helden.framework.held.K;
import helden.framework.held.object.o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0;
import helden.framework.int.String;
import helden.gui.A;
import helden.gui.allgemein.Utils;
import helden.gui.components.AuswahlPanel;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Renamed from helden.gui.H.super.ooOO
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class oooo_1 {
    protected A o00000;
    protected K new;
    protected o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0 \u00d300000;

    public oooo_1(K k2, A a2) {
        this.o00000 = a2;
        this.new = k2;
        this.\u00d300000 = new o0oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_0(this.new);
    }

    public <T> T o00000(ArrayList<T> arrayList, String string) {
        AuswahlPanel<T> auswahlPanel = new AuswahlPanel<T>(arrayList, string, 1);
        JDialog jDialog = new JDialog(Utils.getFrame(this.o00000), "Sp\u00e4tweihe", true);
        auswahlPanel.getController().setDialog(jDialog);
        jDialog.getContentPane().add(auswahlPanel);
        jDialog.setSize(600, 400);
        Utils.zentriere(jDialog);
        do {
            jDialog.setVisible(true);
            if (auswahlPanel.getController().istBestaetigt()) continue;
            return null;
        } while (!auswahlPanel.check());
        return auswahlPanel.getAusgewaelteVarianteimPanelList().get(0);
    }

    public void o00000(int n) {
        ArrayList<Object> arrayList;
        Object object;
        helden.framework.held.object.oooo_1 oooo_12 = new helden.framework.held.object.oooo_1(this.new);
        Iterator<P> iterator = oooo_12.o00000(true).iterator();
        ArrayList<P> arrayList2 = new ArrayList<P>();
        int n2 = 0;
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!((P)object).\u00d3O0000() || !oooo_12.\u00d200000((P)object)) continue;
            public public_ = (public)object;
            arrayList2.add((P)object);
            n2 += public_.whilenew();
        }
        if (n > n2) {
            JOptionPane.showMessageDialog(null, "Ihnen stehen " + n + " Liturgiegrade zur Vef\u00fcgung, \n" + "jedoch k\u00f6nnen sie nur Liturgien\nmit insgesamt " + n2 + " Liturgiegrade w\u00e4hlen,\n" + "da f\u00fcr alle anderen die Voraussetzungen nicht erf\u00fcllt sind.\n\n" + (n - n2) + " Liturgiegrade verfallen ungenutzt!", "Regelbug", 0);
            n = n2;
        }
        if (n >= n2) {
            arrayList = new ArrayList<P>();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = this.o00000(n, arrayList2);
        }
        object = arrayList.iterator();
        while (object.hasNext()) {
            this.\u00d300000.o00000((P)object.next(), "Sp\u00e4tweihe");
        }
    }

    public boolean \u00d200000() {
        return this.new.\u00d800000().\u00d400000(String._o.\u00d200000) || this.new.o00000(while.o\u00d4\u00d4000) || this.new.o00000(while.fornewObject) || this.new.o00000(while.\u00d8\u00d6\u00d5000) || this.new.o00000(while.o\u00d2\u00f4000) || this.new.o00000(while.\u00d6\u00d8\u00d8000) || this.new.o00000(while.\u00d3\u00f8\u00d4000);
    }

    public abstract void o00000();

    private ArrayList<P> o00000(int n, ArrayList<P> arrayList) {
        Cloneable cloneable;
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (P object2 : arrayList) {
            cloneable = (public)object2;
            arrayList2.add(((P)cloneable).toString() + " (Grad: " + ((oO0O)cloneable).whilenew() + ")");
        }
        AuswahlPanel auswahlPanel = new AuswahlPanel(arrayList2, "Bitten w\u00e4hlen sie Liturgien mit einen Gesamtgrad von " + n + " aus:", 1, n);
        JDialog jDialog = new JDialog(Utils.getFrame(this.o00000), "Zus\u00e4tzliche Liturgien", true);
        auswahlPanel.getController().setDialog(jDialog);
        jDialog.getContentPane().add(auswahlPanel);
        jDialog.setSize(600, 400);
        Utils.zentriere(jDialog);
        cloneable = new ArrayList();
        while (true) {
            jDialog.setVisible(true);
            if (!auswahlPanel.getController().istBestaetigt() || !auswahlPanel.check()) continue;
            ArrayList arrayList3 = auswahlPanel.getAusgewaelteVarianteimPanelList();
            int n2 = 0;
            ((ArrayList)cloneable).clear();
            for (String string : arrayList3) {
                string = string.substring(0, string.length() - 10);
                P p2 = oooo_0.o00000(string);
                ((ArrayList)cloneable).add(p2);
                public public_ = (public)p2;
                n2 += public_.whilenew();
            }
            if (n2 == n) break;
            if (n2 > n) {
                JOptionPane.showMessageDialog(null, "Sie haben zuviele Liturgiegrade verbraucht: " + n2, "Zuviele Punkte", 0);
            }
            if (n2 >= n) continue;
            JOptionPane.showMessageDialog(null, "Sie haben zuwenige Liturgiegrade verbraucht: " + n2, "Zuwenige Punkte", 0);
        }
        return cloneable;
    }
}

