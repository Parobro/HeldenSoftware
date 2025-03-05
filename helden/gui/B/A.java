/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.B;

import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.B.B;
import helden.gui.B.C;
import helden.gui.B.o0OO;
import helden.gui.oooo_1;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A
extends JTable {
    private C \u00d300000;
    private B o00000;
    private o0OO \u00d200000;

    public A(B b) {
        this.o00000 = b;
        this.\u00d300000 = new C(b);
        this.super(b.o00000());
    }

    public void super() {
        if (this.cellEditor != null) {
            this.cellEditor.stopCellEditing();
        }
        this.\u00d200000.o00000();
        this.setModel(this.\u00d200000);
        this.revalidate();
    }

    public B \u00d300000() {
        return this.o00000;
    }

    public C \u00d200000() {
        return this.\u00d300000;
    }

    public void super(C c) {
        this.\u00d300000 = c;
    }

    public void super(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.\u00d200000 = new o0OO(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        this.setModel(this.\u00d200000);
        this.setRowHeight(oooo_1.o00000(20));
        TableColumnModel tableColumnModel = this.getColumnModel();
        block5: for (int i2 = 0; i2 < 3; ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(200);
                    continue block5;
                }
                case 1: {
                    tableColumn.setPreferredWidth(30);
                    continue block5;
                }
                case 2: {
                    tableColumn.setPreferredWidth(250);
                    tableColumn.setMinWidth(200);
                    tableColumn.setCellEditor(this.\u00d300000);
                    tableColumn.setCellRenderer(this.\u00d300000);
                    continue block5;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 2 Spalten.");
                }
            }
        }
    }
}

