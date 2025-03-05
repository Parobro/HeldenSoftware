/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.zustaende;

import helden.framework.D.K;
import helden.framework.D.OOOo;
import helden.framework.D.P;
import helden.framework.Einstellungen;
import helden.framework.OoOO.D;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.floatsuper;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.components.GuiModus;
import helden.gui.components.TabDefSonderfertigkeiten;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.werkzeug.Hinweis;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import helden.gui.erschaffung.werkzeug.KostenArt;
import helden.gui.erschaffung.werkzeug.KostenEntry;
import helden.gui.icons.IconFactory;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SonderfertigkeitenZustand
extends ZweiTabellenZustand {
    private HashMap<P, P> voidObject;
    private ArrayList<Hinweis> O\u00d40000 = new ArrayList();

    public SonderfertigkeitenZustand(HEW2 hEW2) {
        super(hEW2);
        this.voidObject = new HashMap();
        this.\u00f4\u00d20000();
        this.\u00d8\u00d20000();
        this.createPanel();
    }

    public HashMap<P, P> getAuswahl() {
        return this.voidObject;
    }

    public String getBeschreibungOben() {
        return "Verf\u00fcgbare Sonderfertigkeiten:";
    }

    public String getBeschreibungUnten() {
        return "Gew\u00e4hlte Sonderfertigkeiten:";
    }

    @Override
    public String getBezeichner() {
        return "Sonderfertigkeiten";
    }

    @Override
    public ArrayList<Hinweis> getFehler() {
        this.O\u00d40000.clear();
        if (this.super.getKosten().getGesamtKosten(KostenArt.int, KostenEntry.kostenBereich.class) > 0) {
            this.super.getPruefer().addPruefStringFuerKosten(this.O\u00d40000, KostenArt.int);
        }
        if (this.super.getKosten().getGesamtKosten(KostenArt.\u00f600000, KostenEntry.kostenBereich.class) > 0) {
            this.super.getPruefer().addPruefStringFuerKosten(this.O\u00d40000, KostenArt.\u00f600000);
        }
        for (KostenArt kostenArt : this.super.getKosten().getRKPKostenArten()) {
            if (!kostenArt.getNutzbareBereiche().contains((Object)KostenEntry.kostenBereich.class)) continue;
            this.super.getPruefer().addPruefStringFuerKosten(this.O\u00d40000, kostenArt);
        }
        this.O\u00d40000.addAll(this.super.getSf().pruefe(KostenEntry.kostenBereich.class));
        return this.O\u00d40000;
    }

    @Override
    public String getHelp() {
        String string = "<html>";
        string = string + "Nach WDH S.15 k\u00f6nnen auch Sonderfertigkeiten erworben werden, wenn die Voraussetzungen nicht erf\u00fcllt sind.<br> Eine gewisse Filterung erfolgt trotzdem (z.B. magische Sonderfertigkeiten bei nicht-magischen Helden).<br><br>Es k\u00f6nnen nur Sonderfertigkeiten gew\u00e4hlt werden, die eine Verbreitung von mindestens 4 haben oder durch Rasse/Kultur/Profession verbilligt sind (Errata WDH).<br><br>";
        string = string + "Bei den Talentspezialisierungen k\u00f6nnen vom User auch andere Varianten eingetragen werden.";
        if (Einstellungen.getInstance().isTestMode()) {
            string = string + "<ul><li>Behandlung von SF die automaitsch und gleichzeitig verbilligt sind</ul>";
        }
        return string;
    }

    @Override
    public boolean isActive() {
        return this.super.getPhase() == HEW2.PHASEN.super;
    }

    private void \u00d8\u00d20000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        final HEW2 hEW2 = this.super;
        this.super.getSf();
        for (int i2 = 0; i2 < TabDefSonderfertigkeiten.\u00d2\u00d50000.length; ++i2) {
            arrayList.add(new TabDefSonderfertigkeiten(i2, GuiModus.new){
                private ArrayList<Object> Objectclass;
                private ArrayList<Object> \u00f4\u00d60000;

                @Override
                protected void addSonderfertigkeit(P p2) {
                    try {
                        P p3 = (P)p2.clone();
                        p3.new(p2.o\u00d20000());
                        SonderfertigkeitenZustand.this.super.getSf().add(p3, KostenArt.int);
                    }
                    catch (CloneNotSupportedException cloneNotSupportedException) {
                        cloneNotSupportedException.printStackTrace();
                    }
                }

                @Override
                protected void forceUpdateKosten() {
                    SonderfertigkeitenZustand.this.super.getSf().passeKostenAn();
                }

                @Override
                protected floatsuper getBedingungsTester() {
                    return new floatsuper(hEW2.getHeld());
                }

                @Override
                protected List<Object> getErlaubteTSTalente() {
                    if (this.Objectclass == null) {
                        this.Objectclass = new ArrayList();
                        for (voidsuper voidsuper2 : hEW2.getHeld().\u00f8O0000().\u00d200000()) {
                            if (!voidsuper2.istEchtesTalent() || !voidsuper2.isSpezialisierungenErlaubt() || !hEW2.getHeld().oO0000().contains(voidsuper2)) continue;
                            this.Objectclass.add(voidsuper2);
                        }
                    }
                    return this.Objectclass;
                }

                @Override
                protected List<Object> getErlaubteZSTalente() {
                    if (this.\u00f4\u00d60000 == null) {
                        this.\u00f4\u00d60000 = new ArrayList();
                        for (KonkreterZauber konkreterZauber : hEW2.getHeld().\u00d5o0000().\u00d200000()) {
                            this.\u00f4\u00d60000.add(konkreterZauber);
                        }
                    }
                    return this.\u00f4\u00d60000;
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
                    JPanel jPanel = new JPanel();
                    P p2 = (P)object;
                    int n = 0;
                    jPanel.setLayout(new GridBagLayout());
                    if (this.istVerbilligt(p2)) {
                        jPanel.add((Component)new JLabel(IconFactory.getIconVerbilligt()), this.getConstraints(n++, 0, 1));
                    }
                    if (SonderfertigkeitenZustand.this.super.isBGB() && SonderfertigkeitenZustand.this.super.getSf().istInProfesisonEnthalten(SonderfertigkeitenZustand.this.super.getBGBProfession(), p2)) {
                        jPanel.add((Component)new JLabel(IconFactory.getIconBGB()), this.getConstraints(n++, 0, 1));
                    }
                    if (SonderfertigkeitenZustand.this.super.isVeteran() && SonderfertigkeitenZustand.this.super.getSf().istInProfesisonEnthalten(SonderfertigkeitenZustand.this.super.getVeteranProfession(), p2)) {
                        jPanel.add((Component)new JLabel(IconFactory.getIconVeteran()), this.getConstraints(n++, 0, 1));
                    }
                    return jPanel;
                }

                @Override
                protected Settings getSetting() {
                    return SonderfertigkeitenZustand.this.super.getHeld().oO0000();
                }

                @Override
                protected String getToolTipFuerPanelSpalte(Object object) {
                    String string = "";
                    P p2 = (P)object;
                    if (this.istVerbilligt(p2)) {
                        if (Einstellungen.getInstance().isTestMode()) {
                            string = "<html><body>Normale Kosten: " + p2.newnew() + " AP<br>";
                            if (p2.\u00d8o0000() != null) {
                                for (String string2 : p2.\u00d8o0000()) {
                                    string = string + string2;
                                    string = string + "<br>";
                                }
                            }
                        } else {
                            string = string + "Sonderfertigkeit ist verbilligt. Normale Kosten: " + p2.newnew() + " AP<br>";
                        }
                    }
                    if (SonderfertigkeitenZustand.this.super.isBGB() && SonderfertigkeitenZustand.this.super.getSf().istInProfesisonEnthalten(SonderfertigkeitenZustand.this.super.getBGBProfession(), p2)) {
                        string = string + "Sonderfertigkeit kann mit AP aus der Breitgef\u00e4cherten Bildung gekauft werden<br>";
                    }
                    if (SonderfertigkeitenZustand.this.super.isVeteran() && SonderfertigkeitenZustand.this.super.getSf().istInProfesisonEnthalten(SonderfertigkeitenZustand.this.super.getVeteranProfession(), p2)) {
                        string = string + "Sonderfertigkeit kann mit AP aus dem Vorteil Veteran gekauft werden<br>";
                    }
                    return string;
                }

                @Override
                protected KategorienArrayList<P> getVListe() {
                    return SonderfertigkeitenZustand.this.super.getSf().getMoeglicheSonderfertigkeiten().o00000(TabDefSonderfertigkeiten.\u00d2\u00d50000);
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
                    SonderfertigkeitenZustand.this.update();
                }

                @Override
                protected void updateKosten() {
                    SonderfertigkeitenZustand.this.update();
                }
            });
            arrayList.get(i2).setTabname(TabDefSonderfertigkeiten.\u00d2\u00d50000[i2]);
            arrayList.get(i2).setGlobalname("M\u00f6gliche Sonderfertigkeiten:");
            arrayList.get(i2).setHideWennLeer(true);
        }
        this.setSpaltenOben(arrayList);
    }

    private void \u00f4\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return SonderfertigkeitenZustand.this.super.getHeld().\u00f5O0000().\u00d3O0000().size();
            }
        };
        tabellenDefinition.setGlobalname("Automatische oder gew\u00e4hlte Sonderfertigkeiten:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Sonderfertigkeit", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return SonderfertigkeitenZustand.this.super.getHeld().\u00f5O0000().\u00d3O0000().get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("Kosten", 60, false, String.class){

            @Override
            public Object getData(int n) {
                P p2 = SonderfertigkeitenZustand.this.super.getHeld().\u00f5O0000().\u00d3O0000().get(n);
                if (SonderfertigkeitenZustand.this.super.getSf().isAuto(p2)) {
                    return "AUTO";
                }
                return p2.o\u00d20000() + " AP / " + p2.nullsuper() + " GP";
            }
        });
        arrayList.add(new SpaltenDefinition("Bezahlen mit", 60, true, voidsuper.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                SonderfertigkeitenZustand.this.super.getSf().setzeKostenArt((P)object, (KostenArt)object2);
            }

            @Override
            public Object getData(int n) {
                if (SonderfertigkeitenZustand.this.super.getSf().isAuto(SonderfertigkeitenZustand.this.super.getHeld().\u00f5O0000().\u00d3O0000().get(n))) {
                    return null;
                }
                return SonderfertigkeitenZustand.this.super.getHeld().\u00f5O0000().\u00d3O0000().get(n);
            }

            @Override
            public List<Object> getItems(Object object) {
                return SonderfertigkeitenZustand.this.super.getSf().getMoeglicheKostenArten((P)object);
            }

            @Override
            public Object selectedItem(Object object) {
                KostenArt kostenArt = SonderfertigkeitenZustand.this.super.getSf().getKostenArtFuerSf().get(object);
                return kostenArt;
            }
        });
        arrayList.add(new SpaltenDefinition("Nutzbar", 30, false, Boolean.class){

            @Override
            public Object getData(int n) {
                return SonderfertigkeitenZustand.this.super.getBt().\u00d200000(SonderfertigkeitenZustand.this.super.getHeld().\u00f5O0000().\u00d3O0000().get(n).\u00f5o0000()) == floatsuper._o.Object;
            }

            @Override
            public String getToolTip(int n) {
                if (SonderfertigkeitenZustand.this.super.getBt().\u00d200000(SonderfertigkeitenZustand.this.super.getHeld().\u00f5O0000().\u00d3O0000().get(n).\u00f5o0000()) == floatsuper._o.Object) {
                    return super.getToolTip(n);
                }
                return "<pre>" + SonderfertigkeitenZustand.this.super.getHeld().\u00f5O0000().\u00d3O0000().get(n).\u00f5o0000().toStringFormatiert() + "</pre>";
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                SonderfertigkeitenZustand.this.super.getSf().remove((P)object);
                SonderfertigkeitenZustand.this.update();
            }

            @Override
            public Object getData(int n) {
                if (SonderfertigkeitenZustand.this.super.getSf().isAuto(SonderfertigkeitenZustand.this.super.getHeld().\u00f5O0000().\u00d3O0000().get(n))) {
                    return null;
                }
                return SonderfertigkeitenZustand.this.super.getHeld().\u00f5O0000().\u00d3O0000().get(n);
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

