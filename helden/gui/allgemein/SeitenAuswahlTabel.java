/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.Einstellungen;
import helden.gui.A;
import helden.gui.allgemein.SeitenTableModel;
import helden.gui.oooo_1;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class SeitenAuswahlTabel
extends JTable {
    public SeitenAuswahlTabel(A a2, boolean bl) {
        this.zeigeSeitenInTabelle(a2, bl);
    }

    public SeitenTableModel getSeitenTableModel() {
        return (SeitenTableModel)this.getModel();
    }

    public void zeigeSeitenInTabelle(A a2, boolean bl) {
        this.setRowHeight(oooo_1.o00000(20));
        File file = new File(Einstellungen.getInstance().getPfade().getPfad("hintergruende"));
        File[] fileArray = new File[]{};
        if (file.exists() && file.isDirectory()) {
            fileArray = file.listFiles();
        } else {
            if (file != null) {
                file = file.getParentFile();
            }
            if (file != null) {
                fileArray = file.listFiles();
            }
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("KEIN HINTERGRUND");
        if (fileArray != null) {
            for (File file2 : fileArray) {
                String[] stringArray;
                if (!file2.isDirectory() || (stringArray = file2.list()) == null) continue;
                boolean tableColumn = false;
                for (String string : stringArray) {
                    if (string.equals("hskb1.JPG") || string.equals("hskb1.jpg")) {
                        tableColumn = true;
                    }
                    if (string.equals("hshb1.JPG") || string.equals("hshb1.jpg")) {
                        tableColumn = true;
                    }
                    if (string.equals("hshb2.JPG") || string.equals("hshb2.jpg")) {
                        tableColumn = true;
                    }
                    if (string.equals("hshb3.JPG") || string.equals("hshb3.jpg")) {
                        tableColumn = true;
                    }
                    if (string.equals("hshb4.JPG") || string.equals("hshb4.jpg")) {
                        tableColumn = true;
                    }
                    if (string.equals("hsnb1.JPG") || string.equals("hsnb1.jpg")) {
                        tableColumn = true;
                    }
                    if (string.equals("hsnd1.JPG") || string.equals("hsnd1.jpg")) {
                        tableColumn = true;
                    }
                    if (string.equals("hszd1.JPG") || string.equals("hszd1.jpg")) {
                        tableColumn = true;
                    }
                    if (!string.equals("hszd2.JPG") && !string.equals("hszd2.jpg")) continue;
                    tableColumn = true;
                }
                if (!tableColumn) continue;
                arrayList.add(file2.getName());
            }
        }
        JComboBox<Object> jComboBox = new JComboBox<Object>(arrayList.toArray());
        JComboBox jComboBox2 = new JComboBox();
        DefaultComboBoxModel<String> defaultComboBoxModel = new DefaultComboBoxModel<String>();
        defaultComboBoxModel.addElement("20");
        defaultComboBoxModel.addElement("15");
        jComboBox2.setModel(defaultComboBoxModel);
        TableColumnModel tableColumnModel = this.getColumnModel();
        block19: for (int i2 = 0; i2 < 15; ++i2) {
            TableColumn tableColumn = tableColumnModel.getColumn(i2);
            switch (i2) {
                case 0: {
                    tableColumn.setPreferredWidth(150);
                    continue block19;
                }
                case 1: {
                    tableColumn.setPreferredWidth(20);
                    continue block19;
                }
                case 2: {
                    tableColumn.setPreferredWidth(20);
                    continue block19;
                }
                case 3: {
                    tableColumn.setPreferredWidth(20);
                    continue block19;
                }
                case 4: {
                    tableColumn.setPreferredWidth(20);
                    continue block19;
                }
                case 5: {
                    tableColumn.setPreferredWidth(20);
                    continue block19;
                }
                case 6: {
                    tableColumn.setPreferredWidth(20);
                    continue block19;
                }
                case 7: {
                    tableColumn.setPreferredWidth(20);
                    continue block19;
                }
                case 8: {
                    tableColumn.setPreferredWidth(20);
                    continue block19;
                }
                case 9: {
                    tableColumn.setPreferredWidth(20);
                    continue block19;
                }
                case 10: {
                    tableColumn.setPreferredWidth(30);
                    continue block19;
                }
                case 11: {
                    tableColumn.setPreferredWidth(30);
                    continue block19;
                }
                case 12: {
                    tableColumn.setPreferredWidth(30);
                    continue block19;
                }
                case 13: {
                    tableColumn.setPreferredWidth(40);
                    tableColumn.setCellEditor(new DefaultCellEditor(jComboBox2));
                    continue block19;
                }
                case 14: {
                    tableColumn.setPreferredWidth(150);
                    tableColumn.setCellEditor(new DefaultCellEditor(jComboBox));
                    continue block19;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 15 Spalten.");
                }
            }
        }
    }
}

