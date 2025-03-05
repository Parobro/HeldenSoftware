/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.erschaffung.dialoge.tabellenDialog;

import helden.framework.D.Q;
import helden.framework.OooO.C;
import helden.framework.held.object.oooo_0;
import helden.gui.erschaffung.dialoge.tabellenDialog.DarstellungAuswahlSonderfertigkeiten;
import helden.gui.erschaffung.dialoge.tabellenDialog.ExtJComboBox;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class CellComboBox
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<Object, ExtJComboBox> \u00d400000 = new HashMap<Object, ExtJComboBox>();
    private Map<ExtJComboBox, Object> Object = new HashMap<ExtJComboBox, Object>();
    private Object o00000;
    private SpaltenDefinition \u00d200000;

    public static void fillCombobox(SpaltenDefinition spaltenDefinition, Object object, ExtJComboBox extJComboBox) {
        int n = 0;
        int n2 = 0;
        int n3 = extJComboBox.getSelectedIndex();
        ArrayList<DarstellungAuswahlSonderfertigkeiten> arrayList = new ArrayList<DarstellungAuswahlSonderfertigkeiten>();
        List<Object> list = spaltenDefinition.getItems(object);
        if (list == null) {
            oooo_0.\u00f500000("getItems == null f\u00fcr " + object + " " + extJComboBox.getName());
            return;
        }
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        arrayList2.addAll(list);
        if (!arrayList2.contains(spaltenDefinition.selectedItem(object)) && spaltenDefinition.selectedItem(object) != null) {
            arrayList2.add(spaltenDefinition.selectedItem(object));
        }
        C.o00000(arrayList2);
        Object object2 = spaltenDefinition.selectedItem(object);
        ActionListener[] actionListenerArray = arrayList2.iterator();
        while (actionListenerArray.hasNext()) {
            Object object3 = actionListenerArray.next();
            if (object3 == null) {
                oooo_0.\u00f500000("o==null f\u00fcr " + object);
                continue;
            }
            if (object3.equals(object2)) {
                n2 = n;
            }
            if (object3 instanceof Q) {
                Q q = (Q)object3;
                arrayList.add(new DarstellungAuswahlSonderfertigkeiten(q));
            } else {
                arrayList.add((DarstellungAuswahlSonderfertigkeiten)object3);
            }
            ++n;
        }
        if (extJComboBox.getItemCount() != arrayList.size() || n3 != n2) {
            extJComboBox.setDisableEvents(true);
            ActionListener[] actionListenerArray2 = actionListenerArray = extJComboBox.getActionListeners();
            int n4 = actionListenerArray2.length;
            for (int i2 = 0; i2 < n4; ++i2) {
                ActionListener actionListener = actionListenerArray2[i2];
                extJComboBox.removeActionListener(actionListener);
            }
            if (extJComboBox.getItemCount() != arrayList.size()) {
                extJComboBox.removeAllItems();
                for (Object e : arrayList) {
                    extJComboBox.addItem(e);
                }
            }
            if (n3 != -1 && n3 != n2 && n2 < extJComboBox.getItemCount()) {
                extJComboBox.setSelectedIndex(n2);
            }
            for (ActionListener actionListener : actionListenerArray) {
                extJComboBox.addActionListener(actionListener);
            }
            extJComboBox.setDisableEvents(false);
            if (n3 == -1 && arrayList.size() > 0) {
                extJComboBox.setSelectedIndex(n2);
                spaltenDefinition.click(object, extJComboBox.getItemAt(n2));
            }
        }
    }

    public CellComboBox(SpaltenDefinition spaltenDefinition) {
        this.\u00d200000 = spaltenDefinition;
    }

    public void check() {
        for (Map.Entry<Object, ExtJComboBox> entry : this.\u00d400000.entrySet()) {
            ExtJComboBox extJComboBox = entry.getValue();
            CellComboBox.fillCombobox(this.\u00d200000, entry.getKey(), extJComboBox);
        }
    }

    public JComboBox getButton(Object object) {
        if (object == null) {
            return null;
        }
        ExtJComboBox extJComboBox = this.\u00d400000.get(object);
        if (extJComboBox == null) {
            extJComboBox = new ExtJComboBox(this.\u00d200000, object);
            CellComboBox.fillCombobox(this.\u00d200000, object, extJComboBox);
            extJComboBox.setName(object.toString());
            extJComboBox.addActionListener(this.\u00d200000);
            this.\u00d400000.put(object, extJComboBox);
            this.Object.put(extJComboBox, object);
        }
        return extJComboBox;
    }

    @Override
    public Object getCellEditorValue() {
        return this.o00000;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.o00000 = object;
        return this.\u00d400000.get(this.o00000);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        Object object2 = object;
        return this.getButton(object2);
    }

    public Object getTalent(JButton jButton) {
        return this.Object.get(jButton);
    }

    public void setController(SpaltenDefinition spaltenDefinition) {
        this.\u00d200000 = spaltenDefinition;
    }
}

