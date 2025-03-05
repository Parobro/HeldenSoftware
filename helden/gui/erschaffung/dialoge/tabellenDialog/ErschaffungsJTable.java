/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.CellButton;
import helden.gui.erschaffung.dialoge.tabellenDialog.CellCheckBox;
import helden.gui.erschaffung.dialoge.tabellenDialog.CellComboBox;
import helden.gui.erschaffung.dialoge.tabellenDialog.CellJPanel;
import helden.gui.erschaffung.dialoge.tabellenDialog.CellMultifunctional;
import helden.gui.erschaffung.dialoge.tabellenDialog.CellSpinbox;
import helden.gui.erschaffung.dialoge.tabellenDialog.CellTextArea;
import helden.gui.erschaffung.dialoge.tabellenDialog.CellVorteile;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TableSelectionListener;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenTabModell;
import helden.gui.oooo_1;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ErschaffungsJTable
extends JTable {
    private TabellenDefinition \u00d500000;
    private ArrayList<CellSpinbox> \u00d800000;
    private ArrayList<CellMultifunctional> o00000;
    private ArrayList<CellComboBox> \u00d400000;
    private ArrayList<CellCheckBox> return;
    private ArrayList<CellJPanel> \u00d300000;
    private ArrayList<CellVorteile> new;

    public ErschaffungsJTable(TabellenDefinition tabellenDefinition) {
        this.\u00d500000 = tabellenDefinition;
        this.setEnabled(true);
        this.\u00d800000 = new ArrayList();
        this.\u00d400000 = new ArrayList();
        this.new = new ArrayList();
        this.return = new ArrayList();
        this.\u00d300000 = new ArrayList();
        this.o00000 = new ArrayList();
        this.setModel(new ZweiTabellenTabModell(tabellenDefinition));
        this.setRowHeight(oooo_1.o00000(20));
        TableColumnModel tableColumnModel = this.getColumnModel();
        for (int i2 = 0; i2 < tabellenDefinition.getSpaltenDefinition().size(); ++i2) {
            TableCellEditor tableCellEditor;
            SpaltenDefinition spaltenDefinition = tabellenDefinition.getSpaltenDefinition().get(i2);
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            tableColumn.setPreferredWidth(spaltenDefinition.getBreite());
            if (spaltenDefinition.getButtonArt().equals((Object)SpaltenDefinition.ART.\u00d200000)) {
                tableCellEditor = new CellButton(spaltenDefinition, spaltenDefinition.getButtonBeschriftung());
                tableColumn.setCellRenderer((TableCellRenderer)((Object)tableCellEditor));
                tableColumn.setCellEditor(tableCellEditor);
            }
            if (spaltenDefinition.getButtonArt().equals((Object)SpaltenDefinition.ART.\u00f800000)) {
                tableCellEditor = new CellSpinbox(spaltenDefinition);
                this.\u00d800000.add((CellSpinbox)tableCellEditor);
                tableColumn.setCellRenderer((TableCellRenderer)((Object)tableCellEditor));
                tableColumn.setCellEditor(tableCellEditor);
            }
            if (spaltenDefinition.getButtonArt().equals((Object)SpaltenDefinition.ART.\u00d300000)) {
                tableCellEditor = new CellComboBox(spaltenDefinition);
                this.\u00d400000.add((CellComboBox)tableCellEditor);
                tableColumn.setCellRenderer((TableCellRenderer)((Object)tableCellEditor));
                tableColumn.setCellEditor(tableCellEditor);
            }
            if (spaltenDefinition.getButtonArt().equals((Object)SpaltenDefinition.ART.\u00d600000)) {
                tableCellEditor = new CellVorteile(spaltenDefinition);
                this.new.add((CellVorteile)tableCellEditor);
                tableColumn.setCellRenderer((TableCellRenderer)((Object)tableCellEditor));
                tableColumn.setCellEditor(tableCellEditor);
            }
            if (spaltenDefinition.getButtonArt().equals((Object)SpaltenDefinition.ART.null)) {
                tableCellEditor = new CellJPanel(spaltenDefinition);
                this.\u00d300000.add((CellJPanel)tableCellEditor);
                tableColumn.setCellRenderer((TableCellRenderer)((Object)tableCellEditor));
                tableColumn.setCellEditor(tableCellEditor);
            }
            if (spaltenDefinition.getButtonArt().equals((Object)SpaltenDefinition.ART.\u00f600000)) {
                tableCellEditor = new CellCheckBox(spaltenDefinition);
                this.return.add((CellCheckBox)tableCellEditor);
                tableColumn.setCellRenderer((TableCellRenderer)((Object)tableCellEditor));
                tableColumn.setCellEditor(tableCellEditor);
            }
            if (spaltenDefinition.getButtonArt().equals((Object)SpaltenDefinition.ART.o00000)) {
                tableCellEditor = new CellTextArea(this, spaltenDefinition);
                tableColumn.setCellRenderer((TableCellRenderer)((Object)tableCellEditor));
                tableColumn.setCellEditor(tableCellEditor);
            }
            if (!spaltenDefinition.getButtonArt().equals((Object)SpaltenDefinition.ART.String)) continue;
            tableCellEditor = new CellMultifunctional(this, spaltenDefinition);
            this.o00000.add((CellMultifunctional)tableCellEditor);
            tableColumn.setCellRenderer((TableCellRenderer)((Object)tableCellEditor));
            tableColumn.setCellEditor(tableCellEditor);
        }
        TableSelectionListener tableSelectionListener = new TableSelectionListener(this, tabellenDefinition);
        this.getSelectionModel().addListSelectionListener(tableSelectionListener);
        this.getColumnModel().getSelectionModel().addListSelectionListener(tableSelectionListener);
        this.setName(tabellenDefinition.getTabname());
    }

    public void aktualisieren() {
        for (CellSpinbox tableCellEditor : this.\u00d800000) {
            tableCellEditor.check();
        }
        for (CellComboBox cellComboBox : this.\u00d400000) {
            cellComboBox.check();
        }
        for (CellVorteile cellVorteile : this.new) {
            cellVorteile.check();
        }
        for (CellCheckBox cellCheckBox : this.return) {
            cellCheckBox.check();
        }
        for (CellJPanel cellJPanel : this.\u00d300000) {
            cellJPanel.check();
        }
        for (CellMultifunctional cellMultifunctional : this.o00000) {
            cellMultifunctional.check();
        }
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tableCellRenderer, int n, int n2) {
        Component component = super.prepareRenderer(tableCellRenderer, n, n2);
        if (component instanceof JComponent) {
            JComponent jComponent = (JComponent)component;
            if (this.getValueAt(n, n2) != null) {
                char[] cArray = this.getValueAt(n, n2).toString().toCharArray();
                int n3 = jComponent.getFontMetrics(jComponent.getFont()).charsWidth(cArray, 0, cArray.length);
                String string = "";
                if (this.getColumnModel().getColumn(n2).getWidth() < n3) {
                    string = this.getValueAt(n, n2).toString() + "<br>";
                }
                if ((string = string + this.\u00d500000.getSpaltenDefinition().get(n2).getToolTip(n)).equals("")) {
                    jComponent.setToolTipText(null);
                } else {
                    jComponent.setToolTipText("<html>" + string);
                }
            }
        }
        return component;
    }
}

