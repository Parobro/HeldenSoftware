/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.D.P;
import helden.framework.held.Object.floatsuper;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.Vector;

public class APPoolAutoVerbilligteSF
extends KostenArt {
    private int \u00d8\u00d20000;
    private Vector<KostenEntry.kostenBereich> \u00f4\u00d20000;

    public APPoolAutoVerbilligteSF(String string, String string2, int n, floatsuper floatsuper2) {
        super(string, string2);
        this.\u00d8\u00d20000 = n;
        this.\u00f4\u00d20000 = super.getNutzbareBereiche();
        this.\u00f4\u00d20000.add(KostenEntry.kostenBereich.\u00d800000);
    }

    @Override
    public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
        return KostenEntry.kostenBereich.\u00d800000.equals((Object)kostenBereich2) && object instanceof P;
    }

    @Override
    public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
        return this.\u00f4\u00d20000;
    }

    @Override
    public int getVerfuegbarePunkte() {
        return this.\u00d8\u00d20000;
    }

    @Override
    public Boolean verbilligteSFKostennutzen() {
        return false;
    }
}

