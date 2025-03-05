/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.P;
import helden.framework.D.while;
import helden.framework.d.oooo_0;
import helden.model.myranor.profession.maggrundprof.MagischerDiebMagischerSpionVariante;
import java.util.ArrayList;

public class MagischerDiebMagischerSpionZ
extends MagischerDiebMagischerSpionVariante {
    public MagischerDiebMagischerSpionZ() {
        super("Magischer Dieb/Spion (Z)", "Magische Diebin/Spionin (Z)", 10, false);
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(oooo_0.o00000(while.StringthisString));
        arrayList.add(oooo_0.o00000(while.o\u00f6\u00f6000));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Vollzauberer"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

