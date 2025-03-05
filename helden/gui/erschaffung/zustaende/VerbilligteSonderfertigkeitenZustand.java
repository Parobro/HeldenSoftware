/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.D.K;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.D.for;
import helden.framework.OoOO.D;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.settings.Settings;
import helden.gui.components.GuiModus;
import helden.gui.components.TabDefSonderfertigkeiten;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.HEW2SF;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JPanel;

public class VerbilligteSonderfertigkeitenZustand
extends ZweiTabellenZustand {
    protected HashMap<P, P> \u00f4\u00d30000;
    private ArrayList<Hinweis> \u00d8\u00d30000 = new ArrayList();

    public VerbilligteSonderfertigkeitenZustand(HEW2 hEW2) {
        super(hEW2);
        this.\u00f4\u00d30000 = new HashMap();
        this.privatesuper();
        this.\u00f5o0000();
        this.createPanel();
    }

    public P get(int n) {
        return this.super.getSf().getVerbilligteSFausPoolPunkten().get(n);
    }

    public HashMap<P, P> getAuswahl() {
        return this.\u00f4\u00d30000;
    }

    public String getBeschreibungOben() {
        return "Verf\u00fcgbare Sonderfertigkeiten:";
    }

    public String getBeschreibungUnten() {
        return "Gew\u00e4hlte Sonderfertigkeiten:";
    }

    @Override
    public String getBezeichner() {
        return "verbilligte SF";
    }

    @Override
    public ArrayList<Hinweis> getFehler() {
        this.\u00d8\u00d30000.clear();
        for (KostenArt kostenArt : this.super.getKosten().getRKPKostenArten()) {
            if (!kostenArt.getNutzbareBereiche().contains((Object)KostenEntry.kostenBereich.\u00d800000)) continue;
            this.super.getPruefer().addPruefStringFuerKosten(this.\u00d8\u00d30000, kostenArt);
        }
        this.\u00d8\u00d30000.addAll(this.super.getSf().pruefe(KostenEntry.kostenBereich.\u00d800000));
        return this.\u00d8\u00d30000;
    }

    @Override
    public String getHelp() {
        String string = "<html>";
        if (this.super.getSf().getVerbilligtUndAutomatischeSonderfertigkeiten().size() > 0) {
            string = string + "<br><br>Folgende Sonderfertigkeiten erh\u00e4lt der Held verbilligt, wurden jedoch bereits automatisch vergeben:<br><ul>";
            for (for for_ : this.super.getSf().getVerbilligtUndAutomatischeSonderfertigkeiten()) {
                string = string + "<li>" + for_;
            }
            string = string + "</ul>In diesem Tab k\u00f6nnen hierf\u00fcr Alternativen ausgesucht werden.<br>";
        }
        return string;
    }

    @Override
    public boolean isActive() {
        if (this.super.getPhase() != HEW2.PHASEN.super) {
            return false;
        }
        for (KostenArt kostenArt : this.super.getKosten().getRKPKostenArten()) {
            if (!kostenArt.getNutzbareBereiche().contains((Object)KostenEntry.kostenBereich.\u00d800000)) continue;
            return true;
        }
        return false;
    }

    private void \u00f5o0000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        this.super.getSf();
        final HEW2 hEW2 = this.super;
        for (int i2 = 0; i2 < TabDefSonderfertigkeiten.\u00d2\u00d50000.length; ++i2) {
            arrayList.add(new TabDefSonderfertigkeiten(i2, GuiModus.o00000){
                private ArrayList<Object> interfaceString;
                private ArrayList<Object> \u00d4\u00d60000;

                @Override
                protected void addSonderfertigkeit(P p2) {
                    List<Object> list = VerbilligteSonderfertigkeitenZustand.this.super.getSf().getMoeglicheKostenArtenVerbilligt(p2);
                    KostenArt kostenArt = (KostenArt)list.get(0);
                    VerbilligteSonderfertigkeitenZustand.this.super.getSf().addVerbilligte(p2, kostenArt);
                    this.update();
                }

                @Override
                protected void forceUpdateKosten() {
                    VerbilligteSonderfertigkeitenZustand.this.super.getSf().passeKostenAn();
                }

                @Override
                protected floatsuper getBedingungsTester() {
                    return new floatsuper(hEW2.getHeld());
                }

                @Override
                protected List<Object> getErlaubteTSTalente() {
                    if (this.interfaceString == null) {
                        this.interfaceString = new ArrayList();
                        for (voidsuper voidsuper2 : hEW2.getHeld().\u00f8O0000().\u00d200000()) {
                            if (!voidsuper2.istEchtesTalent() || !voidsuper2.isSpezialisierungenErlaubt() || !hEW2.getHeld().oO0000().contains(voidsuper2)) continue;
                            this.interfaceString.add(voidsuper2);
                        }
                    }
                    return this.interfaceString;
                }

                @Override
                protected List<Object> getErlaubteZSTalente() {
                    if (this.\u00d4\u00d60000 == null) {
                        this.\u00d4\u00d60000 = new ArrayList();
                    }
                    return this.\u00d4\u00d60000;
                }

                @Override
                protected int getKostenTalentSpezialisierung(K k2) {
                    OOOo oOOo = new OOOo();
                    oOOo.o00000(k2);
                    hEW2.getSf().passeKostenAn(oOOo);
                    return k2.o\u00d20000();
                }

                @Override
                protected D getLernMethode(P p2) {
                    return null;
                }

                @Override
                protected List<Object> getMoeglicheLehrmeisterArten(P p2) {
                    return null;
                }

                @Override
                protected JPanel getPanelFuePanelSpalte(Object object) {
                    return null;
                }

                @Override
                protected Settings getSetting() {
                    return hEW2.getHeld().oO0000();
                }

                @Override
                protected String getToolTipFuerPanelSpalte(Object object) {
                    return null;
                }

                @Override
                protected KategorienArrayList<P> getVListe() {
                    return VerbilligteSonderfertigkeitenZustand.this.super.getSf().getMoeglicheVerbilligteSonderfertigkeiten().o00000(TabDefSonderfertigkeiten.\u00d2\u00d50000);
                }

                @Override
                protected boolean isSE(P p2) {
                    return false;
                }

                @Override
                protected void setLernMethode(P p2, D d2) {
                }

                @Override
                protected void setSE(P p2, boolean bl) {
                }

                @Override
                protected void update() {
                    VerbilligteSonderfertigkeitenZustand.this.update();
                }

                @Override
                protected void updateKosten() {
                    VerbilligteSonderfertigkeitenZustand.this.update();
                }
            });
            arrayList.get(i2).setTabname(HEW2SF.Object[i2]);
            arrayList.get(i2).setGlobalname("Sonderfertigkeiten, die verbilligt werden k\u00f6nnen:");
            arrayList.get(i2).setHideWennLeer(true);
        }
        this.setSpaltenOben(arrayList);
    }

    private void privatesuper() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return VerbilligteSonderfertigkeitenZustand.this.super.getSf().getVerbilligteSFausPoolPunkten().size();
            }
        };
        tabellenDefinition.setGlobalname("Gew\u00e4hlte Sonderfertigkeiten, die verbilligt sind:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Sonderfertigkeit", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return VerbilligteSonderfertigkeitenZustand.this.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("Kosten", 60, false, String.class){

            @Override
            public Object getData(int n) {
                return "" + VerbilligteSonderfertigkeitenZustand.this.get(n).newnew();
            }
        });
        arrayList.add(new SpaltenDefinition("Bezahlen mit", 60, true, voidsuper.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                if (!VerbilligteSonderfertigkeitenZustand.this.super.getSf().getKostenArtFuerVerbilligteSf().get(object).toString().equals(object2.toString())) {
                    VerbilligteSonderfertigkeitenZustand.this.super.getSf().setzeKostenArtVerbilligteSF((P)object, (KostenArt)object2);
                    VerbilligteSonderfertigkeitenZustand.this.super.recalc();
                    VerbilligteSonderfertigkeitenZustand.this.update();
                }
            }

            @Override
            public Object getData(int n) {
                return VerbilligteSonderfertigkeitenZustand.this.get(n);
            }

            @Override
            public List<Object> getItems(Object object) {
                return VerbilligteSonderfertigkeitenZustand.this.super.getSf().getMoeglicheKostenArtenVerbilligt((P)object);
            }

            @Override
            public Object selectedItem(Object object) {
                return VerbilligteSonderfertigkeitenZustand.this.super.getSf().getKostenArtFuerVerbilligteSf().get(object);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                VerbilligteSonderfertigkeitenZustand.this.super.getSf().removeVerbilligt((P)object);
                VerbilligteSonderfertigkeitenZustand.this.update();
                VerbilligteSonderfertigkeitenZustand.this.update();
            }

            @Override
            public Object getData(int n) {
                return VerbilligteSonderfertigkeitenZustand.this.get(n);
            }
        });
        this.setSpaltenUnten(tabellenDefinition);
        tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 0;
            }
        };
        arrayList = tabellenDefinition.getSpaltenDefinition();
        ArrayList<TabellenDefinition> arrayList2 = new ArrayList<TabellenDefinition>();
        arrayList2.add(tabellenDefinition);
        arrayList2.add(tabellenDefinition);
        this.setSpaltenOben(arrayList2);
    }
}

