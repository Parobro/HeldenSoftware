/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.D.P;
import helden.framework.OoOO.D;
import helden.framework.OoOO.N;
import helden.framework.held.Object.floatsuper;
import helden.framework.settings.Settings;
import helden.gui.O0OO.D.new.B;
import helden.gui.O0OO.ooOO.new;
import helden.gui.components.GuiModus;
import helden.gui.components.TabDefSonderfertigkeiten;
import helden.gui.erschaffung.werkzeug.KategorienArrayList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class K
extends TabDefSonderfertigkeiten {
    private new O\u00d60000;
    private B \u00d2\u00d60000;
    private ArrayList<Object> doString;
    private ArrayList<Object> \u00f8\u00d50000;

    public K(int n, new new_, B b, boolean bl) {
        super(n, GuiModus.return);
        this.O\u00d60000 = new_;
        this.\u00d2\u00d60000 = b;
        this.setHideWennLeer(true);
    }

    @Override
    public void addVerbilligtesSonderfertigkeit(P p2) {
        this.\u00d2\u00d60000.\u00d200000(p2);
    }

    @Override
    protected void addSonderfertigkeit(P p2) {
        this.\u00d2\u00d60000.o00000(p2);
    }

    @Override
    protected void forceUpdateKosten() {
        this.\u00d2\u00d60000.\u00d500000();
    }

    @Override
    protected floatsuper getBedingungsTester() {
        return null;
    }

    @Override
    protected List<Object> getErlaubteTSTalente() {
        if (this.doString == null) {
            this.doString = new ArrayList();
            this.doString.addAll(N.floatsuper().\u00d3O0000());
        }
        return this.doString;
    }

    @Override
    protected List<Object> getErlaubteZSTalente() {
        if (this.\u00f8\u00d50000 == null) {
            this.\u00f8\u00d50000 = new ArrayList();
        }
        return this.\u00f8\u00d50000;
    }

    @Override
    protected int getKostenTalentSpezialisierung(helden.framework.D.K k2) {
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
        return null;
    }

    @Override
    protected String getToolTipFuerPanelSpalte(Object object) {
        return null;
    }

    @Override
    protected KategorienArrayList<P> getVListe() {
        return this.O\u00d60000.\u00d5\u00d20000().o00000(TabDefSonderfertigkeiten.\u00d2\u00d50000);
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
        this.\u00d2\u00d60000.\u00d500000();
    }

    @Override
    protected void updateKosten() {
        this.\u00d2\u00d60000.\u00d500000();
    }
}

