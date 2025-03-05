/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.B;

import helden.framework.C.D;
import helden.framework.C.I;
import helden.framework.C.J;
import helden.framework.C.M;
import helden.framework.C.public;
import helden.framework.C.void;
import helden.framework.c.a.oooo_0;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class C
extends AbstractCellEditor
implements TableCellRenderer,
TableCellEditor {
    private Map<public, JButton> \u00d400000;
    private public \u00d300000;
    private ActionListener super;
    private Map<JButton, public> \u00d200000 = new HashMap<JButton, public>();

    public C(ActionListener actionListener) {
        this.\u00d400000 = new HashMap<public, JButton>();
        this.super = actionListener;
    }

    @Override
    public Object getCellEditorValue() {
        return this.\u00d300000;
    }

    public public o00000(JButton jButton) {
        return this.\u00d200000.get(jButton);
    }

    @Override
    public Component getTableCellEditorComponent(JTable jTable, Object object, boolean bl, int n, int n2) {
        this.\u00d300000 = (public)object;
        return this.\u00d400000.get(this.\u00d300000);
    }

    @Override
    public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
        public public_ = null;
        public_ = object == null ? (public)jTable.getValueAt(n, n2) : (public)object;
        JButton jButton = this.o00000(public_);
        return jButton;
    }

    private JButton o00000(public public_) {
        JButton jButton = this.\u00d400000.get(public_);
        if (jButton == null) {
            jButton = new JButton("senken");
            jButton.setName(public_.toString());
            if (public_ instanceof J) {
                J j2 = (J)public_;
                if (j2.O\u00d20000()) {
                    jButton.setText("-1 (Spezielle Erfahrung)");
                } else {
                    jButton.setText("-1");
                }
            } else if (public_ instanceof void && ((void)public_).O\u00d20000()) {
                jButton.setText("-1 (Spezielle Erfahrung)");
            } else if (public_ instanceof D && ((D)public_).\u00f5o0000() instanceof oooo_0) {
                jButton.setText("-1 (Spezielle Erfahrung)");
            } else {
                jButton.setText("abbauen");
            }
            if (public_.equals(I.whilenewsuper)) {
                jButton.setText("Geld zur\u00fcckzahlen");
            }
            if (public_ instanceof M) {
                jButton.setEnabled(false);
            }
            jButton.addActionListener(this.super);
            this.\u00d400000.put(public_, jButton);
            this.\u00d200000.put(jButton, public_);
            jButton.setEnabled(true);
        }
        return jButton;
    }
}

