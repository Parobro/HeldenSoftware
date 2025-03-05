/*
 * Decompiled with CFR 0.152.
 */
package helden.model.myranor.profession.varianten;

import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.OoOO.privatesuper;
import helden.framework.D.OoOO.whilesuper;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.OOoO.K;
import helden.framework.OOoO.L;
import helden.framework.OOoO.o00O;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.held.Object.floatsuper;
import helden.framework.int.N;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.MyranischerZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import helden.model.myranor.profession.Optimat;
import java.util.ArrayList;
import java.util.Vector;

public class MagieVarianten
extends N
implements helden.framework.oOoO.A.Object {
    private ArrayList<KonkreterZauber> \u00f8\u00f6\u00f4O00 = new ArrayList();
    private K O\u00f8\u00f4O00;
    protected ArrayList<public> ifthisfloat = new ArrayList();
    protected ArrayList<for> o\u00f8\u00f4O00;

    public MagieVarianten(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    public void addWC(oooo_0 oooo_02, String string, int n) {
        boolean bl = false;
        if (string.startsWith("H")) {
            bl = true;
            string = string.substring(1);
        }
        if (string.substring(2).equals("(Un-)Element")) {
            for (o00O o00O2 : o00O.\u00f400000()) {
                String string2 = string.substring(0, 2) + o00O2.toString();
                if (!MyranischerZauber.zauberExists(string2)) continue;
                b_0 b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(string.substring(0, 2) + o00O2.toString()), n, bl));
                oooo_02.o00000(b_02);
            }
        } else {
            b_0 b_03 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(string), n, bl));
            oooo_02.o00000(b_03);
        }
    }

    @Override
    public Vector<KostenArt> getPunktePools(floatsuper floatsuper2) {
        Vector<KostenArt> vector = new Vector<KostenArt>();
        if (this.getUmfangFormelPool() == 0) {
            return vector;
        }
        vector.add(new KostenArt("Formel-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                if (object instanceof Q && KostenEntry.kostenBereich.class.equals((Object)kostenBereich2)) {
                    System.out.println(object);
                    return ((Q)object).\u00d4\u00d30000() instanceof privatesuper || ((Q)object).\u00d4\u00d30000() instanceof whilesuper;
                }
                return false;
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.class);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return MagieVarianten.this.getUmfangFormelPool();
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return false;
            }
        });
        return vector;
    }

    public K getRep() {
        if (!this.istRepBestimmt()) {
            for (helden.framework.int.P p2 : this.getProfession().getGewaehlteVarianten()) {
                N n = (N)p2;
                for (P p3 : n.getSonderfertigkeiten()) {
                    if (!p3.\u00f4O0000()) continue;
                    this.O\u00f8\u00f4O00 = K.super(p3);
                }
            }
            if (!this.istRepBestimmt()) {
                if (this.getProfession() instanceof Optimat) {
                    this.O\u00f8\u00f4O00 = K.\u00f500000;
                } else {
                    helden.framework.held.object.oooo_0.\u00f500000("Konnte keine Repr\u00e4senation finden!" + this.toString());
                }
            }
        }
        return this.O\u00f8\u00f4O00;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        return new ArrayList<oooo_0>();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        for (public public_ : this.ifthisfloat) {
            oo0O.\u00d300000(public_);
        }
        return oo0O;
    }

    @Override
    public WaehlbareZauber getWaehlbareZauber() {
        WaehlbareZauber waehlbareZauber = super.getWaehlbareZauber();
        for (Zauber zauber : MyranischerZauber.getMyranischeZauber()) {
            waehlbareZauber.add(KonkreterZauber.getZauber(zauber, this.getRep(), ""));
        }
        return waehlbareZauber;
    }

    public KonkreterZauber getZauber(L l2, o00O o00O2) {
        MyranischerZauber myranischerZauber = MyranischerZauber.getZauber(o00O2, l2);
        return KonkreterZauber.getZauber(myranischerZauber, this.getRep(), "");
    }

    public KonkreterZauber getZauber(String string) {
        return KonkreterZauber.getZauber(string, this.getRep(), "");
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        this.\u00f8\u00f6\u00f4O00.add(konkreterZauber);
    }

    @Override
    public void gewaehlterVorteil(public public_) {
        this.ifthisfloat.add(public_);
    }

    @Override
    public void gewaehltesLeittalent(oo0o_0 oo0o_02) {
        throw new RuntimeException("Nicht implementiert");
    }

    @Override
    public void gewaehlteSonderfertigkeit(P p2) {
        this.getProfession().getGewaehlteSonderfertigkeiten().o00000(p2);
    }

    @Override
    public void gewaehltesTalent(oo0o_0 oo0o_02, int n, helden.framework.held.K k2, boolean bl) {
        if (oo0o_02 instanceof voidsuper) {
            k2.\u00f8O0000().\u00d300000((voidsuper)oo0o_02, n);
        } else {
            k2.\u00d5o0000().super((KonkreterZauber)oo0o_02, (Integer)n);
        }
        this.setTalentauswahl(oo0o_02, n);
    }

    public boolean istRepBestimmt() {
        return this.O\u00f8\u00f4O00 != null;
    }

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.addAll(this.\u00f8\u00f6\u00f4O00);
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        this.getProfession().waehleVerbilligteSonderfertigkeit(for_);
    }

    protected void addZauber(oooo_0 oooo_02, ArrayList<o00O> arrayList, L l2, int n) {
        this.addZauber(oooo_02, arrayList, l2, n, false);
    }

    protected void addZauber(oooo_0 oooo_02, ArrayList<o00O> arrayList, L l2, int n, boolean bl) {
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getMyranischeZauber()) {
            if (!myranischerZauber.getZauberArt().equals((Object)l2)) continue;
            boolean bl2 = false;
            for (o00O o00O2 : myranischerZauber.getMerkmale(null)) {
                if (!arrayList.contains(o00O2)) continue;
                bl2 = true;
            }
            if (!bl2) continue;
            b_0 b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), n, bl));
            oooo_02.o00000(b_02);
        }
    }

    protected void beliebigeQuelle(oooo_0 oooo_02, int n, int n2) {
        for (MyranischerZauber myranischerZauber : MyranischerZauber.getMyranischeZauber()) {
            b_0 b_02;
            if (myranischerZauber.toString().startsWith("E:")) {
                b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), n, false));
                oooo_02.o00000(b_02);
                continue;
            }
            if (!myranischerZauber.toString().startsWith("W:")) continue;
            b_02 = new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(myranischerZauber), n2, false));
            oooo_02.o00000(b_02);
        }
        this.removeGewaehlte(oooo_02);
    }

    @Override
    protected K getRepraesentation(Zauber zauber) {
        return this.getRep();
    }

    protected int getUmfangFormelPool() {
        return 0;
    }

    protected void removeGewaehlte(oooo_0 oooo_02) {
        for (b_0 b_02 : oooo_02.\u00d200000()) {
            if (b_02.Object().size() != 1) {
                helden.framework.held.object.oooo_0.\u00f500000("Mehr als ein Element im WC bei remove gew\u00e4hlte!" + b_02.toString());
                continue;
            }
            ZauberMitWertUndHZ zauberMitWertUndHZ = (ZauberMitWertUndHZ)b_02.Object().get(0);
            b_02.o00000(new BedingungsVerknuepfung(VerknuepfungsArt.o00000, Bedingung.hatNicht(zauberMitWertUndHZ.getZauber(), (Integer)1)));
        }
    }
}

