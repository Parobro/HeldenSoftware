/*
 * Decompiled with CFR 0.152.
 */
package helden.model.dsa41.orden;

import helden.framework.int.L;
import helden.framework.int.P;
import helden.model.dsa41.orden.Ardariten;
import helden.model.dsa41.orden.Badilakaner;
import helden.model.dsa41.orden.Basaltfaust;
import helden.model.dsa41.orden.BeniFessiri;
import helden.model.dsa41.orden.Bluter;
import helden.model.dsa41.orden.BruderschaftLoderndesFeuer;
import helden.model.dsa41.orden.BundWahrenGlaubens;
import helden.model.dsa41.orden.Donnerer;
import helden.model.dsa41.orden.Draconiterarkan;
import helden.model.dsa41.orden.Draconiterprofan;
import helden.model.dsa41.orden.Dreischwesternorden;
import helden.model.dsa41.orden.Efferdbrueder;
import helden.model.dsa41.orden.Efferdbruederkampf;
import helden.model.dsa41.orden.Etilianer;
import helden.model.dsa41.orden.Gaenseritter;
import helden.model.dsa41.orden.GenerischerOrden;
import helden.model.dsa41.orden.GolgaritenGeweiht;
import helden.model.dsa41.orden.GolgaritenUngeweiht;
import helden.model.dsa41.orden.Horasritter;
import helden.model.dsa41.orden.Laguan;
import helden.model.dsa41.orden.MadaBasari;
import helden.model.dsa41.orden.Madaschwestern;
import helden.model.dsa41.orden.Marbiden;
import helden.model.dsa41.orden.Nanduriaten;
import helden.model.dsa41.orden.NoionitenGeweiht;
import helden.model.dsa41.orden.NoionitenUngeweiht;
import helden.model.dsa41.orden.Rhodenstein;
import helden.model.dsa41.orden.Rosenritter;
import helden.model.dsa41.orden.Schwerter;
import helden.model.dsa41.orden.Sonnenlegion;
import helden.model.dsa41.orden.Templer;
import helden.model.dsa41.orden.Therbuniten;
import helden.model.dsa41.orden.Yppolitaner;
import helden.model.dsa41.orden.Zornesritter;
import java.util.ArrayList;
import java.util.Iterator;

public class Orden
extends L {
    private ArrayList<P> o\u00f8\u00d5O00 = new ArrayList();

    public Orden() {
        this.o\u00f8\u00d5O00.add(new Badilakaner());
        this.o\u00f8\u00d5O00.add(new Basaltfaust());
        this.o\u00f8\u00d5O00.add(new BeniFessiri());
        this.o\u00f8\u00d5O00.add(new BruderschaftLoderndesFeuer());
        this.o\u00f8\u00d5O00.add(new BundWahrenGlaubens());
        this.o\u00f8\u00d5O00.add(new Draconiterarkan());
        this.o\u00f8\u00d5O00.add(new Draconiterprofan());
        this.o\u00f8\u00d5O00.add(new Dreischwesternorden());
        this.o\u00f8\u00d5O00.add(new Efferdbrueder());
        this.o\u00f8\u00d5O00.add(new Efferdbruederkampf());
        this.o\u00f8\u00d5O00.add(new Etilianer());
        this.o\u00f8\u00d5O00.add(new Gaenseritter());
        this.o\u00f8\u00d5O00.add(new GolgaritenGeweiht());
        this.o\u00f8\u00d5O00.add(new GolgaritenUngeweiht());
        this.o\u00f8\u00d5O00.add(new Horasritter());
        this.o\u00f8\u00d5O00.add(new Laguan());
        this.o\u00f8\u00d5O00.add(new MadaBasari());
        this.o\u00f8\u00d5O00.add(new Madaschwestern());
        this.o\u00f8\u00d5O00.add(new Marbiden());
        this.o\u00f8\u00d5O00.add(new Nanduriaten());
        this.o\u00f8\u00d5O00.add(new NoionitenGeweiht());
        this.o\u00f8\u00d5O00.add(new NoionitenUngeweiht());
        this.o\u00f8\u00d5O00.add(new Rhodenstein());
        this.o\u00f8\u00d5O00.add(new Rosenritter());
        this.o\u00f8\u00d5O00.add(new Sonnenlegion());
        this.o\u00f8\u00d5O00.add(new Therbuniten());
        this.o\u00f8\u00d5O00.add(new Ardariten());
        this.o\u00f8\u00d5O00.add(new Bluter());
        this.o\u00f8\u00d5O00.add(new Donnerer());
        this.o\u00f8\u00d5O00.add(new Schwerter());
        this.o\u00f8\u00d5O00.add(new Templer());
        this.o\u00f8\u00d5O00.add(new Yppolitaner());
        this.o\u00f8\u00d5O00.add(new Zornesritter());
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Bruder- und Schwesternschaft zur F\u00f6rderung der Heilzauberei des Anconius (Anconiten)"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Verteidiger der Lehre von den Grauen St\u00e4ben zu Perricum"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden zur F\u00f6rderung und Lenkung der magischen K\u00fcnste des Mephal von Punin (Mephaliten)"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden vom Pentagramm zu Vinsalt"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Pfeile des Lichts"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden der W\u00e4chter vom Magischen Recht in Rohals Namen (Rohalsw\u00e4chter)"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden der Schlange der Erkenntnis"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Bund der Schatten"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden der sechs Fl\u00fcgel Menacors"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden des Goldenen Falken (Ucuriaten)"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden des Heiligen H\u00fcters (H\u00fcterorden)"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden vom Bannstrahl Praios' (Bannstrahler)"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Bund der Bewahrer der Neun Splitter Siebenstreichs"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Herzliebe Schwestern und Br\u00fcder vom rechtschaffenden Leben zu Ehren der Herrin Peraine"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Heiliger Ritterbund zur neunfingrigen Klaue des Kor"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Schwarzer Bund des Kor"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Ritter des Immerw\u00e4hrenden Kampfes"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden des Schwarzen L\u00f6wen"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Rondragef\u00e4lliger Orden von B\u00e4r und Wolf"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Schmetterlingsorden"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden der Jagd zu Ask"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden des Schwarzen Raben"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Ritter des Alten Weges"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Widderorden"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("K\u00f6nigliche Ritterschaft des Roten Drachen"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Horasische Ehrenlegion"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Staats-Orden des Goldenen Adler"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Geheimer Orden vom Schwarzen Auge zu Punin"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Eukolizana"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Orden der Organa"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Eherne Gilde"));
        this.o\u00f8\u00d5O00.add(new GenerischerOrden("Dornen der Rose"));
        for (P p2 : this.o\u00f8\u00d5O00) {
            this.addAlleVarianten(p2);
        }
    }

    @Override
    public String getID() {
        return "O001";
    }

    public ArrayList<P> getVarianten() {
        return this.o\u00f8\u00d5O00;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.getGewaehlteVarianten().size() == 0) {
            if (this.istMaennlich()) {
                return "";
            }
            return "";
        }
        Iterator<P> iterator = this.getGewaehlteVarianten().iterator();
        while (iterator.hasNext()) {
            stringBuffer.append(iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }

    @Override
    protected void setzeAlleVarianten() {
    }

    @Override
    protected void setzeMoeglicheVarianten() {
    }
}

