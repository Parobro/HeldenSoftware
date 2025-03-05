/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.d.oooo_0;
import helden.framework.held.K;
import helden.framework.oooo.b_0;
import helden.gui.erschaffung.werkzeug.APPoolAutoVerbilligteSF;
import helden.gui.erschaffung.werkzeug.APPoolKarmatiker;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import helden.gui.erschaffung.werkzeug.MyHashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class HEW2Kosten {
    private MyHashMap<String, KostenEntry> \u00d200000;
    private HEW2 super;

    public HEW2Kosten(HEW2 hEW2) {
        this.super = hEW2;
        this.\u00d200000 = new MyHashMap();
    }

    public void addKosten(String string, KostenEntry kostenEntry) {
        if (this.getList().get(string) != null) {
            this.addKosten(string + "*", kostenEntry);
            return;
        }
        this.super.getKosten().put(string, kostenEntry);
        this.super.fireUpdate();
    }

    public void berechneSonderkostenUndGutschriften(K k2) {
    }

    public Vector<KostenArt> getAlleKostenArten() {
        Vector<KostenArt> vector = new Vector<KostenArt>();
        vector.addAll(KostenArt.values());
        vector.addAll(this.getRKPKostenArten());
        return vector;
    }

    public int getGesamtKosten(KostenArt kostenArt, KostenEntry.kostenBereich kostenBereich2) {
        int n = 0;
        for (Map.Entry entry : this.getList().entrySet()) {
            KostenEntry kostenEntry = (KostenEntry)entry.getValue();
            if (!kostenEntry.\u00d500000.equals(kostenArt) || !kostenEntry.o00000.equals((Object)kostenBereich2)) continue;
            n += kostenEntry.\u00d400000;
        }
        return n;
    }

    public int getKosten(KostenArt kostenArt) {
        int n = 0;
        for (Map.Entry entry : this.getList().entrySet()) {
            KostenEntry kostenEntry = (KostenEntry)entry.getValue();
            if (!kostenEntry.\u00d500000.equals(kostenArt)) continue;
            n += kostenEntry.\u00d400000;
        }
        return n;
    }

    public MyHashMap<String, KostenEntry> getList() {
        return this.\u00d200000;
    }

    public Vector<KostenArt> getRKPKostenArten() {
        Vector<KostenArt> vector = new Vector<KostenArt>();
        vector.addAll(this.super.getRasse().getPunktePools(this.super.getBt()));
        vector.addAll(this.super.getKultur().getPunktePools(this.super.getBt()));
        vector.addAll(this.super.getHauptProfession().getPunktePools(this.super.getBt()));
        if (this.super.getSf().getVerbilligtUndAutomatischeSonderfertigkeiten().size() > 0) {
            for (for object : this.super.getSf().getVerbilligtUndAutomatischeSonderfertigkeiten()) {
                P p2 = oooo_0.o00000(object.getBezeichner().toString());
                vector.add(new APPoolAutoVerbilligteSF("vSF (" + object + ")", "verbilligte SF: " + object, p2.newnew(), this.super.getBt()));
            }
        }
        if (this.super.\u00d6o0000.o00000(I.\u00f5\u00d60000)) {
            vector.add(new APPoolKarmatiker(this.super));
        }
        for (public public_ : this.super.\u00d6o0000.\u00d500000().o00000().getListe()) {
            vector.addAll(public_.\u00d200000(this.super.getBt()));
        }
        return vector;
    }

    public int getVerfuegbarePunkte(KostenArt kostenArt) {
        if (kostenArt.equals(KostenArt.\u00f600000)) {
            int n = (this.super.getHeld().o00000(b_0.newwhilesuper) + this.super.getHeld().o00000(b_0.\u00f8\u00f4\u00d2000)) * 20;
            if (this.super.getHeld().o00000(I.whilefor)) {
                J j2 = (J)this.super.getHeld().\u00d500000().\u00d300000(I.whilefor);
                n -= j2.ObjectString() * 40;
            }
            return n;
        }
        if (kostenArt.equals(KostenArt.int)) {
            return this.super.getGpmax();
        }
        if (kostenArt.equals(KostenArt.\u00f800000)) {
            if (this.super.getHeld().o00000(I.O\u00d80000)) {
                J j3 = (J)this.super.getHeld().\u00d500000().\u00d300000(I.O\u00d80000);
                return j3.ObjectString() * 40;
            }
            return 0;
        }
        if (kostenArt.equals(KostenArt.\u00f400000)) {
            if (this.super.isBGB() && this.super.getBGBProfession() != null) {
                return (7 + this.super.getBGBProfession().getGPKosten()) * 50;
            }
            return 0;
        }
        if (kostenArt.equals(KostenArt.\u00d300000)) {
            if (this.super.isVeteran() && this.super.getVeteranProfession() != null) {
                return (3 + this.super.getVeteranProfession().getGPKosten()) * 50;
            }
            return 0;
        }
        if (kostenArt.equals(KostenArt.class)) {
            return this.super.getHswZauber().getVerrechnungspunkte();
        }
        return kostenArt.getVerfuegbarePunkte();
    }

    public boolean moeglicherweiseNutzbar(Object object, KostenEntry.kostenBereich kostenBereich2) {
        for (KostenArt kostenArt : this.getRKPKostenArten()) {
            if (!kostenArt.darfGenutztWerden(object, kostenBereich2)) continue;
            return true;
        }
        return false;
    }

    public void put(String string, KostenEntry kostenEntry) {
        this.\u00d200000.put(string, kostenEntry);
    }

    public void removeAllKostenEntries(KostenEntry.kostenBereich kostenBereich2) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry object : this.getList().entrySet()) {
            KostenEntry kostenEntry = (KostenEntry)object.getValue();
            if (!kostenEntry.o00000.equals((Object)kostenBereich2)) continue;
            arrayList.add(object.getKey());
        }
        for (String string : arrayList) {
            this.getList().remove(string);
        }
        this.super.fireUpdate();
    }

    public void removeKosten(String string) {
        this.getList().remove(string);
        this.super.fireUpdate();
    }
}

