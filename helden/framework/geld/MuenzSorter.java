/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.geld;

import helden.framework.geld.Muenze;
import helden.framework.geld.Waehrung;
import java.util.Comparator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class MuenzSorter
implements Comparator<String> {
    private Waehrung super;

    public MuenzSorter(Waehrung waehrung) {
        this.super = waehrung;
    }

    @Override
    public int compare(String string, String string2) {
        Muenze muenze = this.super.getMuenzen(string);
        Muenze muenze2 = this.super.getMuenzen(string2);
        return new Float(muenze2.getWertInSilberstuecke()).compareTo(new Float(muenze.getWertInSilberstuecke()));
    }
}

