/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.d.oooo_0;
import helden.framework.oooo.objectsuper_0;
import helden.model.myranor.profession.maggrundprof.MagischerKaempferVariante;
import java.util.ArrayList;

public class MagischerKaempferVE
extends MagischerKaempferVariante {
    public MagischerKaempferVE() {
        super("Magischer K\u00e4mpfer (Essenz) (V)", "Magische K\u00e4mpferin (Essenz) (V)", 12, false);
    }

    @Override
    public int getAnzahlSonderfertigkeitAuswahlen() {
        return 1;
    }

    @Override
    public objectsuper_0 getSonderfertigkeitAuswahl(int n) {
        switch (n) {
            case 0: {
                ArrayList<P> arrayList = new ArrayList<P>();
                arrayList.add(oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Element"));
                arrayList.add(oooo_0.o00000("Instruktion", "Kontrolle \u00fcber Gef\u00fchle"));
                return new objectsuper_0(this.getProfession(), arrayList, 1);
            }
        }
        return super.getSonderfertigkeitAuswahl(n);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000("Instruktion", "Beseelung der Quelle"));
        return arrayList;
    }

    @Override
    public ArrayList<helden.framework.oooo.a.oooo_0> getVerallgemeinteListenAuswahlen() {
        ArrayList<helden.framework.oooo.a.oooo_0> arrayList = new ArrayList<helden.framework.oooo.a.oooo_0>();
        helden.framework.oooo.a.oooo_0 oooo_02 = new helden.framework.oooo.a.oooo_0(1, this);
        arrayList.add(oooo_02);
        ArrayList<o00O> arrayList2 = new ArrayList<o00O>();
        arrayList2.addAll(o00O.public());
        this.addZauber(oooo_02, arrayList2, L.o00000, 6);
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Viertelzauberer"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }

    @Override
    protected int getUmfangFormelPool() {
        return 50;
    }
}

