/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import java.util.ArrayList;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class TabellenDefinition {
    private String class = "";
    private String \u00d400000 = "";
    private boolean \u00d300000 = false;
    private ArrayList<SpaltenDefinition> \u00d200000 = new ArrayList();
    private JPanel super;

    public abstract int getAnzahl();

    public String getGlobalname() {
        return this.\u00d400000;
    }

    public JPanel getPanel() {
        return this.super;
    }

    public ArrayList<SpaltenDefinition> getSpaltenDefinition() {
        return this.\u00d200000;
    }

    public String getTabname() {
        return this.class;
    }

    public Integer getWeightY() {
        return null;
    }

    public boolean isHideWennLeer() {
        return this.\u00d300000;
    }

    public void setGlobalname(String string) {
        this.\u00d400000 = string;
    }

    public void setHideWennLeer(boolean bl) {
        this.\u00d300000 = bl;
    }

    public void setPanel(JPanel jPanel) {
        this.super = jPanel;
    }

    public void setSelectedRow(int n) {
    }

    public void setSpaltenDefinition(ArrayList<SpaltenDefinition> arrayList) {
        this.\u00d200000 = arrayList;
    }

    public void setTabname(String string) {
        this.class = string;
    }
}

