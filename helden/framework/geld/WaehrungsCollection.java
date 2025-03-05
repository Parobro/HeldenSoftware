/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.geld;

import helden.framework.geld.Waehrung;
import java.util.Collection;

public interface WaehrungsCollection {
    public Collection<Waehrung> getAllWaehrungen();

    public Collection<String> getAllWaehrungenBezeichner();

    public Waehrung getWaehrungen(String var1);
}

