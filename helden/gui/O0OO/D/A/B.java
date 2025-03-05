/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.A;

import helden.framework.D.P;
import helden.framework.OoOO.voidsuper;
import helden.gui.O0OO.A.class;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.D.new.K;
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
public class B
extends G
implements helden.gui.O0OO.D.new.B {
    protected HashMap<P, P> Stringsuper = new HashMap();
    private class \u00f5O0000;

    public B(new new_, class clazz, int n) {
        super(new_);
        this.\u00f5O0000 = clazz;
        this.\u00d2o0000();
        this.intsuper();
        this.\u00d5o0000();
        this.\u00d600000();
    }

    @Override
    public void o00000(P p2) {
        this.\u00f5O0000.o00000(p2);
    }

    @Override
    public void \u00d200000(P p2) {
    }

    @Override
    public HashMap<P, P> void() {
        return this.Stringsuper;
    }

    public new \u00d4o0000() {
        return (new)super.\u00d200000();
    }

    void intsuper() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return B.this.\u00f5O0000.\u00f500000().size();
            }

            @Override
            public Integer getWeightY() {
                return 5;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Sonderfertigkeit", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return B.this.\u00f5O0000.\u00f500000().get(n);
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                B.this.\u00f5O0000.new((P)object);
                B.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return B.this.\u00f5O0000.\u00f500000().get(n);
            }
        });
        this.o00000(2, tabellenDefinition);
    }

    void \u00d5o0000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return 2;
            }

            @Override
            public Integer getWeightY() {
                return 1;
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("", 100, false, String.class){

            @Override
            public Object getData(int n) {
                if (n == 0) {
                    return "Anzahl zu w\u00e4hlender Sonderfertigkeiten: ";
                }
                return "Sonderfertigkeiten werden verbilligt:";
            }
        });
        arrayList.add(new SpaltenDefinition("", 80, true, P.class, SpaltenDefinition.ART.\u00d300000){

            @Override
            public void click(Object object, Object object2) {
                if (object.toString().equals("0")) {
                    B.this.\u00f5O0000.\u00d300000((Integer)object2);
                } else {
                    B.this.\u00f5O0000.o00000(object2.toString().equals("Yes"));
                }
            }

            @Override
            public Object getData(int n) {
                if (n == 0) {
                    return "0";
                }
                return "1";
            }

            @Override
            public List<Object> getItems(Object object) {
                ArrayList<Object> arrayList = new ArrayList<Object>();
                if (object.toString().equals("0")) {
                    for (int i2 = 1; i2 < 5; ++i2) {
                        arrayList.add(new Integer(i2));
                    }
                } else {
                    arrayList.add("Nein");
                    arrayList.add("Ja");
                }
                return arrayList;
            }

            @Override
            public Object selectedItem(Object object) {
                if (object.equals("0")) {
                    return new Integer(B.this.\u00f5O0000.\u00d800000());
                }
                if (B.this.\u00f5O0000.\u00f400000()) {
                    return "Ja";
                }
                return "Nein";
            }
        });
        this.o00000(1, tabellenDefinition);
    }

    private void \u00d2o0000() {
        ArrayList<TabellenDefinition> arrayList = new ArrayList<TabellenDefinition>();
        for (int i2 = 0; i2 < HEW2SF.Object.length; ++i2) {
            arrayList.add(new K(i2, this.\u00d4o0000(), this, false));
            arrayList.get(i2).setTabname(HEW2SF.Object[i2]);
            arrayList.get(i2).setGlobalname("M\u00f6gliche Sonderfertigkeiten:");
            arrayList.get(i2).setHideWennLeer(true);
        }
        this.o00000(arrayList);
    }
}

