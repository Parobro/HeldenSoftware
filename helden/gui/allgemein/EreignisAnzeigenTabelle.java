/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.allgemein.EreignisAnzeigenModel;
import helden.gui.oooo_1;
import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class EreignisAnzeigenTabelle
extends JTable {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o00000;

    public EreignisAnzeigenTabelle(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.o00000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.setModel(new EreignisAnzeigenModel(this.o00000));
        this.setRowHeight(oooo_1.o00000(20));
        TableColumnModel tableColumnModel = this.getColumnModel();
        block9: for (int i2 = 0; i2 < 6; ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(180);
                    continue block9;
                }
                case 1: {
                    tableColumn.setPreferredWidth(180);
                    continue block9;
                }
                case 2: {
                    tableColumn.setPreferredWidth(50);
                    continue block9;
                }
                case 3: {
                    tableColumn.setPreferredWidth(30);
                    continue block9;
                }
                case 4: {
                    tableColumn.setPreferredWidth(100);
                    continue block9;
                }
                case 5: {
                    tableColumn.setPreferredWidth(100);
                    continue block9;
                }
                case 6: {
                    tableColumn.setPreferredWidth(70);
                    continue block9;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 2 Spalten.");
                }
            }
        }
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tableCellRenderer, int n, int n2) {
        Component component = super.prepareRenderer(tableCellRenderer, n, n2);
        if (component instanceof JComponent) {
            JComponent jComponent = (JComponent)component;
            char[] cArray = this.getValueAt(n, n2).toString().toCharArray();
            int n3 = jComponent.getFontMetrics(jComponent.getFont()).charsWidth(cArray, 0, cArray.length);
            if (this.getColumnModel().getColumn(n2).getWidth() < n3) {
                jComponent.setToolTipText(this.getValueAt(n, n2).toString());
            } else {
                jComponent.setToolTipText(null);
            }
        }
        return component;
    }
}

