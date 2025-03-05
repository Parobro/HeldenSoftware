/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.components.JScrollPaneFast;
import helden.gui.erschaffung.dialoge.JTabbedPaneWithVisible;
import helden.gui.erschaffung.dialoge.tabellenDialog.ErschaffungsJTable;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenTabModell;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ZweiTabellenDialog
extends JPanel {
    private static final long serialVersionUID = 1L;
    private ArrayList<ErschaffungsJTable>[] \u00d500000;
    private Component[] new = null;
    private String[] o00000 = null;
    private Integer[] \u00d400000;
    private ZweiTabellenZustand \u00d300000;

    public ZweiTabellenDialog() {
    }

    public ZweiTabellenDialog(ArrayList<TabellenDefinition>[] arrayListArray) {
        this.setup(arrayListArray);
    }

    public void setup(ArrayList<TabellenDefinition>[] arrayListArray) {
        this.\u00d500000 = new ArrayList[arrayListArray.length];
        this.new = new Component[arrayListArray.length];
        this.o00000 = new String[arrayListArray.length];
        this.\u00d400000 = new Integer[arrayListArray.length];
        for (int i2 = 0; i2 < arrayListArray.length; ++i2) {
            JComponent jComponent;
            if (arrayListArray[i2] == null) continue;
            this.\u00d500000[i2] = new ArrayList();
            ArrayList<TabellenDefinition> arrayList = arrayListArray[i2];
            if (arrayList.size() == 1) {
                if (arrayList.get(0).getPanel() != null) {
                    this.new[i2] = arrayList.get(0).getPanel();
                } else {
                    jComponent = new JScrollPaneFast();
                    ErschaffungsJTable erschaffungsJTable = new ErschaffungsJTable(arrayList.get(0));
                    ((JScrollPane)jComponent).setViewportView(erschaffungsJTable);
                    this.\u00d500000[i2].add(erschaffungsJTable);
                    this.new[i2] = jComponent;
                }
            } else {
                jComponent = new JTabbedPaneWithVisible();
                for (TabellenDefinition tabellenDefinition : arrayList) {
                    ErschaffungsJTable erschaffungsJTable = new ErschaffungsJTable(tabellenDefinition);
                    ((JTabbedPaneWithVisible)jComponent).addTab(tabellenDefinition.getTabname(), new JScrollPane(erschaffungsJTable));
                    this.\u00d500000[i2].add(erschaffungsJTable);
                }
                this.new[i2] = jComponent;
            }
            this.\u00d400000[i2] = arrayList.get(0).getWeightY();
            this.o00000[i2] = arrayList.get(0).getGlobalname();
        }
        this.o00000();
    }

    public void update(boolean bl) {
        for (int i2 = 0; i2 < this.\u00d500000.length; ++i2) {
            if (this.\u00d500000[i2] == null) continue;
            for (int i3 = 0; i3 < this.\u00d500000[i2].size(); ++i3) {
                boolean bl2;
                ErschaffungsJTable erschaffungsJTable = this.\u00d500000[i2].get(i3);
                erschaffungsJTable.removeEditor();
                erschaffungsJTable.clearSelection();
                ZweiTabellenTabModell zweiTabellenTabModell = (ZweiTabellenTabModell)erschaffungsJTable.getModel();
                zweiTabellenTabModell.aktualisiereAlles();
                if (!bl) {
                    erschaffungsJTable.aktualisieren();
                }
                if (!zweiTabellenTabModell.getTabDef().isHideWennLeer()) continue;
                boolean bl3 = bl2 = zweiTabellenTabModell.getTabDef().getAnzahl() > 0;
                if (this.new[i2] instanceof JScrollPaneFast) {
                    if (this.new[i2].isVisible() == bl2) continue;
                    this.new[i2].setVisible(bl2);
                    continue;
                }
                if (!(this.new[i2] instanceof JTabbedPaneWithVisible)) continue;
                JTabbedPaneWithVisible jTabbedPaneWithVisible = (JTabbedPaneWithVisible)this.new[i2];
                jTabbedPaneWithVisible.setVisible(jTabbedPaneWithVisible.getTabNameAt(i3), bl2);
                jTabbedPaneWithVisible.revalidate();
            }
        }
    }

    private void o00000() {
        this.setLayout(new GridBagLayout());
        int n = 0;
        if (this.\u00d300000 != null && this.\u00d300000.hatFilterBox()) {
            ++n;
        }
        for (int i2 = 0; i2 < this.new.length; ++i2) {
            if (this.new[i2] == null) continue;
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.fill = 2;
            gridBagConstraints.gridy = n++;
            gridBagConstraints.insets = new Insets(5, 5, 5, 5);
            gridBagConstraints.anchor = 17;
            gridBagConstraints.weightx = 0.0;
            gridBagConstraints.weighty = 0.0;
            gridBagConstraints.gridwidth = 3;
            gridBagConstraints.gridx = 0;
            this.add((Component)new JLabel(this.o00000[i2]), gridBagConstraints);
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.fill = 3;
            gridBagConstraints.gridy = n++;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = this.\u00d400000[i2] != null ? (double)this.\u00d400000[i2].intValue() : 1.0 * (double)(i2 + 1);
            gridBagConstraints.gridwidth = 3;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = n++;
            gridBagConstraints.fill = 1;
            this.add(this.new[i2], gridBagConstraints);
        }
    }
}

