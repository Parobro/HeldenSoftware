/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F;

import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.allgemein.new.D;
import helden.gui.allgemein.super.super;
import helden.gui.oooo_1;
import helden.gui.super.F.E;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class OoOO
extends JTable {
    public super o00000() {
        return (super)this.getModel();
    }

    public void o00000(ArrayList<OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO> arrayList) {
        super super_ = new super(new E(arrayList));
        this.setModel(super_);
        super_.super(this.getTableHeader());
        this.setRowHeight(oooo_1.o00000(20));
        TableColumnModel tableColumnModel = this.getColumnModel();
        block8: for (int i2 = 0; i2 < 6; ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(100);
                    tableColumn.setCellRenderer(new D());
                    continue block8;
                }
                case 1: {
                    tableColumn.setPreferredWidth(50);
                    continue block8;
                }
                case 2: {
                    tableColumn.setPreferredWidth(100);
                    continue block8;
                }
                case 3: {
                    tableColumn.setPreferredWidth(100);
                    continue block8;
                }
                case 4: {
                    tableColumn.setPreferredWidth(100);
                    continue block8;
                }
                case 5: {
                    tableColumn.setPreferredWidth(100);
                    continue block8;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 7 Spalten.");
                }
            }
        }
    }
}

