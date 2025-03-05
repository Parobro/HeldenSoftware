/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G.String;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.OoOO.D;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.O0OO;
import helden.framework.held.Object.floatsuper;
import helden.framework.settings.Settings;
import helden.framework.zauber.KonkreterZauber;
import helden.gui.G.String.B;
import helden.gui.G.String.C;
import helden.gui.components.GuiModus;
import helden.gui.components.TabDefSonderfertigkeiten;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class oOOO
extends ZweiTabellenZustand {
    private O0OO classString;

    public oOOO(O0OO o0OO2, C c) {
        super(null);
        this.classString = o0OO2;
        this.classString.o00000(true);
        this.\u00d3\u00d40000();
        this.\u00d4\u00d40000();
        this.\u00d8\u00d40000();
        this.createPanel();
        this.update();
    }

    public void \u00d300000(P p2) {
        this.classString.\u00d800000(p2);
        this.update();
    }

    public String \u00d5\u00d40000() {
        return "Verf\u00fcgbare Sonderfertigkeiten:";
    }

    public String forObject() {
        return "Gew\u00e4hlte Sonderfertigkeiten:";
    }

    @Override
    public String getBezeichner() {
        return "Sonderfertigkeiten";
    }

    @Override
    public void update() {
        super.update();
    }

    private void \u00d4\u00d40000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 1;
            }

            @Override
            public Integer getWeightY() {
                return 1;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return "Nur SF mit erf\u00fcllten Bedingungen anzeigen?";
            }
        });
        arrayList.add(new SpaltenDefinition("", 100, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public Object getData(int n) {
                return "";
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                return SpaltenDefinition.ART.\u00f600000;
            }

            @Override
            public boolean getSelected(Object object) {
                return oOOO.this.classString.returnsuper();
            }

            @Override
            public void selected(Object object, boolean bl) {
                oOOO.this.classString.\u00d200000(bl);
                oOOO.this.update();
            }
        });
        this.setTabDef(1, tabellenDefinition);
    }

    private void \u00d3\u00d40000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        final O0OO o0OO2 = this.classString;
        for (int i2 = 0; i2 < TabDefSonderfertigkeiten.\u00d2\u00d50000.length; ++i2) {
            arrayList.add(new TabDefSonderfertigkeiten(i2, GuiModus.\u00d500000){
                private ArrayList<Object> voidclass;
                private ArrayList<Object> O\u00d80000;

                @Override
                protected void addSonderfertigkeit(P p2) {
                    oOOO.this.\u00d300000(p2);
                }

                @Override
                protected void forceUpdateKosten() {
                }

                @Override
                protected floatsuper getBedingungsTester() {
                    return new floatsuper(o0OO2.\u00d800000());
                }

                @Override
                protected List<Object> getErlaubteTSTalente() {
                    if (this.voidclass == null) {
                        this.voidclass = new ArrayList();
                        for (voidsuper voidsuper2 : o0OO2.\u00d800000().\u00f8O0000().\u00d200000()) {
                            if (!voidsuper2.istEchtesTalent() || !voidsuper2.isSpezialisierungenErlaubt() || !o0OO2.\u00d800000().oO0000().contains(voidsuper2)) continue;
                            this.voidclass.add(voidsuper2);
                        }
                    }
                    return this.voidclass;
                }

                @Override
                protected List<Object> getErlaubteZSTalente() {
                    if (this.O\u00d80000 == null) {
                        this.O\u00d80000 = new ArrayList();
                        for (KonkreterZauber konkreterZauber : o0OO2.\u00d800000().\u00d5o0000().\u00d200000()) {
                            this.O\u00d80000.add(konkreterZauber);
                        }
                    }
                    return this.O\u00d80000;
                }

                @Override
                protected int getKostenTalentSpezialisierung(K k2) {
                    return 0;
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
                    return o0OO2.\u00d800000().oO0000();
                }

                @Override
                protected String getToolTipFuerPanelSpalte(Object object) {
                    return null;
                }

                @Override
                protected KategorienArrayList<P> getVListe() {
                    return o0OO2.o00000(false).o00000(TabDefSonderfertigkeiten.\u00d2\u00d50000);
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
                    oOOO.this.update();
                }

                @Override
                protected void updateKosten() {
                }
            });
            arrayList.get(i2).setTabname(TabDefSonderfertigkeiten.\u00d2\u00d50000[i2]);
            arrayList.get(i2).setGlobalname("M\u00f6gliche Sonderfertigkeiten:");
            arrayList.get(i2).setHideWennLeer(true);
        }
        this.setSpaltenOben(arrayList);
    }

    private void \u00d8\u00d40000() {
        this.setTabDef(2, new B(this.classString, this));
    }
}

