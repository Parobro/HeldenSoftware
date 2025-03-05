/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.O0OO.D.new;

import helden.framework.OoOO.interface;
import helden.framework.OoOO.voidsuper;
import helden.framework.oooo.oo0o_0;
import helden.gui.O0OO.D.G;
import helden.gui.O0OO.ooOO.new;
import helden.gui.erschaffung.dialoge.tabellenDialog.SpaltenDefinition;
import helden.gui.erschaffung.dialoge.tabellenDialog.TabellenDefinition;
import java.util.ArrayList;

public class public
extends G {
    public public(new new_) {
        super(new_);
        this.O\u00d40000();
        this.o\u00d40000();
        this.\u00d600000();
    }

    @Override
    public String Object() {
        return "Talente";
    }

    public new \u00d2\u00d40000() {
        return (new)super.\u00d200000();
    }

    private void O\u00d40000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return public.this.\u00d2\u00d40000().\u00d3o0000().size();
            }
        };
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Talentname", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return public.this.\u00d2\u00d40000().\u00d3o0000().get(n).toString();
            }
        });
        arrayList.add(new SpaltenDefinition("Kategorie", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return public.this.\u00d2\u00d40000().\u00d3o0000().get(n).getArt().toString();
            }
        });
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "+"){

            @Override
            public void click(Object object) {
                public.this.\u00d2\u00d40000().\u00d200000((oo0o_0)((voidsuper)object));
                public.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                return public.this.\u00d2\u00d40000().\u00d3o0000().get(n);
            }
        });
        this.o00000(tabellenDefinition);
    }

    private void o\u00d40000() {
        TabellenDefinition tabellenDefinition = new TabellenDefinition(){

            @Override
            public int getAnzahl() {
                return public.this.\u00d2\u00d40000().\u00d5o0000().size();
            }
        };
        tabellenDefinition.setTabname("Automatische und aktivierte Talente:");
        ArrayList<SpaltenDefinition> arrayList = tabellenDefinition.getSpaltenDefinition();
        arrayList.add(new SpaltenDefinition("Talentname", 140, false, String.class){

            @Override
            public Object getData(int n) {
                return public.this.\u00d2\u00d40000().\u00d5o0000().get(n).new().toString();
            }
        });
        arrayList.add(new SpaltenDefinition("Kategorie", 100, false, String.class){

            @Override
            public Object getData(int n) {
                return public.this.\u00d2\u00d40000().\u00d5o0000().get(n).new().getArt().toString();
            }
        });
        if (this.\u00d2\u00d40000().oo0000()) {
            arrayList.add(new SpaltenDefinition("Basis-Wert", 20, false, String.class){

                @Override
                public Object getData(int n) {
                    interface interface_ = public.this.\u00d2\u00d40000().\u00d5o0000().get(n);
                    if (public.this.\u00d2\u00d40000().\u00d8O0000().contains(interface_.new())) {
                        return null;
                    }
                    for (interface interface_2 : public.this.\u00d2\u00d40000().\u00d3\u00d30000().\u00d5o0000()) {
                        if (!interface_2.new().equals(interface_.new())) continue;
                        return interface_2.\u00d300000();
                    }
                    return null;
                }
            });
        }
        arrayList.add(new SpaltenDefinition("Wert", 20, true, Integer.class, SpaltenDefinition.ART.\u00f800000){

            @Override
            public void changed(Object object, int n) {
                interface interface_ = (interface)object;
                interface_.o00000(n);
                public.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                interface interface_ = public.this.\u00d2\u00d40000().\u00d5o0000().get(n);
                if (public.this.\u00d2\u00d40000().\u00d8O0000().contains(interface_.new())) {
                    return null;
                }
                return interface_;
            }

            @Override
            public int getMax(Object object) {
                return 20;
            }

            @Override
            public int getMin(Object object) {
                return -20;
            }

            @Override
            public int getValue(Object object) {
                interface interface_ = (interface)object;
                return interface_.\u00d300000();
            }
        });
        if (this.\u00d2\u00d40000().oo0000()) {
            arrayList.add(new SpaltenDefinition("Talent entf\u00e4llt", 30, true, Boolean.class, SpaltenDefinition.ART.\u00f600000){

                @Override
                public Object getData(int n) {
                    oo0o_0 oo0o_02 = public.this.\u00d2\u00d40000().\u00d5o0000().get(n).new();
                    if (public.this.\u00d2\u00d40000().oo0000() && public.this.\u00d2\u00d40000().\u00d3\u00d30000().\u00d300000(oo0o_02)) {
                        return oo0o_02;
                    }
                    return null;
                }

                @Override
                public boolean getSelected(Object object) {
                    return public.this.\u00d2\u00d40000().\u00d8O0000().contains(object);
                }

                @Override
                public void selected(Object object, boolean bl) {
                    oo0o_0 oo0o_02 = (oo0o_0)object;
                    if (bl) {
                        if (!public.this.\u00d2\u00d40000().\u00d8O0000().contains(oo0o_02)) {
                            public.this.\u00d2\u00d40000().\u00d8O0000().add(oo0o_02);
                            public.this.\u00d500000();
                        }
                    } else {
                        public.this.\u00d2\u00d40000().\u00d8O0000().remove(oo0o_02);
                    }
                }
            });
        }
        arrayList.add(new SpaltenDefinition("", 20, true, voidsuper.class, SpaltenDefinition.ART.\u00d200000, "-"){

            @Override
            public void click(Object object) {
                public.this.\u00d2\u00d40000().\u00d200000((interface)object);
                public.this.\u00d500000();
            }

            @Override
            public Object getData(int n) {
                interface interface_ = public.this.\u00d2\u00d40000().\u00d5o0000().get(n);
                if (public.this.\u00d2\u00d40000().oo0000() && public.this.\u00d2\u00d40000().\u00d3\u00d30000().\u00d300000(interface_.new())) {
                    return null;
                }
                return interface_;
            }
        });
        this.\u00d200000(tabellenDefinition);
    }
}

