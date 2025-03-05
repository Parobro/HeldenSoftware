/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import javax.swing.table.AbstractTableModel;

public class ZweiTabellenTabModell
extends AbstractTableModel {
    private TabellenDefinition o00000;

    public ZweiTabellenTabModell(TabellenDefinition tabellenDefinition) {
        this.o00000 = tabellenDefinition;
    }

    public void aktualisiereAlles() {
        this.fireTableDataChanged();
    }

    @Override
    public Class<?> getColumnClass(int n) {
        return this.o00000.getSpaltenDefinition().get(n).getCellClass();
    }

    @Override
    public int getColumnCount() {
        return this.o00000.getSpaltenDefinition().size();
    }

    @Override
    public String getColumnName(int n) {
        return this.o00000.getSpaltenDefinition().get(n).getUeberschrift();
    }

    @Override
    public int getRowCount() {
        return this.o00000.getAnzahl();
    }

    public TabellenDefinition getTabDef() {
        return this.o00000;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        return this.o00000.getSpaltenDefinition().get(n2).getData(n);
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        return this.o00000.getSpaltenDefinition().get(n2).isEditable(n);
    }
}

