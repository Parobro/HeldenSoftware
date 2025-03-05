/*
 * Decompiled with CFR 0.152.
 */
package helden.model.DDZKulturen;

import helden.framework.Geschlecht;
import helden.framework.OoOO.G;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.super;
import helden.framework.oooo.c_1;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.model.DDZprofessionen.BasisDDZProfessionMitGeweihter;
import helden.model.DDZprofessionen.Gaukler;
import helden.model.DDZprofessionen.Goetterdiener;
import helden.model.DDZprofessionen.Hofkuenstler;
import helden.model.DDZprofessionen.Schiffer;
import helden.model.DDZprofessionen.Stammeskrieger;
import helden.model.DDZprofessionen.TochterSatu;
import helden.model.ProfessionenFabrik;
import helden.model.kultur.Aranien;
import helden.model.profession.Schelm;
import java.util.ArrayList;

public class Haranija
extends Aranien {
    public Haranija() {
    }

    public Haranija(Geschlecht geschlecht) {
        super(geschlecht);
    }

    @Override
    public void bestimmeTalentwerte(int n) {
        super.bestimmeTalentwerte(n);
        this.addTalentwert(voidsuper.\u00f8\u00f4\u00d5000, 1);
        this.addTalentwert(G.\u00f8\u00f8\u00f4000, 3);
        if (this.istVariante(\u00d3\u00f8\u00f6000)) {
            this.addTalentwert(G.\u00f8\u00f8\u00f4000, 2);
        }
    }

    @Override
    public String getID() {
        return "K69";
    }

    @Override
    public String getKulturkundeBezeichnung() {
        return "Haranija";
    }

    @Override
    public G getMuttersprache() {
        return G.\u00f5\u00f6\u00f5000;
    }

    @Override
    public o0oo_2 getNextTalentAuswahl() {
        ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
        switch (this.\u00d5\u00f8\u00f6000) {
            case 0: {
                arrayList.add(voidsuper.\u00f5\u00f5\u00d5000);
                arrayList.add(voidsuper.thisintObject);
                int[] nArray = new int[]{1};
                ++this.\u00d5\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 1: {
                arrayList.add(G.\u00d3\u00f8\u00f5000);
                arrayList.add(G.whilenewclass);
                int[] nArray = new int[]{3};
                ++this.\u00d5\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 2: {
                arrayList.add(voidsuper.\u00d8\u00d5\u00d5000);
                arrayList.add(voidsuper.privateObjectObject);
                arrayList.add(voidsuper.newreturnObject);
                int[] nArray = new int[]{1};
                ++this.\u00d5\u00f8\u00f6000;
                if (!this.istMaennlich()) {
                    ++this.\u00d5\u00f8\u00f6000;
                }
                return new o0oo_2(this, arrayList, nArray);
            }
            case 3: {
                arrayList.add(voidsuper.\u00d5\u00d2\u00d6000);
                arrayList.add(voidsuper.\u00f5\u00d5\u00d6000);
                int[] nArray = new int[]{1};
                ++this.\u00d5\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
            case 4: {
                arrayList.add(voidsuper.\u00d5O\u00d6000);
                arrayList.add(voidsuper.\u00d5o\u00d8000);
                int[] nArray = new int[]{1};
                ++this.\u00d5\u00f8\u00f6000;
                return new o0oo_2(this, arrayList, nArray);
            }
        }
        throw new c_1();
    }

    @Override
    public ArrayList<super> getProfessionen(floatsuper floatsuper2) {
        BasisDDZProfessionMitGeweihter basisDDZProfessionMitGeweihter;
        ArrayList<super> arrayList = new ArrayList<super>();
        G g2 = this.getMuttersprache();
        G g3 = this.getSchrift();
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenKampf(this.getGeschlecht(), g2, g3));
        arrayList.remove(new Stammeskrieger(this.getGeschlecht(), g2, g3));
        if (this.getGeschlecht().istMaennlich()) {
            basisDDZProfessionMitGeweihter = new Stammeskrieger(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
            basisDDZProfessionMitGeweihter.clearMoeglicheVarianten();
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Stammeskrieger)basisDDZProfessionMitGeweihter).getTarisharim());
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Stammeskrieger)basisDDZProfessionMitGeweihter).getAlDrakorhim());
            basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Stammeskrieger)basisDDZProfessionMitGeweihter).getBeniUchakani());
            arrayList.add(basisDDZProfessionMitGeweihter);
        }
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenReiseWildnis(this.getGeschlecht(), g2, g3));
        basisDDZProfessionMitGeweihter = new Schiffer(this.getGeschlecht(), g2, g3);
        arrayList.remove(basisDDZProfessionMitGeweihter);
        basisDDZProfessionMitGeweihter.addMoeglicheVariante(((Schiffer)basisDDZProfessionMitGeweihter).getFlusspirat());
        arrayList.add(basisDDZProfessionMitGeweihter);
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenGesellschaft(this.getGeschlecht(), g2, g3));
        Hofkuenstler hofkuenstler = new Hofkuenstler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(hofkuenstler);
        hofkuenstler.addMoeglicheVariante(hofkuenstler.getKalligraph());
        arrayList.add(hofkuenstler);
        Gaukler gaukler = new Gaukler(this.getGeschlecht(), this.getMuttersprache(), this.getSchrift());
        arrayList.remove(gaukler);
        gaukler.addMoeglicheVariante(gaukler.getSchlangenbeschwoerer());
        arrayList.add(gaukler);
        arrayList.addAll(ProfessionenFabrik.getDDZProfessionenHandwerkWissen(this.getGeschlecht(), g2, g3));
        arrayList.add(new Schelm(this.getGeschlecht(), g2, g3));
        arrayList.add(new TochterSatu(this.getGeschlecht(), g2, g3));
        arrayList.add(new Goetterdiener(this.getGeschlecht(), g2, g3));
        return arrayList;
    }

    @Override
    public G getSchrift() {
        return G.\u00f8\u00f8\u00f4000;
    }

    @Override
    public boolean hatMehrSprachenAuswahl() {
        return false;
    }

    @Override
    public boolean hatMehrTalentAuswahl() {
        if (this.istVariante(\u00d3\u00f8\u00f6000)) {
            return this.\u00d5\u00f8\u00f6000 < 5;
        }
        if (this.istMaennlich()) {
            return this.\u00d5\u00f8\u00f6000 < 4;
        }
        return this.\u00d5\u00f8\u00f6000 < 3;
    }

    @Override
    public boolean istMutterschriftGewaehlt() {
        return false;
    }

    @Override
    public boolean istMutterspracheGewaehlt() {
        return false;
    }

    @Override
    public boolean istZweitLehrspracheGewaehlt() {
        return false;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Haranija");
        if (this.istVariante(\u00d4\u00f8\u00f6000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d4\u00f8\u00f6000.toString());
        }
        if (this.istVariante(nulldoclass)) {
            stringBuffer.append("/");
            stringBuffer.append(nulldoclass.toString());
        }
        if (this.istVariante(\u00d3\u00f8\u00f6000)) {
            stringBuffer.append("/");
            stringBuffer.append(\u00d3\u00f8\u00f6000.toString());
        }
        return stringBuffer.toString();
    }
}

