/*
 * Decompiled with CFR 0.152.
 */
package helden.plugin.werteplugin.A;

import helden.framework.E.C.B;
import helden.framework.E.C.void;
import helden.framework.E.F;
import helden.framework.held.O;
import helden.plugin.werteplugin.A.H;
import helden.plugin.werteplugin.A.J;
import helden.plugin.werteplugin.A.K;
import helden.plugin.werteplugin.A.class;
import helden.plugin.werteplugin.A.new;
import helden.plugin.werteplugin.PluginAusruestung;
import helden.plugin.werteplugin.PluginFernkampfWaffe;
import helden.plugin.werteplugin.PluginNahkampfWaffe;
import helden.plugin.werteplugin.PluginParadeWaffe;
import helden.plugin.werteplugin.PluginRuestungsTeil;
import helden.plugin.werteplugin.PluginSchild;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class oooO
implements PluginAusruestung {
    private O super;

    public oooO(O o) {
        this.super = o;
    }

    @Override
    public PluginFernkampfWaffe[] getFernkampfWaffen() {
        ArrayList<J> arrayList = new ArrayList<J>();
        Iterator<F> iterator = this.super.o00000(helden.framework.E.B.class).iterator();
        while (iterator.hasNext()) {
            arrayList.add(new J(iterator.next()));
        }
        return arrayList.toArray(new PluginFernkampfWaffe[arrayList.size()]);
    }

    @Override
    public PluginRuestungsTeil getGesammtRuestung(PluginRuestungsTeil[] pluginRuestungsTeilArray) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        int n20 = 0;
        int n21 = 0;
        int n22 = 0;
        double d2 = 0.0;
        double d3 = 0.0;
        for (PluginRuestungsTeil pluginRuestungsTeil : pluginRuestungsTeilArray) {
            try {
                B cloneNotSupportedException = ((B)pluginRuestungsTeil.getRuestungsteil()).private();
                if (cloneNotSupportedException.\u00d3O0000()) {
                    d2 += (double)cloneNotSupportedException.\u00f600000() / (double)cloneNotSupportedException.for();
                    d3 += (double)cloneNotSupportedException.\u00d2O0000() / (double)cloneNotSupportedException.for();
                    cloneNotSupportedException.\u00f600000(0);
                    cloneNotSupportedException.\u00d500000(0);
                }
                if (cloneNotSupportedException.\u00f5O0000() && cloneNotSupportedException.null() > 0) {
                    n12 += (cloneNotSupportedException.\u00f8O0000() + 1) / 2;
                    n13 += (cloneNotSupportedException.\u00f800000() + 1) / 2;
                    n14 += (cloneNotSupportedException.newsuper() + 1) / 2;
                    n15 += (cloneNotSupportedException.\u00f6O0000() + 1) / 2;
                    n16 += (cloneNotSupportedException.\u00d6O0000() + 1) / 2;
                    n17 += (cloneNotSupportedException.\u00d8O0000() + 1) / 2;
                    n18 += (cloneNotSupportedException.\u00f500000() + 1) / 2;
                    n19 += (cloneNotSupportedException.\u00d5O0000() + 1) / 2;
                } else {
                    n12 += cloneNotSupportedException.\u00f8O0000();
                    n13 += cloneNotSupportedException.\u00f800000();
                    n14 += cloneNotSupportedException.newsuper();
                    n15 += cloneNotSupportedException.\u00f6O0000();
                    n16 += cloneNotSupportedException.\u00d6O0000();
                    n17 += cloneNotSupportedException.\u00d8O0000();
                    n18 += cloneNotSupportedException.\u00f500000();
                    n19 += cloneNotSupportedException.\u00d5O0000();
                    n22 += cloneNotSupportedException.null();
                }
                n += cloneNotSupportedException.\u00f8O0000();
                n2 += cloneNotSupportedException.\u00f800000();
                n3 += cloneNotSupportedException.newsuper();
                n4 += cloneNotSupportedException.\u00f6O0000();
                n5 += cloneNotSupportedException.\u00d6O0000();
                n6 += cloneNotSupportedException.\u00d8O0000();
                n7 += cloneNotSupportedException.\u00f500000();
                n8 += cloneNotSupportedException.\u00d5O0000();
                n9 += cloneNotSupportedException.oO0000();
                n10 += cloneNotSupportedException.\u00d2O0000();
                n11 += cloneNotSupportedException.\u00f600000();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                // empty catch block
            }
        }
        n20 = (n12 * 2 + n13 * 4 + n14 * 4 + n15 * 4 + n16 + n17 + n18 * 2 + n19 * 2 + 10) / 20;
        n21 = n20 - n22;
        n11 += (int)(d2 + 0.5);
        n10 += (int)(d3 + 1.0E-4);
        n11 = n21;
        n10 = n20;
        n9 = n20;
        int[] nArray = new int[]{n, n2, n3, n4, n5, n6, n7, n8, n9, n10};
        return new H(new B(nArray, n11, false, n22), "gesammt");
    }

    @Override
    public PluginNahkampfWaffe[] getNahkampfWaffen() {
        ArrayList<new> arrayList = new ArrayList<new>();
        Iterator<F> iterator = this.super.o00000(helden.framework.E.B.\u00d400000).iterator();
        while (iterator.hasNext()) {
            arrayList.add(new new(iterator.next()));
        }
        return arrayList.toArray(new PluginNahkampfWaffe[arrayList.size()]);
    }

    @Override
    public PluginParadeWaffe[] getParadeWaffen() {
        ArrayList<class> arrayList = new ArrayList<class>();
        Iterator<F> iterator = this.super.o00000(helden.framework.E.B.\u00f600000).iterator();
        while (iterator.hasNext()) {
            arrayList.add(new class(iterator.next()));
        }
        return arrayList.toArray(new PluginParadeWaffe[arrayList.size()]);
    }

    @Override
    public PluginRuestungsTeil[] getRuestungsTeile() {
        ArrayList<H> arrayList = new ArrayList<H>();
        Iterator<F> iterator = this.super.o00000(helden.framework.E.B.OO0000).iterator();
        while (iterator.hasNext()) {
            try {
                F f2 = iterator.next();
                B b = ((B)f2.o00000(helden.framework.E.B.OO0000, 0)).private();
                arrayList.add(new H(b, f2.toString()));
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                cloneNotSupportedException.printStackTrace();
            }
        }
        return arrayList.toArray(new PluginRuestungsTeil[arrayList.size()]);
    }

    @Override
    public PluginSchild[] getSchilde() {
        ArrayList<K> arrayList = new ArrayList<K>();
        for (F f2 : this.super.o00000(helden.framework.E.B.\u00d300000)) {
            try {
                void void_ = ((void)f2.o00000(helden.framework.E.B.\u00d300000, 0)).\u00d6\u00d20000();
                arrayList.add(new K(void_, f2.toString()));
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {}
        }
        return arrayList.toArray(new PluginSchild[arrayList.size()]);
    }
}

