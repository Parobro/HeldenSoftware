/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.G;

import helden.framework.held.Object.O0OO;
import helden.framework.oooo.b_0;
import helden.gui.G.E;
import helden.gui.G.interfacesuper;
import helden.gui.components.JScrollPaneFast;
import helden.gui.g.oooo_2;
import helden.gui.oooo_1;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class OOoO
extends JPanel {
    private ChangeListener \u00d200000;
    private O0OO \u00d500000;
    private ArrayList<b_0> \u00d400000;
    private JTable Object;
    private E o00000;

    public OOoO(ChangeListener changeListener, O0OO o0OO2, ArrayList<b_0> arrayList) {
        this.\u00d400000 = arrayList;
        this.\u00d500000 = o0OO2;
        this.\u00d200000 = changeListener;
        this.setName("Eigenschaften-Panel");
        this.setLayout(new BorderLayout());
        this.add((Component)this.o00000(), "Center");
        this.add((Component)new JLabel("<html>In der ersten Spalte sind die Startwerte einzutragen!<br>Die Spalte \"gekauft/gesteigert\" ist so einzustellen, dass der Wert<br> in der Spalte \"Akuteller Wert\" dem aktuellen Wert entspricht!"), "South");
    }

    public JSpinner o00000(String string) {
        return this.o00000.new(string);
    }

    public String o00000(JSpinner jSpinner) {
        return this.o00000.o00000(jSpinner);
    }

    public JTable new() {
        if (this.Object == null) {
            this.Object = new JTable();
        }
        return this.Object;
    }

    private JScrollPaneFast o00000() {
        JScrollPaneFast jScrollPaneFast = new JScrollPaneFast();
        this.new().setModel(new oooo_2(this.\u00d500000, this.\u00d400000));
        this.new().setRowHeight(oooo_1.o00000(25));
        this.new().setIntercellSpacing(new Dimension(4, 4));
        TableColumnModel tableColumnModel = this.new().getColumnModel();
        this.o00000 = new E(this.\u00d200000);
        block4: for (int i2 = 0; i2 < tableColumnModel.getColumnCount(); ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            tableColumn.setHeaderRenderer(new interfacesuper());
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(300);
                    continue block4;
                }
                case 2: {
                    tableColumn.setPreferredWidth(20);
                    continue block4;
                }
                default: {
                    tableColumn.setPreferredWidth(200);
                    tableColumn.setCellRenderer(this.o00000);
                    tableColumn.setCellEditor(this.o00000);
                }
            }
        }
        jScrollPaneFast.setViewportView(this.new());
        return jScrollPaneFast;
    }
}

