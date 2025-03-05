/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.C.A;

import helden.framework.C.A;
import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.OOoO.R;
import helden.framework.d.oooo_0;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.b_0;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.Vector;

public class B
extends A {
    private static ArrayList o\u00d30000() {
        ArrayList<P> arrayList = new ArrayList<P>();
        for (P p2 : oooo_0.\u00f500000().values()) {
            if (!p2.\u00d500000()) continue;
            arrayList.add(p2);
        }
        return arrayList;
    }

    public B() {
        super(I.Oo0000, false, 1, b_0.o\u00d60000(), B.o\u00d30000());
        ((M)this).o00000("Unvollst\u00e4ndig implementiert.<br>Punkte stehen nur f\u00fcr SF zur Verf\u00fcgung. Nicht f\u00fcr Vorteile.<br>Keine Verg\u00fcnstigung der Sp\u00e4tweihe<br>Keine Verg\u00fcnstigung von Liturgien");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        B b = new B();
        this.o00000(b);
        return b;
    }

    @Override
    public int \u00d200000(R r) {
        return 20;
    }

    public b_0 \u00d400000(R r) {
        return (b_0)r.o00000(0);
    }

    @Override
    public Vector<KostenArt> o00000(floatsuper floatsuper2, Object object) {
        Vector<KostenArt> vector = new Vector<KostenArt>();
        vector.add(new KostenArt("LdG", "Liebling der Gottheit"){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                return KostenEntry.kostenBereich.class.equals((Object)kostenBereich2) || KostenEntry.kostenBereich.\u00f400000.equals((Object)kostenBereich2) && object instanceof public && !((public)object).\u00d500000();
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.class);
                vector.add(KostenEntry.kostenBereich.\u00f400000);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return 650;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return false;
            }
        });
        return vector;
    }
}

