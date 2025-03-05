/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.D.K;
import helden.framework.D.P;
import helden.framework.E.B;
import helden.framework.E.F;
import helden.framework.OoOO.D;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.Object.T;
import helden.framework.held.Object.floatsuper;
import helden.framework.settings.Settings;
import helden.gui.components.GuiModus;
import helden.gui.components.TabDefSonderfertigkeiten;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class G
extends ZweiTabellenZustand {
    private ArrayList<P> \u00f6o0000;
    private helden.framework.E.C.K \u00f8o0000;

    public G(F f2) {
        super(null);
        this.\u00f8o0000 = (helden.framework.E.C.K)f2.o00000(B.\u00d200000, 0);
        this.\u00f6o0000 = new ArrayList();
        this.\u00f6o0000.addAll(this.\u00f8o0000.\u00d3\u00d40000().\u00f600000());
        this.\u00f800000();
        this.\u00f400000();
        this.createPanel();
        this.update();
    }

    public void o00000(P p2) {
        try {
            if (!this.\u00f6o0000.contains(p2)) {
                P p3 = (P)p2.clone();
                this.\u00f6o0000.add(p3);
            }
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
        }
        this.update();
    }

    public String \u00f500000() {
        return "Verf\u00fcgbare SF / Besondere Kampfregeln:";
    }

    public String if() {
        return "Gew\u00e4hlte SF / Besondere Kampfregeln:";
    }

    @Override
    public String getBezeichner() {
        return "SF / Besondere Kampfregeln";
    }

    public void o00000(P p2, boolean bl) {
    }

    public boolean OO0000() {
        this.\u00f8o0000.\u00d3\u00d40000().for();
        for (P p2 : this.\u00f6o0000) {
            this.\u00f8o0000.o00000(p2);
        }
        return true;
    }

    @Override
    public void update() {
        super.update();
    }

    private void \u00f400000() {
        TabDefSonderfertigkeiten tabDefSonderfertigkeiten = new TabDefSonderfertigkeiten(-1, GuiModus.\u00d400000){

            @Override
            protected void addSonderfertigkeit(P p2) {
                G.this.o00000(p2);
            }

            @Override
            protected void forceUpdateKosten() {
            }

            @Override
            protected floatsuper getBedingungsTester() {
                return new floatsuper(null);
            }

            @Override
            protected List<Object> getErlaubteTSTalente() {
                return null;
            }

            @Override
            protected List<Object> getErlaubteZSTalente() {
                return null;
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
                return Settings.getSettingsBySetting(G.this.\u00f8o0000.\u00f6\u00d30000());
            }

            @Override
            protected String getToolTipFuerPanelSpalte(Object object) {
                return null;
            }

            @Override
            protected KategorienArrayList<P> getVListe() {
                return T.o00000(G.this.\u00f8o0000.\u00f6\u00d30000()).o00000(new String[]{""});
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
                G.this.update();
            }

            @Override
            protected void updateKosten() {
            }
        };
        this.setSpaltenOben(tabDefSonderfertigkeiten);
    }

    private void \u00f800000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return G.this.\u00f6o0000.size();
            }
        };
        tabellenDefinition.setGlobalname("SF / Besondere Kampfregeln:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("SF / Besondere Kampfregeln", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return G.this.\u00f6o0000.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                G.this.\u00f6o0000.remove(object);
                G.this.update();
            }

            @Override
            public Object getData(int n) {
                return G.this.\u00f6o0000.get(n);
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

