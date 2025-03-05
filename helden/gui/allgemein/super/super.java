/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  helden.gui.allgemein.super.super$_o0
 *  helden.gui.allgemein.super.super$_oo
 */
package helden.gui.allgemein.super;

import helden.gui.allgemein.super.super;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Exception performing whole class analysis ignored.
 */
public class super
extends AbstractTableModel {
    public static final int \u00d600000 = -1;
    public static final int \u00d200000 = 0;
    public static final int OO0000 = 1;
    private static _o0_0 \u00f500000 = new _o0(-1, 0, null);
    public static final Comparator<Object> \u00d500000 = new Comparator<Object>(){

        @Override
        public int compare(Object object, Object object2) {
            return ((Comparable)object).compareTo(object2);
        }
    };
    public static final Comparator<Object> Object = new Comparator<Object>(){

        @Override
        public int compare(Object object, Object object2) {
            return object.toString().compareTo(object2.toString());
        }
    };
    protected TableModel oO0000;
    private _Oo[] void;
    private int[] o00000;
    private JTableHeader \u00f600000;
    private MouseListener \u00d2O0000;
    private TableModelListener \u00d400000;
    private Map<Class<?>, Comparator<Object>> \u00f400000 = new HashMap();
    private List<_o0_0> float = new ArrayList<_o0_0>();

    public super() {
        this.\u00d2O0000 = new _oo(this, null);
        this.\u00d400000 = new _OOo();
    }

    public super(TableModel tableModel) {
        this();
        this.super(tableModel);
    }

    public super(TableModel tableModel, JTableHeader jTableHeader) {
        this();
        this.super(jTableHeader);
        this.super(tableModel);
    }

    @Override
    public Class<?> getColumnClass(int n) {
        return this.oO0000.getColumnClass(n);
    }

    @Override
    public int getColumnCount() {
        if (this.oO0000 == null) {
            return 0;
        }
        return this.oO0000.getColumnCount();
    }

    @Override
    public String getColumnName(int n) {
        return this.oO0000.getColumnName(n);
    }

    @Override
    public int getRowCount() {
        if (this.oO0000 == null) {
            return 0;
        }
        return this.oO0000.getRowCount();
    }

    public int \u00d200000(int n) {
        return _o0.new((_o0_0)this.super(n));
    }

    public JTableHeader \u00d300000() {
        return this.\u00f600000;
    }

    public TableModel \u00d600000() {
        return this.oO0000;
    }

    @Override
    public Object getValueAt(int n, int n2) {
        return this.oO0000.getValueAt(this.\u00d300000(n), n2);
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        return this.oO0000.isCellEditable(this.\u00d300000(n), n2);
    }

    public boolean super() {
        return this.float.size() != 0;
    }

    public int \u00d300000(int n) {
        return _Oo.super(this.\u00d200000()[n]);
    }

    public void super(Class<?> clazz, Comparator<Object> comparator) {
        if (comparator == null) {
            this.\u00f400000.remove(clazz);
        } else {
            this.\u00f400000.put(clazz, comparator);
        }
    }

    public void \u00d200000(int n, int n2) {
        _o0_0 _o0_02 = this.super(n);
        if (_o0_02 != \u00f500000) {
            this.float.remove(_o0_02);
        }
        if (n2 != 0) {
            this.float.add((_o0_0)new _o0(n, n2, null));
        }
        this.\u00f400000();
    }

    public void super(JTableHeader jTableHeader) {
        TableCellRenderer tableCellRenderer;
        if (this.\u00f600000 != null) {
            this.\u00f600000.removeMouseListener(this.\u00d2O0000);
            tableCellRenderer = this.\u00f600000.getDefaultRenderer();
            if (tableCellRenderer instanceof _O0) {
                this.\u00f600000.setDefaultRenderer(tableCellRenderer);
            } else {
                this.\u00f600000.setDefaultRenderer(new _O0(this.\u00f600000.getDefaultRenderer()));
            }
        }
        this.\u00f600000 = jTableHeader;
        if (this.\u00f600000 != null) {
            this.\u00f600000.addMouseListener(this.\u00d2O0000);
            tableCellRenderer = this.\u00f600000.getDefaultRenderer();
            if (tableCellRenderer instanceof _O0) {
                this.\u00f600000.setDefaultRenderer(tableCellRenderer);
            } else {
                this.\u00f600000.setDefaultRenderer(new _O0(this.\u00f600000.getDefaultRenderer()));
            }
        }
    }

    public void super(TableModel tableModel) {
        if (this.oO0000 != null) {
            this.oO0000.removeTableModelListener(this.\u00d400000);
        }
        this.oO0000 = tableModel;
        if (this.oO0000 != null) {
            this.oO0000.addTableModelListener(this.\u00d400000);
        }
        this.class();
        this.fireTableStructureChanged();
    }

    @Override
    public void setValueAt(Object object, int n, int n2) {
        this.oO0000.setValueAt(object, this.\u00d300000(n), n2);
    }

    protected Comparator<Object> \u00d400000(int n) {
        Class<?> clazz = this.oO0000.getColumnClass(n);
        Comparator<Object> comparator = this.\u00f400000.get(clazz);
        if (comparator != null) {
            return comparator;
        }
        if (Comparable.class.isAssignableFrom(clazz)) {
            return \u00d500000;
        }
        return Object;
    }

    protected Icon super(int n, int n2) {
        _o0_0 _o0_02 = this.super(n);
        if (_o0_02 == \u00f500000) {
            return null;
        }
        return new _o(_o0.new((_o0_0)_o0_02) == -1, n2, this.float.indexOf(_o0_02));
    }

    private void \u00d800000() {
        this.float.clear();
        this.\u00f400000();
    }

    private void class() {
        this.void = null;
        this.o00000 = null;
    }

    private _o0_0 super(int n) {
        for (int i2 = 0; i2 < this.float.size(); ++i2) {
            _o0 _o02 = (_o0)this.float.get(i2);
            if (_o0.o00000((_o0_0)_o02) != n) continue;
            return _o02;
        }
        return \u00f500000;
    }

    private int[] \u00d400000() {
        int n = this.\u00d200000().length;
        this.o00000 = new int[n];
        for (int i2 = 0; i2 < n; ++i2) {
            this.o00000[this.\u00d300000((int)i2)] = i2;
        }
        return this.o00000;
    }

    private _Oo[] \u00d200000() {
        int n = this.oO0000.getRowCount();
        this.void = new _Oo[n];
        for (int i2 = 0; i2 < n; ++i2) {
            this.void[i2] = new _Oo(i2);
        }
        if (this.super()) {
            Arrays.sort(this.void);
        }
        return this.void;
    }

    private void \u00f400000() {
        this.class();
        this.fireTableDataChanged();
        if (this.\u00f600000 != null) {
            this.\u00f600000.repaint();
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    private class _OOo
    implements TableModelListener {
        private _OOo() {
        }

        @Override
        public void tableChanged(TableModelEvent tableModelEvent) {
            if (!super.this.super()) {
                super.this.class();
                super.this.fireTableChanged(tableModelEvent);
                return;
            }
            if (tableModelEvent.getFirstRow() == -1) {
                super.this.\u00d800000();
                super.this.fireTableChanged(tableModelEvent);
                return;
            }
            int n = tableModelEvent.getColumn();
            if (tableModelEvent.getFirstRow() == tableModelEvent.getLastRow() && n != -1 && super.this.\u00d200000(n) == 0 && super.this.o00000 != null) {
                int n2 = super.this.\u00d400000()[tableModelEvent.getFirstRow()];
                super.this.fireTableChanged(new TableModelEvent(super.this, n2, n2, n, tableModelEvent.getType()));
                return;
            }
            super.this.class();
            super.this.fireTableDataChanged();
        }
    }

    private class _O0
    implements TableCellRenderer {
        private TableCellRenderer \u00d200000;

        public _O0(TableCellRenderer tableCellRenderer) {
            this.\u00d200000 = tableCellRenderer;
        }

        @Override
        public Component getTableCellRendererComponent(JTable jTable, Object object, boolean bl, boolean bl2, int n, int n2) {
            Component component = this.\u00d200000.getTableCellRendererComponent(jTable, object, bl, bl2, n, n2);
            if (component instanceof JLabel) {
                JLabel jLabel = (JLabel)component;
                jLabel.setHorizontalTextPosition(2);
                int n3 = jTable.convertColumnIndexToModel(n2);
                jLabel.setIcon(super.this.super(n3, jLabel.getFont().getSize()));
            }
            return component;
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     * Exception performing whole class analysis ignored.
     */
    private class _Oo
    implements Comparable<Object> {
        private int new;

        public _Oo(int n) {
            this.new = n;
        }

        @Override
        public int compareTo(Object object) {
            int n = this.new;
            int n2 = ((_Oo)object).new;
            for (_o0 _o02 : super.this.float) {
                int n3 = _o0.o00000((_o0_0)_o02);
                Object object2 = super.this.oO0000.getValueAt(n, n3);
                Object object3 = super.this.oO0000.getValueAt(n2, n3);
                int n4 = 0;
                n4 = object2 == null && object3 == null ? 0 : (object2 == null ? -1 : (object3 == null ? 1 : super.this.\u00d400000(n3).compare(object2, object3)));
                if (n4 == 0) continue;
                if (_o0.new((_o0_0)_o02) == -1) {
                    return -n4;
                }
                return n4;
            }
            return 0;
        }

        static /* synthetic */ int super(_Oo _Oo2) {
            return _Oo2.new;
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    private static class _o
    implements Icon {
        private boolean \u00d300000;
        private int \u00d200000;
        private int super;

        public _o(boolean bl, int n, int n2) {
            this.\u00d300000 = bl;
            this.\u00d200000 = n;
            this.super = n2;
        }

        @Override
        public int getIconHeight() {
            return this.\u00d200000;
        }

        @Override
        public int getIconWidth() {
            return this.\u00d200000;
        }

        @Override
        public void paintIcon(Component component, Graphics graphics, int n, int n2) {
            Color color = Color.GRAY;
            if (component != null) {
                color = component.getBackground();
            }
            int n3 = (int)((double)(this.\u00d200000 / 2) * Math.pow(0.8, this.super));
            int n4 = -n3;
            if (this.\u00d300000) {
                n4 = n3;
            }
            n2 = this.\u00d300000 ? n2 + 5 * this.\u00d200000 / 6 - n4 : n2 + 5 * this.\u00d200000 / 6 + 0;
            int n5 = -1;
            if (this.\u00d300000) {
                n5 = 1;
            }
            graphics.translate(n, n2);
            graphics.setColor(color.darker());
            graphics.drawLine(n3 / 2, n4, 0, 0);
            graphics.drawLine(n3 / 2, n4 + n5, 0, n5);
            graphics.setColor(color.brighter());
            graphics.drawLine(n3 / 2, n4, n3, 0);
            graphics.drawLine(n3 / 2, n4 + n5, n3, n5);
            if (this.\u00d300000) {
                graphics.setColor(color.darker().darker());
            } else {
                graphics.setColor(color.brighter().brighter());
            }
            graphics.drawLine(n3, 0, 0, 0);
            graphics.setColor(color);
            graphics.translate(-n, -n2);
        }
    }
}

