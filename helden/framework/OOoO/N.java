/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.OoOO;

import helden.framework.E.B;
import helden.framework.E.C.A;
import helden.framework.E.F;
import helden.framework.E.O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.Einstellungen;
import helden.framework.OOoO.o0Oo;
import helden.framework.OoOO.E;
import helden.framework.OoOO.G;
import helden.framework.OoOO.X;
import helden.framework.OoOO.private;
import helden.framework.OoOO.voidsuper;
import helden.framework.held.persistenz.ModsDatenParser;
import helden.framework.oooo.b_0;
import helden.framework.oooo.l_0;
import helden.framework.oooo.oooo_4;
import helden.framework.oooo.oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1;
import helden.framework.settings.Settings;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class N {
    private static N null;
    private ArrayList<voidsuper> String;
    private ArrayList<voidsuper> \u00d800000;
    private ArrayList<voidsuper> \u00d300000;
    private ArrayList<voidsuper> \u00f500000;
    private HashMap<String, voidsuper> \u00d600000;
    private ArrayList<voidsuper> \u00d200000;
    private HashMap<String, voidsuper> \u00d500000 = new HashMap();
    private HashMap<String, voidsuper> o00000;

    public static N floatsuper() {
        if (null == null) {
            null = new N();
        }
        return null;
    }

    private N() {
        this.String = new ArrayList();
        this.\u00d800000 = new ArrayList();
        this.\u00d300000 = new ArrayList();
        this.\u00f500000 = new ArrayList();
        this.o00000 = new HashMap();
        this.\u00d200000 = new ArrayList();
        this.\u00f400000();
        this.\u00d6o0000();
        this.\u00d3o0000();
        this.\u00f600000();
        this.\u00f4O0000();
        this.\u00d300000();
        this.\u00d8O0000();
        this.\u00d200000();
        this.\u00d6O0000();
        this.\u00f6O0000();
        this.OO0000();
        this.super();
        this.int();
        this.\u00d8o0000();
        E.newnewString.setSpezialisierungenErlaubt(false);
        E.\u00d4\u00d4\u00d8000.setSpezialisierungenErlaubt(false);
        E.returnnewString.setSpezialisierungenErlaubt(false);
        E.o\u00d5\u00d8000.setSpezialisierungenErlaubt(false);
        E.O\u00d6\u00d8000.setSpezialisierungenErlaubt(false);
        E.whilethisString.setSpezialisierungenErlaubt(false);
        E.\u00d5\u00d5\u00d8000.setSpezialisierungenErlaubt(false);
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.addAll(this.String);
        arrayList.addAll(this.\u00d800000);
        for (voidsuper voidsuper2 : arrayList) {
            this.o00000.put(voidsuper2.getID(), voidsuper2);
            if (voidsuper2.getSpezialisierungen() != null || !voidsuper2.isSpezialisierungenErlaubt()) continue;
            ArrayList<String> arrayList2 = new ArrayList<String>();
            arrayList2.add("dummy");
            voidsuper2.setSpezialisierungen(arrayList2);
        }
    }

    public void \u00d200000(voidsuper voidsuper2) {
        private private_ = (private)((Object)voidsuper2);
        if (!this.\u00d500000.containsKey(private_.getID())) {
            this.\u00d500000.put(private_.getID(), voidsuper2);
            this.o00000.put(private_.getID(), voidsuper2);
            this.String.add(voidsuper2);
        }
    }

    public ArrayList<voidsuper> super(Settings settings, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 ... oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1Array) {
        if (settings == null) {
            ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
            for (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12 : oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1Array) {
                arrayList.addAll(this.super(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12));
            }
            return arrayList;
        }
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        for (voidsuper voidsuper2 : this.String) {
            for (oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_13 : oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1Array) {
                if (!oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_13, voidsuper2) || !settings.contains(voidsuper2)) continue;
                arrayList.add(voidsuper2);
            }
        }
        return arrayList;
    }

    public ArrayList<voidsuper> \u00d400000() {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.addAll(this.String);
        arrayList.addAll(this.\u00d800000);
        return arrayList;
    }

    public ArrayList<voidsuper> \u00d2O0000() {
        return new ArrayList<voidsuper>(this.\u00d600000.values());
    }

    public ArrayList<voidsuper> voidsuper() {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        for (voidsuper voidsuper2 : this.String) {
            if (!voidsuper2.\u00f5\u00d60000()) continue;
            arrayList.add(voidsuper2);
        }
        return arrayList;
    }

    public List<voidsuper> do() {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        arrayList.addAll(this.\u00d500000.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public List<E> \u00d2o0000() {
        ArrayList<E> arrayList = new ArrayList<E>();
        for (voidsuper voidsuper2 : this.String) {
            E e;
            if (!voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000) || !(e = (E)voidsuper2).classclass()) continue;
            arrayList.add((E)voidsuper2);
        }
        return arrayList;
    }

    public ArrayList<voidsuper> \u00d800000() {
        return this.\u00d300000;
    }

    public ArrayList<voidsuper> Objectsuper() {
        return this.super(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Objectsuper);
    }

    public ArrayList<voidsuper> \u00d600000() {
        return this.super(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.super);
    }

    public ArrayList<voidsuper> \u00d4O0000() {
        return this.super(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000);
    }

    public ArrayList<voidsuper> \u00f8O0000() {
        return this.super(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.Oo0000);
    }

    public voidsuper super(b_0 b_02) {
        String string = "Kraftschub (" + b_02.toString() + ")";
        try {
            return this.\u00d200000(string);
        }
        catch (Exception exception) {
            voidsuper voidsuper2 = new voidsuper(string, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d2O0000, false, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper));
            this.\u00d600000.put(voidsuper2.toString(), voidsuper2);
            return voidsuper2;
        }
    }

    public ArrayList<voidsuper> interface() {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        for (voidsuper voidsuper2 : this.String) {
            E e;
            if (!voidsuper2.getArt().equals(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f400000) || (e = (E)voidsuper2).classclass()) continue;
            arrayList.add(voidsuper2);
        }
        return arrayList;
    }

    public ArrayList<voidsuper> \u00f800000() {
        return this.super(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.OO0000);
    }

    public ArrayList<voidsuper> \u00d4o0000() {
        return this.super(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f600000);
    }

    public ArrayList<voidsuper> Oo0000() {
        return this.super(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00f800000);
    }

    public voidsuper \u00d200000(String string) {
        Iterator<voidsuper> iterator;
        if (this.\u00d600000 == null) {
            this.\u00d600000 = new HashMap();
            for (voidsuper voidsuper2 : this.String) {
                this.\u00d600000.put(voidsuper2.toString(), voidsuper2);
            }
            for (voidsuper voidsuper2 : this.\u00d800000) {
                this.\u00d600000.put(voidsuper2.toString(), voidsuper2);
            }
            for (voidsuper voidsuper2 : this.\u00d300000) {
                this.\u00d600000.put(voidsuper2.toString(), voidsuper2);
            }
            for (voidsuper voidsuper2 : this.\u00d200000) {
                this.\u00d600000.put(voidsuper2.toString(), voidsuper2);
            }
            iterator = this.\u00f500000.iterator();
            while (iterator.hasNext()) {
                voidsuper voidsuper2;
                voidsuper2 = iterator.next();
                this.\u00d600000.put(voidsuper2.toString(), voidsuper2);
            }
            this.\u00d600000.put(G.\u00d30\u00f6000.toString(), G.\u00d30\u00f6000);
            this.\u00d600000.put(G.\u00d4\u00f4\u00f5000.toString(), G.\u00d4\u00f4\u00f5000);
        }
        if ((iterator = this.\u00d600000.get(string)) != null) {
            return iterator;
        }
        throw new X(string);
    }

    public voidsuper super(String string) {
        return this.o00000.get(string);
    }

    public ArrayList<voidsuper> \u00d3O0000() {
        return this.String;
    }

    public ArrayList<voidsuper> super(Settings settings) {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        for (voidsuper voidsuper2 : this.\u00d3O0000()) {
            if (!settings.contains(voidsuper2)) continue;
            arrayList.add(voidsuper2);
        }
        return arrayList;
    }

    public ArrayList<voidsuper> super(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1 oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12) {
        ArrayList<voidsuper> arrayList = new ArrayList<voidsuper>();
        for (voidsuper voidsuper2 : this.String) {
            if (!oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.o00000(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_12, voidsuper2)) continue;
            arrayList.add(voidsuper2);
        }
        return arrayList;
    }

    public voidsuper super(voidsuper voidsuper2) {
        String string = "Talentschub (" + voidsuper2.toString() + ")";
        try {
            return this.\u00d200000(string);
        }
        catch (Exception exception) {
            voidsuper voidsuper3 = new voidsuper(string, oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d2O0000, false, new l_0(b_0.whilewhilesuper, b_0.\u00f8\u00f4\u00d2000, b_0.returnwhilesuper));
            this.\u00d600000.put(voidsuper3.toString(), voidsuper3);
            return voidsuper3;
        }
    }

    public ArrayList<voidsuper> \u00f4o0000() {
        return this.super(oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo_1.\u00d8O0000);
    }

    private void \u00d8o0000() {
        FilenameFilter filenameFilter;
        File file = new File(Einstellungen.getInstance().getPfade().getPfad("mods") + "/Talent");
        File[] fileArray = file.listFiles(filenameFilter = new FilenameFilter(){

            @Override
            public boolean accept(File file, String string) {
                return string.toLowerCase().endsWith(".xml");
            }
        });
        if (fileArray != null) {
            for (File file2 : fileArray) {
                voidsuper voidsuper2 = ModsDatenParser.getInstance().einlesenTalent(file2);
                if (voidsuper2 == null) continue;
                this.\u00d200000(voidsuper2);
            }
        }
    }

    private void \u00f6O0000() {
        this.\u00d300000.add(voidsuper.o\u00f8\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f4\u00d6\u00d5000);
        this.\u00d300000.add(voidsuper.\u00d3\u00d4\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f8\u00d2\u00d6000);
        this.\u00d300000.add(voidsuper.newprivateObject);
        this.\u00d300000.add(voidsuper.o\u00d3\u00d8000);
        this.\u00d300000.add(voidsuper.\u00d5\u00f8\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f4\u00d5\u00d5000);
        this.\u00d300000.add(voidsuper.forinterfaceObject);
        this.\u00d300000.add(voidsuper.\u00d5\u00d8\u00d6000);
        this.\u00d300000.add(voidsuper.nullpublicObject);
        this.\u00d300000.add(voidsuper.\u00f4\u00f4\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f5\u00d8\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d8\u00f8\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d8\u00d4\u00d6000);
        this.\u00d300000.add(voidsuper.\u00f5\u00f6\u00d6000);
        this.\u00d300000.add(voidsuper.O\u00d2\u00d6000);
        this.\u00d300000.add(voidsuper.O\u00d2\u00d8000);
        this.\u00d300000.add(voidsuper.\u00d8\u00f6\u00d6000);
        this.\u00d300000.add(voidsuper.nullclassObject);
        this.\u00d300000.add(voidsuper.\u00d5\u00f4\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f4\u00f8\u00d6000);
        this.\u00d300000.add(voidsuper.o\u00f8\u00d6000);
        this.\u00d300000.add(voidsuper.newforObject);
        this.\u00d300000.add(voidsuper.O\u00d6\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d3\u00d4\u00d6000);
        this.\u00d300000.add(voidsuper.\u00f8\u00f5\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f4\u00d4\u00d5000);
        this.\u00d300000.add(voidsuper.\u00d4\u00f5\u00d5000);
        this.\u00d300000.add(voidsuper.\u00d4o\u00d8000);
        this.\u00d300000.add(voidsuper.nulldoObject);
        this.\u00d300000.add(voidsuper.\u00d4\u00d4\u00d6000);
        this.\u00d300000.add(voidsuper.privateinterfaceObject);
        this.\u00d300000.add(voidsuper.returnnewObject);
        this.\u00d300000.add(voidsuper.\u00f4O\u00d8000);
        this.\u00d300000.add(voidsuper.\u00d4\u00d2\u00d6000);
        this.\u00d300000.add(voidsuper.ifreturnObject);
        this.\u00d300000.add(voidsuper.\u00d3\u00d2\u00d6000);
        this.\u00d300000.add(voidsuper.\u00f8O\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d4\u00f6\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f8\u00f8\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f8o\u00d8000);
        this.\u00d300000.add(voidsuper.o0\u00d8000);
        this.\u00d300000.add(voidsuper.nullfloatObject);
        this.\u00d300000.add(voidsuper.\u00f8\u00d2\u00d8000);
        this.\u00d300000.add(voidsuper.\u00f5\u00d4\u00d5000);
        this.\u00d300000.add(voidsuper.\u00d8\u00f6\u00d5000);
        this.\u00d300000.add(voidsuper.returnthisString);
        this.\u00d300000.add(voidsuper.\u00d3\u00f6\u00d6000);
        this.\u00d300000.add(voidsuper.o\u00f4\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f5O\u00d8000);
        this.\u00d300000.add(voidsuper.\u00d5\u00d2\u00d8000);
        this.\u00d300000.add(voidsuper.\u00f40\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d8\u00f4\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d4\u00d8\u00d5000);
        this.\u00d300000.add(voidsuper.\u00d3\u00d3\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d4O\u00d8000);
        this.\u00d300000.add(voidsuper.\u00d8\u00d6\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d3\u00f6\u00d5000);
        this.\u00d300000.add(voidsuper.\u00d4o\u00d6000);
        this.\u00d300000.add(voidsuper.returnStringObject);
        this.\u00d300000.add(voidsuper.O\u00d3\u00d8000);
        this.\u00d300000.add(voidsuper.O\u00d5\u00d5000);
        this.\u00d300000.add(voidsuper.o\u00d6\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f4\u00d2\u00d8000);
        this.\u00d300000.add(voidsuper.\u00d5\u00f8\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d3\u00f5\u00d6000);
        this.\u00d300000.add(voidsuper.o\u00d6\u00d6000);
        this.\u00d300000.add(voidsuper.\u00f8\u00f5\u00d6000);
        this.\u00d300000.add(voidsuper.newthisString);
        this.\u00d300000.add(voidsuper.O0\u00d8000);
        this.\u00d300000.add(voidsuper.\u00f8\u00d4\u00d5000);
        this.\u00d300000.add(voidsuper.nullintObject);
        this.\u00d300000.add(voidsuper.\u00d80\u00d6000);
        this.\u00d300000.add(voidsuper.o\u00d8\u00d6000);
        this.\u00d300000.add(voidsuper.ifprivateObject);
        this.\u00d300000.add(voidsuper.\u00d3\u00d5\u00d6000);
        this.\u00d300000.add(voidsuper.O\u00f4\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d5\u00f5\u00d6000);
        this.\u00d300000.add(voidsuper.\u00f50\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d8\u00f5\u00d5000);
        this.\u00d300000.add(voidsuper.fordoObject);
        this.\u00d300000.add(voidsuper.\u00f8o\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d5\u00d8\u00d5000);
        this.\u00d300000.add(voidsuper.ifStringObject);
        this.\u00d300000.add(voidsuper.thispublicObject);
        this.\u00d300000.add(voidsuper.\u00f8\u00d8\u00d6000);
        this.\u00d300000.add(voidsuper.whilereturnObject);
        this.\u00d300000.add(voidsuper.\u00f8\u00f6\u00d5000);
        this.\u00d300000.add(voidsuper.thisdoObject);
        this.\u00d300000.add(voidsuper.\u00d4\u00f4\u00d6000);
        this.\u00d300000.add(voidsuper.\u00f4\u00f5\u00d6000);
        this.\u00d300000.add(voidsuper.whilenullObject);
        this.\u00d300000.add(voidsuper.\u00f5\u00f4\u00d5000);
        this.\u00d300000.add(voidsuper.\u00d8O\u00d6000);
        this.\u00d300000.add(voidsuper.\u00f5\u00f8\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f5\u00d2\u00d8000);
        this.\u00d300000.add(voidsuper.O\u00d4\u00d6000);
        this.\u00d300000.add(voidsuper.o\u00d2\u00d6000);
        this.\u00d300000.add(voidsuper.whileprivateObject);
        this.\u00d300000.add(voidsuper.\u00f8\u00d6\u00d5000);
        this.\u00d300000.add(voidsuper.\u00d5\u00f4\u00d6000);
        this.\u00d300000.add(voidsuper.nullinterfaceObject);
        this.\u00d300000.add(voidsuper.\u00f4O\u00d6000);
        this.\u00d300000.add(voidsuper.\u00f8\u00f6\u00d6000);
        this.\u00d300000.add(voidsuper.O\u00f8\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d4\u00d3\u00d8000);
        this.\u00d300000.add(voidsuper.\u00d8\u00f4\u00d5000);
        this.\u00d300000.add(voidsuper.\u00f5\u00f8\u00d6000);
        this.\u00d300000.add(voidsuper.O\u00d2\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d4\u00f5\u00d6000);
        this.\u00d300000.add(voidsuper.\u00f5\u00d4\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d3O\u00d8000);
        this.\u00d300000.add(voidsuper.\u00f5\u00d5\u00d5000);
        this.\u00d300000.add(voidsuper.newwhileObject);
        this.\u00d300000.add(voidsuper.\u00d80\u00d8000);
        this.\u00d300000.add(voidsuper.\u00d3\u00d2\u00d8000);
        this.\u00d300000.add(voidsuper.ifnewObject);
        this.\u00d300000.add(voidsuper.forfloatObject);
        this.\u00d300000.add(voidsuper.o\u00f5\u00d5000);
        this.\u00d300000.add(voidsuper.\u00d8\u00d2\u00d8000);
        this.\u00d300000.add(voidsuper.OO\u00d8000);
        this.\u00d300000.add(voidsuper.\u00f8\u00d6\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d5\u00f6\u00d6000);
        this.\u00d300000.add(voidsuper.\u00d5\u00d4\u00d5000);
        this.\u00d300000.add(voidsuper.\u00d4\u00d6\u00d5000);
        this.\u00d300000.add(voidsuper.Oo\u00d8000);
        this.\u00d300000.add(voidsuper.\u00d3o\u00d6000);
        this.\u00d300000.add(voidsuper.\u00f4\u00d6\u00d6000);
    }

    private void \u00d3o0000() {
        this.String.add(voidsuper.\u00d5\u00d5\u00d5000);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Rahjak\u00fcnste");
        voidsuper.\u00d5\u00d5\u00d5000.setSpezialisierungen(arrayList);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("optimatische Etikette");
        voidsuper.O0\u00d6000.setSpezialisierungen(arrayList2);
        this.String.add(voidsuper.O0\u00d6000);
        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("Festgestaltung");
        arrayList3.add("Garderobe/Schminke");
        arrayList3.add("Liebesk\u00fcnste");
        voidsuper.\u00f4\u00f8\u00d5000.setSpezialisierungen(arrayList3);
        this.\u00d800000.add(voidsuper.\u00f4\u00f8\u00d5000);
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("Beschatten");
        arrayList4.add("Hehlerei");
        arrayList4.add("Kontakte");
        arrayList4.add("Ortseinsch\u00e4tzung");
        voidsuper.O\u00f6\u00d5000.setSpezialisierungen(arrayList4);
        this.String.add(voidsuper.O\u00f6\u00d5000);
        ArrayList<String> arrayList5 = new ArrayList<String>();
        arrayList5.add("Kampftalente");
        arrayList5.add("K\u00f6rperliche Talente");
        arrayList5.add("Gesellschaftliche Talente");
        arrayList5.add("Natur-Talente");
        arrayList5.add("Wissenstalente");
        arrayList5.add("Handwerkstalente");
        arrayList5.add("Sprachen und Schriften");
        voidsuper.\u00d8\u00d5\u00d6000.setSpezialisierungen(arrayList5);
        this.String.add(voidsuper.\u00d8\u00d5\u00d6000);
        this.String.add(voidsuper.thisinterfaceObject);
        ArrayList<String> arrayList6 = new ArrayList<String>();
        arrayList6.add("Kom\u00f6die");
        arrayList6.add("Possen");
        arrayList6.add("Trag\u00f6die");
        voidsuper.newnullObject.setSpezialisierungen(arrayList6);
        this.String.add(voidsuper.newnullObject);
        ArrayList<String> arrayList7 = new ArrayList<String>();
        arrayList7.add("Schreiber");
        arrayList7.add("Schriftsteller");
        voidsuper.forpublicObject.setSpezialisierungen(arrayList7);
        this.String.add(voidsuper.forpublicObject);
        ArrayList<String> arrayList8 = new ArrayList<String>();
        arrayList8.add("anderer Stand");
        arrayList8.add("anderes Geschlecht");
        arrayList8.add("andere Rasse");
        arrayList8.add("fremde Kultur");
        voidsuper.forclassObject.setSpezialisierungen(arrayList8);
        this.String.add(voidsuper.forclassObject);
        ArrayList<String> arrayList9 = new ArrayList<String>();
        arrayList9.add("Aufwiegeln");
        arrayList9.add("Betteln");
        arrayList9.add("Einsch\u00fcchtern");
        arrayList9.add("Feilschen");
        arrayList9.add("L\u00fcgen");
        voidsuper.\u00d30\u00d8000.setSpezialisierungen(arrayList9);
        this.String.add(voidsuper.\u00d30\u00d8000);
        ArrayList<String> arrayList10 = new ArrayList<String>();
        arrayList10.add("\u00d6ffentliche Rede (Demagogie/Pl\u00e4doyer/Predigt)");
        arrayList10.add("Einzelgespr\u00e4ch (Verh\u00f6r/Bekehrung)");
        arrayList10.add("Diskussionsrhetorik");
        arrayList10.add("schriftliche Rhetorik");
        voidsuper.StringclassObject.setSpezialisierungen(arrayList10);
        this.String.add(voidsuper.StringclassObject);
    }

    private void \u00d200000() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Dompteur");
        arrayList.add("Echsenb\u00e4ndiger");
        arrayList.add("Falkner");
        arrayList.add("Hundef\u00fchrer");
        arrayList.add("Zureiter");
        arrayList.add("Gro\u00dfinsekten");
        voidsuper.\u00d8\u00d5\u00d5000.setSpezialisierungen(arrayList);
        this.String.add(voidsuper.\u00d8\u00d5\u00d5000);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("neristische Pilzzucht");
        arrayList2.add("G'Rolmur-Biotope");
        voidsuper.\u00d5\u00d2\u00d6000.setSpezialisierungen(arrayList2);
        this.String.add(voidsuper.\u00d5\u00d2\u00d6000);
        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("Brandmittel");
        arrayList3.add("Gifte");
        arrayList3.add("Laborpraxis");
        arrayList3.add("Zauber-Elixiere");
        arrayList3.add("Farben/Lacke");
        arrayList3.add("Veredelung (Gl\u00e4ser)");
        arrayList3.add("Veredelung (Porzellan)");
        arrayList3.add("Veredelung (Legierungen)");
        arrayList3.add("Veredelung (Goldmacherei)");
        arrayList3.add("Theoretische Alchimie (Elementarismus)");
        arrayList3.add("Theoretische Alchimie (Sympathetik)");
        voidsuper.\u00f5o\u00d6000.setSpezialisierungen(arrayList3);
        this.String.add(voidsuper.\u00f5o\u00d6000);
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("Bergwerke");
        arrayList4.add("Kanalisation");
        arrayList4.add("nat\u00fcrliche H\u00f6hlen");
        arrayList4.add("Sappeur");
        arrayList4.add("unterirdische St\u00e4dte");
        voidsuper.forObjectObject.setSpezialisierungen(arrayList4);
        this.String.add(voidsuper.forObjectObject);
        ArrayList<String> arrayList5 = new ArrayList<String>();
        arrayList5.add("Armbrust");
        arrayList5.add("Bolzen");
        arrayList5.add("Pfeile");
        arrayList5.add("Torsionswaffen");
        arrayList5.add("Bogen");
        voidsuper.forvoidObject.setSpezialisierungen(arrayList5);
        this.String.add(voidsuper.forvoidObject);
        ArrayList<String> arrayList6 = new ArrayList<String>();
        arrayList6.add("Segeln");
        arrayList6.add("Staken");
        arrayList6.add("Paddeln");
        arrayList6.add("Rudern");
        arrayList6.add("Eissegler");
        voidsuper.thisclassObject.setSpezialisierungen(arrayList6);
        this.String.add(voidsuper.thisclassObject);
        this.String.add(voidsuper.\u00d8O\u00d8000);
        ArrayList<String> arrayList7 = new ArrayList<String>();
        arrayList7.add("Buchdruck");
        arrayList7.add("Druckereitechnik");
        arrayList7.add("Pamphlete");
        arrayList7.add("Typographie");
        voidsuper.\u00d4\u00d3\u00d6000.setSpezialisierungen(arrayList7);
        this.String.add(voidsuper.\u00d4\u00d3\u00d6000);
        this.\u00d800000.add(voidsuper.O\u00f6\u00d6000);
        ArrayList<String> arrayList8 = new ArrayList<String>();
        arrayList8.add("Lastkarren");
        arrayList8.add("Streitwagen");
        arrayList8.add("Zuggespanne");
        arrayList8.add("Hundeschlitten");
        arrayList8.add("Dachsschlitten");
        voidsuper.\u00d5o\u00d8000.setSpezialisierungen(arrayList8);
        this.String.add(voidsuper.\u00d5o\u00d8000);
        ArrayList<String> arrayList9 = new ArrayList<String>();
        arrayList9.add("Karten");
        arrayList9.add("W\u00fcrfel");
        voidsuper.O\u00d3\u00d6000.setSpezialisierungen(arrayList9);
        this.String.add(voidsuper.O\u00d3\u00d6000);
        ArrayList<String> arrayList10 = new ArrayList<String>();
        arrayList10.add("Gold- und Silberschmied");
        arrayList10.add("Gravieren");
        arrayList10.add("Schl\u00f6sser");
        arrayList10.add("Siegelst\u00f6cke");
        arrayList10.add("Trickwaffen/Fallen");
        arrayList10.add("Uhrwerke");
        voidsuper.o\u00f6\u00d5000.setSpezialisierungen(arrayList10);
        this.String.add(voidsuper.o\u00f6\u00d5000);
        this.String.add(voidsuper.\u00f80\u00d8000);
        ArrayList<String> arrayList11 = new ArrayList<String>();
        arrayList11.add("Fische");
        arrayList11.add("Gefl\u00fcgel");
        arrayList11.add("Reptilien");
        arrayList11.add("S\u00e4ugetiere");
        voidsuper.oO\u00d6000.setSpezialisierungen(arrayList11);
        this.String.add(voidsuper.oO\u00d6000);
        ArrayList<String> arrayList12 = new ArrayList<String>();
        arrayList12.add("Gerber");
        arrayList12.add("K\u00fcrschner");
        arrayList12.add("Troph\u00e4en");
        voidsuper.Oo\u00d6000.setSpezialisierungen(arrayList12);
        this.String.add(voidsuper.Oo\u00d6000);
        ArrayList<String> arrayList13 = new ArrayList<String>();
        arrayList13.add("Fensterscheiben");
        arrayList13.add("Glasbl\u00e4serei");
        arrayList13.add("Linsenschleifen");
        arrayList13.add("Spiegel");
        voidsuper.O\u00f5\u00d6000.setSpezialisierungen(arrayList13);
        this.String.add(voidsuper.O\u00f5\u00d6000);
        ArrayList<String> arrayList14 = new ArrayList<String>();
        arrayList14.add("Drahtzieher");
        arrayList14.add("Hufschmied");
        arrayList14.add("Pl\u00e4ttner");
        arrayList14.add("Schwarzschmied");
        arrayList14.add("Spengler");
        arrayList14.add("Waffenschmied");
        voidsuper.\u00f5\u00d8\u00d5000.setSpezialisierungen(arrayList14);
        this.String.add(voidsuper.\u00f5\u00d8\u00d5000);
        ArrayList<String> arrayList15 = new ArrayList<String>();
        arrayList15.add("Thorwal");
        arrayList15.add("Weiden");
        arrayList15.add("Mhanadistan");
        arrayList15.add("Korn");
        arrayList15.add("Metalle");
        arrayList15.add("Sklaven");
        arrayList15.add("Geldwechsel");
        voidsuper.\u00d5\u00d6\u00d6000.setSpezialisierungen(arrayList15);
        this.String.add(voidsuper.\u00d5\u00d6\u00d6000);
        ArrayList<String> arrayList16 = new ArrayList<String>();
        arrayList16.add("Bewirtung/Feiern");
        arrayList16.add("Personal");
        arrayList16.add("Vorratshaltung");
        voidsuper.privatedoObject.setSpezialisierungen(arrayList16);
        this.String.add(voidsuper.privatedoObject);
    }

    private void \u00d6O0000() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("alchimistische/Zaubergifte");
        arrayList.add("mineralische Gifte");
        arrayList.add("pflanzliche Gifte");
        arrayList.add("tierische Gifte");
        arrayList.add("Atemgifte");
        arrayList.add("Einnahmegifte");
        arrayList.add("Kontaktgifte");
        arrayList.add("Waffengifte");
        arrayList.add("Tierheilkunde");
        voidsuper.\u00f4\u00d5\u00d6000.setSpezialisierungen(arrayList);
        this.String.add(voidsuper.\u00f4\u00d5\u00d6000);
        this.String.add(voidsuper.\u00f5\u00f5\u00d6000);
        this.String.add(voidsuper.StringObjectObject);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Traumdeuten");
        voidsuper.StringObjectObject.setSpezialisierungen(arrayList2);
        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("Br\u00fcche/Quetschungen");
        arrayList3.add("Schnitte");
        arrayList3.add("Verbrennungen");
        arrayList3.add("Zahnleiden");
        arrayList3.add("Innere Verletzungen");
        arrayList3.add("Tierheilkunde");
        voidsuper.\u00d5\u00d5\u00d6000.setSpezialisierungen(arrayList3);
        this.String.add(voidsuper.\u00d5\u00d5\u00d6000);
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("Beinschnitzerei");
        arrayList4.add("K\u00fcfer/Wagner");
        arrayList4.add("Holzkunde");
        arrayList4.add("Holzwaffen");
        arrayList4.add("M\u00f6belschreiner");
        arrayList4.add("Schnitzen");
        voidsuper.\u00d3\u00d8\u00d5000.setSpezialisierungen(arrayList4);
        this.String.add(voidsuper.\u00d3\u00d8\u00d5000);
        this.\u00d800000.add(voidsuper.o\u00d4\u00d6000);
        ArrayList<String> arrayList5 = new ArrayList<String>();
        arrayList5.add("Blasinstrumente");
        arrayList5.add("Saiteninstrumente");
        arrayList5.add("Tasteninstrumente");
        arrayList5.add("Trommeln");
        voidsuper.\u00d8\u00f5\u00d6000.setSpezialisierungen(arrayList5);
        this.String.add(voidsuper.\u00d8\u00f5\u00d6000);
        ArrayList<String> arrayList6 = new ArrayList<String>();
        arrayList6.add("Dirigieren");
        arrayList6.add("Komponieren");
        voidsuper.\u00f5O\u00d6000.setSpezialisierungen(arrayList6);
        this.\u00d800000.add(voidsuper.\u00f5O\u00d6000);
        ArrayList<String> arrayList7 = new ArrayList<String>();
        arrayList7.add("Geb\u00e4ude");
        arrayList7.add("H\u00f6hlen/Tunnel");
        arrayList7.add("K\u00fcsten/Meere");
        arrayList7.add("Landschaften");
        arrayList7.add("Stadt");
        voidsuper.ifnullObject.setSpezialisierungen(arrayList7);
        this.String.add(voidsuper.ifnullObject);
        ArrayList<String> arrayList8 = new ArrayList<String>();
        arrayList8.add("Backen/Braten");
        arrayList8.add("Festmahle");
        arrayList8.add("Haltbarmachen");
        arrayList8.add("Marschversorgung");
        arrayList8.add("Tr\u00e4nke");
        arrayList8.add("Vorkoster");
        voidsuper.o\u00f6\u00d6000.setSpezialisierungen(arrayList8);
        this.String.add(voidsuper.o\u00f6\u00d6000);
        this.String.add(voidsuper.privateclassObject);
        ArrayList<String> arrayList9 = new ArrayList<String>();
        arrayList9.add("Gurte/Riemen");
        arrayList9.add("Lederkleidung");
        arrayList9.add("Lederr\u00fcstungen");
        arrayList9.add("S\u00e4ttel");
        arrayList9.add("Schuhwerk");
        voidsuper.\u00d4\u00d4\u00d5000.setSpezialisierungen(arrayList9);
        this.String.add(voidsuper.\u00d4\u00d4\u00d5000);
        ArrayList<String> arrayList10 = new ArrayList<String>();
        arrayList10.add("Architektur");
        arrayList10.add("Landschaften");
        arrayList10.add("Portr\u00e4t");
        arrayList10.add("technische Skizze");
        voidsuper.\u00d3\u00f4\u00d5000.setSpezialisierungen(arrayList10);
        this.String.add(voidsuper.\u00d3\u00f4\u00d5000);
        ArrayList<String> arrayList11 = new ArrayList<String>();
        arrayList11.add("Steinbau");
        arrayList11.add("Steinguss");
        arrayList11.add("Ziegelbau");
        voidsuper.\u00f4\u00f6\u00d6000.setSpezialisierungen(arrayList11);
        this.String.add(voidsuper.\u00f4\u00f6\u00d6000);
        ArrayList<String> arrayList12 = new ArrayList<String>();
        arrayList12.add("Klangk\u00f6rper");
        arrayList12.add("Rohre");
        arrayList12.add("Reliefplatten/Statuen");
        voidsuper.\u00d8\u00d8\u00d6000.setSpezialisierungen(arrayList12);
        this.String.add(voidsuper.\u00d8\u00d8\u00d6000);
        ArrayList<String> arrayList13 = new ArrayList<String>();
        arrayList13.add("Blechblasinstrumente");
        arrayList13.add("Fl\u00f6ten");
        arrayList13.add("Harfen");
        arrayList13.add("Lauten");
        arrayList13.add("Rhythmusinstrumente");
        arrayList13.add("Streichinstrumente");
        arrayList13.add("Tasteninstrumente");
        arrayList13.add("Kapellmeister/Dirigent");
        voidsuper.privateObjectObject.setSpezialisierungen(arrayList13);
        this.String.add(voidsuper.privateObjectObject);
        ArrayList<String> arrayList14 = new ArrayList<String>();
        arrayList14.add("Fallen");
        arrayList14.add("Schl\u00f6sser");
        voidsuper.O\u00d8\u00d5000.setSpezialisierungen(arrayList14);
        this.String.add(voidsuper.O\u00d8\u00d5000);
        ArrayList<String> arrayList15 = new ArrayList<String>();
        arrayList15.add("alchim. Destillation");
        arrayList15.add("Beeren-/Obstbr\u00e4nde");
        arrayList15.add("Kornbr\u00e4nde");
        arrayList15.add("Kr\u00e4uterschn\u00e4pse");
        arrayList15.add("Lagerung");
        voidsuper.ififObject.setSpezialisierungen(arrayList15);
        this.String.add(voidsuper.ififObject);
        ArrayList<String> arrayList16 = new ArrayList<String>();
        arrayList16.add("Entwurf/Festgew\u00e4nder");
        arrayList16.add("Flicken/Gebrauch");
        arrayList16.add("Ma\u00dfschneidern");
        arrayList16.add("Tuchr\u00fcstungen");
        arrayList16.add("Sticken");
        voidsuper.returnifObject.setSpezialisierungen(arrayList16);
        this.String.add(voidsuper.returnifObject);
        ArrayList<String> arrayList17 = new ArrayList<String>();
        arrayList17.add("Ruderschiff");
        arrayList17.add("Segelschiff");
        arrayList17.add("Steuermann");
        arrayList17.add("arkane Antriebe");
        arrayList17.add("Demergator");
        voidsuper.\u00d8\u00d8\u00d5000.setSpezialisierungen(arrayList17);
        this.String.add(voidsuper.\u00d8\u00d8\u00d5000);
        this.String.add(voidsuper.\u00f5\u00f6\u00d5000);
        ArrayList<String> arrayList18 = new ArrayList<String>();
        arrayList18.add("Baugestein");
        arrayList18.add("Reliefs");
        arrayList18.add("Statuen");
        voidsuper.\u00f8\u00f8\u00d6000.setSpezialisierungen(arrayList18);
        this.String.add(voidsuper.\u00f8\u00f8\u00d6000);
        this.String.add(voidsuper.StringfloatObject);
        ArrayList<String> arrayList19 = new ArrayList<String>();
        arrayList19.add("Karren/Wagen");
        arrayList19.add("Schlitten");
        arrayList19.add("Streitwagen");
        voidsuper.whilewhileObject.setSpezialisierungen(arrayList19);
        this.String.add(voidsuper.whilewhileObject);
        ArrayList<String> arrayList20 = new ArrayList<String>();
        arrayList20.add("Ruderschiff");
        arrayList20.add("Segelschiff");
        voidsuper.whileifObject.setSpezialisierungen(arrayList20);
        this.\u00d800000.add(voidsuper.whileifObject);
        ArrayList<String> arrayList21 = new ArrayList<String>();
        arrayList21.add("alchimistische Farben");
        arrayList21.add("mineralische Farben");
        arrayList21.add("pflanzliche Farben");
        arrayList21.add("tierische Farben");
        arrayList21.add("Stoffdruck");
        voidsuper.\u00d5\u00d3\u00d6000.setSpezialisierungen(arrayList21);
        this.String.add(voidsuper.\u00d5\u00d3\u00d6000);
        ArrayList<String> arrayList22 = new ArrayList<String>();
        arrayList22.add("Natur Darstellung");
        arrayList22.add("Ornamente");
        arrayList22.add("Zaubert\u00e4towierungen");
        voidsuper.\u00d3\u00f8\u00d6000.setSpezialisierungen(arrayList22);
        this.String.add(voidsuper.\u00d3\u00f8\u00d6000);
        ArrayList<String> arrayList23 = new ArrayList<String>();
        arrayList23.add("Gef\u00e4\u00dfe");
        arrayList23.add("Statuetten");
        arrayList23.add("Ziegelei");
        voidsuper.\u00f8\u00d3\u00d6000.setSpezialisierungen(arrayList23);
        this.String.add(voidsuper.\u00f8\u00d3\u00d6000);
        ArrayList<String> arrayList24 = new ArrayList<String>();
        arrayList24.add("Rind");
        arrayList24.add("Schaf/Ziege");
        arrayList24.add("Schwein");
        arrayList24.add("Pferd");
        arrayList24.add("Hund");
        voidsuper.\u00f5\u00d5\u00d6000.setSpezialisierungen(arrayList24);
        this.String.add(voidsuper.\u00f5\u00d5\u00d6000);
        ArrayList<String> arrayList25 = new ArrayList<String>();
        arrayList25.add("H\u00e4keln");
        arrayList25.add("Kl\u00f6ppeln");
        arrayList25.add("Stricken");
        arrayList25.add("Teppichkn\u00fcpfen");
        arrayList25.add("Weben");
        voidsuper.newreturnObject.setSpezialisierungen(arrayList25);
        this.String.add(voidsuper.newreturnObject);
        ArrayList<String> arrayList26 = new ArrayList<String>();
        arrayList26.add("Wein");
        arrayList26.add("Fruchtweine");
        arrayList26.add("Schaumweine");
        arrayList26.add("Weinkenner");
        voidsuper.\u00f4\u00d8\u00d6000.setSpezialisierungen(arrayList26);
        this.String.add(voidsuper.\u00f4\u00d8\u00d6000);
        ArrayList<String> arrayList27 = new ArrayList<String>();
        arrayList27.add("Dachdecker");
        arrayList27.add("Holzkonstruktionen");
        arrayList27.add("Schiffszimmermann");
        arrayList27.add("Schiffbau");
        voidsuper.oo\u00d8000.setSpezialisierungen(arrayList27);
        this.String.add(voidsuper.oo\u00d8000);
        ArrayList<String> arrayList28 = new ArrayList<String>();
        arrayList28.add("Ballon");
        arrayList28.add("Gleiter");
        arrayList28.add("Insektopter");
        arrayList28.add("Luftschiff");
        voidsuper.\u00f5\u00d6\u00d5000.setSpezialisierungen(arrayList28);
        this.String.add(voidsuper.\u00f5\u00d6\u00d5000);
    }

    private void class() {
        for (F f2 : O0OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d400000().o00000()) {
            helden.framework.E.G g2;
            int n;
            for (n = 0; n < f2.Object(B.\u00d400000); ++n) {
                g2 = (A)f2.o00000(B.\u00d400000, n);
                if (((A)g2).\u00d2\u00d50000()) continue;
                for (E e : ((A)g2).\u00f6\u00d40000()) {
                    if (e.getSpezialisierungen() != null && e.getSpezialisierungen().contains(f2.toString())) continue;
                    e.addSpezialisierungen(f2.toString());
                }
            }
            for (n = 0; n < f2.Object(B.class); ++n) {
                g2 = (helden.framework.E.C.E)f2.o00000(B.class, n);
                for (E e : ((helden.framework.E.C.E)g2).\u00f5o0000()) {
                    if (((helden.framework.E.C.E)g2).thisnew() || e.getSpezialisierungen() != null && e.getSpezialisierungen().contains(f2.toString())) continue;
                    e.addSpezialisierungen(f2.toString());
                }
            }
        }
    }

    private void \u00f400000() {
        ArrayList<E> arrayList = new ArrayList<E>();
        arrayList.add(E.thissuperString);
        arrayList.add(E.ifthisString);
        E.\u00d8\u00d6\u00d8000.\u00d200000(arrayList);
        this.String.add(E.\u00d8\u00d6\u00d8000);
        ArrayList<E> arrayList2 = new ArrayList<E>();
        arrayList2.add(E.\u00d3\u00d6\u00d8000);
        E.\u00d4\u00d6\u00d8000.\u00d200000(arrayList2);
        this.String.add(E.\u00d4\u00d6\u00d8000);
        ArrayList<E> arrayList3 = new ArrayList<E>();
        arrayList3.add(E.O\u00d5\u00d8000);
        arrayList3.add(E.O\u00d4\u00d8000);
        E.\u00f4\u00d3\u00d8000.\u00d200000(arrayList3);
        this.String.add(E.\u00f4\u00d3\u00d8000);
        this.String.add(E.\u00d4\u00d4\u00d8000);
        this.String.add(E.\u00d3\u00d6\u00d8000);
        this.String.add(E.returnnewString);
        ArrayList<E> arrayList4 = new ArrayList<E>();
        arrayList4.add(E.\u00d4\u00d5\u00d8000);
        arrayList4.add(E.\u00f4\u00d6\u00d8000);
        E.nullsuperString.\u00d200000(arrayList4);
        this.String.add(E.nullsuperString);
        ArrayList<E> arrayList5 = new ArrayList<E>();
        arrayList5.add(E.nullsuperString);
        arrayList5.add(E.thissuperString);
        E.\u00d4\u00d5\u00d8000.\u00d200000(arrayList5);
        this.String.add(E.\u00d4\u00d5\u00d8000);
        ArrayList<E> arrayList6 = new ArrayList<E>();
        arrayList6.add(E.\u00f4\u00d4\u00d8000);
        arrayList6.add(E.\u00f8\u00d5\u00d8000);
        E.\u00f5\u00d3\u00d8000.\u00d200000(arrayList6);
        this.String.add(E.\u00f5\u00d3\u00d8000);
        ArrayList<E> arrayList7 = new ArrayList<E>();
        arrayList7.add(E.o\u00d6\u00d8000);
        arrayList7.add(E.\u00f8\u00d5\u00d8000);
        E.\u00d8\u00d5\u00d8000.\u00d200000(arrayList7);
        this.String.add(E.\u00d8\u00d5\u00d8000);
        ArrayList<E> arrayList8 = new ArrayList<E>();
        arrayList8.add(E.\u00f4\u00d5\u00d8000);
        arrayList8.add(E.\u00d5\u00d5\u00d8000);
        E.o\u00d5\u00d8000.\u00d200000(arrayList8);
        this.String.add(E.o\u00d5\u00d8000);
        ArrayList<E> arrayList9 = new ArrayList<E>();
        arrayList9.add(E.o\u00d5\u00d8000);
        arrayList9.add(E.\u00d5\u00d5\u00d8000);
        E.\u00f4\u00d5\u00d8000.\u00d200000(arrayList9);
        this.String.add(E.\u00f4\u00d5\u00d8000);
        this.String.add(E.O\u00d6\u00d8000);
        this.String.add(E.whilethisString);
        this.String.add(E.\u00f4\u00d6\u00d8000);
        this.String.add(E.newnewString);
        ArrayList<E> arrayList10 = new ArrayList<E>();
        arrayList10.add(E.thissuperString);
        arrayList10.add(E.\u00f5\u00d3\u00d8000);
        E.\u00f4\u00d4\u00d8000.\u00d200000(arrayList10);
        this.String.add(E.\u00f4\u00d4\u00d8000);
        this.String.add(E.\u00f5\u00d5\u00d8000);
        ArrayList<E> arrayList11 = new ArrayList<E>();
        arrayList11.add(E.\u00f4\u00d4\u00d8000);
        arrayList11.add(E.\u00d4\u00d5\u00d8000);
        arrayList11.add(E.\u00d8\u00d6\u00d8000);
        E.thissuperString.\u00d200000(arrayList11);
        this.String.add(E.thissuperString);
        ArrayList<E> arrayList12 = new ArrayList<E>();
        arrayList12.add(E.\u00d8\u00d5\u00d8000);
        arrayList12.add(E.StringsuperString);
        E.o\u00d6\u00d8000.\u00d200000(arrayList12);
        this.String.add(E.o\u00d6\u00d8000);
        ArrayList<E> arrayList13 = new ArrayList<E>();
        arrayList13.add(E.o\u00d6\u00d8000);
        arrayList13.add(E.StringsuperString);
        E.\u00d3\u00d4\u00d8000.\u00d200000(arrayList13);
        this.String.add(E.\u00d3\u00d4\u00d8000);
        ArrayList<E> arrayList14 = new ArrayList<E>();
        arrayList14.add(E.\u00d3\u00d5\u00d8000);
        arrayList14.add(E.\u00d5\u00d6\u00d8000);
        E.\u00d5\u00d4\u00d8000.\u00d200000(arrayList14);
        this.String.add(E.\u00d5\u00d4\u00d8000);
        ArrayList<E> arrayList15 = new ArrayList<E>();
        arrayList15.add(E.\u00d3\u00d5\u00d8000);
        arrayList15.add(E.\u00d5\u00d4\u00d8000);
        E.\u00d5\u00d6\u00d8000.\u00d200000(arrayList15);
        this.String.add(E.\u00d5\u00d6\u00d8000);
        ArrayList<E> arrayList16 = new ArrayList<E>();
        arrayList16.add(E.\u00d5\u00d4\u00d8000);
        E.\u00d3\u00d5\u00d8000.\u00d200000(arrayList16);
        this.String.add(E.\u00d3\u00d5\u00d8000);
        ArrayList<E> arrayList17 = new ArrayList<E>();
        arrayList17.add(E.\u00f4\u00d5\u00d8000);
        arrayList17.add(E.\u00d8\u00d5\u00d8000);
        E.\u00d5\u00d5\u00d8000.\u00d200000(arrayList17);
        this.String.add(E.\u00d5\u00d5\u00d8000);
        ArrayList<E> arrayList18 = new ArrayList<E>();
        arrayList18.add(E.\u00f5\u00d3\u00d8000);
        arrayList18.add(E.\u00d8\u00d5\u00d8000);
        E.\u00f8\u00d5\u00d8000.\u00d200000(arrayList18);
        this.String.add(E.\u00f8\u00d5\u00d8000);
        ArrayList<E> arrayList19 = new ArrayList<E>();
        arrayList19.add(E.thissuperString);
        arrayList19.add(E.\u00f4\u00d4\u00d8000);
        arrayList19.add(E.\u00d8\u00d6\u00d8000);
        E.ifthisString.\u00d200000(arrayList19);
        this.String.add(E.ifthisString);
        ArrayList<E> arrayList20 = new ArrayList<E>();
        arrayList20.add(E.o\u00d6\u00d8000);
        arrayList20.add(E.\u00d3\u00d4\u00d8000);
        arrayList20.add(E.\u00d8\u00d6\u00d8000);
        E.StringsuperString.\u00d200000(arrayList20);
        this.String.add(E.StringsuperString);
        ArrayList<E> arrayList21 = new ArrayList<E>();
        arrayList21.add(E.\u00d4\u00d6\u00d8000);
        arrayList21.add(E.\u00d3\u00d6\u00d8000);
        E.O\u00d5\u00d8000.\u00d200000(arrayList20);
        this.String.add(E.O\u00d5\u00d8000);
        this.class();
        ArrayList<E> arrayList22 = new ArrayList<E>();
        arrayList22.add(E.O\u00d5\u00d8000);
        E.O\u00d4\u00d8000.\u00d200000(arrayList20);
        this.String.add(E.O\u00d4\u00d8000);
        this.class();
    }

    private void \u00d6o0000() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Balancieren");
        arrayList.add("Bodenakrobatik");
        arrayList.add("Schwingen");
        arrayList.add("Spr\u00fcnge");
        arrayList.add("Winden");
        voidsuper.o\u00d2\u00d8000.setSpezialisierungen(arrayList);
        this.String.add(voidsuper.o\u00d2\u00d8000);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Hochsprung");
        arrayList2.add("Kraftakte");
        arrayList2.add("Langlauf");
        arrayList2.add("Sprint");
        arrayList2.add("Weitsprung");
        voidsuper.ifforObject.setSpezialisierungen(arrayList2);
        this.String.add(voidsuper.ifforObject);
        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("Hexenbesen");
        arrayList3.add("Fliegender Teppich");
        voidsuper.\u00f4\u00f4\u00d6000.setSpezialisierungen(arrayList3);
        this.String.add(voidsuper.\u00f4\u00f4\u00d6000);
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("Bauchreden");
        arrayList4.add("Feuerkunst");
        arrayList4.add("Jonglieren");
        arrayList4.add("Possenrei\u00dfen");
        arrayList4.add("Taschenspielereien");
        voidsuper.OO\u00d6000.setSpezialisierungen(arrayList4);
        this.String.add(voidsuper.OO\u00d6000);
        ArrayList<String> arrayList5 = new ArrayList<String>();
        arrayList5.add("Bergsteigen");
        arrayList5.add("Eisklettern");
        arrayList5.add("Freiklettern");
        arrayList5.add("Seilklettern");
        voidsuper.\u00f8\u00f4\u00d6000.setSpezialisierungen(arrayList5);
        this.String.add(voidsuper.\u00f8\u00f4\u00d6000);
        ArrayList<String> arrayList6 = new ArrayList<String>();
        arrayList6.add("Fallen");
        arrayList6.add("Spr\u00fcnge");
        arrayList6.add("Standfestigkeit");
        voidsuper.\u00d4\u00d2\u00d8000.setSpezialisierungen(arrayList6);
        this.String.add(voidsuper.\u00d4\u00d2\u00d8000);
        ArrayList<String> arrayList7 = new ArrayList<String>();
        arrayList7.add("Pferd/Esel/Muli");
        arrayList7.add("Kamel");
        arrayList7.add("Strau\u00df");
        arrayList7.add("Reitechse");
        arrayList7.add("Flugechse");
        arrayList7.add("Hippogriff");
        arrayList7.add("Reit-Wildschwein");
        voidsuper.\u00d5O\u00d6000.setSpezialisierungen(arrayList7);
        this.String.add(voidsuper.\u00d5O\u00d6000);
        ArrayList<String> arrayList8 = new ArrayList<String>();
        arrayList8.add("Eis/Schnee");
        arrayList8.add("Geb\u00e4ude");
        arrayList8.add("Ger\u00f6ll");
        arrayList8.add("Stra\u00dfen");
        arrayList8.add("Wald/Dschungel");
        voidsuper.returnforObject.setSpezialisierungen(arrayList8);
        this.String.add(voidsuper.returnforObject);
        ArrayList<String> arrayList9 = new ArrayList<String>();
        arrayList9.add("Langstreckenschwimmen");
        arrayList9.add("Schnellschwimmen");
        arrayList9.add("Tauchen");
        arrayList9.add("Unterwasserkampf");
        voidsuper.returnprivateObject.setSpezialisierungen(arrayList9);
        this.String.add(voidsuper.returnprivateObject);
        ArrayList<String> arrayList10 = new ArrayList<String>();
        arrayList10.add("Ersch\u00f6pfung Ignorieren");
        arrayList10.add("Schmerz Unterdr\u00fccken");
        arrayList10.add("St\u00f6rungen Ignorieren");
        arrayList10.add("Wunden Ignorieren");
        voidsuper.\u00d4\u00f8\u00d5000.setSpezialisierungen(arrayList10);
        this.String.add(voidsuper.\u00d4\u00f8\u00d5000);
        ArrayList<String> arrayList11 = new ArrayList<String>();
        arrayList11.add("Geb\u00e4ude");
        arrayList11.add("Gebirge");
        arrayList11.add("Grasland");
        arrayList11.add("Eis/Schnee");
        arrayList11.add("Stadt");
        arrayList11.add("Wald/Dschungel");
        arrayList11.add("W\u00fcste");
        voidsuper.thisvoidObject.setSpezialisierungen(arrayList11);
        this.String.add(voidsuper.thisvoidObject);
        ArrayList<String> arrayList12 = new ArrayList<String>();
        arrayList12.add("Balladenvortrag");
        arrayList12.add("Chorgesang");
        arrayList12.add("Mehrstimmigkeit");
        arrayList12.add("Operngesang");
        voidsuper.newnewObject.setSpezialisierungen(arrayList12);
        this.String.add(voidsuper.newnewObject);
        ArrayList<String> arrayList13 = new ArrayList<String>();
        arrayList13.add("H\u00f6ren");
        arrayList13.add("Riechen/Schmecken");
        arrayList13.add("Sehen");
        arrayList13.add("Tasten");
        voidsuper.o\u00d3\u00d6000.setSpezialisierungen(arrayList13);
        this.String.add(voidsuper.o\u00d3\u00d6000);
        this.String.add(voidsuper.\u00d8\u00d3\u00d8000);
        ArrayList<String> arrayList14 = new ArrayList<String>();
        arrayList14.add("Haustiere");
        arrayList14.add("Jagdwild");
        arrayList14.add("Menschliche Stimmen");
        arrayList14.add("Raubtiere");
        arrayList14.add("V\u00f6gel");
        arrayList14.add("Felide Rassen");
        voidsuper.returnwhileObject.setSpezialisierungen(arrayList14);
        this.String.add(voidsuper.returnwhileObject);
        ArrayList<String> arrayList15 = new ArrayList<String>();
        arrayList15.add("Ausdruckst\u00e4nze");
        arrayList15.add("Formationst\u00e4nze");
        arrayList15.add("H\u00f6fische T\u00e4nze");
        arrayList15.add("Kultt\u00e4nze");
        arrayList15.add("Meditationst\u00e4nze");
        voidsuper.\u00d4\u00d8\u00d6000.setSpezialisierungen(arrayList15);
        this.String.add(voidsuper.\u00d4\u00d8\u00d6000);
        this.String.add(voidsuper.whilenewObject);
        this.String.add(voidsuper.\u00d40\u00d6000);
        ArrayList<String> arrayList16 = new ArrayList<String>();
        arrayList16.add("nat\u00fcrliche Flugf\u00e4higkeit");
        arrayList16.add("technomantische Hilfsmittel");
        voidsuper.oO\u00d8000.setSpezialisierungen(arrayList16);
        this.String.add(voidsuper.oO\u00d8000);
        ArrayList<String> arrayList17 = new ArrayList<String>();
        arrayList17.add("Reflexe");
        arrayList17.add("Gute Kondition (Spurt)");
        arrayList17.add("Pr\u00e4ziser Schuss");
        voidsuper.returnnullObject.setSpezialisierungen(arrayList17);
        this.String.add(voidsuper.returnnullObject);
    }

    private void \u00f600000() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Eis/Schnee");
        arrayList.add("Gebirge");
        arrayList.add("Grasland");
        arrayList.add("Stadt");
        arrayList.add("Sumpf");
        arrayList.add("Unterirdisch");
        arrayList.add("Wald/Dschungel");
        arrayList.add("W\u00fcste");
        voidsuper.\u00f8\u00d8\u00d5000.setSpezialisierungen(arrayList);
        this.String.add(voidsuper.\u00f8\u00d8\u00d5000);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Gruben");
        arrayList2.add("Schlingen");
        arrayList2.add("Speere");
        voidsuper.\u00d5\u00d6\u00d5000.setSpezialisierungen(arrayList2);
        this.String.add(voidsuper.\u00d5\u00d6\u00d5000);
        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("Entfesseln");
        arrayList3.add("Fesseln");
        arrayList3.add("Knotenkunde");
        arrayList3.add("Taue Splei\u00dfen");
        arrayList3.add("Netze Kn\u00fcpfen");
        voidsuper.\u00d5\u00f6\u00d5000.setSpezialisierungen(arrayList3);
        this.String.add(voidsuper.\u00d5\u00f6\u00d5000);
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("Fl\u00fcsse/B\u00e4che");
        arrayList4.add("Hochseeangeln");
        arrayList4.add("Seen/Sumpf/Brackwasser");
        arrayList4.add("Strand/Riff");
        arrayList4.add("Seefischerei");
        voidsuper.\u00f80\u00d6000.setSpezialisierungen(arrayList4);
        this.String.add(voidsuper.\u00f80\u00d6000);
        ArrayList<String> arrayList5 = new ArrayList<String>();
        arrayList5.add("Dschungel");
        arrayList5.add("Eis/Schnee");
        arrayList5.add("Gebirge");
        arrayList5.add("Grasland");
        arrayList5.add("Meer");
        arrayList5.add("Stadt");
        arrayList5.add("Unterirdisch");
        arrayList5.add("Wald");
        arrayList5.add("W\u00fcste");
        voidsuper.StringvoidObject.setSpezialisierungen(arrayList5);
        this.String.add(voidsuper.StringvoidObject);
        ArrayList<String> arrayList6 = new ArrayList<String>();
        arrayList6.add("Zyklopensee");
        arrayList6.add("Golf von Prem");
        arrayList6.add("Selemgrund");
        voidsuper.\u00d4O\u00d6000.setSpezialisierungen(arrayList6);
        this.\u00d800000.add(voidsuper.\u00d4O\u00d6000);
        this.String.add(voidsuper.\u00d40\u00d8000);
        ArrayList<String> arrayList7 = new ArrayList<String>();
        arrayList7.add("Dschungel");
        arrayList7.add("Eis/Schnee");
        arrayList7.add("Gebirge");
        arrayList7.add("Meer");
        arrayList7.add("Steppe");
        arrayList7.add("Sumpf");
        arrayList7.add("Wald");
        arrayList7.add("W\u00fcste");
        arrayList7.add("Drayd\u00e2lan");
        arrayList7.add("Narkramar");
        voidsuper.\u00d3\u00f4\u00d6000.setSpezialisierungen(arrayList7);
        this.String.add(voidsuper.\u00d3\u00f4\u00d6000);
    }

    private void int() {
        o0Oo.o00000();
        this.String.add(oooo_4.\u00d5\u00d6\u00f5O00);
        this.String.add(oooo_4.\u00d3\u00d6\u00f5O00);
        this.String.add(oooo_4.privateclassfloat);
        this.String.add(oooo_4.o\u00d6\u00f5O00);
        this.String.add(oooo_4.forclassfloat);
        this.String.add(oooo_4.O\u00d6\u00f5O00);
        this.String.add(oooo_4.\u00f5\u00d5\u00f5O00);
        this.String.add(oooo_4.\u00d4\u00d6\u00f5O00);
        this.String.add(oooo_4.returnreturnfloat);
        this.String.add(oooo_4.\u00f8\u00d5\u00f5O00);
        this.String.add(oooo_4.\u00f5\u00d6\u00f5O00);
        this.String.add(oooo_4.\u00f8\u00d6\u00f5O00);
        this.String.add(oooo_4.\u00f4\u00d6\u00f5O00);
        this.String.add(oooo_4.newreturnfloat);
        this.String.add(oooo_4.\u00d8\u00d6\u00f5O00);
        this.String.add(oooo_4.\u00d8\u00d5\u00f5O00);
    }

    private void \u00f4O0000() {
        this.String.add(G.Stringsuperclass);
        this.String.add(G.\u00d4\u00d8\u00f5000);
        this.String.add(G.nullObjectclass);
        this.String.add(G.o\u00d5\u00f5000);
        this.String.add(G.\u00f8\u00f5\u00f5000);
        this.\u00d800000.add(G.o0\u00f5000);
        this.String.add(G.\u00f4\u00d4\u00f5000);
        this.String.add(G.O\u00d4\u00f5000);
        this.String.add(G.forObjectclass);
        this.String.add(G.oO\u00f5000);
        this.String.add(G.whileStringclass);
        this.String.add(G.o0\u00f6000);
        this.String.add(G.\u00d40\u00f5000);
        this.String.add(G.\u00f8\u00f8\u00f5000);
        this.String.add(G.\u00d40\u00f6000);
        this.String.add(G.\u00d3\u00f4\u00f5000);
        this.String.add(G.\u00d8\u00d8\u00f5000);
        this.String.add(G.\u00d5\u00d4\u00f5000);
        this.String.add(G.\u00f4\u00d6\u00f5000);
        this.String.add(G.Oo\u00f5000);
        this.String.add(G.\u00d3o\u00f5000);
        this.String.add(G.\u00f8\u00f8\u00f4000);
        this.String.add(G.nullpublicString);
        this.String.add(G.returnnewclass);
        this.String.add(G.\u00d8\u00d4\u00f5000);
        this.String.add(G.\u00d3\u00f5\u00f5000);
        this.String.add(G.thisinterfaceString);
        this.String.add(G.nulldoString);
        this.String.add(G.\u00d8O\u00f5000);
        this.String.add(G.oo\u00f5000);
        this.String.add(G.\u00f4\u00f4\u00f5000);
        this.String.add(G.\u00d8\u00f5\u00f5000);
        this.String.add(G.\u00d4\u00f6\u00f5000);
        this.String.add(G.\u00d5\u00f6\u00f4000);
        this.String.add(G.\u00d3\u00f8\u00f4000);
        this.String.add(G.privateclassclass);
        this.String.add(G.\u00d4\u00d3\u00f5000);
        this.String.add(G.o\u00d4\u00f5000);
        this.String.add(G.O\u00f4\u00f5000);
        this.String.add(G.\u00f4o\u00f5000);
        this.String.add(G.O\u00d5\u00f5000);
        this.String.add(G.o\u00f5\u00f5000);
        this.String.add(G.ifthisclass);
        this.String.add(G.ifprivateString);
        this.String.add(G.\u00f8\u00f5\u00f4000);
        this.String.add(G.ifnewclass);
        this.String.add(G.thispublicString);
        this.String.add(G.\u00f5\u00d8\u00f5000);
        this.String.add(G.\u00d8\u00f8\u00f5000);
        this.String.add(G.\u00f8O\u00f5000);
        this.String.add(G.\u00d5\u00f4\u00f5000);
        this.String.add(G.\u00d8\u00f6\u00f5000);
        this.String.add(G.whileprivateString);
        this.String.add(G.\u00f8\u00f6\u00f4000);
        this.String.add(G.StringpublicString);
        this.String.add(G.\u00d5\u00d5\u00f5000);
        this.String.add(G.o\u00d6\u00f5000);
        this.String.add(G.\u00f8\u00d3\u00f5000);
        this.String.add(G.\u00d5\u00d8\u00f5000);
        this.String.add(G.\u00f50\u00f6000);
        this.String.add(G.\u00f4\u00f6\u00f4000);
        this.String.add(G.O\u00f6\u00f4000);
        this.String.add(G.\u00d4\u00f8\u00f4000);
        this.String.add(G.\u00d3\u00d3\u00f5000);
        this.String.add(G.O0\u00f5000);
        this.String.add(G.\u00f8\u00d2\u00f5000);
        this.String.add(G.\u00f8\u00d4\u00f5000);
        this.String.add(G.O\u00f5\u00f5000);
        this.String.add(G.O\u00f8\u00f4000);
        this.String.add(G.ifStringclass);
        this.String.add(G.returnthisclass);
        this.String.add(G.thisObjectclass);
        this.String.add(G.o\u00d3\u00f5000);
        this.String.add(G.\u00f5O\u00f5000);
        this.String.add(G.\u00f5\u00f4\u00f5000);
        this.String.add(G.\u00f4\u00f5\u00f5000);
        this.String.add(G.\u00d4\u00f6\u00f4000);
        this.String.add(G.privatepublicString);
        this.String.add(G.o\u00f6\u00f4000);
        this.String.add(G.o\u00d2\u00f5000);
        this.String.add(G.\u00d4\u00d5\u00f5000);
        this.String.add(G.\u00d8\u00d6\u00f5000);
        this.String.add(G.returnprivateString);
        this.String.add(G.privateObjectclass);
        this.String.add(G.\u00d5\u00f5\u00f5000);
        this.String.add(G.\u00f8o\u00f5000);
        this.String.add(G.\u00d8\u00f6\u00f4000);
        this.String.add(G.\u00d8\u00d5\u00f5000);
        this.String.add(G.OO\u00f5000);
    }

    private void super() {
        this.\u00d200000.add(voidsuper.\u00d4\u00d5\u00d6000);
        this.\u00d200000.add(voidsuper.\u00d8o\u00d6000);
        this.\u00d200000.add(voidsuper.\u00d8\u00f8\u00d5000);
        this.\u00d200000.add(voidsuper.O\u00d5\u00d6000);
        this.\u00d200000.add(voidsuper.\u00f4\u00f5\u00d5000);
        this.\u00d200000.add(voidsuper.o\u00d8\u00d5000);
        this.\u00d200000.add(voidsuper.\u00d8\u00d2\u00d6000);
        this.\u00d200000.add(voidsuper.\u00f8\u00d4\u00d6000);
        this.\u00d200000.add(voidsuper.privatefloatObject);
        this.\u00d200000.add(voidsuper.privatepublicObject);
        this.\u00d200000.add(voidsuper.StringdoObject);
        this.\u00d200000.add(voidsuper.returnreturnObject);
        this.\u00d200000.add(voidsuper.privateintObject);
        this.\u00d200000.add(voidsuper.\u00d50\u00d6000);
        this.\u00d200000.add(voidsuper.StringintObject);
        this.\u00d200000.add(voidsuper.\u00d8o\u00d8000);
        this.\u00d200000.add(voidsuper.forsuperObject);
        this.\u00d200000.add(voidsuper.\u00f8\u00d5\u00d6000);
        this.\u00d200000.add(voidsuper.\u00d30\u00d6000);
        this.\u00d200000.add(voidsuper.\u00f4o\u00d8000);
        this.\u00d200000.add(voidsuper.\u00d3\u00f8\u00d5000);
        this.\u00d200000.add(voidsuper.\u00f4\u00d8\u00d5000);
        this.\u00d200000.add(voidsuper.\u00f5o\u00d8000);
        this.\u00d200000.add(voidsuper.O\u00f8\u00d5000);
        this.\u00d200000.add(voidsuper.o\u00f5\u00d6000);
        this.\u00d200000.add(voidsuper.\u00d8\u00d3\u00d6000);
        this.\u00d200000.add(voidsuper.thisObjectObject);
        this.\u00d200000.add(voidsuper.\u00d5O\u00d8000);
        this.\u00d200000.add(voidsuper.\u00d4\u00f4\u00d5000);
        this.\u00d200000.add(voidsuper.\u00d4\u00d6\u00d6000);
        this.\u00d200000.add(voidsuper.\u00f5\u00f4\u00d6000);
        this.\u00d200000.add(voidsuper.privatevoidObject);
        this.\u00d200000.add(voidsuper.\u00d3\u00d3\u00d8000);
        this.\u00d200000.add(voidsuper.\u00d8\u00d6\u00d5000);
        this.\u00d200000.add(voidsuper.forintObject);
        this.\u00d200000.add(voidsuper.\u00f8\u00d5\u00d5000);
        this.\u00d200000.add(voidsuper.\u00d3\u00f5\u00d5000);
        this.\u00d200000.add(voidsuper.StringinterfaceObject);
        this.\u00d200000.add(voidsuper.\u00d3\u00d5\u00d5000);
        this.\u00d200000.add(voidsuper.newStringObject);
    }

    private void \u00d300000() {
        this.String.add(G.whilewhileString);
        this.String.add(G.\u00d3\u00f8\u00f5000);
        this.String.add(G.\u00f4\u00d3\u00f5000);
        this.String.add(G.\u00f5\u00f5\u00f4000);
        this.String.add(G.newwhileString);
        this.String.add(G.\u00f5\u00f6\u00f5000);
        this.String.add(G.\u00d5\u00f8\u00f5000);
        this.String.add(G.\u00f8\u00f6\u00f5000);
        this.String.add(G.newprivateString);
        this.String.add(G.whilenewclass);
        this.String.add(G.\u00f4\u00d2\u00f5000);
        this.String.add(G.\u00d3\u00d6\u00f5000);
        this.String.add(G.nullsuperclass);
        this.String.add(G.\u00d5o\u00f5000);
        this.String.add(G.\u00d8\u00d3\u00f5000);
        this.String.add(G.o\u00f4\u00f5000);
        this.String.add(G.\u00d5\u00f8\u00f4000);
        this.String.add(G.\u00f50\u00f5000);
        this.String.add(G.\u00d3\u00d4\u00f5000);
        this.String.add(G.\u00d80\u00f6000);
        this.String.add(G.O\u00d8\u00f5000);
        this.String.add(G.\u00d5\u00d6\u00f5000);
        this.String.add(G.\u00d8\u00f4\u00f5000);
        this.String.add(G.\u00d8\u00d2\u00f5000);
        this.String.add(G.thissuperclass);
        this.String.add(G.\u00d5\u00f6\u00f5000);
        this.String.add(G.privatesuperclass);
        this.String.add(G.\u00d5O\u00f5000);
        this.String.add(G.\u00d50\u00f5000);
        this.String.add(G.o\u00f8\u00f5000);
        this.String.add(G.StringdoString);
        this.String.add(G.\u00d3O\u00f5000);
        this.String.add(G.privatedoString);
        this.String.add(G.\u00f5\u00f8\u00f5000);
        this.String.add(G.newnewclass);
        this.String.add(G.O\u00d3\u00f5000);
        this.String.add(G.\u00f5\u00d4\u00f5000);
        this.String.add(G.\u00d50\u00f6000);
        this.String.add(G.returnStringclass);
        this.String.add(G.\u00f5\u00f6\u00f4000);
        this.String.add(G.forsuperclass);
        this.String.add(G.forpublicString);
        this.String.add(G.o\u00d8\u00f5000);
        this.String.add(G.\u00d4\u00d6\u00f5000);
        this.String.add(G.\u00f8\u00d6\u00f5000);
        this.String.add(G.\u00d3\u00f6\u00f5000);
        this.String.add(G.\u00f5\u00f5\u00f5000);
        this.String.add(G.StringinterfaceString);
        this.String.add(G.\u00d3\u00d5\u00f5000);
        this.String.add(G.Stringclassclass);
        this.String.add(G.\u00f5\u00d2\u00f5000);
        this.String.add(G.\u00f4\u00f8\u00f4000);
        this.String.add(G.nullclassclass);
        this.String.add(G.\u00f4\u00f8\u00f5000);
        this.String.add(G.nullinterfaceString);
        this.String.add(G.ifwhileString);
        this.String.add(G.\u00d4\u00f8\u00f5000);
        this.String.add(G.O\u00f8\u00f5000);
        this.String.add(G.\u00f5\u00d3\u00f5000);
        this.String.add(G.\u00f5\u00d6\u00f5000);
        this.String.add(G.forinterfaceString);
        this.String.add(G.\u00f5\u00d5\u00f5000);
        this.String.add(G.O\u00d6\u00f5000);
        this.String.add(G.\u00f80\u00f6000);
        this.String.add(G.thisclassclass);
        this.String.add(G.O\u00d2\u00f5000);
        this.String.add(G.\u00d3\u00f6\u00f4000);
        this.String.add(G.\u00f40\u00f5000);
        this.String.add(G.\u00f5o\u00f5000);
        this.String.add(G.\u00d4\u00f5\u00f5000);
        this.String.add(G.\u00d30\u00f5000);
        this.String.add(G.\u00f4O\u00f5000);
        this.String.add(G.O0\u00f6000);
        this.String.add(G.\u00d80\u00f5000);
        this.String.add(G.forclassclass);
        this.String.add(G.\u00d8o\u00f5000);
        this.String.add(G.fordoString);
        this.String.add(G.whilethisclass);
        this.String.add(G.\u00f8\u00d5\u00f5000);
        this.String.add(G.\u00f40\u00f6000);
        this.String.add(G.\u00f4\u00d5\u00f5000);
        this.String.add(G.\u00f4\u00f6\u00f5000);
        this.String.add(G.newStringclass);
        this.String.add(G.\u00d4O\u00f5000);
        this.String.add(G.\u00f4\u00d8\u00f5000);
        this.String.add(G.\u00d5\u00d3\u00f5000);
        this.String.add(G.o\u00f8\u00f4000);
        this.String.add(G.\u00d4o\u00f5000);
        this.String.add(G.privateinterfaceString);
        this.String.add(G.\u00f8\u00f4\u00f5000);
        this.String.add(G.o\u00f6\u00f5000);
        this.String.add(G.O\u00f6\u00f5000);
        this.String.add(G.\u00f80\u00f5000);
        this.String.add(G.newthisclass);
        this.String.add(G.\u00f8\u00d8\u00f5000);
        this.String.add(G.StringObjectclass);
        this.String.add(G.\u00d4\u00d2\u00f5000);
    }

    private void OO0000() {
        this.\u00f500000.add(voidsuper.\u00f8O\u00d8000);
        this.\u00f500000.add(voidsuper.\u00f8O\u00d8000);
        this.\u00f500000.add(voidsuper.\u00d8\u00d4\u00d5000);
        this.\u00f500000.add(voidsuper.O\u00d6\u00d5000);
        this.\u00f500000.add(voidsuper.\u00d3\u00d6\u00d6000);
        this.\u00f500000.add(voidsuper.\u00d5o\u00d6000);
        this.\u00f500000.add(voidsuper.o0\u00d6000);
        this.\u00f500000.add(voidsuper.o\u00d5\u00d5000);
        this.\u00f500000.add(voidsuper.\u00f50\u00d8000);
        this.\u00f500000.add(voidsuper.O\u00d8\u00d6000);
        this.\u00f500000.add(voidsuper.\u00f4\u00d4\u00d6000);
    }

    private void \u00d8O0000() {
        this.String.add(voidsuper.\u00d5\u00d3\u00d8000);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hochbau");
        arrayList.add("Tiefbau");
        arrayList.add("Wehranlagen");
        voidsuper.whileStringObject.setSpezialisierungen(arrayList);
        this.String.add(voidsuper.whileStringObject);
        this.String.add(voidsuper.\u00f4o\u00d6000);
        this.String.add(voidsuper.nullObjectObject);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Bau- und Kunstgeschichte");
        arrayList2.add("Milit\u00e4rgeschichte");
        arrayList2.add("Religionsgeschichte");
        arrayList2.add("Wissenschaftsgeschichte");
        voidsuper.\u00d5\u00d4\u00d6000.setSpezialisierungen(arrayList2);
        this.String.add(voidsuper.\u00d5\u00d4\u00d6000);
        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("Baugestein");
        arrayList3.add("Edelmetalle");
        arrayList3.add("Edelsteine");
        voidsuper.\u00d50\u00d8000.setSpezialisierungen(arrayList3);
        this.String.add(voidsuper.\u00d50\u00d8000);
        this.String.add(voidsuper.oo\u00d6000);
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("Hohe H\u00e4user");
        arrayList4.add("Imperium");
        arrayList4.add("Myriaden");
        voidsuper.o\u00f4\u00d6000.setSpezialisierungen(arrayList4);
        this.String.add(voidsuper.o\u00f4\u00d6000);
        ArrayList<String> arrayList5 = new ArrayList<String>();
        arrayList5.add("Edelmetalle");
        arrayList5.add("Eisen/Stahl");
        arrayList5.add("Kupfer/Bronze/Messing");
        arrayList5.add("Zinn");
        arrayList5.add("Magische Metalle");
        voidsuper.\u00f40\u00d8000.setSpezialisierungen(arrayList5);
        this.String.add(voidsuper.\u00f40\u00d8000);
        ArrayList<String> arrayList6 = new ArrayList<String>();
        arrayList6.add("Logistik");
        arrayList6.add("Milit\u00e4rgeschichte");
        arrayList6.add("Monstren");
        arrayList6.add("Seegefechte");
        arrayList6.add("Strategie");
        arrayList6.add("Taktik");
        arrayList6.add("Drachen");
        arrayList6.add("Schlachtfeldmagie");
        voidsuper.nullvoidObject.setSpezialisierungen(arrayList6);
        this.String.add(voidsuper.nullvoidObject);
        this.String.add(voidsuper.\u00d3\u00d8\u00d6000);
        ArrayList<String> arrayList7 = new ArrayList<String>();
        arrayList7.add("Artefaktherstellung");
        arrayList7.add("D\u00e4monologie");
        arrayList7.add("Drachenmagie");
        arrayList7.add("Elementarismus");
        arrayList7.add("Magiehistorie");
        arrayList7.add("Magietheorie");
        arrayList7.add("Magische Analyse");
        arrayList7.add("Sph\u00e4rologie");
        arrayList7.add("Zauberpraxis");
        arrayList7.add("Zauberwerkstatt");
        arrayList7.add("Animismus");
        arrayList7.add("Magomechanik");
        arrayList7.add("Optimatik");
        arrayList7.add("Schlachtfeldmagie");
        voidsuper.\u00f5\u00f5\u00d5000.setSpezialisierungen(arrayList7);
        this.String.add(voidsuper.\u00f5\u00f5\u00d5000);
        ArrayList<String> arrayList8 = new ArrayList<String>();
        arrayList8.add("Belagerungswaffen");
        arrayList8.add("Kr\u00e4ne/Hebewerke/Mahlwerke");
        arrayList8.add("Materialkunde");
        arrayList8.add("Pumpen und Wasserkraft");
        arrayList8.add("Windkraft");
        arrayList8.add("Magomechanik");
        voidsuper.\u00f4\u00f6\u00d5000.setSpezialisierungen(arrayList8);
        this.String.add(voidsuper.\u00f4\u00f6\u00d5000);
        ArrayList<String> arrayList9 = new ArrayList<String>();
        arrayList9.add("Dschungel");
        arrayList9.add("Gebirge");
        arrayList9.add("Grasland");
        arrayList9.add("Meer");
        arrayList9.add("Steppe");
        arrayList9.add("Sumpf");
        arrayList9.add("Tundra");
        arrayList9.add("Wald");
        arrayList9.add("W\u00fcste");
        voidsuper.o\u00d5\u00d6000.setSpezialisierungen(arrayList9);
        this.String.add(voidsuper.o\u00d5\u00d6000);
        this.String.add(voidsuper.thisintObject);
        ArrayList<String> arrayList10 = new ArrayList<String>();
        arrayList10.add("Arithmetik");
        arrayList10.add("Buchf\u00fchrung");
        arrayList10.add("Geometrie");
        voidsuper.\u00f5\u00d2\u00d6000.setSpezialisierungen(arrayList10);
        this.String.add(voidsuper.\u00f5\u00d2\u00d6000);
        ArrayList<String> arrayList11 = new ArrayList<String>();
        arrayList11.add("Gildenrecht");
        arrayList11.add("Kirchenrecht");
        arrayList11.add("Strafrecht");
        arrayList11.add("Staatsrecht");
        arrayList11.add("Cirkelrecht");
        arrayList11.add("Hausrecht");
        voidsuper.\u00f4\u00d2\u00d6000.setSpezialisierungen(arrayList11);
        this.String.add(voidsuper.\u00f4\u00d2\u00d6000);
        this.String.add(voidsuper.\u00f8\u00f4\u00d5000);
        ArrayList<String> arrayList12 = new ArrayList<String>();
        arrayList12.add("Antiquit\u00e4ten");
        arrayList12.add("Materialwert");
        arrayList12.add("Schmuck");
        arrayList12.add("Handwerksg\u00fcter");
        voidsuper.O\u00f4\u00d5000.setSpezialisierungen(arrayList12);
        this.String.add(voidsuper.O\u00f4\u00d5000);
        this.\u00d800000.add(voidsuper.\u00d3o\u00d8000);
        this.String.add(voidsuper.\u00d5\u00f5\u00d5000);
        ArrayList<String> arrayList13 = new ArrayList<String>();
        arrayList13.add("Garethi-Familie");
        arrayList13.add("Tulamidya-Familie");
        arrayList13.add("Thorwalsch-Familie");
        arrayList13.add("Elfisch-Familie");
        arrayList13.add("Zwergisch-Familie");
        arrayList13.add("Orkisch-Familie");
        arrayList13.add("Rissoal-Familie");
        voidsuper.\u00d5\u00f5\u00d5000.setSpezialisierungen(arrayList13);
        ArrayList<String> arrayList14 = new ArrayList<String>();
        arrayList14.add("Diplomatie");
        arrayList14.add("Intrige");
        arrayList14.add("Verwaltung");
        arrayList14.add("Hohe H\u00e4user");
        voidsuper.\u00f5\u00d6\u00d6000.setSpezialisierungen(arrayList14);
        this.String.add(voidsuper.\u00f5\u00d6\u00d6000);
        ArrayList<String> arrayList15 = new ArrayList<String>();
        arrayList15.add("Himmelskartographie");
        arrayList15.add("Horoskope");
        arrayList15.add("Navigation");
        arrayList15.add("Zeitbestimmung");
        voidsuper.\u00d3\u00d6\u00d5000.setSpezialisierungen(arrayList15);
        this.String.add(voidsuper.\u00d3\u00d6\u00d5000);
        ArrayList<String> arrayList16 = new ArrayList<String>();
        arrayList16.add("Drachen");
        arrayList16.add("Jagdwild");
        arrayList16.add("Meeresgetier");
        arrayList16.add("Monstren");
        arrayList16.add("Nutztiere");
        arrayList16.add("Raubtiere");
        arrayList16.add("Sch\u00e4dlinge");
        arrayList16.add("Vielbeiner");
        arrayList16.add("V\u00f6gel");
        arrayList16.add("Chim\u00e4ren");
        voidsuper.\u00d4\u00f6\u00d6000.setSpezialisierungen(arrayList16);
        this.String.add(voidsuper.\u00d4\u00f6\u00d6000);
        this.String.add(voidsuper.\u00d4\u00d5\u00d5000);
    }
}

