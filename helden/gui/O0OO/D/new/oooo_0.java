/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.o0oo.d.new;

import helden.framework.OoOO.N;
import helden.framework.OoOO.voidsuper;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.ooOO.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.O0OO.D.new.ooOO
 */
public class oooo_0
extends G {
    private String oo0000 = "GP";
    private String nullsuper = "Name (m\u00e4nnlich)";
    private String \u00f5o0000 = "Name (weiblich)";
    private String forsuper = "Optionale Variante";
    private String \u00d4o0000 = "Veteran erlaubt";
    private String \u00f4o0000 = "Zeitaufwendig";
    private String \u00d8o0000 = "Magiedilletant erlaubt";
    private String privatesuper = "Muttersprache";
    private String \u00d5o0000 = "Schrift der Muttersprache";
    private ArrayList<String> \u00d3o0000 = new ArrayList();

    public oooo_0(new new_) {
        super(new_);
        this.\u00d3o0000.add(this.nullsuper);
        this.\u00d3o0000.add(this.\u00f5o0000);
        if (new_.oo0000()) {
            this.\u00d3o0000.add(this.forsuper);
        }
        this.\u00d3o0000.add(this.oo0000);
        if (new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.super)) {
            this.\u00d3o0000.add(this.\u00d4o0000);
            this.\u00d3o0000.add(this.\u00f4o0000);
            this.\u00d3o0000.add(this.\u00d8o0000);
        }
        if (new_.\u00d500000().equals((Object)O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO._o.\u00d300000)) {
            this.\u00d3o0000.add(this.privatesuper);
            this.\u00d3o0000.add(this.\u00d5o0000);
        }
        this.\u00d2\u00d20000();
        this.\u00d4\u00d20000();
        this.\u00d600000();
    }

    @Override
    public String Object() {
        return "Allgemeines";
    }

    public new Objectnew() {
        return (new)super.\u00d200000();
    }

    public void \u00d4\u00d20000() {
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
        jPanel.add(jButton);
        tabellenDefinition.setPanel(jPanel);
        this.o00000(1, tabellenDefinition);
    }

    private void \u00d2\u00d20000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return oooo_0.this.\u00d3o0000.size();
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return oooo_0.this.\u00d3o0000.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 100, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public void changed(Object object, int n) {
                oooo_0.this.Objectnew().\u00d300000(n);
            }

            @Override
            public void click(Object object, Object object2) {
                if (object.equals(oooo_0.this.privatesuper)) {
                    oooo_0.this.Objectnew().\u00d200000((voidsuper)object2);
                } else if (object.equals(oooo_0.this.\u00d5o0000)) {
                    oooo_0.this.Objectnew().o00000((voidsuper)object2);
                }
            }

            @Override
            public Object getData(int n) {
                return oooo_0.this.\u00d3o0000.get(n);
            }

            @Override
            public List<Object> getItems(Object object) {
                if (object.equals(oooo_0.this.privatesuper)) {
                    return N.floatsuper().Oo0000();
                }
                if (object.equals(oooo_0.this.\u00d5o0000)) {
                    return N.floatsuper().\u00d4o0000();
                }
                return null;
            }

            @Override
            public int getMax(Object object) {
                return 40;
            }

            @Override
            public int getMin(Object object) {
                return 0;
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                String string = (String)oooo_0.this.\u00d3o0000.get(n);
                if (string.equals(oooo_0.this.oo0000)) {
                    return SpaltenDefinition.ART.\u00f800000;
                }
                if (string.equals(oooo_0.this.nullsuper) || string.equals(oooo_0.this.\u00f5o0000)) {
                    return SpaltenDefinition.ART.\u00f500000;
                }
                if (string.equals(oooo_0.this.privatesuper) || string.equals(oooo_0.this.\u00d5o0000)) {
                    return SpaltenDefinition.ART.\u00d300000;
                }
                if (string.equals(oooo_0.this.\u00d4o0000) || string.equals(oooo_0.this.\u00d8o0000) || string.equals(oooo_0.this.\u00f4o0000) || string.equals(oooo_0.this.forsuper)) {
                    return SpaltenDefinition.ART.\u00f600000;
                }
                return super.getMultifunctionalArt(n);
            }

            @Override
            public boolean getSelected(Object object) {
                String string = object.toString();
                if (string.equals(oooo_0.this.\u00d4o0000)) {
                    return oooo_0.this.Objectnew().newsuper();
                }
                if (string.equals(oooo_0.this.\u00d8o0000)) {
                    return oooo_0.this.Objectnew().\u00d3\u00d20000();
                }
                if (string.equals(oooo_0.this.\u00f4o0000)) {
                    return oooo_0.this.Objectnew().\u00f5o0000();
                }
                if (string.equals(oooo_0.this.forsuper)) {
                    return oooo_0.this.Objectnew().\u00f6\u00d20000();
                }
                return false;
            }

            @Override
            public String getText(int n) {
                String string = (String)oooo_0.this.\u00d3o0000.get(n);
                if (string.equals(oooo_0.this.nullsuper)) {
                    return oooo_0.this.Objectnew().whilesuper();
                }
                if (string.equals(oooo_0.this.\u00f5o0000)) {
                    return oooo_0.this.Objectnew().\u00f8o0000();
                }
                return super.getText(n);
            }

            @Override
            public int getValue(Object object) {
                return oooo_0.this.Objectnew().\u00f6O0000();
            }

            @Override
            public void selected(Object object, boolean bl) {
                String string = object.toString();
                if (string.equals(oooo_0.this.\u00d4o0000)) {
                    oooo_0.this.Objectnew().String(bl);
                } else if (string.equals(oooo_0.this.\u00d8o0000)) {
                    oooo_0.this.Objectnew().\u00d500000(bl);
                } else if (string.equals(oooo_0.this.\u00f4o0000)) {
                    oooo_0.this.Objectnew().\u00d200000(bl);
                } else if (string.equals(oooo_0.this.forsuper)) {
                    oooo_0.this.Objectnew().\u00d300000(bl);
                }
            }

            @Override
            public Object selectedItem(Object object) {
                if (object.equals(oooo_0.this.privatesuper)) {
                    return oooo_0.this.Objectnew().\u00f8O0000();
                }
                if (object.equals(oooo_0.this.\u00d5o0000)) {
                    return oooo_0.this.Objectnew().\u00f8\u00d20000();
                }
                return null;
            }

            @Override
            public void setText(Object object, String string) {
                String string2 = object.toString();
                if (string2.equals(oooo_0.this.nullsuper)) {
                    oooo_0.this.Objectnew().null(string);
                } else if (string2.equals(oooo_0.this.\u00f5o0000)) {
                    oooo_0.this.Objectnew().\u00f500000(string);
                }
            }
        });
        this.o00000(tabellenDefinition);
    }
}

