/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D;

import helden.gui.O0OO.D.o0OO;
import helden.gui.O0OO.ooOO.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenDialog;
import java.util.ArrayList;
import javax.swing.JPanel;

public class G
extends o0OO {
    private ArrayList<TabellenDefinition>[] \u00d800000 = new ArrayList[5];
    private ZweiTabellenDialog \u00f400000;

    public G(O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        super(o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
    }

    public void \u00d600000() {
        this.\u00f400000 = new ZweiTabellenDialog(this.\u00d800000);
    }

    @Override
    public JPanel o00000() {
        return this.\u00f400000;
    }

    public void o00000(ArrayList<TabellenDefinition> arrayList) {
        this.o00000(0, arrayList);
    }

    public void o00000(TabellenDefinition tabellenDefinition) {
        this.o00000(0, tabellenDefinition);
    }

    public void \u00d200000(TabellenDefinition tabellenDefinition) {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        arrayList.add(tabellenDefinition);
        this.\u00d800000[1] = arrayList;
    }

    public void o00000(int n, ArrayList<TabellenDefinition> arrayList) {
        this.\u00d800000[n] = arrayList;
    }

    public void o00000(int n, TabellenDefinition tabellenDefinition) {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        arrayList.add(tabellenDefinition);
        this.o00000(n, arrayList);
    }

    public void \u00d500000() {
        this.\u00f400000.update(false);
        this.\u00f400000.validate();
    }
}

