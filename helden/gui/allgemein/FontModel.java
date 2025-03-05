/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.table.AbstractTableModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class FontModel
extends AbstractTableModel {
    private Font[] super = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts();

    @Override
    public Class<?> getColumnClass(int n) {
        if (n == 1) {
            return Font.class;
        }
        return super.getColumnClass(n);
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int n) {
        switch (n) {
            case 0: {
                return "Name";
            }
            case 1: {
                return "Vorschau";
            }
        }
        throw new IllegalArgumentException("Zu viele Spalten");
    }

    @Override
    public int getRowCount() {
        return this.super.length;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        switch (n2) {
            case 0: {
                return this.super[n].getName();
            }
            case 1: {
                return this.super[n];
            }
        }
        throw new IllegalArgumentException("Zu viele Zeilen");
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        return false;
    }
}

