/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.A;

import helden.framework.C.I;
import helden.framework.D.P;
import helden.framework.D.Q;
import helden.framework.D.for;
import helden.framework.OOoO.K;
import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.framework.zauber.KonkreterZauber;
import helden.framework.zauber.Zauber;
import helden.framework.zauber.ZauberMitWertUndHZ;
import helden.gui.O0OO.A.String;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.D.new.B;
import helden.gui.O0OO.D.new.OooO;
import helden.gui.O0OO.D.new.int;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import helden.gui.erschaffung.werkzeug.HEW2SF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class oOOO
extends G
implements OooO,
B {
    private String while;
    protected HashMap<P, P> thissuper = new HashMap();
    protected HashMap<oo0o_0, Integer> OO0000 = new HashMap();
    protected HashMap<oo0o_0, Integer> \u00d4O0000 = new HashMap();
    protected HashMap<oo0o_0, K> \u00d5O0000 = new HashMap();
    protected HashMap<oo0o_0, Boolean> \u00d3O0000 = new HashMap();
    private TabellenDefinition oO0000;
    private int \u00f800000 = -1;

    public oOOO(new new_, String string) {
        super(new_);
        for (Zauber zauber : this.\u00d6O0000().\u00d2o0000()) {
            this.\u00d4O0000.put(zauber, 1);
            this.\u00d5O0000.put(zauber, K.thissuper);
            this.\u00d3O0000.put(zauber, false);
        }
        this.while = string;
        this.\u00d4O0000();
        this.\u00d5O0000();
        this.supersuper();
        this.\u00d600000();
    }

    @Override
    public void o00000(P p2) {
        this.while.o00000(p2, this.\u00f800000);
        this.\u00f800000 = -1;
    }

    @Override
    public void o00000(I i2) {
        this.while.o00000(i2, this.\u00f800000);
        this.\u00f800000 = -1;
    }

    @Override
    public void \u00d200000(P p2) {
        if (p2 instanceof Q) {
            this.while.o00000(for.o00000(p2).get(0), this.\u00f800000);
        } else {
            this.while.o00000(new for(p2.\u00f500000()), this.\u00f800000);
        }
        this.\u00f800000 = -1;
    }

    @Override
    public HashMap<P, P> void() {
        return this.thissuper;
    }

    public new \u00d6O0000() {
        return (new)super.\u00d200000();
    }

    protected void o00000(interface interface_) {
        this.while.o00000(interface_, this.\u00f800000);
        this.\u00f800000 = -1;
    }

    protected void o00000(ZauberMitWertUndHZ zauberMitWertUndHZ) {
        this.while.o00000(zauberMitWertUndHZ, this.\u00f800000);
        this.\u00f800000 = -1;
    }

    private void \u00d5O0000() {
        this.oO0000 = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return oOOO.this.while.return().size() + 1;
            }

            @Override
            public Integer getWeightY() {
                return 5;
            }

            @Override
            public void setSelectedRow(int n) {
                oOOO.this.\u00f800000 = n;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = this.oO0000.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition(".", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                Object object = oOOO.this.while.o00000(n, 0);
                if (object instanceof for) {
                    return "% " + object.toString();
                }
                return object;
            }
        });
        arrayList.add(new SpaltenDefinition(".", 20, true, java.lang.String.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                helden.framework.OOoO.String string = (helden.framework.OOoO.String)object;
                oOOO.this.while.o00000((Integer)string.\u00d300000(), (Integer)string.new());
                oOOO.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return new helden.framework.OOoO.String(0, n);
            }
        });
        arrayList.add(new SpaltenDefinition(".", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                Object object = oOOO.this.while.o00000(n, 1);
                if (object instanceof for) {
                    return "% " + object.toString();
                }
                return object;
            }
        });
        arrayList.add(new SpaltenDefinition(".", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                helden.framework.OOoO.String string = (helden.framework.OOoO.String)object;
                oOOO.this.while.o00000((Integer)string.\u00d300000(), (Integer)string.new());
                oOOO.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return new helden.framework.OOoO.String(1, n);
            }
        });
        arrayList.add(new SpaltenDefinition(".", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                Object object = oOOO.this.while.o00000(n, 2);
                if (object instanceof for) {
                    return "% " + object.toString();
                }
                return object;
            }
        });
        arrayList.add(new SpaltenDefinition(".", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                helden.framework.OOoO.String string = (helden.framework.OOoO.String)object;
                oOOO.this.while.o00000((Integer)string.\u00d300000(), (Integer)string.new());
                oOOO.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return new helden.framework.OOoO.String(2, n);
            }
        });
        arrayList.add(new SpaltenDefinition(".", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                Object object = oOOO.this.while.o00000(n, 3);
                if (object instanceof for) {
                    return "% " + object.toString();
                }
                return object;
            }
        });
        arrayList.add(new SpaltenDefinition(".", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                helden.framework.OOoO.String string = (helden.framework.OOoO.String)object;
                oOOO.this.while.o00000((Integer)string.\u00d300000(), (Integer)string.new());
                oOOO.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return new helden.framework.OOoO.String(3, n);
            }
        });
        arrayList.add(new SpaltenDefinition(".", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                Object object = oOOO.this.while.o00000(n, 4);
                if (object instanceof for) {
                    return "% " + object.toString();
                }
                return object;
            }
        });
        arrayList.add(new SpaltenDefinition(".", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                helden.framework.OOoO.String string = (helden.framework.OOoO.String)object;
                oOOO.this.while.o00000((Integer)string.\u00d300000(), (Integer)string.new());
                oOOO.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return new helden.framework.OOoO.String(4, n);
            }
        });
        this.o00000(2, this.oO0000);
    }

    private void \u00d4O0000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        arrayList.add(new int(0, this.\u00d6O0000(), this, false));
        ((TabellenDefinition)arrayList.get(0)).setTabname("Vorteile");
        ((TabellenDefinition)arrayList.get(0)).setGlobalname("M\u00f6gliche Auswahlen");
        arrayList.add(new int(1, this.\u00d6O0000(), this, false));
        ((TabellenDefinition)arrayList.get(1)).setTabname("Nachteile");
        for (int i2 = 0; i2 < HEW2SF.Object.length; ++i2) {
            arrayList.add(new helden.gui.O0OO.D.new.K(i2, this.\u00d6O0000(), this, true));
            ((TabellenDefinition)arrayList.get(arrayList.size() - 1)).setTabname("SF: " + HEW2SF.Object[i2]);
            ((TabellenDefinition)arrayList.get(arrayList.size() - 1)).setGlobalname("M\u00f6gliche Sonderfertigkeiten:");
            ((TabellenDefinition)arrayList.get(arrayList.size() - 1)).setHideWennLeer(true);
        }
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return oOOO.this.\u00d6O0000().\u00d3o0000().size();
            }

            @Override
            public Integer getWeightY() {
                return 5;
            }
        };
        ArrayList<SpaltenDefinition> arrayList2 = tabellenDefinition.getSpaltenDefinition();
        arrayList2.add(new SpaltenDefinition("Talentname", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                return oOOO.this.\u00d6O0000().\u00d3o0000().get(n).toString();
            }
        });
        arrayList2.add(new SpaltenDefinition("Kategorie", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                return oOOO.this.\u00d6O0000().\u00d3o0000().get(n).getArt().toString();
            }
        });
        arrayList2.add(new SpaltenDefinition("", 80, true, java.lang.String.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                oOOO.this.OO0000.put((oo0o_0)object, (Integer)object2);
            }

            @Override
            public Object getData(int n) {
                return oOOO.this.\u00d6O0000().\u00d3o0000().get(n);
            }

            @Override
            public List<Object> getItems(Object object) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                for (int i2 = 1; i2 < 10; ++i2) {
                    arrayList.add(new Integer(i2));
                }
                return arrayList;
            }

            @Override
            public Object selectedItem(Object object) {
                return oOOO.this.OO0000.get(object);
            }
        });
        arrayList2.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                oOOO.this.o00000(new interface((oo0o_0)object, oOOO.this.OO0000.get(object)));
                oOOO.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return oOOO.this.\u00d6O0000().\u00d3o0000().get(n);
            }
        });
        arrayList.add(tabellenDefinition);
        ((TabellenDefinition)arrayList.get(arrayList.size() - 1)).setTabname("Talente");
        tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return oOOO.this.\u00d6O0000().\u00d2o0000().size();
            }

            @Override
            public Integer getWeightY() {
                return 5;
            }
        };
        arrayList2 = tabellenDefinition.getSpaltenDefinition();
        arrayList2.add(new SpaltenDefinition("Zauber", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                return oOOO.this.\u00d6O0000().\u00d2o0000().get(n).toString();
            }
        });
        arrayList2.add(new SpaltenDefinition("", 80, true, java.lang.String.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                oOOO.this.\u00d5O0000.put((oo0o_0)object, (K)object2);
            }

            @Override
            public Object getData(int n) {
                return oOOO.this.\u00d6O0000().\u00d2o0000().get(n);
            }

            @Override
            public List<Object> getItems(Object object) {
                return K.\u00d400000();
            }

            @Override
            public Object selectedItem(Object object) {
                return oOOO.this.\u00d5O0000.get(object);
            }
        });
        arrayList2.add(new SpaltenDefinition("", 80, true, java.lang.String.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                oOOO.this.\u00d4O0000.put((oo0o_0)object, (Integer)object2);
            }

            @Override
            public Object getData(int n) {
                return oOOO.this.\u00d6O0000().\u00d2o0000().get(n);
            }

            @Override
            public List<Object> getItems(Object object) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                for (int i2 = 1; i2 < 10; ++i2) {
                    arrayList.add(new Integer(i2));
                }
                return arrayList;
            }

            @Override
            public Object selectedItem(Object object) {
                return oOOO.this.\u00d4O0000.get(object);
            }
        });
        arrayList2.add(new SpaltenDefinition("HZ", 30, true, Boolean.class, SpaltenDefinition.ART.\u00f600000){

            @Override
            public Object getData(int n) {
                return oOOO.this.\u00d6O0000().\u00d2o0000().get(n);
            }

            @Override
            public boolean getSelected(Object object) {
                return oOOO.this.\u00d3O0000.get(object);
            }

            @Override
            public boolean isEnabled(Object object) {
                return true;
            }

            @Override
            public void selected(Object object, boolean bl) {
                oOOO.this.\u00d3O0000.put((oo0o_0)object, bl);
                oOOO.this.\u00d500000();
            }
        });
        arrayList2.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                KonkreterZauber konkreterZauber = KonkreterZauber.getZauber((Zauber)object, oOOO.this.\u00d5O0000.get(object), "");
                oOOO.this.o00000(new ZauberMitWertUndHZ(konkreterZauber, oOOO.this.\u00d4O0000.get(object), oOOO.this.\u00d3O0000.get(object)));
                oOOO.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return oOOO.this.\u00d6O0000().\u00d2o0000().get(n);
            }
        });
        arrayList.add(tabellenDefinition);
        ((TabellenDefinition)arrayList.get(arrayList.size() - 1)).setTabname("Zauber");
        this.o00000(arrayList);
    }

    private void supersuper() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 1;
            }

            @Override
            public Integer getWeightY() {
                return 1;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 100, false, java.lang.String.class){

            @Override
            public Object getData(int n) {
                return "Anzahl zu w\u00e4hlender Wahlm\u00f6glichkeiten: ";
            }
        });
        arrayList.add(new SpaltenDefinition("", 80, true, P.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                oOOO.this.while.new((Integer)object2);
            }

            @Override
            public Object getData(int n) {
                return "0";
            }

            @Override
            public List<Object> getItems(Object object) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                for (int i2 = 1; i2 < 5; ++i2) {
                    arrayList.add(new Integer(i2));
                }
                return arrayList;
            }

            @Override
            public Object selectedItem(Object object) {
                return new Integer(oOOO.this.while.\u00d500000());
            }
        });
        this.o00000(1, tabellenDefinition);
    }
}

