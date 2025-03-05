/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;

public class KostenUebersichtZustand
extends ZweiTabellenZustand {
    public KostenUebersichtZustand(HEW2 hEW2) {
        super(hEW2);
        this.\u00f5\u00d20000();
        this.ifnew();
        this.createPanel();
    }

    public String getBeschreibungOben() {
        return "";
    }

    public String getBeschreibungUnten() {
        return "";
    }

    @Override
    public String getBezeichner() {
        return "Kosten\u00fcbersicht";
    }

    @Override
    public ArrayList<Hinweis> getFehler() {
        return this.super.getPruefer().pruefe();
    }

    @Override
    public boolean isActive() {
        return this.super.getPhase() == HEW2.PHASEN.super;
    }

    private void \u00f5\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 10 + KostenUebersichtZustand.this.super.getKosten().getRKPKostenArten().size();
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Name", 200, false, String.class){

            @Override
            public Object getData(int n) {
                switch (n) {
                    case 0: {
                        return "GP";
                    }
                    case 1: {
                        return "GP in Nachteilen";
                    }
                    case 2: {
                        return "GP in schlechten Eigenschaften";
                    }
                    case 3: {
                        return "AP";
                    }
                    case 4: {
                        return "AP aus Gebildet";
                    }
                    case 5: {
                        return "AP aus Veteran";
                    }
                    case 6: {
                        return "AP aus BGB";
                    }
                    case 7: {
                        return "Eigenschaftspunkte";
                    }
                    case 8: {
                        return "aktivierte Talente";
                    }
                    case 9: {
                        return "aktivierte Zauber";
                    }
                }
                return KostenUebersichtZustand.this.super.getKosten().getRKPKostenArten().get(n - 10).toString() + " aus " + KostenUebersichtZustand.this.super.getKosten().getRKPKostenArten().get(n - 10).getID();
            }
        });
        arrayList.add(new SpaltenDefinition("Genutzt", 200, false, String.class){

            @Override
            public Object getData(int n) {
                switch (n) {
                    case 0: {
                        return KostenUebersichtZustand.this.super.getKosten().getKosten(KostenArt.int);
                    }
                    case 1: {
                        return KostenUebersichtZustand.this.super.getHswVorteile().getGPNachteile();
                    }
                    case 2: {
                        return KostenUebersichtZustand.this.super.getHswVorteile().getGPSchlechteEigenschaften();
                    }
                    case 3: {
                        return KostenUebersichtZustand.this.super.getKosten().getKosten(KostenArt.\u00f600000);
                    }
                    case 4: {
                        return KostenUebersichtZustand.this.super.getKosten().getKosten(KostenArt.\u00f800000);
                    }
                    case 5: {
                        return KostenUebersichtZustand.this.super.getKosten().getKosten(KostenArt.\u00d300000);
                    }
                    case 6: {
                        return KostenUebersichtZustand.this.super.getKosten().getKosten(KostenArt.\u00f400000);
                    }
                    case 7: {
                        return KostenUebersichtZustand.this.super.getHswEigenschaften().getEigenschaftenGP();
                    }
                    case 8: {
                        if (KostenUebersichtZustand.this.super.isBGB()) {
                            return KostenUebersichtZustand.this.super.getTalente().getAnzahlAktivierterTalenteOhneBGBundVR() + " (inkl. BGB " + KostenUebersichtZustand.this.super.getTalente().getAnzahlAktivierterTalente() + ")";
                        }
                        return KostenUebersichtZustand.this.super.getTalente().getAnzahlAktivierterTalente();
                    }
                    case 9: {
                        return KostenUebersichtZustand.this.super.getHswZauber().getAnzahlAktivierterZauber();
                    }
                }
                KostenArt kostenArt = KostenUebersichtZustand.this.super.getKosten().getRKPKostenArten().get(n - 10);
                return KostenUebersichtZustand.this.super.getKosten().getKosten(kostenArt);
            }
        });
        arrayList.add(new SpaltenDefinition("Maximal", 200, false, String.class){

            @Override
            public Object getData(int n) {
                switch (n) {
                    case 0: {
                        return KostenUebersichtZustand.this.super.getKosten().getVerfuegbarePunkte(KostenArt.int);
                    }
                    case 1: {
                        return 50;
                    }
                    case 2: {
                        return 30;
                    }
                    case 3: {
                        return KostenUebersichtZustand.this.super.getKosten().getVerfuegbarePunkte(KostenArt.\u00f600000);
                    }
                    case 4: {
                        return KostenUebersichtZustand.this.super.getKosten().getVerfuegbarePunkte(KostenArt.\u00f800000);
                    }
                    case 5: {
                        return KostenUebersichtZustand.this.super.getKosten().getVerfuegbarePunkte(KostenArt.\u00d300000);
                    }
                    case 6: {
                        return KostenUebersichtZustand.this.super.getKosten().getVerfuegbarePunkte(KostenArt.\u00f400000);
                    }
                    case 7: {
                        return KostenUebersichtZustand.this.super.getMaxgpeigenschaft();
                    }
                    case 8: {
                        return KostenUebersichtZustand.this.super.getTalente().getErlaubteAnzahlAktivierterTalente();
                    }
                    case 9: {
                        String string = "" + KostenUebersichtZustand.this.super.getHswZauber().getErlaubteAnzahlAktivierterZauber();
                        if (KostenUebersichtZustand.this.super.getHswZauber().getVrAktivierbareZauber() > 0) {
                            string = string + " + " + KostenUebersichtZustand.this.super.getHswZauber().getVrAktivierbareZauber();
                        }
                        return string;
                    }
                }
                KostenArt kostenArt = KostenUebersichtZustand.this.super.getKosten().getRKPKostenArten().get(n - 10);
                return KostenUebersichtZustand.this.super.getKosten().getVerfuegbarePunkte(kostenArt);
            }
        });
        this.setSpaltenOben(tabellenDefinition);
    }

    private void ifnew() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return KostenUebersichtZustand.this.super.getKosten().getList().getWerte().size();
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Name", 200, false, String.class){

            @Override
            public Object getData(int n) {
                return KostenUebersichtZustand.this.super.getKosten().getList().getWerte().get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("Bereich", 60, false, String.class){

            @Override
            public Object getData(int n) {
                return ((KostenEntry)KostenUebersichtZustand.this.super.getKosten().getList().get((Object)KostenUebersichtZustand.this.super.getKosten().getList().getWerte().get((int)n))).o00000;
            }
        });
        arrayList.add(new SpaltenDefinition("Kosten", 40, false, String.class){

            @Override
            public Object getData(int n) {
                return ((KostenEntry)KostenUebersichtZustand.this.super.getKosten().getList().get((Object)KostenUebersichtZustand.this.super.getKosten().getList().getWerte().get((int)n))).\u00d400000 + " " + ((KostenEntry)KostenUebersichtZustand.this.super.getKosten().getList().get((Object)KostenUebersichtZustand.this.super.getKosten().getList().getWerte().get((int)n))).\u00d500000;
            }
        });
        this.setSpaltenUnten(tabellenDefinition);
    }
}

