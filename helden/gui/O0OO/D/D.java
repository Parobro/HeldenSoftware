/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D;

import helden.gui.O0OO.D.G;
import helden.gui.O0OO.D.super;
import helden.gui.O0OO.ooOO.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class D
extends G {
    private List<super> thisObject;
    private ArrayList<String> \u00d8\u00d30000;
    private String \u00f4\u00d30000;

    public D(String string, List<super> list, O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        super(o0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
        this.\u00f4\u00d30000 = string;
        this.thisObject = list;
        this.\u00f6\u00d40000();
        this.\u00f5\u00d40000();
        this.\u00f4\u00d40000();
        this.\u00d600000();
    }

    public void \u00f6\u00d40000() {
        this.\u00d8\u00d30000 = new ArrayList();
        for (super super_ : this.thisObject) {
            this.\u00d8\u00d30000.add(super_.\u00d200000());
        }
    }

    @Override
    public String Object() {
        return this.\u00f4\u00d30000;
    }

    private super o00000(String string) {
        for (super super_ : this.thisObject) {
            if (!super_.\u00d200000().equals(string)) continue;
            return super_;
        }
        return null;
    }

    private void \u00f4\u00d40000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return D.this.\u00d8\u00d30000.size();
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return D.this.\u00d8\u00d30000.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 100, true, String.class, SpaltenDefinition.ART.String){

            @Override
            public void changed(Object object, int n) {
                D.this.\u00d200000().\u00d200000().put(object.toString(), n);
            }

            @Override
            public void click(Object object, Object object2) {
                D.this.\u00d200000().\u00d200000().put(object.toString(), object2);
            }

            @Override
            public Object getData(int n) {
                return D.this.\u00d8\u00d30000.get(n);
            }

            @Override
            public List<Object> getItems(Object object) {
                return D.this.o00000(object.toString()).Object();
            }

            @Override
            public SpaltenDefinition.ART getMultifunctionalArt(int n) {
                String string = (String)D.this.\u00d8\u00d30000.get(n);
                return D.this.o00000(string).o00000();
            }

            @Override
            public boolean getSelected(Object object) {
                return (Boolean)D.this.\u00d200000().\u00d200000().get(object);
            }

            @Override
            public String getText(int n) {
                String string = (String)D.this.\u00d8\u00d30000.get(n);
                return (String)D.this.\u00d200000().\u00d200000().get(string);
            }

            @Override
            public int getValue(Object object) {
                return (Integer)D.this.\u00d200000().\u00d200000().get(object.toString());
            }

            @Override
            public void selected(Object object, boolean bl) {
                D.this.\u00d200000().\u00d200000().put(object.toString(), bl);
            }

            @Override
            public Object selectedItem(Object object) {
                return D.this.\u00d200000().\u00d200000().get(object.toString());
            }

            @Override
            public void setText(Object object, String string) {
                String string2 = object.toString();
                D.this.\u00d200000().\u00d200000().put(string2, string);
            }
        });
        this.o00000(tabellenDefinition);
    }

    private void \u00f5\u00d40000() {
        for (super super_ : this.thisObject) {
            Map<String, Object> map = this.\u00d200000().\u00d200000();
            if (map.get(super_.\u00d200000()) != null) continue;
            SpaltenDefinition.ART aRT = super_.super;
            if (aRT.equals((Object)SpaltenDefinition.ART.\u00f500000)) {
                map.put(super_.\u00d200000(), "");
                continue;
            }
            if (!aRT.equals((Object)SpaltenDefinition.ART.\u00f800000)) continue;
            map.put(super_.\u00d200000(), 0);
        }
    }
}

