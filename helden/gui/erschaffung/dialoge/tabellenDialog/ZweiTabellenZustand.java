/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenDialog;
import helden.gui.erschaffung.werkzeug.HEW2;
import helden.gui.erschaffung.zustaende.ErschaffungsZustand;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public abstract class ZweiTabellenZustand
extends ErschaffungsZustand
implements ActionListener {
    protected ZweiTabellenDialog \u00d8o0000;
    protected JPanel \u00d4o0000;
    private ArrayList<TabellenDefinition>[] floatsuper = new ArrayList[5];
    private JComboBox \u00d6o0000;

    public ZweiTabellenZustand(HEW2 hEW2) {
        super(hEW2);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.getFilterBox()) {
            this.filterBoxChanged(this.getFilterBox().getSelectedItem(), this.getFilterBox().getSelectedIndex());
        }
    }

    public void createPanel() {
        this.\u00d8o0000 = new ZweiTabellenDialog(this.floatsuper);
        if (this.hatFilterBox()) {
            this.\u00d4o0000 = new JPanel();
            this.\u00d4o0000.setLayout(new BorderLayout());
            this.\u00d4o0000.add((Component)this.getFilterBox(), "North");
            this.\u00d4o0000.add((Component)this.\u00d8o0000, "Center");
        } else {
            this.\u00d4o0000 = this.\u00d8o0000;
        }
    }

    @Override
    public String getBezeichner() {
        return null;
    }

    public JComboBox getFilterBox() {
        if (this.\u00d6o0000 == null) {
            this.\u00d6o0000 = new JComboBox();
            for (Object e : this.getFilterItems()) {
                this.\u00d6o0000.addItem(e);
            }
            this.\u00d6o0000.addActionListener(this);
        }
        return this.\u00d6o0000;
    }

    public ArrayList getFilterItems() {
        return null;
    }

    @Override
    public JPanel getPanel() {
        return this.\u00d4o0000;
    }

    public boolean hatFilterBox() {
        return false;
    }

    public void setSpaltenOben(ArrayList<TabellenDefinition> arrayList) {
        this.setTabDef(0, arrayList);
    }

    public void setSpaltenOben(TabellenDefinition tabellenDefinition) {
        this.setTabDef(0, tabellenDefinition);
    }

    public void setSpaltenUnten(TabellenDefinition tabellenDefinition) {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        arrayList.add(tabellenDefinition);
        this.floatsuper[1] = arrayList;
    }

    public void setTabDef(int n, ArrayList<TabellenDefinition> arrayList) {
        this.floatsuper[n] = arrayList;
    }

    public void setTabDef(int n, TabellenDefinition tabellenDefinition) {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        arrayList.add(tabellenDefinition);
        this.setTabDef(n, arrayList);
    }

    @Override
    public void update() {
        this.\u00d8o0000.update(false);
        this.\u00d8o0000.invalidate();
    }

    public void updateSoft() {
        this.\u00d8o0000.update(true);
        this.\u00d8o0000.validate();
    }

    protected void filterBoxChanged(Object object, int n) {
    }
}

