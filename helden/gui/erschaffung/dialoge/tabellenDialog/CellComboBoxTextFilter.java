/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.framework.held.object.oooo_0;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJComboBox;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class CellComboBoxTextFilter
extends DocumentFilter {
    private SpaltenDefinition \u00d200000;
    private Object \u00d300000;
    private ExtJComboBox o00000;

    public CellComboBoxTextFilter(SpaltenDefinition spaltenDefinition, Object object, ExtJComboBox extJComboBox) {
        this.\u00d300000 = object;
        this.\u00d200000 = spaltenDefinition;
        this.o00000 = extJComboBox;
    }

    @Override
    public void insertString(DocumentFilter.FilterBypass filterBypass, int n, String string, AttributeSet attributeSet) throws BadLocationException {
        this.replace(filterBypass, n, 0, string, attributeSet);
        this.o00000(filterBypass);
    }

    @Override
    public void replace(DocumentFilter.FilterBypass filterBypass, int n, int n2, String string, AttributeSet attributeSet) throws BadLocationException {
        String string2 = filterBypass.getDocument().getText(0, n) + string + filterBypass.getDocument().getText(n + n2, filterBypass.getDocument().getLength() - (n2 + n));
        if (this.\u00d200000.getItems(this.\u00d300000).contains(string2)) {
            filterBypass.replace(n, n2, string, attributeSet);
            this.o00000(filterBypass);
            return;
        }
        int n3 = filterBypass.getDocument().getLength() - n2 + string.length();
        if (n3 > this.\u00d200000.getComboBoxLength(this.\u00d300000)) {
            throw new BadLocationException("New characters exceeds max size of document", n);
        }
        filterBypass.replace(n, n2, string, attributeSet);
        this.o00000(filterBypass);
    }

    private void o00000(DocumentFilter.FilterBypass filterBypass) throws BadLocationException {
        String string = filterBypass.getDocument().getText(0, filterBypass.getDocument().getLength());
        if (!this.o00000.isDisableEvents()) {
            oooo_0.\u00f400000("Neuer eingebener String in ComboBox: " + string);
            System.out.println(string);
            this.\u00d200000.click(this.\u00d300000, string);
        }
    }
}

