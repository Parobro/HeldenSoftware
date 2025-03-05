/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.werkzeug;

import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.E.A;
import helden.framework.E.C.I;
import helden.framework.E.F;
import helden.framework.Einstellungen;
import helden.framework.HeldenMath;
import helden.framework.OOoO.K;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.interface;
import helden.framework.OooO.C;
import helden.framework.OooO.new;
import helden.framework.held.D;
import helden.framework.held.L;
import helden.framework.held.Object.private;
import helden.framework.held.Stringsuper;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.settings.Setting;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.TharunZauber;
import helden.framework.zauber.Zauber;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import helden.model.kultur.ElfischeSiedlung;
import helden.model.profession.Kristallomant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class HEW2Zauber {
    private k_0<helden.framework.OoOO.M> public;
    private HEW2 \u00d500000;
    private ArrayList<KonkreterZauber> \u00d600000;
    private ArrayList<KonkreterZauber> OO0000;
    private ArrayList<KonkreterZauber> void;
    protected helden.framework.held.K \u00d2O0000;
    private helden.framework.held.K \u00f600000;
    private ArrayList<KonkreterZauber> \u00d400000;
    private boolean o00000;
    private K oO0000;
    private int float = 0;
    private int \u00f500000 = 0;
    private int \u00d200000 = 0;
    private int Object = 0;
    private Comparator \u00f400000 = new Comparator<interface>(){

        public int o00000(interface interface_, interface interface_2) {
            int n;
            int n2 = this.o00000(interface_.new());
            if (n2 == (n = this.o00000(interface_2.new()))) {
                return 0;
            }
            if (n2 < n) {
                return -1;
            }
            return 1;
        }

        public int o00000(oo0o_0 oo0o_02) {
            int n = 0;
            L l2 = HEW2Zauber.this.\u00d500000.getHeld().\u00d5o0000();
            try {
                n = l2.super(oo0o_02, HEW2Zauber.this.\u00d500000.getHeld(), true).\u00d400000();
                if (l2.super((KonkreterZauber)oo0o_02, HEW2Zauber.this.\u00d500000.getHeld().\u00f5O0000()) > 0) {
                    n -= 99;
                }
                if (l2.super((KonkreterZauber)oo0o_02, HEW2Zauber.this.\u00d500000.getHeld().\u00d500000(), HEW2Zauber.this.\u00d500000.getHeld().\u00f5O0000()) > 0) {
                    n -= 99;
                }
            }
            catch (Stringsuper stringsuper) {
                // empty catch block
            }
            return n;
        }
    };

    public HEW2Zauber(HEW2 hEW2) {
        this.\u00d500000 = hEW2;
        this.\u00d400000 = new ArrayList();
        this.void = new ArrayList();
    }

    public void aktivierte(KonkreterZauber konkreterZauber) {
        if (this.\u00d600000.contains(konkreterZauber)) {
            return;
        }
        this.\u00d500000.getKosten().addKosten(this.getKostenString(konkreterZauber, 0), new KostenEntry(KostenEntry.kostenBereich.super, KostenArt.\u00f600000, this.getAktivierungskosten(konkreterZauber), konkreterZauber, 0));
        this.\u00d500000().\u00d5o0000().super(konkreterZauber, 0);
        this.OO0000.add(konkreterZauber);
        this.\u00d600000.add(konkreterZauber);
        if (!konkreterZauber.getZauber().hatVarianten()) {
            this.\u00d400000.remove(konkreterZauber);
        }
        this.sortiereListen();
    }

    public void bestimmeVerfuegbareVerrechungspunkte() {
        this.o00000 = false;
        this.float = 0;
        this.\u00f500000 = 0;
        this.\u00d200000 = 0;
        this.Object = 0;
        if (this.\u00d2O0000.o\u00d20000() != null) {
            this.fuegeVRhinzu(this.\u00d2O0000.o\u00d20000());
        }
        if (this.\u00d2O0000.\u00f800000() != null) {
            this.fuegeVRhinzu(this.\u00d2O0000.\u00f800000());
        }
        if (this.\u00d2O0000.\u00d4O0000() != null) {
            this.fuegeVRhinzu(this.\u00d2O0000.\u00d4O0000());
        }
        if (this.\u00d2O0000.o\u00d50000() && !this.\u00d2O0000.\u00f4\u00d40000() && !this.\u00d2O0000.\u00d4O0000().istMagischeProfession()) {
            this.o00000 = true;
            this.float += 60;
            this.oO0000 = K.\u00f4o0000;
            this.\u00f500000 += 10;
            this.\u00d200000 += 4;
        }
    }

    public boolean darfGesteigertWerden(oo0o_0 oo0o_02) {
        Iterator<public> iterator = this.\u00d500000().\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            public public_ = iterator.next();
            if (!public_.equals(helden.framework.C.I.O\u00d4O000) || !oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) continue;
            for (o00O o00O2 : ((M)public_).intsuper()) {
                if (!((KonkreterZauber)oo0o_02).hatMerkmal(o00O2)) continue;
                return false;
            }
        }
        return true;
    }

    public void deAktivierte(KonkreterZauber konkreterZauber) {
        this.OO0000.remove(konkreterZauber);
        this.veraendereTalentwert(konkreterZauber, 0);
        this.\u00d600000.remove(konkreterZauber);
        this.\u00d500000().\u00d5o0000().super(konkreterZauber);
        this.\u00d500000.getKosten().removeKosten(this.getKostenString(konkreterZauber, 0));
        this.getVrAktivierteZauber().remove(konkreterZauber);
        if (!konkreterZauber.getZauber().hatVarianten()) {
            this.\u00d400000.add(konkreterZauber);
        }
        this.sortiereListen();
    }

    public void fuegeVRhinzu(OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        if (ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getVerrechnungspunkte() > 0) {
            this.o00000 = true;
            this.float += ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getVerrechnungspunkte();
            this.oO0000 = ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.repraesenationVerrechnungspunkte();
            this.\u00f500000 += ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.anzahlAktivierbarerZauber();
            this.\u00d200000 += ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.anzahlWaehlbareHauszauber();
            this.Object += ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.anzahlWahlbarerLeitzauber();
        }
    }

    public ArrayList<KonkreterZauber> getAktivierbareZauber() {
        return this.\u00d400000;
    }

    public ArrayList<KonkreterZauber> getAktivierteTalente() {
        return this.\u00d600000;
    }

    public int getAktivierungskosten(KonkreterZauber konkreterZauber) {
        try {
            if (konkreterZauber.getZauber() instanceof TharunZauber) {
                return 0;
            }
            return this.\u00d500000().\u00d5o0000().super((oo0o_0)konkreterZauber, this.\u00d500000(), false, true);
        }
        catch (Stringsuper stringsuper) {
            throw new RuntimeException(stringsuper);
        }
    }

    public int getAnzahlAktivierterZauber() {
        return this.OO0000.size();
    }

    public int getErlaubteAnzahlAktivierterZauber() {
        if (this.\u00d500000.getSetting().getHauptSetting().equals((Object)Setting.\u00f600000)) {
            return 999;
        }
        if (this.\u00d500000.getSetting().getHauptSetting().equals((Object)Setting.\u00f8O0000)) {
            int n = 0;
            if (this.\u00d500000().o00000(helden.framework.C.I.\u00f5\u00d8o000)) {
                n = 6;
            }
            if (this.\u00d500000().o00000(helden.framework.C.I.forsupersuper)) {
                n = 12;
            }
            return n;
        }
        int n = 0;
        if (this.\u00d500000().o00000(helden.framework.C.I.\u00f5\u00d8o000)) {
            n = Einstellungen.getInstance().getAnzahlAktivierbar();
        }
        if (this.\u00d500000().o00000(helden.framework.C.I.forsupersuper)) {
            n = Einstellungen.getInstance().getAnzahlAktivierbar() * 2;
        }
        return n;
    }

    public String getKostenString(oo0o_0 oo0o_02, int n) {
        KonkreterZauber konkreterZauber = (KonkreterZauber)oo0o_02;
        String string = KonkreterZauber.getBezeichner(konkreterZauber.getZaubername(), konkreterZauber.getRep().toString(), konkreterZauber.getVariante());
        if (this.\u00d2O0000.\u00d5o0000().\u00d200000(konkreterZauber)) {
            string = string + " (HZ)";
        }
        if (this.\u00d2O0000.\u00d5o0000().super((oo0o_0)konkreterZauber, this.\u00d2O0000.\u00d500000())) {
            string = string + " (LZ)";
        }
        string = string + ": " + n;
        return string;
    }

    public int getMaximalWert(oo0o_0 oo0o_02) {
        return this.\u00d500000().\u00d800000(oo0o_02);
    }

    public int getMinimalwert(helden.framework.OoOO.M m) {
        return this.public.Object(m);
    }

    public int getTalentWert(KonkreterZauber konkreterZauber) {
        try {
            return this.\u00d500000().\u00d5o0000().\u00d400000(konkreterZauber);
        }
        catch (D d2) {
            return -99;
        }
    }

    public ArrayList<KonkreterZauber> getUserAktivierteTalente() {
        return this.OO0000;
    }

    public int getVerrechnungspunkte() {
        return this.float;
    }

    public int getVrAktivierbareZauber() {
        return this.\u00f500000;
    }

    public ArrayList<KonkreterZauber> getVrAktivierteZauber() {
        return this.void;
    }

    public int getVrHauszauber() {
        return this.\u00d200000;
    }

    public int getVRkosten(KonkreterZauber konkreterZauber) {
        int n = konkreterZauber.getKategorie(true).\u00d400000();
        if (this.\u00d500000.getHeld().\u00d5o0000().\u00d200000(konkreterZauber) && n > 1) {
            --n;
        }
        return n;
    }

    public int getVrLeitzauber() {
        return this.Object;
    }

    public K getVrRep() {
        return this.oO0000;
    }

    public int getZauberMitMerkmal(o00O o00O2) {
        Iterator<KonkreterZauber> iterator = this.\u00d500000.getHeld().\u00d5o0000().super();
        int n = 0;
        while (iterator.hasNext()) {
            KonkreterZauber konkreterZauber = iterator.next();
            if (!konkreterZauber.hatMerkmal(o00O2)) continue;
            ++n;
        }
        if (this.\u00d500000.getHeld().\u00d5o0000().\u00d300000() == 0) {
            return 0;
        }
        return Math.round((float)n * 100.0f / (float)this.\u00d500000.getHeld().\u00d5o0000().\u00d300000());
    }

    public void init(helden.framework.held.K k2) {
        Object object;
        this.setHeld(k2);
        this.bestimmeVerfuegbareVerrechungspunkte();
        Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.\u00d500000().newnew();
        while (iterator.hasNext()) {
            object = iterator.next();
            this.o00000(((OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO)object).getZauberfertigkeiten());
        }
        this.speichereMinimaleTalentWerte();
        this.\u00d300000();
        this.new();
        this.\u00d400000();
        if (this.\u00f600000 == null) {
            return;
        }
        object = this.\u00f600000.\u00d5o0000();
        HashMap<String, ArrayList<interface>> hashMap = this.o00000((L)object);
        for (Map.Entry<String, ArrayList<interface>> entry : hashMap.entrySet()) {
            Collections.sort((List)entry.getValue(), this.\u00f400000);
            for (interface interface_ : entry.getValue()) {
                this.o00000(k2, (L)object, (KonkreterZauber)interface_.new(), interface_.\u00d300000());
            }
        }
        this.sortiereListen();
    }

    public boolean isAutoTalent(KonkreterZauber konkreterZauber) {
        return this.public.\u00d200000(konkreterZauber);
    }

    public boolean isHatVerrechnungpunkte() {
        return this.o00000;
    }

    public ArrayList<Hinweis> pruefe() {
        int n;
        ArrayList<Hinweis> arrayList = new ArrayList<Hinweis>();
        int n2 = 0;
        if (this.isHatVerrechnungpunkte()) {
            int n3 = 0;
            n = 0;
            int n4 = 0;
            boolean bl = false;
            for (KonkreterZauber object2 : this.getAktivierteTalente()) {
                if (this.\u00d2O0000.\u00d5o0000().super((oo0o_0)object2, this.\u00d2O0000.\u00d500000()) && !this.\u00d2O0000.\u00d5o0000().\u00d200000((oo0o_0)object2, this.\u00d2O0000.\u00d500000())) {
                    ++n4;
                }
                if (this.void.contains(object2)) {
                    if (this.\u00d2O0000.\u00d5o0000().\u00d200000(object2)) {
                        ++n;
                    }
                } else {
                    ++n3;
                    if (this.\u00d2O0000.\u00d5o0000().\u00d200000(object2)) {
                        ++n;
                        bl = true;
                    }
                }
                n2 = n3 - this.getErlaubteAnzahlAktivierterZauber();
            }
            if (this.\u00d500000.getHswZauber().getVrLeitzauber() < n4) {
                arrayList.add(new Hinweis("Es wurden zuviele Leitzauber gew\u00e4hlt!"));
            }
            if (bl) {
                arrayList.add(new Hinweis("Alle Hauszauber m\u00fcssen mit Verrechnungpunkte erworben sein!"));
            }
            if (n > this.getVrHauszauber()) {
                arrayList.add(new Hinweis("Zuviele Hauszauber gew\u00e4hlt!"));
            }
            if (this.getVrAktivierteZauber().size() > this.getVrAktivierbareZauber()) {
                arrayList.add(new Hinweis("Zuviele Zauber mit Verrechnungspunkte aktiviert!"));
            }
            this.\u00d500000.getPruefer().addPruefStringFuerKosten(arrayList, KostenArt.class);
        } else if (this.getAnzahlAktivierterZauber() > this.getErlaubteAnzahlAktivierterZauber()) {
            n2 = this.getAnzahlAktivierterZauber() - this.getErlaubteAnzahlAktivierterZauber();
        }
        if (n2 == 1) {
            arrayList.add(new Hinweis("Es wurde ein Zauber zuviel aktiviert."));
        } else if (n2 > 0) {
            arrayList.add(new Hinweis("Es wurden " + n2 + " Zauber zuviel aktiviert."));
        }
        this.\u00d500000.getPruefer().addPruefStringFuerKosten(arrayList, KostenArt.\u00f600000);
        if (this.\u00d500000.getHauptProfession().hatProfession(Kristallomant.class) != null) {
            L l2 = this.\u00d500000().\u00d5o0000();
            int n3 = n = l2.\u00d200000(KonkreterZauber.getZauber(Zauber.privateintnew, K.thissuper, "")) || l2.\u00d200000(KonkreterZauber.getZauber(Zauber.nullpublicnew, K.thissuper, "")) ? 1 : 0;
            if (n == 0) {
                arrayList.add(new Hinweis("Der Applicatus oder der Arcanovi muss Hauszauber sein!"));
            }
        }
        if (this.\u00d2O0000.\u00d3O0000()) {
            K k2 = this.\u00d2O0000.return();
            Iterator<public> iterator = this.\u00d500000().\u00d500000().\u00d500000();
            while (iterator.hasNext()) {
                public public_ = iterator.next();
                if (!public_.equals(helden.framework.C.I.O\u00d4O000)) continue;
                for (Object object : ((M)public_).intsuper()) {
                    Iterator<KonkreterZauber> iterator2 = this.\u00d500000().\u00d5o0000().super();
                    while (iterator2.hasNext()) {
                        KonkreterZauber konkreterZauber = iterator2.next();
                        if (konkreterZauber.getRep().equals(k2) || !konkreterZauber.hatMerkmal((o00O)object)) continue;
                        arrayList.add(new Hinweis("Zauber " + konkreterZauber.toStringKomplett() + " darf aufgrund" + " der Merkmalsunf\u00e4higkeit " + ((o00O)object).toString() + " nicht " + "aktiviert und nicht gesteigert werden"));
                    }
                }
            }
        }
        arrayList.addAll(this.\u00d500000.getPruefer().pruefeGebildetMagisch());
        return arrayList;
    }

    public void pruefeAufRecalc(KonkreterZauber konkreterZauber) {
        if (konkreterZauber.getHexalogie() == null) {
            return;
        }
        int n = 0;
        for (KonkreterZauber konkreterZauber2 : this.\u00d500000().\u00d5o0000().\u00d200000()) {
            if (!konkreterZauber.getHexalogie().equals(konkreterZauber2.getHexalogie())) continue;
            ++n;
        }
        if (n > 1) {
            this.\u00d500000.recalc();
        }
    }

    public void setHatVerrechnungpunkte(boolean bl) {
        this.o00000 = bl;
    }

    public void setHeld(helden.framework.held.K k2) {
        this.\u00f600000 = this.\u00d2O0000;
        this.\u00d2O0000 = k2;
    }

    public void setVerrechnungspunkte(int n) {
        this.float = n;
    }

    public void setVrAktivierbareZauber(int n) {
        this.\u00f500000 = n;
    }

    public void setVrHauszauber(int n) {
        this.\u00d200000 = n;
    }

    public void setVrLeitzauber(int n) {
        this.Object = n;
    }

    public void setVrRep(K k2) {
        this.oO0000 = k2;
    }

    public void sortiereListen() {
        C.o00000(this.\u00d600000);
        C.o00000(this.\u00d400000);
    }

    public void speichereMinimaleTalentWerte() {
        this.public = new k_0();
        this.\u00d600000 = new ArrayList();
        this.OO0000 = new ArrayList();
        Iterator<KonkreterZauber> iterator = this.\u00d500000().\u00d5o0000().super();
        while (iterator.hasNext()) {
            KonkreterZauber konkreterZauber = iterator.next();
            this.\u00d600000.add(konkreterZauber);
            try {
                int n = this.\u00d500000().\u00d5o0000().\u00d400000(konkreterZauber);
                this.public.o00000(konkreterZauber, n);
            }
            catch (D d2) {
                throw new RuntimeException(d2);
            }
        }
    }

    public void triggerRecalc() {
        this.\u00d500000.getHswZauber();
        this.\u00d500000.fireUpdate();
    }

    public void veraendereTalentwert(KonkreterZauber konkreterZauber, int n) {
        int n2 = this.getTalentWert(konkreterZauber);
        if (n2 == n || n2 == -99) {
            return;
        }
        L l2 = this.\u00d500000().\u00d5o0000();
        if (n2 < n) {
            try {
                while (n2 < n) {
                    this.\u00d500000.getKosten().addKosten(this.getKostenString(konkreterZauber, ++n2), new KostenEntry(KostenEntry.kostenBereich.super, KostenArt.\u00f600000, HeldenMath.runde(l2.\u00d200000(konkreterZauber, this.\u00d500000(), true)), konkreterZauber, n2));
                    l2.super(konkreterZauber, n2);
                }
            }
            catch (Stringsuper stringsuper) {
                stringsuper.printStackTrace();
            }
        } else {
            while (n < n2) {
                this.\u00d500000.getKosten().removeKosten(this.getKostenString(konkreterZauber, n2));
                l2.super(konkreterZauber, --n2);
            }
        }
        if (this.o00000) {
            this.\u00d500000.beruecksichtigeSonstigePunkteQuellen();
        }
    }

    private void o00000(ArrayList<KonkreterZauber> arrayList) {
        for (KonkreterZauber konkreterZauber : arrayList) {
            if (this.\u00d400000.contains(konkreterZauber)) continue;
            this.\u00d400000.add(konkreterZauber);
        }
    }

    private void o00000(helden.framework.held.K k2, L l2, KonkreterZauber konkreterZauber, int n) {
        if (this.isHatVerrechnungpunkte() && this.\u00f600000.\u00d5o0000().\u00d200000(konkreterZauber)) {
            k2.\u00d5o0000().\u00d300000(konkreterZauber);
        }
        if (l2.super((oo0o_0)konkreterZauber, this.\u00f600000.\u00d500000()) && !l2.\u00d200000((oo0o_0)konkreterZauber, this.\u00f600000.\u00d500000()) && !k2.\u00d5o0000().super((oo0o_0)konkreterZauber, k2.\u00d500000())) {
            k2.\u00d5o0000().\u00d200000((oo0o_0)konkreterZauber);
        }
        if (!k2.\u00d5o0000().\u00d300000(konkreterZauber)) {
            this.aktivierte(konkreterZauber);
        }
        this.veraendereTalentwert(konkreterZauber, n);
    }

    private helden.framework.held.K \u00d500000() {
        return this.\u00d2O0000;
    }

    private HashMap<String, ArrayList<interface>> o00000(L l2) {
        HashMap<String, ArrayList<interface>> hashMap = new HashMap<String, ArrayList<interface>>();
        Iterator<KonkreterZauber> iterator = l2.super();
        while (iterator.hasNext()) {
            ArrayList<interface> arrayList;
            KonkreterZauber konkreterZauber = iterator.next();
            String string = konkreterZauber.getHexalogie();
            if (string == null) {
                string = "";
            }
            if ((arrayList = hashMap.get(string)) == null) {
                arrayList = new ArrayList();
                hashMap.put(string, arrayList);
            }
            try {
                if (!this.darfGesteigertWerden(konkreterZauber)) continue;
                int n = Math.max(Math.min(this.\u00f600000.\u00d5o0000().\u00d400000(konkreterZauber), this.getMaximalWert(konkreterZauber)), this.getTalentWert(konkreterZauber));
                arrayList.add(new interface(konkreterZauber, n));
            }
            catch (D d2) {}
        }
        return hashMap;
    }

    private void \u00d300000() {
        this.\u00d400000.clear();
        if (this.\u00d500000.getSetting().getHauptSetting().equals((Object)Setting.\u00f8O0000)) {
            this.o00000();
            for (KonkreterZauber konkreterZauber : this.\u00d600000) {
                if (konkreterZauber.getZauber().hatVarianten()) continue;
                this.\u00d400000.remove(konkreterZauber);
            }
            Iterator<KonkreterZauber> iterator = this.\u00d600000.iterator();
            while (iterator.hasNext()) {
                KonkreterZauber konkreterZauber;
                konkreterZauber = iterator.next();
                if (((TharunZauber)konkreterZauber.getZauber()).isGueltig(this.\u00d500000())) continue;
                iterator.remove();
            }
            return;
        }
        this.o00000(this.\u00d500000().\u00d4O0000().getWaehlbareZauber().getZauberListe());
        this.o00000(this.\u00d500000().\u00f800000().getWaehlbareZauber().getZauberListe());
        if (this.\u00d2O0000.o\u00d50000() && !this.\u00d2O0000.\u00f4\u00d40000() && !this.\u00d2O0000.\u00d4O0000().istMagischeProfession()) {
            this.o00000(new ElfischeSiedlung().getWaehlbareZauber().getZauberListe());
        }
        for (KonkreterZauber konkreterZauber : this.\u00d600000) {
            if (konkreterZauber.getZauber().hatVarianten()) continue;
            this.\u00d400000.remove(konkreterZauber);
        }
    }

    private void o00000() {
        ArrayList<F> arrayList = this.\u00d500000.getHeld().\u00d8o0000().o00000(A.\u00d400000);
        Iterator<F> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            F f2 = iterator.next();
            I._o object = ((I)f2.o00000(A.\u00d400000, 0)).\u00d3\u00d30000();
            if (object.equals((Object)I._o.String)) continue;
            iterator.remove();
        }
        for (List list : new.super(arrayList, 3)) {
            if (list.size() < 3) continue;
            this.\u00d400000.add(KonkreterZauber.getZauber(new TharunZauber(TharunZauber.TharunischeZauberArten.o00000, new F[]{(F)list.get(0), (F)list.get(1), (F)list.get(2)})));
        }
    }

    private void o00000(oo0o_0 oo0o_02, int n) {
        if (oo0o_02.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f8O0000)) {
            L l2 = this.\u00d500000().\u00d5o0000();
            if (oo0o_02 instanceof KonkreterZauber) {
                try {
                    int n2 = l2.\u00d400000((KonkreterZauber)oo0o_02);
                    l2.super((KonkreterZauber)oo0o_02, n2 + n);
                }
                catch (Exception exception) {
                    l2.super((KonkreterZauber)oo0o_02, n);
                }
            } else {
                for (KonkreterZauber konkreterZauber : l2.\u00d200000()) {
                    if (!konkreterZauber.getZauber().equals(oo0o_02)) continue;
                    try {
                        private.\u00d200000(">>" + konkreterZauber.toStringKomplett(), "alle");
                        int n3 = l2.\u00d400000(konkreterZauber);
                        private.\u00d200000(">>" + konkreterZauber.toString() + " => " + n, "alle");
                        l2.super(konkreterZauber, n3 + n);
                    }
                    catch (Exception exception) {}
                }
            }
        }
    }

    private void new() {
        Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.\u00d500000().newnew();
        while (iterator.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
            this.\u00d500000().\u00d5o0000().\u00d300000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getHauszauber());
        }
    }

    private void \u00d400000() {
        Iterator<OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> iterator = this.\u00d500000().newnew();
        while (iterator.hasNext()) {
            OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2 = iterator.next();
            this.\u00d500000().\u00d5o0000().\u00d200000(ooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.getLeittalente());
        }
    }

    private void o00000(k_0<oo0o_0> k_02) {
        for (oo0o_0 oo0o_02 : k_02) {
            int n = k_02.\u00d400000(oo0o_02);
            this.o00000(oo0o_02, n);
            if (!(oo0o_02 instanceof KonkreterZauber) || ((KonkreterZauber)oo0o_02).getZauber().hatVarianten()) continue;
            this.\u00d400000.remove(oo0o_02);
        }
    }
}

