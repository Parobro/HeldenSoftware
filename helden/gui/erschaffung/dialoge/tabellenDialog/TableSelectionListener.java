/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.ErschaffungsJTable;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class TableSelectionListener
implements ListSelectionListener {
    private ErschaffungsJTable new;
    private TabellenDefinition o00000;

    public TableSelectionListener(ErschaffungsJTable erschaffungsJTable, TabellenDefinition tabellenDefinition) {
        this.new = erschaffungsJTable;
        this.o00000 = tabellenDefinition;
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) {
        int n;
        if (listSelectionEvent.getSource() == this.new.getSelectionModel() && this.new.getRowSelectionAllowed() && !listSelectionEvent.getValueIsAdjusting() && (n = this.new.getSelectedRow()) > -1) {
            this.o00000.setSelectedRow(n);
        }
    }
}

