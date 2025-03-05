/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.maggrundprof;

import helden.framework.C.K;
import helden.framework.C.Oo0O;
import helden.framework.D.for;
import helden.model.myranor.profession.maggrundprof.MagischerDiebMagischerSpionVariante;
import java.util.ArrayList;

public class MagischerDiebMagischerSpionH
extends MagischerDiebMagischerSpionVariante {
    public MagischerDiebMagischerSpionH() {
        super("Magischer Dieb/Spion (H)", "Magische Diebin/Spionin (H)", 8, false);
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.\u00d200000("Aura verh\u00fcllen"));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(K.o00000("Halbzauberer"));
        return oo0O;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

