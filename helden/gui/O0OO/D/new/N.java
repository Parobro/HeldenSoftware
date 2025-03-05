/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.OoOO.voidsuper;
import helden.gui.O0OO.A.String;
import helden.gui.O0OO.A.class;
import helden.gui.O0OO.A.oOOO;
import helden.gui.O0OO.D.A.B;
import helden.gui.O0OO.D.A.C;
import helden.gui.O0OO.D.o0OO;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenDialog;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class N
extends o0OO {
    private JPanel new = new JPanel();
    private JPanel \u00d500000;
    private JPanel \u00d300000;
    private JButton return;
    private JButton \u00d400000;

    public N(final new new_) {
        super(new_);
        this.new.setLayout(new BorderLayout());
        this.\u00d300000 = new JPanel();
        this.\u00d300000.setLayout(new GridBagLayout());
        this.\u00d500000 = new JPanel();
        this.\u00d500000.setLayout(new BorderLayout());
        final ZweiTabellenDialog zweiTabellenDialog = new ZweiTabellenDialog();
        final TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return N.this.\u00d400000().\u00f5\u00d20000().size();
            }

            @Override
            public void setSelectedRow(int n) {
                o0OO o0OO2 = null;
                if (n < N.this.\u00d400000().\u00f5\u00d20000().size()) {
                    helden.gui.O0OO.A.B b = N.this.\u00d400000().\u00f5\u00d20000().get(n);
                    if (b instanceof oOOO) {
                        o0OO2 = new helden.gui.O0OO.D.A.String(new_, (oOOO)b);
                    }
                    if (b instanceof class) {
                        o0OO2 = new B(new_, (class)b, 0);
                    }
                    if (b instanceof helden.gui.O0OO.A.C) {
                        o0OO2 = new C(new_, (helden.gui.O0OO.A.C)b);
                    }
                    if (b instanceof String) {
                        o0OO2 = new helden.gui.O0OO.D.A.oOOO(new_, (String)b);
                    }
                }
                N.this.\u00d500000.removeAll();
                if (o0OO2 != null) {
                    N.this.\u00d500000.add(o0OO2.o00000());
                } else {
                    N.this.\u00d500000.add(new JPanel());
                }
                N.this.new.revalidate();
            }
        };
        tabellenDefinition.setTabname("Probleme:");
        tabellenDefinition.setHideWennLeer(false);
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Auswahlen: ", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                return N.this.\u00d400000().\u00f5\u00d20000().get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 26, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                N.this.\u00d400000().\u00f5\u00d20000().remove(object);
                zweiTabellenDialog.update(false);
                tabellenDefinition.setSelectedRow(0);
            }

            @Override
            public Object getData(int n) {
                return N.this.\u00d400000().\u00f5\u00d20000().get(n);
            }
        });
        ArrayList[] arrayListArray = new ArrayList[5];
        ArrayList<1> arrayList2 = new ArrayList<1>();
        arrayList2.add(tabellenDefinition);
        arrayListArray[0] = arrayList2;
        zweiTabellenDialog.setup(arrayListArray);
        zweiTabellenDialog.update(false);
        this.\u00d300000.add((Component)zweiTabellenDialog, this.o00000(0, 1));
        this.return = new JButton("Neue TalentAuswahl");
        this.\u00d300000.add((Component)this.return, this.o00000(0, 2));
        this.return.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new_.\u00f5\u00d20000().add(new oOOO());
                zweiTabellenDialog.update(false);
            }
        });
        this.\u00d400000 = new JButton("Neue AllgemeineAuswahl");
        this.\u00d300000.add((Component)this.\u00d400000, this.o00000(0, 5));
        this.\u00d400000.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new_.\u00f5\u00d20000().add(new String());
                zweiTabellenDialog.update(false);
            }
        });
        JSplitPane jSplitPane = new JSplitPane(1, this.\u00d300000, this.\u00d500000);
        jSplitPane.setDividerLocation(200);
        this.new.add((Component)jSplitPane, "Center");
    }

    @Override
    public java.lang.String Object() {
        return "Auswahlen";
    }

    @Override
    public JPanel o00000() {
        return this.new;
    }

    public new \u00d400000() {
        return (new)super.\u00d200000();
    }

    private GridBagConstraints o00000(int n, int n2) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridy = n2;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.gridx = n;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        return gridBagConstraints;
    }
}

