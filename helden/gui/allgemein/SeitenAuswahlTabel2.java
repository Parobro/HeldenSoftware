/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.Einstellungen;
import helden.gui.A;
import helden.gui.allgemein.SeitenTableModel2;
import helden.gui.oooo_1;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class SeitenAuswahlTabel2
extends JTable {
    public SeitenAuswahlTabel2(A a2) {
        this.zeigeSeitenInTabelle(a2);
    }

    public SeitenTableModel2 getSeitenTableModel() {
        return (SeitenTableModel2)this.getModel();
    }

    public void zeigeSeitenInTabelle(A a2) {
        int n;
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
            File[] object = fileArray;
            int tableColumnModel = object.length;
            for (n = 0; n < tableColumnModel; ++n) {
                String[] stringArray;
                File file2 = object[n];
                if (!file2.isDirectory() || (stringArray = file2.list()) == null) continue;
                boolean bl = false;
                for (String string : stringArray) {
                    if (string.equals("hskb1.JPG") || string.equals("hskb1.jpg")) {
                        bl = true;
                    }
                    if (string.equals("hshb1.JPG") || string.equals("hshb1.jpg")) {
                        bl = true;
                    }
                    if (string.equals("hshb2.JPG") || string.equals("hshb2.jpg")) {
                        bl = true;
                    }
                    if (string.equals("hshb3.JPG") || string.equals("hshb3.jpg")) {
                        bl = true;
                    }
                    if (string.equals("hshb4.JPG") || string.equals("hshb4.jpg")) {
                        bl = true;
                    }
                    if (string.equals("hsnb1.JPG") || string.equals("hsnb1.jpg")) {
                        bl = true;
                    }
                    if (string.equals("hsnd1.JPG") || string.equals("hsnd1.jpg")) {
                        bl = true;
                    }
                    if (string.equals("hszd1.JPG") || string.equals("hszd1.jpg")) {
                        bl = true;
                    }
                    if (!string.equals("hszd2.JPG") && !string.equals("hszd2.jpg")) continue;
                    bl = true;
                }
                if (!bl) continue;
                arrayList.add(file2.getName());
            }
        }
        JComboBox<Object> jComboBox = new JComboBox<Object>(arrayList.toArray());
        TableColumnModel tableColumnModel = this.getColumnModel();
        block15: for (n = 0; n < 11; ++n) {
            TableColumn tableColumn = tableColumnModel.getColumn(n);
            switch (n) {
                case 0: {
                    tableColumn.setPreferredWidth(150);
                    continue block15;
                }
                case 1: {
                    tableColumn.setPreferredWidth(20);
                    continue block15;
                }
                case 2: {
                    tableColumn.setPreferredWidth(20);
                    continue block15;
                }
                case 3: {
                    tableColumn.setPreferredWidth(20);
                    continue block15;
                }
                case 4: {
                    tableColumn.setPreferredWidth(20);
                    continue block15;
                }
                case 5: {
                    tableColumn.setPreferredWidth(20);
                    continue block15;
                }
                case 6: {
                    tableColumn.setPreferredWidth(20);
                    continue block15;
                }
                case 7: {
                    tableColumn.setPreferredWidth(20);
                    continue block15;
                }
                case 8: {
                    tableColumn.setPreferredWidth(20);
                    continue block15;
                }
                case 9: {
                    tableColumn.setPreferredWidth(20);
                    continue block15;
                }
                case 10: {
                    tableColumn.setPreferredWidth(150);
                    tableColumn.setCellEditor(new DefaultCellEditor(jComboBox));
                    continue block15;
                }
                default: {
                    throw new IllegalArgumentException("Es gibt nur 10 Spalten.");
                }
            }
        }
    }
}

