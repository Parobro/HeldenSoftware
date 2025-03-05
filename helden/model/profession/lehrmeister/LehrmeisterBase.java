/*
 * Decompiled with CFR 0.152.
 */
package helden.model.profession.lehrmeister;

import helden.framework.C.Oo0O;
import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OOoO.K;
import helden.framework.OoOO.voidsuper;
import helden.framework.bedingungen.Bedingung;
import helden.framework.bedingungen.BedingungsVerknuepfung;
import helden.framework.bedingungen.VerknuepfungsArt;
import helden.framework.int.N;
import helden.framework.int.Q;
import helden.framework.oooo.a.b_0;
import helden.framework.oooo.a.oooo_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.WaehlbareZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.framework.zauber.ZauberMitWertUndHZ;
import java.util.ArrayList;

public class LehrmeisterBase
extends N
implements helden.framework.oOoO.A.Object,
Q {
    private ArrayList<KonkreterZauber> \u00d5O\u00d2O00 = new ArrayList();
    protected ArrayList<public> \u00d3O\u00d2O00 = new ArrayList();
    protected ArrayList<for> fordovoid;
    protected String \u00d4O\u00d2O00 = "keine";

    public LehrmeisterBase(String string, String string2, int n, boolean bl) {
        super(string, string2, n, bl);
    }

    @Override
    public String getGildenzugehoerigkeit() {
        return this.\u00d4O\u00d2O00;
    }

    @Override
    public ArrayList<oooo_0> getVerallgemeinteListenAuswahlen() {
        return new ArrayList<oooo_0>();
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        for (public public_ : this.\u00d3O\u00d2O00) {
            oo0O.\u00d300000(public_);
        }
        return oo0O;
    }

    public KonkreterZauber getZauber(String string) {
        for (Zauber zauber : ZauberFabrik.getInstance().getAlleZauber()) {
            if (!zauber.toString().toLowerCase().startsWith(string.toLowerCase())) continue;
            string = zauber.toString();
            break;
        }
        return KonkreterZauber.getZauber(string, K.\u00f8O0000, "");
    }

    @Override
    public void gewaehlterHauszauber(KonkreterZauber konkreterZauber) {
        this.\u00d5O\u00d2O00.add(konkreterZauber);
    }

    @Override
    public void gewaehlterVorteil(public public_) {
        this.\u00d3O\u00d2O00.add(public_);
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

    @Override
    public void setzeHauszauber(ArrayList<KonkreterZauber> arrayList) {
        arrayList.addAll(this.\u00d5O\u00d2O00);
    }

    @Override
    public void waehleVerbilligteSonderfertigkeit(for for_) {
        this.getProfession().waehleVerbilligteSonderfertigkeit(for_);
    }

    void o00000(WaehlbareZauber waehlbareZauber) {
        for (oooo_0 oooo_02 : this.getVerallgemeinteListenAuswahlen()) {
            for (b_0 b_02 : oooo_02.\u00d200000()) {
                for (Object object : b_02.Object()) {
                    if (!(object instanceof ZauberMitWertUndHZ)) continue;
                    ZauberMitWertUndHZ zauberMitWertUndHZ = (ZauberMitWertUndHZ)object;
                    waehlbareZauber.add(zauberMitWertUndHZ.getZauber());
                }
            }
        }
    }

    protected ArrayList<oooo_0> getAuswahl(String[] stringArray, Integer[] integerArray, boolean bl) {
        ArrayList<oooo_0> arrayList = new ArrayList<oooo_0>();
        for (Integer n : integerArray) {
            oooo_0 oooo_02 = new oooo_0(1, this);
            arrayList.add(oooo_02);
            for (String string : stringArray) {
                if (string.equals("D\u00e4monenbann")) {
                    for (String string2 : Zauber.O\u00d8\u00d3000.getVarianten()) {
                        oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(KonkreterZauber.getZauber(string, K.\u00f8O0000, string2), n, bl)));
                    }
                    continue;
                }
                oooo_02.o00000(new b_0((Object)new ZauberMitWertUndHZ(this.getZauber(string), n, bl)));
            }
            this.removeGewaehlte(oooo_02);
        }
        return arrayList;
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

