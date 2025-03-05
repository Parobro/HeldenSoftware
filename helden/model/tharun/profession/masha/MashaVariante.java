/*
 * Decompiled with CFR 0.152.
 */
package helden.model.tharun.profession.masha;

import helden.framework.C.I;
import helden.framework.C.Oo0O;
import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.G;
import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.oooo.b_0;
import helden.framework.oooo.k_0;
import helden.framework.oooo.oo0o_0;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.Vector;

public class MashaVariante
extends helden.framework.int.N {
    public MashaVariante() {
        super("Masha", "Masha", 12, false);
    }

    @Override
    public ArrayList<I> getEmpfohleneVorteile() {
        ArrayList<I> arrayList = super.getEmpfohleneVorteile();
        arrayList.add(helden.framework.C.K.o00000("Herausragendes Aussehen"));
        arrayList.add(helden.framework.C.K.o00000("Schlangenmensch"));
        arrayList.add(helden.framework.C.K.o00000("Soziale Anpassungsf\u00e4higkeit"));
        arrayList.add(helden.framework.C.K.o00000("Wohlklang"));
        return arrayList;
    }

    @Override
    public int getMaximalSozialstatus() {
        return 9;
    }

    @Override
    public int getMinimalEigenschaftswert(b_0 b_02) {
        if (b_02.equals(b_0.void("KL"))) {
            return 12;
        }
        if (b_02.equals(b_0.void("CH"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("GE"))) {
            return 13;
        }
        if (b_02.equals(b_0.void("FF"))) {
            return 12;
        }
        if (b_02.equals(b_0.\u00f5\u00f5\u00d2000)) {
            return 6;
        }
        return super.getMinimalEigenschaftswert(b_02);
    }

    @Override
    public Vector<KostenArt> getPunktePools(floatsuper floatsuper2) {
        Vector<KostenArt> vector = super.getPunktePools(floatsuper2);
        vector.add(new KostenArt("Sprachen-Pool", this.toString()){

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2) {
                if (!(object instanceof voidsuper) || !KostenEntry.kostenBereich.\u00d600000.equals((Object)kostenBereich2)) {
                    return false;
                }
                voidsuper voidsuper2 = (voidsuper)object;
                return oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000, voidsuper2);
            }

            @Override
            public boolean darfGenutztWerden(Object object, KostenEntry.kostenBereich kostenBereich2, KostenEntry kostenEntry, HEW2 hEW2) {
                return this.darfGenutztWerden(object, kostenBereich2) && kostenEntry.\u00d600000 - hEW2.getTalente().getMinimalwertOhneProf((voidsuper)object) <= 5;
            }

            @Override
            public Vector<KostenEntry.kostenBereich> getNutzbareBereiche() {
                Vector<KostenEntry.kostenBereich> vector = super.getNutzbareBereiche();
                vector.add(KostenEntry.kostenBereich.\u00d600000);
                return vector;
            }

            @Override
            public int getVerfuegbarePunkte() {
                return 15;
            }

            @Override
            public Boolean verbilligteSFKostennutzen() {
                return null;
            }
        });
        return vector;
    }

    @Override
    public ArrayList<P> getSonderfertigkeiten() {
        ArrayList<P> arrayList = super.getSonderfertigkeiten();
        arrayList.add(K.o00000(voidsuper.\u00d5\u00d5\u00d5000, "Festgestaltung"));
        arrayList.add(K.o00000(voidsuper.O0\u00d6000, "Zeremonien"));
        return arrayList;
    }

    @Override
    public k_0<oo0o_0> getTalentwerte(voidsuper voidsuper2, voidsuper voidsuper3, int n) {
        k_0<oo0o_0> k_02 = super.getTalentwerte(voidsuper2, voidsuper3, n);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Dolche"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Akrobatik"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("K\u00f6rperbeherrschung"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schleichen"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Singen"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verstecken"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sinnensch\u00e4rfe"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Tanzen"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Bet\u00f6ren"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Etikette"), 7);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Lehren"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Menschenkenntnis"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schriftlicher Ausdruck"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Schauspielerei"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sich verkleiden"), 5);
        k_02.\u00d200000(N.floatsuper().\u00d200000("\u00dcberreden"), 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Brett-/Kartenspiel"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Geschichtswissen"), 2);
        k_02.\u00d200000(voidsuper.oo\u00d6000, 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heraldik"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Sagen und Legenden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Pflanzenkunde"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Rechnen"), 4);
        k_02.\u00d200000(G.\u00f8O\u00f5000, 6);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Hauswirtschaft"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Seele"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Heilkunde: Wunden"), 2);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Kochen"), 3);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Malen/Zeichnen"), 4);
        k_02.\u00d200000(N.floatsuper().\u00d200000("Musizieren"), 4);
        return k_02;
    }

    @Override
    public ArrayList<I> getUngeeigneteVorteile() {
        ArrayList<I> arrayList = super.getUngeeigneteVorteile();
        arrayList.add(helden.framework.C.K.o00000("Impulsiv"));
        arrayList.add(helden.framework.C.K.o00000("J\u00e4hzorn"));
        arrayList.add(helden.framework.C.K.o00000("Randgruppe"));
        arrayList.add(helden.framework.C.K.o00000("\u00dcbler Geruch"));
        arrayList.add(helden.framework.C.K.o00000("Unansehnlich"));
        arrayList.add(helden.framework.C.K.o00000(I.\u00f4\u00f4o000));
        return arrayList;
    }

    @Override
    public ArrayList<for> getVerbilligteSonderfertigkeiten() {
        ArrayList<for> arrayList = super.getVerbilligteSonderfertigkeiten();
        arrayList.addAll(for.o00000(K.o00000(voidsuper.o\u00f6\u00d6000, "Tr\u00e4nke")));
        return arrayList;
    }

    @Override
    public Oo0O getVorteile() {
        Oo0O oo0O = super.getVorteile();
        oo0O.\u00d300000(helden.framework.C.K.o00000("Eitelkeit", 7));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Gebildet", 4));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Gutaussehend"));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Verbindungen", 45));
        oo0O.\u00d300000(helden.framework.C.K.o00000("Verpflichtungen", "Herrscher und/oder Ausbilderin)"));
        return oo0O;
    }

    @Override
    public boolean istZeitaufwendig() {
        return true;
    }

    @Override
    public String toString() {
        return this.getBezeichner(this.getProfession().getGeschlecht());
    }
}

