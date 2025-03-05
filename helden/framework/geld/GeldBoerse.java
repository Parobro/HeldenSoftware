/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.geld;

import helden.framework.geld.Muenze;
import java.util.Iterator;
import java.util.Vector;

public interface GeldBoerse {
    public void addMuenze(Muenze var1, int var2);

    public Vector<String> getGeldStrings(boolean var1);

    public int getMuenzAnzahl(Muenze var1);

    public Iterator<Muenze> getMuenzeIter();

    public void putMuenze(Muenze var1, int var2);
}

