/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.OOoO.o00O;
import helden.framework.OOoO.while;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.Object.private;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.framework.oOoO.W;
import helden.framework.oOoO.returnsuper;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.o00o_0;
import helden.framework.oooo.o0oo_2;
import helden.framework.oooo.oo0o_0;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.model.DDZRassen.Grolm;
import helden.model.DDZprofessionen.Alchemist;
import helden.model.rasse.Zwerg;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class HEW2Auswahlen {
    protected ArrayList<while<String, ArrayList<Integer[]>>> \u00d800000 = new ArrayList();
    private int \u00d300000;
    private int \u00d600000;
    protected K \u00d400000;
    private HEW2 \u00d200000;
    private k_0<oo0o_0> super;
    private boolean class;

    public HEW2Auswahlen(HEW2 hEW2) {
        this.\u00d200000 = hEW2;
    }

    public void addAuswahl(String string, ArrayList<Integer[]> arrayList) {
        this.\u00d800000.add(new while<String, ArrayList<Integer[]>>(string, arrayList));
    }

    public ArrayList<while<String, ArrayList<Integer[]>>> getGemachteAuswahlen() {
        return this.\u00d800000;
    }

    public ArrayList<oooo_0> getGenerischeListenAuswahlen() {
        super super_;
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        if (this.getHeld().o\u00d20000() instanceof helden.framework.oOoO.A.Object) {
            arrayList.addAll(((helden.framework.oOoO.A.Object)((Object)this.getHeld().o\u00d20000())).getVerallgemeinteListenAuswahlen());
        }
        if (this.getHeld().\u00f800000() instanceof helden.framework.oOoO.A.Object) {
            arrayList.addAll(((helden.framework.oOoO.A.Object)((Object)this.getHeld().\u00f800000())).getVerallgemeinteListenAuswahlen());
        }
        if ((super_ = this.getHeld().\u00d4O0000()) instanceof helden.framework.oOoO.A.Object) {
            arrayList.addAll(((helden.framework.oOoO.A.Object)((Object)super_)).getVerallgemeinteListenAuswahlen());
        }
        if (this.getHeld().o\u00d20000() instanceof Grolm) {
            boolean bl;
            boolean bl2 = bl = super_.getVorteile().\u00d400000(I.forsupersuper) || super_.getVorteile().\u00d400000(I.\u00f5\u00d8o000) || this.o00000(super_);
            if (!bl) {
                arrayList.addAll(((Grolm)this.getHeld().o\u00d20000()).getSpezielleAuswahlen());
            }
        }
        return arrayList;
    }

    public K getHeld() {
        return this.\u00d400000;
    }

    public W<?> getNextListenAuswahl() {
        if (this.\u00d4O0000()) {
            return this.\u00d500000();
        }
        if (this.return()) {
            return this.\u00d400000();
        }
        if (this.\u00f500000()) {
            return this.\u00d300000();
        }
        if (this.\u00f400000()) {
            return this.\u00d800000();
        }
        if (this.if()) {
            return this.getHeld().privatesuper().O\u00d4O000();
        }
        if (this.o00000()) {
            return this.new();
        }
        if (this.oO0000()) {
            return this.\u00d3O0000();
        }
        if (this.\u00f800000()) {
            return this.\u00d5O0000();
        }
        if (this.OO0000()) {
            return this.while();
        }
        if (this.\u00d200000.isZwergMitVollzaubererDerKeinGeodeWerdenWill() && !this.class) {
            this.class = true;
            ArrayList<public> arrayList = new ArrayList<public>();
            M m = (M)helden.framework.C.K.o00000(I.O\u00d4O000);
            ArrayList<public> arrayList2 = m.\u00f4\u00d20000();
            helden.framework.C.D d2 = (helden.framework.C.D)arrayList2.get(0);
            d2.o00000(o00O.\u00d6o0000);
            arrayList.add(d2);
            d2 = (helden.framework.C.D)arrayList2.get(1);
            d2.o00000(o00O.classnew);
            arrayList.add(d2);
            d2 = (helden.framework.C.D)arrayList2.get(2);
            d2.o00000(o00O.O\u00d30000);
            arrayList.add(d2);
            d2 = (helden.framework.C.D)arrayList2.get(3);
            d2.o00000(o00O.publicsuper);
            arrayList.add(d2);
            d2 = (helden.framework.C.D)arrayList2.get(4);
            d2.o00000(o00O.Oo0000);
            arrayList.add(d2);
            d2 = (helden.framework.C.D)arrayList2.get(5);
            d2.o00000(o00O.\u00d8o0000);
            arrayList.add(d2);
            return new o00o_0((Zwerg)this.getHeld().o\u00d20000(), arrayList, 2);
        }
        return null;
    }

    public o0oo_2 getNextTalentAuswahl() {
        if (this.getHeld().o\u00d20000().hatMehrTalentAuswahl()) {
            return this.getHeld().o\u00d20000().getNextTalentAuswahl();
        }
        if (this.getHeld().\u00f800000().hatMehrTalentAuswahl()) {
            return this.getHeld().\u00f800000().getNextTalentAuswahl();
        }
        if (this.getHeld().\u00d800000().hatMehrTalentAuswahl()) {
            return this.getHeld().\u00d800000().getNextTalentAuswahl();
        }
        return null;
    }

    public returnsuper getNextTaPVerteilAuswahl() {
        if (this.getHeld().o\u00d20000().hatMehrTaPVerteilAuswahl()) {
            return this.getHeld().o\u00d20000().getNextTaPVerteilAuswahl();
        }
        if (this.getHeld().\u00f800000().hatMehrTaPVerteilAuswahl()) {
            return this.getHeld().\u00f800000().getNextTaPVerteilAuswahl();
        }
        if (this.getHeld().\u00d800000().hatMehrTaPVerteilAuswahl()) {
            return this.getHeld().\u00d800000().getNextTaPVerteilAuswahl();
        }
        return null;
    }

    public returnsuper getNextVerteilTalentAuswahl() {
        if (this.getHeld().o\u00d20000().hatMehrTaPVerteilAuswahl()) {
            return this.getHeld().o\u00d20000().getNextTaPVerteilAuswahl();
        }
        if (this.getHeld().\u00f800000().hatMehrTaPVerteilAuswahl()) {
            return this.getHeld().\u00f800000().getNextTaPVerteilAuswahl();
        }
        if (this.getHeld().\u00d800000().hatMehrTaPVerteilAuswahl()) {
            return this.getHeld().\u00d800000().getNextTaPVerteilAuswahl();
        }
        if (this.getHeld().\u00f8O0000().\u00d300000(G.\u00d3\u00d2\u00f5000)) {
            int n = 0;
            try {
                n = this.getHeld().\u00d300000((oo0o_0)G.\u00d3\u00d2\u00f5000);
                this.getHeld().\u00f8O0000().super(G.\u00d3\u00d2\u00f5000);
            }
            catch (D d2) {
                // empty catch block
            }
            ArrayList<oo0o_0> arrayList = new ArrayList<oo0o_0>();
            arrayList.addAll(N.floatsuper().\u00d4o0000());
            return new returnsuper(this.getHeld().\u00d800000(), arrayList, n, n);
        }
        return null;
    }

    public int getWahlWert(oo0o_0 oo0o_02) {
        return this.super.Object(oo0o_02);
    }

    public boolean hatMehrListenAuswahl() {
        return this.\u00d4O0000() || this.return() || this.\u00f500000() || this.\u00f400000() || this.if() || this.o00000() || this.oO0000() || this.\u00f800000() || this.OO0000() || this.\u00d200000.isZwergMitVollzaubererDerKeinGeodeWerdenWill() && !this.class;
    }

    public boolean hatMehrTalentAuswahl() {
        return this.getHeld().o\u00d20000().hatMehrTalentAuswahl() || this.getHeld().\u00f800000().hatMehrTalentAuswahl() || this.getHeld().\u00d800000().hatMehrTalentAuswahl();
    }

    public boolean hatMehrVerteilTalentAuswahl() {
        return this.getHeld().o\u00d20000().hatMehrTaPVerteilAuswahl() || this.getHeld().\u00f800000().hatMehrTaPVerteilAuswahl() || this.getHeld().\u00d800000().hatMehrTaPVerteilAuswahl() || this.getHeld().\u00f8O0000().\u00d300000(G.\u00d3\u00d2\u00f5000);
    }

    public boolean hatTaPVerteilAuswahl() {
        if (this.getHeld().o\u00d20000() != null && this.getHeld().o\u00d20000().hatMehrTaPVerteilAuswahl()) {
            return true;
        }
        if (this.getHeld().\u00f800000() != null && this.getHeld().\u00f800000().hatMehrTaPVerteilAuswahl()) {
            return true;
        }
        if (this.getHeld().\u00d4O0000() != null) {
            if (this.getHeld().\u00d800000().hatMehrTaPVerteilAuswahl()) {
                return true;
            }
            if (this.getHeld().\u00f8O0000().\u00d300000(G.\u00d3\u00d2\u00f5000)) {
                return true;
            }
        }
        return false;
    }

    public boolean hatWeitereAuswahlen() {
        return this.hatMehrListenAuswahl() || this.hatMehrTalentAuswahl();
    }

    public void init(K k2) {
        this.setHeld(k2);
    }

    public void setGemachteAuswahlen(ArrayList<while<String, ArrayList<Integer[]>>> arrayList) {
        this.\u00d800000 = arrayList;
    }

    public void setHeld(K k2) {
        this.\u00d400000 = k2;
        this.class = false;
        this.super = new k_0();
    }

    public void setzteGespeicherteAuswahlenListenAuswahl() {
        helden.framework.held.object.oooo_0.\u00d300000("setzteGespeicherteAuswahlenListenAuswahl()");
        this.\u00d300000 = 0;
        this.\u00d600000 = 0;
        while (this.hatMehrListenAuswahl()) {
            ++this.\u00d600000;
            W<?> w = this.getNextListenAuswahl();
            helden.framework.held.object.oooo_0.new("Listenauswahl " + this.\u00d600000 + " " + w.return());
            for (Integer[] integerArray : this.\u00d800000.get(this.\u00d300000).getWert2()) {
                w.o00000(integerArray[0], this.getHeld());
                helden.framework.held.object.oooo_0.new("Listenauswahl " + this.\u00d600000 + " Getroffene Auswahl " + integerArray[0]);
            }
            this.\u00d200000.updateMutterspracheInProfession(this.getHeld());
            ++this.\u00d300000;
        }
        for (oooo_0 oooo_02 : this.getGenerischeListenAuswahlen()) {
            oooo_02.o00000(this.\u00d200000.getBt());
            ++this.\u00d600000;
            helden.framework.held.object.oooo_0.new("GenerischeListenauswahl " + this.\u00d600000 + " " + oooo_02.\u00d500000());
            for (Integer[] integerArray : this.\u00d800000.get(this.\u00d300000).getWert2()) {
                helden.framework.held.object.oooo_0.new("GenerischeListenauswahl " + this.\u00d600000 + " Auswahl: " + integerArray[0]);
                oooo_02.o00000(integerArray[0], this.getHeld(), this.\u00d200000.isBGBProfession(oooo_02.String()));
            }
            ++this.\u00d300000;
        }
    }

    public void setzteGespeicherteAuswahlenTalente() {
        Iterator<Integer[]> iterator;
        Object object;
        this.\u00d200000.updateMutterspracheInProfession(this.\u00d400000);
        while (this.hatMehrTalentAuswahl()) {
            ++this.\u00d600000;
            object = this.getNextTalentAuswahl();
            if (this.\u00d300000 == this.\u00d800000.size()) {
                private.o00000("Keine Werte f\u00fcr die folgende Auswahl gespeichert: " + ((o0oo_2)object).toString() + " " + ((o0oo_2)object).new());
            }
            for (Integer[] integerArray : this.\u00d800000.get(this.\u00d300000).getWert2()) {
                ((o0oo_2)object).o00000(integerArray[0], integerArray[1], this.\u00d400000, this.\u00d400000.\u00d5o0000(), this.\u00d200000.isBGBProfession(((o0oo_2)object).\u00d400000()));
                helden.framework.held.object.oooo_0.new("TalentAuswahl " + this.\u00d600000 + " Auswahl: " + ((o0oo_2)object).o00000().get(integerArray[0]).toString() + ": " + ((o0oo_2)object).\u00d500000()[integerArray[1]]);
            }
            ++this.\u00d300000;
        }
        while (this.hatMehrVerteilTalentAuswahl()) {
            ++this.\u00d600000;
            object = this.getNextVerteilTalentAuswahl();
            if (this.\u00d800000.size() <= this.\u00d300000) {
                helden.framework.held.object.oooo_0.\u00f500000("Fehler bei VerteilTalentAuswahlen " + object.toString() + " aus " + ((returnsuper)object).\u00f400000());
            }
            for (Integer[] integerArray : this.\u00d800000.get(this.\u00d300000).getWert2()) {
                ((returnsuper)object).o00000(integerArray[0], integerArray[1], this.getHeld());
            }
            ++this.\u00d300000;
        }
        object = this.getHeld().newnew();
        while (object.hasNext()) {
            iterator = (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object.next();
            for (oo0o_0 oo0o_02 : ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)((Object)iterator)).getGewaehlteTalente()) {
                this.super.\u00d200000(oo0o_02, ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)((Object)iterator)).getWahlWert(oo0o_02));
            }
        }
        if (this.\u00d200000.isVeteran()) {
            iterator = this.getHeld().\u00d800000().\u00d500000(String._o.String);
            for (oo0o_0 oo0o_02 : ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)((Object)iterator)).getGewaehlteTalente()) {
                ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)((Object)iterator)).getTalente().\u00d200000(oo0o_02, ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)((Object)iterator)).getWahlWert(oo0o_02));
            }
        }
        if (this.\u00d200000.isBGB()) {
            iterator = this.getHeld().\u00d800000().\u00d500000(String._o.\u00d500000);
            for (oo0o_0 oo0o_02 : ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)((Object)iterator)).getGewaehlteTalente()) {
                ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)((Object)iterator)).getTalente().\u00d200000(oo0o_02, ((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)((Object)iterator)).getWahlWert(oo0o_02));
            }
        }
    }

    private W<?> \u00d3O0000() {
        if (this.getHeld().o\u00d20000().hatMehrLeittalentAuswahl()) {
            return this.getHeld().o\u00d20000().getNextLeittalentAuswahl();
        }
        if (this.getHeld().\u00f800000().hatMehrLeittalentAuswahl()) {
            return this.getHeld().\u00f800000().getNextLeittalentAuswahl();
        }
        if (this.getHeld().\u00d800000().hatMehrLeittalentAuswahl()) {
            return this.getHeld().\u00d800000().getNextLeittalentAuswahl();
        }
        return null;
    }

    private W<?> \u00d5O0000() {
        if (this.getHeld().\u00d800000().hatMehrMirakeltalentAuswahl()) {
            return this.getHeld().\u00d800000().getNextMirakeltalentAuswahl();
        }
        return null;
    }

    private W<?> \u00d500000() {
        if (this.getHeld().o\u00d20000().hatMehrModifikationAuswahl()) {
            return this.getHeld().o\u00d20000().getNextModifikationAuswahl();
        }
        if (this.getHeld().\u00f800000().hatMehrModifikationAuswahl()) {
            return this.getHeld().\u00f800000().getNextModifikationAuswahl();
        }
        if (this.getHeld().\u00d800000().hatMehrModifikationAuswahl()) {
            return this.getHeld().\u00d800000().getNextModifikationAuswahl();
        }
        return null;
    }

    private W<?> \u00d300000() {
        if (this.getHeld().o\u00d20000().hatMehrSonderfertigkeitAuswahl()) {
            return this.getHeld().o\u00d20000().getNextSonderfertigkeitAuswahl();
        }
        if (this.getHeld().\u00f800000().hatMehrSonderfertigkeitAuswahl()) {
            return this.getHeld().\u00f800000().getNextSonderfertigkeitAuswahl();
        }
        if (this.getHeld().\u00d800000().hatMehrSonderfertigkeitAuswahl()) {
            return this.getHeld().\u00d800000().getNextSonderfertigkeitAuswahl();
        }
        return null;
    }

    private W<?> new() {
        if (this.getHeld().o\u00d20000().hatMehrSprachenAuswahl()) {
            return this.getHeld().o\u00d20000().getNextSprachAuswahl();
        }
        if (this.getHeld().\u00f800000().hatMehrSprachenAuswahl()) {
            return this.getHeld().\u00f800000().getNextSprachAuswahl();
        }
        if (this.getHeld().\u00d800000().hatMehrSprachenAuswahl()) {
            return this.getHeld().\u00d800000().getNextSprachAuswahl();
        }
        return null;
    }

    private W<?> while() {
        if (this.getHeld().o\u00d20000().hatMehrTalentTyp2Auswahl()) {
            return this.getHeld().o\u00d20000().getNextTalentTyp2Auswahl();
        }
        if (this.getHeld().\u00f800000().hatMehrTalentTyp2Auswahl()) {
            return this.getHeld().\u00f800000().getNextTalentTyp2Auswahl();
        }
        if (this.getHeld().\u00d800000().hatMehrTalentTyp2Auswahl()) {
            return this.getHeld().\u00d800000().getNextTalentTyp2Auswahl();
        }
        return null;
    }

    private W<?> \u00d800000() {
        if (this.getHeld().o\u00d20000().hatMehrVerbilligteSonderfertigkeitAuswahl()) {
            return this.getHeld().o\u00d20000().getNextVerbilligteSonderfertigkeitAuswahl();
        }
        if (this.getHeld().\u00f800000().hatMehrVerbilligteSonderfertigkeitAuswahl()) {
            return this.getHeld().\u00f800000().getNextVerbilligteSonderfertigkeitAuswahl();
        }
        if (this.getHeld().\u00d800000().hatMehrVerbilligteSonderfertigkeitAuswahl()) {
            return this.getHeld().\u00d800000().getNextVerbilligteSonderfertigkeitAuswahl();
        }
        return null;
    }

    private o00o_0 \u00d400000() {
        if (this.getHeld().o\u00d20000().hatMehrVorteilAuswahl()) {
            return this.getHeld().o\u00d20000().getNextVorteilAuswahl();
        }
        if (this.getHeld().\u00f800000().hatMehrVorteilAuswahl()) {
            return this.getHeld().\u00f800000().getNextVorteilAuswahl();
        }
        if (this.getHeld().\u00d800000().hatMehrVorteilAuswahl()) {
            return this.getHeld().\u00d800000().getNextVorteilAuswahl();
        }
        return null;
    }

    private boolean if() {
        return this.getHeld().privatesuper().\u00d4\u00d3O000();
    }

    private boolean oO0000() {
        return this.getHeld().o\u00d20000().hatMehrLeittalentAuswahl() || this.getHeld().\u00f800000().hatMehrLeittalentAuswahl() || this.getHeld().\u00d800000().hatMehrLeittalentAuswahl();
    }

    private boolean \u00f800000() {
        return this.getHeld().o\u00d20000().hatMehrMirakeltalentAuswahl() || this.getHeld().\u00f800000().hatMehrMirakeltalentAuswahl() || this.getHeld().\u00d800000().hatMehrMirakeltalentAuswahl();
    }

    private boolean \u00d4O0000() {
        return this.getHeld().o\u00d20000().hatMehrModifikationAuswahl() || this.getHeld().\u00f800000().hatMehrModifikationAuswahl() || this.getHeld().\u00d800000().hatMehrModifikationAuswahl();
    }

    private boolean \u00f500000() {
        return this.getHeld().o\u00d20000().hatMehrSonderfertigkeitAuswahl() || this.getHeld().\u00f800000().hatMehrSonderfertigkeitAuswahl() || this.getHeld().\u00d800000().hatMehrSonderfertigkeitAuswahl();
    }

    private boolean o00000() {
        return this.getHeld().o\u00d20000().hatMehrSprachenAuswahl() || this.getHeld().\u00f800000().hatMehrSprachenAuswahl() || this.getHeld().\u00d800000().hatMehrSprachenAuswahl();
    }

    private boolean OO0000() {
        return this.getHeld().o\u00d20000().hatMehrTalentTyp2Auswahl() || this.getHeld().\u00f800000().hatMehrTalentTyp2Auswahl() || this.getHeld().\u00d800000().hatMehrTalentTyp2Auswahl();
    }

    private boolean \u00f400000() {
        return this.getHeld().o\u00d20000().hatMehrVerbilligteSonderfertigkeitAuswahl() || this.getHeld().\u00f800000().hatMehrVerbilligteSonderfertigkeitAuswahl() || this.getHeld().\u00d800000().hatMehrVerbilligteSonderfertigkeitAuswahl();
    }

    private boolean return() {
        return this.getHeld().o\u00d20000().hatMehrVorteilAuswahl() || this.getHeld().\u00f800000().hatMehrVorteilAuswahl() || this.getHeld().\u00d800000().hatMehrVorteilAuswahl();
    }

    private boolean o00000(super super_) {
        Alchemist alchemist;
        return super_ instanceof Alchemist && (alchemist = (Alchemist)super_).istVariante(alchemist.getGrolmischerGoldmacher());
    }
}

