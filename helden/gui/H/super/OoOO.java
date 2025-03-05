/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.H.super;

import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.while;
import helden.framework.OOoO.R;
import helden.framework.OOoO.Stringsuper;
import helden.framework.OOoO.class;
import helden.framework.bedingungen.AbstraktBedingung;
import helden.framework.bedingungen.Bedingung;
import helden.framework.d.oooo.o0oo_0;
import helden.framework.d.oooo_0;
import helden.framework.held.K;
import helden.framework.held.Object.floatsuper;
import helden.gui.A;
import helden.gui.h.super.oooo_1;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OoOO
extends oooo_1 {
    public OoOO(K k2, A a2) {
        super(k2, a2);
    }

    public int o00000(floatsuper floatsuper2, Integer n) {
        int n2 = n - 1;
        int[] nArray = new int[]{500, 700, 850, 1000, 1500, 2000};
        int[] nArray2 = new int[]{750, 1000, 1250, 1500, 2300, 3000};
        int[] nArray3 = new int[]{1000, 1500, 1700, 2000, 3000, 4000};
        if (floatsuper2.Object((AbstraktBedingung)Bedingung.istMindestens(Bedingung.MagieLevel.\u00d500000))) {
            return nArray3[n2];
        }
        if (floatsuper2.Object((AbstraktBedingung)Bedingung.istMindestens(Bedingung.MagieLevel.\u00d800000))) {
            return nArray2[n2];
        }
        return nArray[n2];
    }

    @Override
    public void o00000() {
        floatsuper floatsuper2 = new floatsuper(this.new);
        this.new = (K)this.o00000.\u00d2O0000();
        if (this.\u00d200000()) {
            return;
        }
        o0oo_0 o0oo_02 = (o0oo_0)oooo_0.o00000(while.\u00d8\u00d6\u00d5000);
        ArrayList<Stringsuper> arrayList = new ArrayList<Stringsuper>(class.\u00d300000().keySet());
        Stringsuper stringsuper = this.o00000(arrayList, "Ausrichtung der Sp\u00e4tweihe: ");
        if (stringsuper == null) {
            return;
        }
        ArrayList arrayList2 = o0oo_02.o00000(1, this.new.oO0000());
        Integer n = (Integer)this.o00000(arrayList2, "Stufe der Sp\u00e4tweihe");
        if (n == null) {
            return;
        }
        o0oo_02.\u00d400000(new R(stringsuper, n));
        Q q = o0oo_02.o\u00d40000().get(0);
        if (!floatsuper2.Object(q.\u00f5o0000())) {
            String string = "<html><body>Nicht alle Bedingungen f\u00fcr die Sp\u00e4tweihe sind erf\u00fcllt.\n\n";
            string = string + q.\u00f5o0000().toStringFormatiertHTML();
            JOptionPane.showMessageDialog(null, string, "Fehlende Voraussetzungen:", 2);
            return;
        }
        int n2 = this.o00000(floatsuper2, n);
        if (this.new.o00000(while.\u00d3\u00f4\u00f5000)) {
            n2 -= 50;
        }
        if (this.new.\u00d400000() < n2) {
            String string = "Nicht gen\u00fcgend Abenteuerpunkte f\u00fcr die Sp\u00e4tweihe\n\n";
            string = string + "Notwending sind " + n2 + " AP\n";
            JOptionPane.showMessageDialog(null, string, "Nicht gen\u00fcgend AP", 2);
            return;
        }
        this.\u00d300000.o00000((P)o0oo_02, "Sp\u00e4tweihe");
        int n3 = n * 4;
        this.o00000(n3);
        this.\u00d300000.o00000(n2, "Sp\u00e4tweihe");
        this.o00000.\u00d800000();
    }
}

