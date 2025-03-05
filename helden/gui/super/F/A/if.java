/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.F.A;

import helden.gui.super.F.A.B;
import helden.gui.super.F.A.G;
import helden.gui.super.F.A.H;
import helden.gui.super.F.A.I;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

public class if
extends B
implements TableCellEditor {
    private I Object;
    private H \u00d200000;

    public if(I i2, H h2) {
        this.Object = i2;
        this.\u00d200000 = h2;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        return this.Object;
    }

    @Override
    public boolean isCellEditable(EventObject eventObject) {
        if (eventObject instanceof MouseEvent) {
            for (int i2 = this.\u00d200000.getColumnCount() - 1; i2 >= 0; --i2) {
                if (this.\u00d200000.getColumnClass(i2) != G.class) continue;
                MouseEvent mouseEvent = (MouseEvent)eventObject;
                MouseEvent mouseEvent2 = new MouseEvent(this.\u00d200000.o00000, mouseEvent.getID(), mouseEvent.getWhen(), mouseEvent.getModifiers(), mouseEvent.getX() - this.\u00d200000.getCellRect((int)0, (int)i2, (boolean)true).x, mouseEvent.getY(), mouseEvent.getClickCount(), mouseEvent.isPopupTrigger());
                this.Object.dispatchEvent(mouseEvent2);
                break;
            }
        }
        return false;
    }
}

