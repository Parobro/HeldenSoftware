/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.H;

import helden.framework.D.P;
import helden.framework.D.oO0O;
import helden.framework.D.public;
import helden.framework.D.while;
import helden.framework.OooO.o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.d.oooo_0;
import helden.framework.held.K;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.object.a_0;
import helden.gui.A;
import helden.gui.allgemein.Utils;
import helden.gui.components.AuswahlPanel;
import helden.gui.oooo_1;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends AbstractAction {
    private static C o00000;
    private A new;

    public static C super(A a2) {
        if (o00000 == null) {
            o00000 = new C(a2);
        }
        return o00000;
    }

    public C(A a2) {
        super("Kontakt zum gro\u00dfen Geist ...", new ImageIcon(Thread.currentThread().getContextClassLoader().getResource(oooo_1.o00000("helden/gui/icons/Blank.gif"))));
        this.new = a2;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        K k2 = (K)this.new.\u00d2O0000();
        String string = o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.new(k2);
        if (!string.isEmpty()) {
            JOptionPane.showMessageDialog(null, string, "Voraussetzungen", 2);
            return;
        }
        K k3 = a_0.class().\u00d200000(k2);
        if (k3 == null) {
            JOptionPane.showMessageDialog(this.new, "Duplizieren fehlgeschlagen", "Fehler beim Duplizieren des Helden", 0);
            return;
        }
        k3.\u00d500000(oooo_0.o00000(while.\u00d3\u00d6O000));
        ArrayList<P> arrayList = this.super(8, k3);
        if (arrayList == null) {
            return;
        }
        o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.o00000(arrayList, k2);
        this.new.\u00d800000();
    }

    public ArrayList<P> super(int n, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        Object object;
        helden.framework.held.object.oooo_1 oooo_12 = new helden.framework.held.object.oooo_1(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (P object22 : oooo_0.\u00f500000().values()) {
            if (!object22.\u00d3O0000() || !oooo_12.\u00d200000(object22)) continue;
            object = (public)object22;
            arrayList.add(object22.toString() + " (Grad: " + ((oO0O)object).whilenew() + ")");
        }
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        AuswahlPanel auswahlPanel = new AuswahlPanel(arrayList, "Bitten w\u00e4hlen sie Liturgien mit einen Gesamtgrad von " + n + " aus:", 1, n);
        object = new JDialog(Utils.getFrame(this.new), "Zus\u00e4tzliche Liturgien", true);
        auswahlPanel.getController().setDialog((JDialog)object);
        ((JDialog)object).getContentPane().add(auswahlPanel);
        ((Window)object).setSize(600, 400);
        Utils.zentriere((Window)object);
        while (true) {
            ((Dialog)object).setVisible(true);
            if (!auswahlPanel.getController().istBestaetigt()) {
                return null;
            }
            if (!auswahlPanel.check()) continue;
            ArrayList arrayList3 = auswahlPanel.getAusgewaelteVarianteimPanelList();
            int n2 = 0;
            arrayList2.clear();
            for (String string : arrayList3) {
                string = string.substring(0, string.length() - 10);
                P p2 = oooo_0.o00000(string);
                arrayList2.add(p2);
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
        return arrayList2;
    }
}

