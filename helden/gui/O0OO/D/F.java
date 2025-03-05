/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D;

import helden.gui.O0OO.D.G;
import helden.gui.O0OO.ooOO.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;

public class F
extends G {
    private String O\u00d40000 = "Beschreibung";
    private String \u00f5\u00d30000 = "Urheber";
    private String StringObject = "Kontakt (WWW, E-Mail)";
    private ArrayList<String> \u00f8\u00d30000 = new ArrayList();

    public F(O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        super(o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        this.\u00f8\u00d30000.add(this.O\u00d40000);
        this.\u00f8\u00d30000.add(this.\u00f5\u00d30000);
        this.\u00f8\u00d30000.add(this.StringObject);
        this.O\u00d50000();
        this.\u00d600000();
    }

    @Override
    public String Object() {
        return "Allgemeines";
    }

    private void O\u00d50000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return F.this.\u00f8\u00d30000.size();
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return F.this.\u00f8\u00d30000.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 100, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public Object getData(int n) {
                return F.this.\u00f8\u00d30000.get(n);
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                String string = (String)F.this.\u00f8\u00d30000.get(n);
                if (string.equals(F.this.O\u00d40000) || string.equals(F.this.StringObject) || string.equals(F.this.\u00f5\u00d30000)) {
                    return SpaltenDefinition.ART.\u00f500000;
                }
                return super.getMultifunctionalArt(n);
            }

            @Override
            public String getText(int n) {
                String string = (String)F.this.\u00f8\u00d30000.get(n);
                if (string.equals(F.this.O\u00d40000)) {
                    return F.this.\u00d200000().\u00d300000();
                }
                if (string.equals(F.this.StringObject)) {
                    return F.this.\u00d200000().String();
                }
                if (string.equals(F.this.\u00f5\u00d30000)) {
                    return F.this.\u00d200000().o00000();
                }
                return super.getText(n);
            }

            @Override
            public void setText(Object object, String string) {
                String string2 = object.toString();
                if (string2.equals(F.this.O\u00d40000)) {
                    F.this.\u00d200000().\u00d300000(string);
                } else if (string2.equals(F.this.StringObject)) {
                    F.this.\u00d200000().\u00d200000(string);
                } else if (string2.equals(F.this.\u00f5\u00d30000)) {
                    F.this.\u00d200000().o00000(string);
                }
            }
        });
        this.o00000(tabellenDefinition);
    }
}

