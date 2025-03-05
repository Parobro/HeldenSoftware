/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.C.A.float;
import helden.framework.C.I;
import helden.framework.D.P;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class APPoolKarmatiker
extends KostenArt {
    private int OO0000;
    private Vector<KostenEntry.kostenBereich> do;

    public APPoolKarmatiker(HEW2 hEW2) {
        super("Karmatiker-Punkte", "KARMATIKER");
        float float_ = (float)hEW2.\u00d6o0000.\u00d500000().\u00d300000(I.\u00f5\u00d60000);
        this.OO0000 = (float_.classObject() + 3) * 50;
        this.do = super.getNutzbareBereiche();
        this.do.add(KostenEntry.kostenBereich.class);
    }

    @Override
    public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
        if (!(object instanceof P)) {
            return false;
        }
        P p2 = (P)object;
        return p2.\u00d3O0000() || p2.\u00d500000();
    }

    @Override
    public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
        return this.do;
    }

    @Override
    public int getVerfuegbarePunkte() {
        return this.OO0000;
    }

    @Override
    public ArrayList<Hinweis> pruefen() {
        return null;
    }

    @Override
    public Boolean verbilligteSFKostennutzen() {
        return false;
    }
}

