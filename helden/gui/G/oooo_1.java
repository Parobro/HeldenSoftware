/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.g;

import helden.framework.held.Object.O0OO;
import helden.framework.int.OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.G.D;
import helden.gui.g.o0oo_0;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.event.ListSelectionListener;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.G.OooO
 */
public abstract class oooo_1<T>
extends D
implements ItemListener {
    private o0oo_0 \u00d3O0000 = new o0oo_0();
    private ArrayList<T> while = this.super(false);
    private String \u00d4O0000 = "Nur m\u00f6gliche";
    private boolean oO0000 = true;

    public oooo_1(O0OO o0OO2, boolean bl) {
        super(o0OO2);
        if (bl) {
            this.\u00f600000();
        }
        this.\u00f400000();
    }

    @Override
    public String \u00d200000() {
        return "W\u00e4hle eine Rasse";
    }

    @Override
    public JPanel super() {
        return this.\u00d3O0000;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        String string;
        JComponent jComponent;
        if (itemEvent.getSource() instanceof JToggleButton && (jComponent = (JToggleButton)itemEvent.getSource()).getName().equals("alphabetisch")) {
            this.oO0000 = ((AbstractButton)jComponent).isSelected();
            this.\u00f400000();
        }
        if (itemEvent.getSource() instanceof JComboBox && (string = ((JComboBox)(jComponent = (JComboBox)itemEvent.getSource())).getSelectedItem().toString()) != this.\u00d4O0000) {
            this.\u00d4O0000 = string;
            this.while = this.int();
            this.\u00f400000();
        }
    }

    protected abstract ArrayList<T> \u00d800000();

    protected abstract ArrayList<T> super(boolean var1);

    protected o0oo_0 \u00f800000() {
        return this.\u00d3O0000;
    }

    protected Object OO0000() {
        return this.\u00d3O0000.\u00d200000().getSelectedValue();
    }

    protected void super(Object object) {
        this.\u00d3O0000.\u00d200000().setSelectedValue(object, true);
        if (!this.\u00d3O0000.\u00d200000().getSelectedValue().equals(object)) {
            DefaultListModel defaultListModel = (DefaultListModel)this.\u00d3O0000.\u00d200000().getModel();
            defaultListModel.addElement(object);
            this.\u00d3O0000.\u00d200000().setSelectedValue(object, true);
        }
    }

    protected void \u00f600000() {
    }

    private void super(JList jList, ListSelectionListener[] listSelectionListenerArray) {
        for (ListSelectionListener listSelectionListener : listSelectionListenerArray) {
            jList.removeListSelectionListener(listSelectionListener);
        }
    }

    private ArrayList<T> int() {
        if (this.\u00d4O0000 == "Alle") {
            return this.\u00d800000();
        }
        if (this.\u00d4O0000 == "Nur m\u00f6gliche") {
            return this.super(false);
        }
        if (this.\u00d4O0000 == "Nur \u00fcbliche") {
            return this.super(true);
        }
        throw new IllegalArgumentException("Falscher Filter : " + this.\u00d4O0000);
    }

    private void \u00d200000(JList jList, ListSelectionListener[] listSelectionListenerArray) {
        for (ListSelectionListener listSelectionListener : listSelectionListenerArray) {
            jList.addListSelectionListener(listSelectionListener);
        }
    }

    private void \u00f400000() {
        DefaultListModel<Object> defaultListModel = new DefaultListModel<Object>();
        List<Object> list = this.oO0000 ? OoOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.sortiereAlphabetisch(this.while) : this.while;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            defaultListModel.addElement(list.get(i2));
        }
        ListSelectionListener[] listSelectionListenerArray = this.\u00d3O0000.\u00d200000().getListSelectionListeners();
        this.super(this.\u00d3O0000.\u00d200000(), listSelectionListenerArray);
        this.\u00d3O0000.\u00d200000().setModel(defaultListModel);
        this.\u00d200000(this.\u00d3O0000.\u00d200000(), listSelectionListenerArray);
        this.\u00d3O0000.\u00d200000().setSelectedIndex(0);
    }
}

