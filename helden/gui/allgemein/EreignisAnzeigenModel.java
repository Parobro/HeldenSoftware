/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import helden.framework.A.A;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import java.text.SimpleDateFormat;
import javax.swing.table.AbstractTableModel;

public class EreignisAnzeigenModel
extends AbstractTableModel {
    private OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o00000;

    public EreignisAnzeigenModel(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this.o00000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
    }

    @Override
    public Class<?> getColumnClass(int n) {
        return super.getColumnClass(n);
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int n) {
        switch (n) {
            case 0: {
                return "Name";
            }
            case 1: {
                return "";
            }
            case 2: {
                return "";
            }
            case 3: {
                return "AP";
            }
            case 4: {
                return "\u00c4nderung";
            }
            case 5: {
                return "Kommentar";
            }
            case 6: {
                return "Datum";
            }
        }
        return "";
    }

    @Override
    public int getRowCount() {
        return this.o00000.\u00d8O0000().size();
    }

    @Override
    public Object getValueAt(int n, int n2) {
        A a2 = this.o00000.\u00d8O0000().get(n);
        switch (n2) {
            case 0: {
                return a2.\u00d3O0000();
            }
            case 1: {
                return a2.\u00d2O0000();
            }
            case 2: {
                return a2.\u00d600000();
            }
            case 3: {
                return a2.o00000();
            }
            case 4: {
                StringBuffer stringBuffer = new StringBuffer("");
                if (a2.\u00d5O0000() != 0) {
                    stringBuffer.append("AsP: ").append(a2.\u00d5O0000()).append(", ");
                }
                if (a2.\u00d200000() != 0) {
                    stringBuffer.append("KeP: ").append(a2.\u00d200000()).append(", ");
                }
                if (a2.oO0000() != 0) {
                    stringBuffer.append("LeP: ").append(a2.oO0000()).append(", ");
                }
                if (!a2.\u00f800000().equals("")) {
                    stringBuffer.append(a2.\u00f800000()).append(" => ");
                }
                if (!a2.\u00f600000().equals("")) {
                    stringBuffer.append(a2.\u00f600000());
                }
                if (stringBuffer.toString().endsWith(", ")) {
                    stringBuffer.delete(stringBuffer.length() - 2, stringBuffer.length() - 1);
                }
                return stringBuffer.toString();
            }
            case 5: {
                return a2.private();
            }
            case 6: {
                if (a2.\u00d800000().getTime() == 0L) {
                    return "";
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yy");
                return simpleDateFormat.format(a2.\u00d800000());
            }
        }
        throw new IllegalArgumentException("Zu viele Zeilen");
    }

    @Override
    public boolean isCellEditable(int n, int n2) {
        return false;
    }
}

