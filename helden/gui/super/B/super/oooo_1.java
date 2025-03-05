/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.b.super;

import helden.framework.E.B;
import helden.framework.E.C.K;
import helden.framework.E.F;
import helden.framework.OoOO.N;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.framework.settings.Settings;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberFabrik;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Renamed from helden.gui.super.B.super.oOOO
 */
public class oooo_1
extends ZweiTabellenZustand {
    private ArrayList<interface> \u00d8\u00d50000;
    private ArrayList<oo0o_0> \u00f4\u00d50000;
    private K \u00d6\u00d50000;

    public oooo_1(F f2) {
        super(null);
        this.\u00d6\u00d50000 = (K)f2.o00000(B.\u00d200000, 0);
        Settings settings = Settings.getSettingsBySetting(this.\u00d6\u00d50000.\u00f6\u00d30000());
        this.\u00d8\u00d50000 = new ArrayList<interface>(this.\u00d6\u00d50000.\u00f8\u00d30000());
        this.\u00f4\u00d50000 = new ArrayList();
        for (voidsuper object : N.floatsuper().\u00d2O0000()) {
            if (!settings.contains(object)) continue;
            this.\u00f4\u00d50000.add(object);
        }
        for (Zauber zauber : ZauberFabrik.getInstance().getAlleZauber()) {
            if (!settings.contains(zauber)) continue;
            this.\u00f4\u00d50000.add(zauber);
        }
        for (interface interface_ : this.\u00d8\u00d50000) {
            this.\u00f4\u00d50000.remove(interface_.new());
        }
        this.\u00f8\u00d40000();
        this.\u00f4\u00d40000();
        this.createPanel();
        this.update();
    }

    public String \u00f5\u00d40000() {
        return "Verf\u00fcgbare Talente:";
    }

    public String privateObject() {
        return "Gew\u00e4hlte Talente:";
    }

    @Override
    public String getBezeichner() {
        return "Talente";
    }

    public boolean O\u00d50000() {
        this.\u00d6\u00d50000.\u00d6\u00d30000();
        this.\u00d6\u00d50000.\u00f8\u00d30000().addAll(this.\u00d8\u00d50000);
        return true;
    }

    @Override
    public void update() {
        super.update();
    }

    private void \u00f4\u00d40000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(this){
            final /* synthetic */ oooo_1 \u00d600000;
            {
                this.\u00d600000 = oooo_12;
            }

            public int getAnzahl() {
                return oooo_1.o00000(this.\u00d600000).size();
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition(this, "Talentname", 100, false, String.class){
            final /* synthetic */ oooo_1 \u00f500000;
            {
                this.\u00f500000 = oooo_12;
                super(string, n, bl, clazz);
            }

            public Object getData(int n) {
                return ((oo0o_0)oooo_1.o00000(this.\u00f500000).get(n)).toString();
            }
        });
        arrayList.add(new SpaltenDefinition(this, "Kategorie", 100, false, String.class){
            final /* synthetic */ oooo_1 \u00f400000;
            {
                this.\u00f400000 = oooo_12;
                super(string, n, bl, clazz);
            }

            public Object getData(int n) {
                return ((oo0o_0)oooo_1.o00000(this.\u00f400000).get(n)).getArt().toString();
            }
        });
        arrayList.add(new SpaltenDefinition(this, "", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){
            final /* synthetic */ oooo_1 \u00d800000;
            {
                this.\u00d800000 = oooo_12;
                super(string, n, bl, clazz, aRT, string2);
            }

            public void click(Object object) {
                oooo_1.new(this.\u00d800000).add(new interface((oo0o_0)object, 0));
                oooo_1.o00000(this.\u00d800000).remove(object);
                this.\u00d800000.update();
            }

            public Object getData(int n) {
                return oooo_1.o00000(this.\u00d800000).get(n);
            }
        });
        this.setSpaltenOben(tabellenDefinition);
    }

    private void \u00f8\u00d40000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return oooo_1.this.\u00d8\u00d50000.size();
            }
        };
        tabellenDefinition.setGlobalname("Gew\u00e4hlte Talente:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Talente", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return ((interface)oooo_1.this.\u00d8\u00d50000.get(n)).new();
            }
        });
        arrayList.add(new SpaltenDefinition("Wert", 20, true, Integer.class, SpaltenDefinition.ART.\u00f800000){

            @Override
            public void changed(Object object, int n) {
                ((interface)object).o00000(n);
                oooo_1.this.update();
            }

            @Override
            public Object getData(int n) {
                return oooo_1.this.\u00d8\u00d50000.get(n);
            }

            @Override
            public int getMax(Object object) {
                return 30;
            }

            @Override
            public int getMin(Object object) {
                return 0;
            }

            @Override
            public int getValue(Object object) {
                return ((interface)object).\u00d300000();
            }

            @Override
            public boolean isEnabled(Object object) {
                return true;
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                oooo_1.this.\u00d8\u00d50000.remove(object);
                oooo_1.this.\u00f4\u00d50000.add(((interface)object).new());
                oooo_1.this.update();
            }

            @Override
            public Object getData(int n) {
                return oooo_1.this.\u00d8\u00d50000.get(n);
            }
        });
        this.setSpaltenUnten(tabellenDefinition);
    }
}

