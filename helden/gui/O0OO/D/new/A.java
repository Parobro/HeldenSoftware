/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.OoOO.voidsuper;
import helden.framework.held.a.oooo_1;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

public class A
extends G {
    private int Oo0000;

    public A(new new_, int n) {
        super(new_);
        this.Oo0000 = n;
        this.interfacesuper();
        this.o\u00d20000();
        this.\u00d600000();
    }

    @Override
    public String Object() {
        switch (this.Oo0000) {
            case 0: {
                return "Haarfarbe";
            }
            case 1: {
                return "Augenfarbe";
            }
        }
        return "Unbekannt";
    }

    public new O\u00d20000() {
        return (new)super.\u00d200000();
    }

    public void o\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 0;
            }

            @Override
            public Integer getWeightY() {
                return 0;
            }
        };
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Neuer Eintrag");
        jButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                A.this.O\u00d20000().String(A.this.Oo0000).add(new oooo_1("Missing", 1, 0));
                A.this.\u00d500000();
            }
        });
        jPanel.add(jButton);
        tabellenDefinition.setPanel(jPanel);
        this.o00000(1, tabellenDefinition);
    }

    private void interfacesuper() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return A.this.O\u00d20000().String(A.this.Oo0000).size();
            }

            @Override
            public Integer getWeightY() {
                return 6;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 100, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public Object getData(int n) {
                return A.this.O\u00d20000().String(A.this.Oo0000).get(n);
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                return SpaltenDefinition.ART.\u00f500000;
            }

            @Override
            public String getText(int n) {
                return A.this.O\u00d20000().String(A.this.Oo0000).get(n).String();
            }

            @Override
            public void setText(Object object, String string) {
                ((oooo_1)object).o00000(string);
            }
        });
        arrayList.add(new SpaltenDefinition("Wert", 20, true, Integer.class, SpaltenDefinition.ART.\u00f800000){

            @Override
            public void changed(Object object, int n) {
                ((oooo_1)object).o00000(n);
                A.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return A.this.O\u00d20000().String(A.this.Oo0000).get(n);
            }

            @Override
            public int getMax(Object object) {
                return 20;
            }

            @Override
            public int getMin(Object object) {
                return 1;
            }

            @Override
            public int getValue(Object object) {
                return ((oooo_1)object).\u00d300000();
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                A.this.O\u00d20000().String(A.this.Oo0000).remove(object);
                A.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return A.this.O\u00d20000().String(A.this.Oo0000).get(n);
            }
        });
        this.o00000(0, tabellenDefinition);
    }
}

