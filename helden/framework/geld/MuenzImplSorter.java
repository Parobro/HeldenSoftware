/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.geld;

import helden.framework.geld.Muenze;
import java.util.Comparator;

public class MuenzImplSorter
implements Comparator<Muenze> {
    @Override
    public int compare(Muenze muenze, Muenze muenze2) {
        return muenze.getBezeichner().compareTo(muenze2.getBezeichner());
    }
}

