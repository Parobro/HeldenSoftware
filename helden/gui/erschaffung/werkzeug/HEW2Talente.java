/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.C.I;
import helden.framework.C.M;
import helden.framework.C.ooOO;
import helden.framework.C.public;
import helden.framework.Einstellungen;
import helden.framework.HeldenMath;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.X;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.D;
import helden.framework.held.K;
import helden.framework.held.Stringsuper;
import helden.framework.held.T;
import helden.framework.held.U;
import helden.framework.held.o00O;
import helden.framework.held.object.oooo_0;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.int.String;
import helden.framework.int.super;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import helden.model.profession.Schelm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class HEW2Talente {
    private k_0<helden.framework.OoOO.M> o00000;
    private HEW2 \u00d200000;
    private ArrayList<oo0o_0> \u00d500000;
    private ArrayList<oo0o_0> \u00d800000;
    protected K \u00d300000;
    private K \u00d600000;
    private ArrayList<voidsuper> String;

    public HEW2Talente(HEW2 hEW2) {
        this.\u00d200000 = hEW2;
    }

    public void aktivierte(oo0o_0 oo0o_02) {
        this.String.remove(oo0o_02);
        this.\u00d500000.add(oo0o_02);
        this.\u00d800000.add(oo0o_02);
        this.\u00d200000.getKosten().addKosten(this.getKostenString(oo0o_02, 0), new KostenEntry(KostenEntry.kostenBereich.\u00d600000, KostenArt.\u00f600000, this.getAktivierungskosten(oo0o_02), oo0o_02, 0));
        this.\u00d200000().\u00f8O0000().super((voidsuper)oo0o_02, 0);
        Collections.sort(this.String);
        Collections.sort(this.\u00d800000);
    }

    public boolean darfGesteigertWerden(oo0o_0 oo0o_02) {
        if (this.getMaximaleBGBTalentPunkte(oo0o_02) > 0) {
            return true;
        }
        return !this.hatUnFaehigkeitFuer(oo0o_02);
    }

    public void deAktivierte(oo0o_0 oo0o_02) {
        this.veraendereTalentwert(oo0o_02, 0);
        this.\u00d800000.remove(oo0o_02);
        this.String.add((voidsuper)oo0o_02);
        this.\u00d500000.remove(oo0o_02);
        this.\u00d200000().\u00f8O0000().super((voidsuper)oo0o_02);
        this.\u00d200000.getKosten().removeKosten(this.getKostenString(oo0o_02, 0));
        Collections.sort(this.String);
        Collections.sort(this.\u00d800000);
    }

    public ArrayList<oo0o_0> getAktivierteTalente() {
        return this.\u00d800000;
    }

    public int getAktivierungskosten(oo0o_0 oo0o_02) {
        try {
            return this.\u00d200000().\u00f8O0000().super(oo0o_02, this.\u00d200000(), false, true);
        }
        catch (Stringsuper stringsuper) {
            throw new RuntimeException(stringsuper);
        }
    }

    public int getAnzahlAktivierterTalente() {
        return this.\u00d500000.size();
    }

    public int getAnzahlAktivierterTalenteOhneBGBundVR() {
        int n = 0;
        for (oo0o_0 object : this.\u00d500000) {
            if (this.getMaximaleBGBTalentPunkte(object) != 0) continue;
            ++n;
        }
        for (KostenEntry kostenEntry : this.\u00d200000.getKosten().getList().values()) {
            if (!kostenEntry.o00000.equals((Object)KostenEntry.kostenBereich.\u00d600000) || kostenEntry.\u00d500000.equals(KostenArt.\u00f600000) || kostenEntry.\u00d600000 != 0) continue;
            --n;
        }
        return n;
    }

    public int getErlaubteAnzahlAktivierterTalente() {
        int n = Einstellungen.getInstance().getAnzahlAktivierbar();
        if (this.\u00d200000.isBGB() || this.\u00d200000.isVeteran()) {
            n += 3;
        }
        return n;
    }

    public String getKostenString(oo0o_0 oo0o_02, int n) {
        return oo0o_02.toString() + ": " + n;
    }

    public int getMaximaleBGBTalentPunkte(oo0o_0 oo0o_02) {
        int n = 0;
        if (this.\u00d200000.\u00d600000) {
            try {
                n = oo0o_02.istZauber() ? this.\u00d200000.getBGBProfession().getZauberfertigkeiten().\u00d400000(oo0o_02) : this.\u00d200000.getBGBProfession().getTalente().\u00d400000(oo0o_02);
            }
            catch (X x) {
                // empty catch block
            }
        }
        return n;
    }

    public int getMaximalWert(oo0o_0 oo0o_02) {
        if (this.hatUnFaehigkeitFuer(oo0o_02) && this.getMaximaleBGBTalentPunkte(oo0o_02) > 0) {
            return Math.min(this.\u00d200000().\u00d800000(oo0o_02), this.getMinimalwert(oo0o_02) + this.getMaximaleBGBTalentPunkte(oo0o_02));
        }
        return this.\u00d200000().\u00d800000(oo0o_02);
    }

    public int getMinimalwert(helden.framework.OoOO.M m) {
        return this.o00000.Object(m);
    }

    public int getMinimalwertOhneProf(voidsuper voidsuper2) {
        return this.getMinimalwert(voidsuper2) - this.\u00d200000().\u00d4O0000().getTalente().Object(voidsuper2) - this.\u00d200000().\u00d4O0000().getWahlWert0(voidsuper2);
    }

    public ArrayList<voidsuper> getNichtAktivierteTalente() {
        return this.String;
    }

    public int getTalentWert(oo0o_0 oo0o_02) {
        try {
            return this.\u00d200000().\u00d300000(oo0o_02);
        }
        catch (D d2) {
            return -99;
        }
    }

    public ArrayList<oo0o_0> getUserAktivierteTalente() {
        return this.\u00d500000;
    }

    public int getVRkosten(voidsuper voidsuper2) {
        int n = voidsuper2.getKategorie(true).\u00d400000();
        return n;
    }

    public boolean hatUnFaehigkeitFuer(oo0o_0 oo0o_02) {
        if (!this.\u00d200000().\u00d500000().\u00d400000(I.\u00d8\u00f8O000) && !this.\u00d200000().\u00d500000().\u00d400000(I.fordo)) {
            return false;
        }
        Iterator<public> iterator = this.\u00d200000().\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (public_.equals(I.fordo) && ((M)public_).\u00f400000(oo0o_02)) {
                return true;
            }
            if (!public_.equals(I.\u00d8\u00f8O000)) continue;
            M m = (M)public_;
            Iterator iterator2 = m.intsuper().iterator();
            while (iterator2.hasNext()) {
                if (!oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000((String)iterator2.next()), oo0o_02)) continue;
                return true;
            }
        }
        return false;
    }

    public void init() {
        Object object;
        this.\u00d200000.updateMutterspracheInProfession(this.\u00d300000);
        int n = this.\u00d300000.o00000(b_0.newwhilesuper);
        if (n == 0) {
            n = 8;
        }
        this.\u00d200000().o\u00d20000().bestimmeTalentwerte(n);
        this.\u00d200000().\u00f800000().bestimmeTalentwerte(n);
        this.\u00d200000().\u00d800000().bestimmeTalentwerte(n);
        if (this.\u00d200000.isVeteran()) {
            object = this.\u00d200000().\u00d800000().\u00d500000(String._o.String);
            ((super)object).bestimmeTalentwerte(n);
        }
        if (this.\u00d200000.isBGB()) {
            object = this.\u00d200000().\u00d800000().\u00d500000(String._o.\u00d500000);
            ((super)object).bestimmeTalentwerte(n);
        }
        this.\u00d200000().\u00f800000().setSprachen(n, !(this.\u00d200000.getHauptProfession() instanceof Schelm));
        object = this.\u00d200000().newnew();
        while (object.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = (OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object.next();
            this.uebernehmeTalentwerte(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getTalente());
        }
        this.\u00d500000 = new ArrayList();
    }

    public void initialisiereKampfwerte() {
        Iterator<voidsuper> iterator = this.\u00d200000().\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            if (!voidsuper2.isKampftalent()) continue;
            E e = (E)voidsuper2;
            this.\u00d200000().o00000(voidsuper2, new U(e, this.\u00d200000().\u00f8O0000()));
        }
    }

    public void initializeBasisTalente() {
        T t = this.\u00d200000().\u00f8O0000();
        Iterator<voidsuper> iterator = N.floatsuper().voidsuper().iterator();
        while (iterator.hasNext()) {
            t.super(iterator.next(), 0);
        }
        if (this.\u00d200000.getKultur() != null && this.\u00d200000.getKultur().getSchrift() != null && this.\u00d300000.\u00d800000().hatProfession(Schelm.class) == null) {
            t.super(this.\u00d200000.getKultur().getSchrift(), 0);
        }
    }

    public boolean isAutoTalent(oo0o_0 oo0o_02) {
        return this.o00000.\u00d200000(oo0o_02);
    }

    public boolean isVeteranTalent(oo0o_0 oo0o_02) {
        if (oo0o_02.istGabe()) {
            for (public public_ : this.\u00d200000.getHswVorteile().getVorteile()) {
                ooOO ooOO2;
                if (!(public_ instanceof ooOO) || !this.\u00d200000.getHswVorteile().isAuto(public_) || !oo0o_02.equals((ooOO2 = (ooOO)public_).oo0000())) continue;
                return true;
            }
        }
        return this.\u00d200000.getHauptProfession().getTalente().\u00d200000(oo0o_02) || this.\u00d200000.getHauptProfession().getGewaehlteTalente().contains(oo0o_02) || this.\u00d500000.contains(oo0o_02) || ((voidsuper)oo0o_02).\u00f5\u00d60000();
    }

    /*
     * WARNING - void declaration
     */
    public ArrayList<Hinweis> pruefe() {
        Object object;
        Object object2;
        ArrayList<Hinweis> arrayList = new ArrayList<Hinweis>();
        if (this.getAnzahlAktivierterTalenteOhneBGBundVR() > this.getErlaubteAnzahlAktivierterTalente()) {
            int n = this.getAnzahlAktivierterTalenteOhneBGBundVR() - this.getErlaubteAnzahlAktivierterTalente();
            if (n == 1) {
                arrayList.add(new Hinweis("Es wurde ein Talent zuviel aktiviert."));
            } else {
                arrayList.add(new Hinweis("Es wurden " + n + " Talente zuviel aktiviert."));
            }
        }
        for (voidsuper voidsuper2 : this.\u00d500000) {
            if (!this.\u00d200000().\u00d300000(voidsuper2)) continue;
            arrayList.add(new Hinweis("Voraussetzungen f\u00fcr das Talent " + voidsuper2.toString() + " sind nicht erf\u00fcllt!"));
        }
        this.\u00d200000.getPruefer().addPruefStringFuerKosten(arrayList, KostenArt.\u00f600000);
        boolean n = false;
        if (this.\u00d300000.\u00d500000().\u00d400000(I.\u00d3\u00d3O000)) {
            void var3_6;
            object2 = "";
            Iterator<voidsuper> n3 = this.\u00d300000.\u00f8O0000().super();
            while (n3.hasNext()) {
                object = n3.next();
                if (!((helden.framework.OoOO.U)object).getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000) && !((helden.framework.OoOO.U)object).getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Oo0000)) continue;
                int n2 = this.\u00d200000.getTalente().getTalentWert((oo0o_0)object) - this.o00000.Object((helden.framework.OoOO.M)object);
                if (this.\u00d200000.\u00d600000) {
                    n2 -= this.\u00d200000.getBGBProfession().getTalente().Object((oo0o_0)object);
                }
                if (n2 > 0) {
                    ++var3_6;
                    object2 = (String)object2 + ((helden.framework.OoOO.U)object).toString() + " ";
                }
                if (n2 <= 2) continue;
                arrayList.add(new Hinweis(((helden.framework.OoOO.U)object).toString() + " darf maximal um zwei Punkte gesteigert werden."));
            }
            if (var3_6 > 5) {
                arrayList.add(new Hinweis("Es d\u00fcrfen maximal 5 Kampftalente bzw. k\u00f6rperliche Talente gesteigert werden.\nGesteigert wurden: " + (String)object2));
            }
        }
        object2 = this.\u00d200000().\u00f8O0000();
        int n3 = this.\u00d300000.\u00f8O0000().Objectsuper();
        object = this.\u00d300000.\u00f8O0000().super();
        while (object.hasNext()) {
            G g2;
            voidsuper voidsuper2 = (voidsuper)object.next();
            if (voidsuper2 instanceof G && (g2 = (G)voidsuper2).\u00f5\u00f40000() < this.\u00d200000().\u00f8O0000().\u00d800000(g2)) {
                arrayList.add(new Hinweis("Der Talentwert f\u00fcr " + g2 + " ist h\u00f6her als die maximale Komplexit\u00e4t." + "Siehe WDH S.94. Korrektur ist ggf. \u00fcber den Editor m\u00f6glich.", Hinweis.HinweisArt.Object));
            }
            int g22 = 0;
            try {
                g22 = ((o00O)object2).\u00f400000(voidsuper2);
            }
            catch (D d2) {
                // empty catch block
            }
            if (voidsuper2 == voidsuper.whilenewObject && g22 > 10 && ((o00O)object2).\u00d200000(voidsuper.thisinterfaceObject, 4)) {
                arrayList.add(new Hinweis("Menschenkenntnis zu niedrig"));
            }
            if (voidsuper2 == voidsuper.\u00d8\u00d5\u00d6000 && g22 > 10 && ((o00O)object2).\u00d200000(voidsuper.thisinterfaceObject, 4)) {
                arrayList.add(new Hinweis("Menschenkenntnis zu niedrig"));
            }
            if (voidsuper2 == voidsuper.newnullObject && g22 > 10) {
                if (((o00O)object2).\u00d200000(voidsuper.O0\u00d6000, 4)) {
                    arrayList.add(new Hinweis("Etikette zu niedrig"));
                }
                if (((o00O)object2).\u00d200000(voidsuper.forclassObject, 4)) {
                    arrayList.add(new Hinweis("Sich verkleiden zu niedrig"));
                }
                if (((o00O)object2).\u00d200000(voidsuper.newnewObject, 4)) {
                    arrayList.add(new Hinweis("Singen zu niedrig"));
                }
                if (((o00O)object2).\u00d200000(voidsuper.\u00d30\u00d8000, 4)) {
                    arrayList.add(new Hinweis("\u00dcberreden zu niedrig"));
                }
                if (((o00O)object2).\u00d200000(voidsuper.StringclassObject, 4)) {
                    arrayList.add(new Hinweis("\u00dcberzeugen zu niedrig"));
                }
            }
            if (voidsuper2 == voidsuper.\u00d30\u00d8000 && g22 > 10 && ((o00O)object2).\u00d200000(voidsuper.thisinterfaceObject, 4)) {
                arrayList.add(new Hinweis("Menschenkenntnis zu niedrig"));
            }
            if (voidsuper2 == voidsuper.\u00d5\u00d6\u00d5000 && g22 > 10 && ((o00O)object2).\u00d200000(voidsuper.\u00d3\u00f4\u00d6000, 4)) {
                arrayList.add(new Hinweis("Wildnisleben zu niedrig"));
            }
            if (voidsuper2 == voidsuper.\u00f5\u00f5\u00d5000 && g22 > 10 && n3 < 6) {
                arrayList.add(new Hinweis("L/S zu niedrig"));
            }
            if (voidsuper2 == voidsuper.\u00f4\u00f6\u00d5000 && g22 > 10) {
                if (n3 < 6) {
                    arrayList.add(new Hinweis("L/S zu niedrig"));
                }
                if (((o00O)object2).\u00d200000(voidsuper.\u00d3\u00f4\u00d5000, 6)) {
                    arrayList.add(new Hinweis("Malen/Zeichnen zu niedrig"));
                }
                if (((o00O)object2).\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 6)) {
                    arrayList.add(new Hinweis("Rechnen zu niedrig"));
                }
            }
            if (voidsuper2 == voidsuper.\u00d3\u00d6\u00d5000 && g22 > 10) {
                if (n3 < 6) {
                    arrayList.add(new Hinweis("L/S zu niedrig"));
                }
                if (((o00O)object2).\u00d200000(voidsuper.\u00f5\u00d2\u00d6000, 6)) {
                    arrayList.add(new Hinweis("Rechnen zu niedrig"));
                }
                if (((o00O)object2).\u00d200000(voidsuper.o\u00d3\u00d6000, 6)) {
                    arrayList.add(new Hinweis("Sinnensch\u00e4rfe zu niedrig"));
                }
            }
            if (voidsuper2 == voidsuper.\u00d8\u00d5\u00d5000 && g22 > 10 && ((o00O)object2).\u00d200000(voidsuper.\u00d4\u00f6\u00d6000, 4)) {
                arrayList.add(new Hinweis("Tierkunde zu niedrig"));
            }
            if (voidsuper2 == voidsuper.forObjectObject && g22 > 10 && ((o00O)object2).\u00d200000(voidsuper.\u00d50\u00d8000, 4)) {
                arrayList.add(new Hinweis("Gesteinskunde zu niedrig"));
            }
            if (voidsuper2 == voidsuper.StringfloatObject && g22 > 10 && ((o00O)object2).\u00d200000(voidsuper.\u00d50\u00d8000, 4)) {
                arrayList.add(new Hinweis("Gesteinskunde zu niedrig"));
            }
            if (voidsuper2 != voidsuper.oo\u00d8000 || g22 <= 10 || !((o00O)object2).\u00d200000(voidsuper.\u00d3\u00d8\u00d5000, 4)) continue;
            arrayList.add(new Hinweis("Holzbearbeitung zu niedrig"));
        }
        return arrayList;
    }

    public void restoreTalentwerte() {
        this.speichereMinimaleTalentWerte();
        this.uebernehmeLeittalente();
        this.o00000();
        if (this.\u00d600000 == null || !this.\u00d200000.getTalentTabErreicht()) {
            return;
        }
        Iterator<voidsuper> iterator = this.\u00d600000.\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2 = iterator.next();
            if (this.String.contains(voidsuper2)) {
                if (!voidsuper2.istEchtesTalent() && !voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d800000)) continue;
                this.aktivierte(voidsuper2);
            }
            try {
                int n = Math.max(Math.min(this.\u00d600000.\u00d300000((oo0o_0)voidsuper2), this.getMaximalWert(voidsuper2)), this.getTalentWert(voidsuper2));
                if (n < this.getMinimalwert(voidsuper2)) {
                    n = this.getMinimalwert(voidsuper2);
                }
                if (!this.darfGesteigertWerden(voidsuper2) && n >= 0) continue;
                this.veraendereTalentwert(voidsuper2, n);
            }
            catch (D d2) {}
        }
        Collections.sort(this.String);
        Collections.sort(this.\u00d800000);
    }

    public void setHeld(K k2) {
        this.\u00d600000 = this.\u00d300000;
        this.\u00d300000 = k2;
    }

    public void speichereMinimaleTalentWerte() {
        this.String = new ArrayList();
        for (voidsuper voidsuper2 : N.floatsuper().\u00d3O0000()) {
            if (!this.\u00d200000.getSetting().contains(voidsuper2)) continue;
            this.String.add(voidsuper2);
        }
        this.\u00d800000 = new ArrayList();
        this.o00000 = new k_0();
        this.\u00d800000 = new ArrayList();
        Iterator<voidsuper> iterator = this.\u00d200000().\u00f8O0000().super();
        while (iterator.hasNext()) {
            voidsuper voidsuper2;
            voidsuper2 = iterator.next();
            this.\u00d800000.add(voidsuper2);
            this.String.remove(voidsuper2);
            try {
                int n = this.\u00d200000().\u00f8O0000().\u00f400000(voidsuper2);
                this.o00000.o00000(voidsuper2, n);
            }
            catch (D d2) {
                throw new RuntimeException(d2);
            }
        }
        Collections.sort(this.String);
    }

    public void uebernehmeLeittalente() {
        Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.\u00d200000().newnew();
        while (iterator.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
            this.\u00d200000().\u00f8O0000().\u00d200000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getLeittalente());
        }
    }

    public void uebernehmeTalentwerte(k_0<oo0o_0> k_02) {
        for (oo0o_0 oo0o_02 : k_02) {
            int n = k_02.\u00d400000(oo0o_02);
            this.o00000(oo0o_02, n);
        }
    }

    public void veraendereTalentwert(oo0o_0 oo0o_02, int n) {
        int n2 = this.getTalentWert(oo0o_02);
        if (n2 == n) {
            return;
        }
        T t = this.\u00d200000().\u00f8O0000();
        if (n2 < n) {
            try {
                while (n2 < n) {
                    this.\u00d200000.getKosten().addKosten(this.getKostenString(oo0o_02, ++n2), new KostenEntry(KostenEntry.kostenBereich.\u00d600000, KostenArt.\u00f600000, HeldenMath.runde(t.\u00d200000(oo0o_02, this.\u00d200000(), true)), oo0o_02, n2));
                    t.super((voidsuper)oo0o_02, n2);
                }
            }
            catch (Stringsuper stringsuper) {
                oooo_0.o00000(stringsuper);
            }
            if (this.\u00d200000.getKosten().moeglicherweiseNutzbar(oo0o_02, KostenEntry.kostenBereich.\u00d600000)) {
                this.\u00d200000.recalc();
            }
        } else {
            while (n < n2) {
                this.\u00d200000.getKosten().removeKosten(this.getKostenString(oo0o_02, n2));
                t.super((voidsuper)oo0o_02, --n2);
            }
            if (this.\u00d200000.getKosten().moeglicherweiseNutzbar(oo0o_02, KostenEntry.kostenBereich.\u00d600000)) {
                this.\u00d200000.recalc();
            }
        }
    }

    private K \u00d200000() {
        return this.\u00d300000;
    }

    private void o00000() {
        Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.\u00d200000().newnew();
        while (iterator.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
            this.\u00d200000().\u00f8O0000().\u00d400000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getMirakelplustalente());
            this.\u00d200000().\u00f8O0000().class(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getMirakelminustalente());
        }
    }

    private void o00000(oo0o_0 oo0o_02, int n) {
        T t = this.\u00d200000().\u00f8O0000();
        try {
            int n2 = t.\u00f400000((voidsuper)oo0o_02);
            t.super((voidsuper)oo0o_02, n2 + n);
        }
        catch (Exception exception) {
            t.super((voidsuper)oo0o_02, n);
        }
    }
}

