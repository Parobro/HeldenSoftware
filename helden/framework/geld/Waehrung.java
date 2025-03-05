/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.geld;

import helden.framework.geld.Muenze;
import java.util.Iterator;

public interface Waehrung {
    public String getBezeichner();

    public Waehrung getClone();

    public Iterator<String> getMuenzBezeichner();

    public Muenze getMuenzen(String var1);

    public void setMuenzen(String var1, Muenze var2);
}

