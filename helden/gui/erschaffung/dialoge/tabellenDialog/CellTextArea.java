/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class CellTextArea
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<Object, JPanel> \u00d400000 = new HashMap<Object, JPanel>();
    private Map<JPanel, Object> \u00d300000 = new HashMap<JPanel, Object>();
    private Object super;
    private JTable \u00d200000;

    public CellTextArea(JTable jTable, SpaltenDefinition spaltenDefinition) {
        this.\u00d200000 = jTable;
    }

    public void check() {
    }

    public JPanel getButton(Object object, String string) {
        JTextArea jTextArea;
        if (object == null) {
            return null;
        }
        JPanel jPanel = this.\u00d400000.get(object);
        if (jPanel == null) {
            jTextArea = new JTextArea(string);
            jTextArea.setLineWrap(true);
            jTextArea.setWrapStyleWord(true);
            jTextArea.setOpaque(true);
            jTextArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
            jPanel = new JPanel();
            jPanel.setLayout(new BorderLayout());
            jPanel.add((Component)jTextArea, "Center");
            this.\u00d400000.put(object, jPanel);
        }
        if (!(jTextArea = (JTextArea)jPanel.getComponent(0)).getText().equals(string)) {
            jTextArea.setText(string);
            jPanel.revalidate();
        }
        return jPanel;
    }

    @Override
    public Object getCellEditorValue() {
        return this.super;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.super = object;
        return this.\u00d400000.get(this.super);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        JPanel jPanel = this.getButton(new Integer(n), object.toString());
        int n3 = Math.max(40, (int)jPanel.getPreferredSize().getHeight());
        if (n3 != jTable.getRowHeight(n)) {
            this.\u00d200000.setRowHeight(n, n3);
        }
        return jPanel;
    }

    public Object getTalent(JButton jButton) {
        return this.\u00d300000.get(jButton);
    }

    public void setController(SpaltenDefinition spaltenDefinition) {
    }
}

