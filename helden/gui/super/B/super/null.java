/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.super.B.super;

import helden.framework.E.B;
import helden.framework.E.C.M;
import helden.framework.OoOO.voidsuper;
import helden.framework.gmod.GMod;
import helden.framework.gmod.GmodFactory;
import helden.framework.settings.Settings;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.ZweiTabellenZustand;
import helden.gui.super.B.super.F;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class null
extends ZweiTabellenZustand {
    private ArrayList<GMod> supernew;
    private M O\u00d20000;
    private Settings \u00d2\u00d20000;

    public null(helden.framework.E.F f2, Settings settings) {
        super(null);
        this.\u00d2\u00d20000 = settings;
        this.O\u00d20000 = (M)f2.o00000(B.super, 0);
        this.supernew = new ArrayList();
        this.supernew.addAll(this.O\u00d20000.fornew());
        this.\u00d5O0000();
        this.oO0000();
        this.createPanel();
        this.update();
    }

    public void o00000(GMod gMod) {
        this.supernew.add(gMod);
        this.update();
    }

    public String while() {
        return "";
    }

    public String \u00d4O0000() {
        return "Gw\u00e4hlte Modifiktoren";
    }

    @Override
    public String getBezeichner() {
        return "Gw\u00e4hlte Modifiktoren";
    }

    public Settings \u00d3O0000() {
        return this.\u00d2\u00d20000;
    }

    public boolean thissuper() {
        this.O\u00d20000.fornew().clear();
        this.O\u00d20000.fornew().addAll(this.supernew);
        return true;
    }

    @Override
    public void update() {
        super.update();
    }

    private void oO0000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        HashMap<String, ArrayList<GMod>> hashMap = GmodFactory.getGModsProKategorie();
        for (String string : hashMap.keySet()) {
            arrayList.add(new F(this, string, hashMap.get(string)));
        }
        this.setSpaltenOben(arrayList);
    }

    private void \u00d5O0000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return null.this.supernew.size();
            }
        };
        tabellenDefinition.setGlobalname("<html><body>Gew\u00e4hlte Modifikatonen:<br>(Die Modifikatoren gelten ab dem ersten Wert und bis der zweite Wert erreicht wurde.)");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Modifizierer", 180, false, String.class){

            @Override
            public Object getData(int n) {
                return null.this.supernew.get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                null.this.supernew.remove(object);
                null.this.update();
            }

            @Override
            public Object getData(int n) {
                return null.this.supernew.get(n);
            }
        });
        this.setSpaltenUnten(tabellenDefinition);
        tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 0;
            }
        };
        arrayList = tabellenDefinition.getSpaltenDefinition();
        ArrayList<TabellenDefinition> arrayList2 = new ArrayList<TabellenDefinition>();
        arrayList2.add(tabellenDefinition);
        arrayList2.add(tabellenDefinition);
        this.setSpaltenOben(arrayList2);
    }
}

