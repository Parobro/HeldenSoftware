/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.CellComboBoxTextFilter;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;

public class ExtJComboBox
extends JComboBox {
    private Object o00000;
    private boolean \u00d200000;

    public ExtJComboBox(SpaltenDefinition spaltenDefinition, Object object) {
        this.setPayLoad(object);
        if (spaltenDefinition.getComboBoxLength(object) != null) {
            this.setEditable(true);
            AbstractDocument abstractDocument = (AbstractDocument)((JTextField)this.getEditor().getEditorComponent()).getDocument();
            abstractDocument.setDocumentFilter(new CellComboBoxTextFilter(spaltenDefinition, object, this));
        }
    }

    public Object getPayLoad() {
        return this.o00000;
    }

    public boolean isDisableEvents() {
        return this.\u00d200000;
    }

    public void setDisableEvents(boolean bl) {
        this.\u00d200000 = bl;
    }

    public void setPayLoad(Object object) {
        this.o00000 = object;
    }
}

