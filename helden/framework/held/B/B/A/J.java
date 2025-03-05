/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.A;

import helden.framework.C.public;
import helden.framework.D.P;
import helden.framework.D.void;
import helden.framework.D.while;
import helden.framework.DruckEinstellungen;
import helden.framework.Einstellungen;
import helden.framework.HeldenMath;
import helden.framework.held.B.B.C.String;
import helden.framework.held.B.B.G;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class J
extends G {
    private int \u00d2\u00d40000 = 0;
    private DruckEinstellungen ifObject;
    private List<String> \u00d3\u00d40000 = new ArrayList<String>();

    public J(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, 0);
    }

    public J(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, int n) {
        this.\u00d6O0000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
        this.ifObject = Einstellungen.getInstance().getSeitenEinstellungen(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.\u00f4o0000());
        this.\u00d2\u00d40000 = n;
        this.new(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2);
    }

    @Override
    public void o00000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        this.o00000(graphics2D);
        File file = new File(this.\u00d6O0000.forsuper());
        int n = this.new(graphics2D, file.exists());
        this.\u00d300000(graphics2D, 20, 430, n += 10, 445);
        n = this.\u00f8O0000(graphics2D, 445);
        this.Stringsuper(graphics2D, 610);
        if (!this.return()) {
            graphics2D.drawRoundRect(5, 5, 440, 660, 5, 5);
        }
        this.new(graphics2D);
    }

    @Override
    public List<G> \u00d500000() {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).isDrucken(this.new())) {
            arrayList.add(new J(this.\u00d6O0000, 0));
        }
        return arrayList;
    }

    @Override
    public int \u00d800000() {
        return 1;
    }

    @Override
    public java.lang.String \u00f400000() {
        return "Vorteilebogen";
    }

    @Override
    public boolean \u00d300000() {
        return true;
    }

    @Override
    public boolean \u00d400000() {
        return true;
    }

    private List<String> new(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        String string;
        Object object;
        oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().o00000();
        Font font = this.o00000(12).deriveFont(1);
        Font font2 = this.o00000(9).deriveFont(1);
        this.\u00d3\u00d40000 = new ArrayList<String>();
        boolean bl = false;
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<public> iterator = this.\u00d6O0000.\u00d500000().\u00d500000();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (((public)object).\u00d500000() && !bl) {
                if (stringBuilder.toString().length() > 0) {
                    string = new String("Vorteile", "", font);
                    string.\u00d200000(420);
                    this.\u00d3\u00d40000.add(string);
                    string = new String("", stringBuilder.toString(), font2);
                    string.\u00d200000(420);
                    stringBuilder = new StringBuilder();
                    this.\u00d3\u00d40000.add(string);
                }
                bl = true;
            }
            stringBuilder.append(((public)object).oO0000());
            stringBuilder.append("; ");
        }
        if (stringBuilder.toString().length() > 0) {
            string = new String("Nachteile", "", font);
            string.\u00d200000(420);
            this.\u00d3\u00d40000.add(string);
            string = new String("", stringBuilder.toString(), font2);
            string.\u00d200000(420);
            this.\u00d3\u00d40000.add(string);
        }
        object = this.\u00d6O0000.\u00f5O0000().iterator();
        stringBuilder = new StringBuilder();
        while (object.hasNext()) {
            P p2 = (P)object.next();
            if (p2.privatesuper() || p2.\u00d300000() || p2.\u00f400000() || p2.\u00f8O0000()) continue;
            if (p2 instanceof void) {
                void void_ = (void)p2;
                stringBuilder.append(void_.toString());
                stringBuilder.append("; ");
                continue;
            }
            stringBuilder.append(p2.toString());
            stringBuilder.append("; ");
        }
        if (stringBuilder.toString().length() > 0) {
            string = new String("Profane Sonderfertigkeiten", "", font);
            string.\u00d200000(420);
            this.\u00d3\u00d40000.add(string);
            string = new String("", stringBuilder.toString(), font2);
            string.\u00d200000(420);
            this.\u00d3\u00d40000.add(string);
        }
        return this.\u00d3\u00d40000;
    }

    private int \u00f8O0000(Graphics2D graphics2D, int n) {
        int n2;
        int n3 = n + 35;
        int n4 = 15;
        int n5 = 435;
        int n6 = n3 - 15;
        this.o00000(graphics2D, n4 - 5, n6, n5 - n4 + 10, 611 - n6 + 16, 5, 5);
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("Eigenschaften", n4, n3);
        graphics2D.drawString("Basiswerte", 190, n3);
        int n7 = (n3 += 5) - 7;
        graphics2D.setFont(this.o00000(8));
        this.\u00d300000(graphics2D, "Mut", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.whilewhilesuper), this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper), this.\u00d6O0000.o00000(b_0.whilewhilesuper), n3);
        int n8 = (this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper) * 2 + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 1) / 2;
        this.o00000(graphics2D, "Lebenspunkte", "(KO+KO+KK)/2", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00d3\u00f4\u00d2000), n8, this.\u00d6O0000.\u00d3\u00d30000().OO0000(), n3);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00d3\u00f4\u00d2000)), 395, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().interface(b_0.\u00d3\u00f4\u00d2000)), 420, n3 + 10);
        this.\u00d300000(graphics2D, "Klugheit", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.newwhilesuper), this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.newwhilesuper), this.\u00d6O0000.o00000(b_0.newwhilesuper), n3 += 14);
        int n9 = (this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + 1) / 2;
        this.o00000(graphics2D, "Ausdauer", "(MU+KO+GE)/2", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.thispublicsuper), n9, this.\u00d6O0000.\u00d3\u00d30000().\u00d2O0000(), n3);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.thispublicsuper)), 395, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().interface(b_0.thispublicsuper)), 420, n3 + 10);
        this.\u00d300000(graphics2D, "Intuition", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00f8\u00f4\u00d2000), this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000), this.\u00d6O0000.o00000(b_0.\u00f8\u00f4\u00d2000), n3 += 14);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.drawString("Astralenergie", 190, n3 + 10);
        graphics2D.setFont(this.o00000(6));
        if (this.\u00d6O0000.new(while.\u00d3\u00d5\u00d6000.toString())) {
            graphics2D.drawString("(MU+IN+CH+CH)/2", 250, n3 + 10);
        } else {
            graphics2D.drawString("(MU+IN+CH)/2", 250, n3 + 10);
        }
        graphics2D.setFont(this.o00000(8));
        if (this.\u00d6O0000.oo0000()) {
            graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f5\u00d2000)), 320, n3 + 10);
            n2 = (this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00d5\u00f4\u00d2000) + 1) / 2;
            graphics2D.drawString("" + n2, 345, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().interface()), 370, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f5\u00d2000)), 395, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().interface(b_0.\u00f4\u00f5\u00d2000)), 420, n3 + 10);
        }
        this.\u00d300000(graphics2D, "Charisma", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00d5\u00f4\u00d2000), this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00d5\u00f4\u00d2000), this.\u00d6O0000.o00000(b_0.\u00d5\u00f4\u00d2000), n3 += 14);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.drawString("Karmaenergie", 190, n3 + 10);
        if (this.\u00d6O0000.\u00d8\u00d20000()) {
            graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00d4\u00f5\u00d2000)), 320, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d3O0000()), 370, n3 + 10);
            graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00d4\u00f5\u00d2000)), 395, n3 + 10);
        }
        this.\u00d300000(graphics2D, "Fingerfertigkeit", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.O\u00f5\u00d2000), this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.O\u00f5\u00d2000), this.\u00d6O0000.o00000(b_0.O\u00f5\u00d2000), n3 += 14);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.drawString("Magieresistenz", 190, n3 + 10);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(MU+KL+KO)/5", 250, n3 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00d8\u00f5\u00d2000)), 320, n3 + 10);
        n2 = this.thissuper();
        graphics2D.drawString(this.new("" + n2), 345, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00f800000()), 370, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00d8\u00f5\u00d2000)), 395, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().interface(b_0.\u00d8\u00f5\u00d2000)), 420, n3 + 10);
        this.\u00d300000(graphics2D, "Gewandtheit", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00f4\u00d2000), this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000), this.\u00d6O0000.o00000(b_0.\u00f4\u00f4\u00d2000), n3 += 14);
        graphics2D.drawLine(190, n3, n5, n3);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(MU+MU+IN+GE)/5", 250, n3 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString("INI-Basiswert", 190, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00f4\u00d8\u00d2000)), 320, n3 + 10);
        int n10 = (this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + 2) / 5;
        graphics2D.drawString(this.new("" + n10), 345, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.OO0000().private()), 370, n3 + 10);
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        this.\u00d300000(graphics2D, "Konstitution", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.returnwhilesuper), this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.returnwhilesuper), this.\u00d6O0000.o00000(b_0.returnwhilesuper), n3);
        graphics2D.drawLine(190, n3, n5 - 48, n3);
        graphics2D.drawString("AT-Basiswert", 190, n3 + 10);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(MU+GE+KK)/5", 250, n3 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00f8\u00d8\u00d2000)), 320, n3 + 10);
        int n11 = (this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.whilewhilesuper) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        graphics2D.drawString(this.new("" + n11), 345, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().int()), 370, n3 + 10);
        this.\u00d300000(graphics2D, "K\u00f6rperkraft", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.privatedosuper), this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.privatedosuper), this.\u00d6O0000.o00000(b_0.privatedosuper), n3 += 14);
        graphics2D.drawLine(190, n3, n5 - 48, n3);
        graphics2D.drawString("PA-Basiswert", 190, n3 + 10);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(IN+GE+KK)/5", 250, n3 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.ifwhilesuper)), 320, n3 + 10);
        int n12 = (this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00f4\u00f4\u00d2000) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        graphics2D.drawString(this.new("" + n12), 345, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d600000()), 370, n3 + 11);
        if (this.\u00d6O0000.thissuper().getGPStart() != 0) {
            graphics2D.drawString("GP-Start: " + this.\u00d6O0000.thissuper().getGPStart(), 390, n3 + 10);
        }
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        this.\u00d300000(graphics2D, "Geschwindigkeit (GS)", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.O\u00f4\u00d2000), this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.O\u00f4\u00d2000), this.\u00d6O0000.OO0000().returnsuper(), n3);
        graphics2D.drawLine(190, n3, n5 - 48, n3);
        graphics2D.drawString("FK-Basiswert", 190, n3 + 10);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(IN+FF+KK)/5", 250, n3 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00f5\u00f4\u00d2000)), 320, n3 + 10);
        int n13 = (this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00f8\u00f4\u00d2000) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.O\u00f5\u00d2000) + this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.privatedosuper) + 2) / 5;
        graphics2D.drawString(this.new("" + n13), 345, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.\u00d3\u00d30000().\u00f600000()), 370, n3 + 11);
        graphics2D.drawLine(n4, n3 += 14, 172, n3);
        this.\u00d300000(graphics2D, "Sozialstatus (SO)", this.\u00d6O0000.\u00d3\u00d30000().\u00d200000(b_0.\u00f5\u00f5\u00d2000), this.\u00d6O0000.\u00d3\u00d30000().OO0000(b_0.\u00f5\u00f5\u00d2000), this.\u00d6O0000.o00000(b_0.\u00f5\u00f5\u00d2000), n3);
        graphics2D.drawLine(190, n3, n5 - 48, n3);
        graphics2D.drawString("Wundschwelle", 190, n3 + 10);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("(KO/2) + Eisern", 250, n3 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString(this.new(""), 320, n3 + 10);
        graphics2D.drawString(this.new("" + (int)Math.floor((this.\u00d6O0000.o00000(b_0.returnwhilesuper) + 1) / 2)), 345, n3 + 10);
        graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(b_0.\u00d5\u00f5\u00d2000)), 370, n3 + 11);
        if (this.\u00d6O0000.thissuper().getGPStart() != 0) {
            graphics2D.drawString(this.new("GP-Rest: " + this.\u00d6O0000.thissuper().getGPRest()), 390, n3 + 10);
        }
        int n14 = n3 + 14;
        int n15 = 102;
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString("Mod", n15 + 6, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawString("Start", (n15 += 24) + 5, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawLine(n15 += 24, n7, n15, n14);
        graphics2D.drawString("Aktuell", ++n15 + 3, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawString("Mod", (n15 += 161) + 6, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawString("Start", (n15 += 25) + 5, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawLine(n15 += 25, n7, n15, n14);
        graphics2D.drawString("Aktuell", ++n15 + 3, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawLine(n15 += 23, n7, n15, n14);
        graphics2D.drawString("Gekauft", ++n15 + 2, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14);
        graphics2D.drawString("Rest", (n15 += 25) + 6, n7 + 5);
        graphics2D.drawLine(n15, n7, n15, n14 - 56);
        return n3;
    }

    private void \u00d300000(Graphics2D graphics2D, java.lang.String string, int n, int n2, int n3, int n4) {
        int n5 = 15;
        graphics2D.drawLine(n5, n4, 172, n4);
        graphics2D.drawString(string, n5, n4 + 10);
        graphics2D.drawString(this.new("" + n), 108, n4 + 10);
        graphics2D.drawString(this.new("" + n2), 133, n4 + 10);
        graphics2D.drawString(this.new("" + n3), 158, n4 + 10);
    }

    private int new(Graphics2D graphics2D, boolean bl) {
        int n = 30;
        int n2 = 15;
        int n3 = 435;
        for (int i2 = 0; i2 <= 1; ++i2) {
            int n4;
            java.lang.String string;
            Object object;
            n = 30;
            graphics2D.setFont(this.o00000(16));
            graphics2D.drawString("Name: ", n2, n - 4);
            if (this.o00000(this.\u00d6O0000.toString(), graphics2D) > 345.0f) {
                object = this.\u00d6O0000.toString().split(" ");
                string = "";
                for (n4 = 0; n4 < ((java.lang.String[])object).length; ++n4) {
                    if (this.o00000(string, graphics2D) + this.o00000(object[n4], graphics2D) > 330.0f) {
                        graphics2D.drawString(string, 90, n - 4);
                        graphics2D.drawLine(n2, n, n3, n);
                        n += 17;
                        string = object[n4] + " ";
                        continue;
                    }
                    string = string + object[n4] + " ";
                }
                graphics2D.drawString(string, 90, n - 4);
                graphics2D.drawLine(n2, n, n3, n);
                n += 17;
            } else {
                graphics2D.drawString(this.\u00d6O0000.toString(), 90, n - 4);
                graphics2D.drawLine(n2, n, n3, n);
                n += 17;
            }
            graphics2D.setFont(this.o00000(12));
            graphics2D.drawString("Rasse: ", n2, n - 4);
            if (this.o00000(this.\u00d6O0000.o\u00d20000().toString(), graphics2D) > 345.0f) {
                object = this.\u00d6O0000.o\u00d20000().toString().split(" ");
                string = "";
                for (n4 = 0; n4 < ((java.lang.String[])object).length; ++n4) {
                    if (this.o00000(string, graphics2D) + this.o00000(object[n4], graphics2D) > 330.0f) {
                        graphics2D.drawString(string, 90, n - 4);
                        graphics2D.drawLine(n2, n, n3, n);
                        n += 17;
                        string = object[n4] + " ";
                        continue;
                    }
                    string = string + object[n4] + " ";
                }
                graphics2D.drawString(string, 90, n - 4);
                graphics2D.drawLine(n2, n, n3, n);
                n += 17;
            } else {
                graphics2D.drawString(this.\u00d6O0000.o\u00d20000().toString(), 90, n - 4);
                graphics2D.drawLine(n2, n, n3, n);
                n += 17;
            }
            graphics2D.drawString("Kultur: ", n2, n - 4);
            if (this.o00000(this.\u00d6O0000.\u00f800000().toString(), graphics2D) > 345.0f) {
                object = this.\u00d6O0000.\u00f800000().toString().split(" ");
                string = "";
                for (n4 = 0; n4 < ((java.lang.String[])object).length; ++n4) {
                    if (this.o00000(string, graphics2D) + this.o00000(object[n4], graphics2D) > 330.0f) {
                        graphics2D.drawString(string, 90, n - 4);
                        graphics2D.drawLine(n2, n, n3, n);
                        n += 17;
                        string = (java.lang.String)object[n4] + " ";
                        continue;
                    }
                    string = string + object[n4] + " ";
                }
                graphics2D.drawString(string, 90, n - 4);
                graphics2D.drawLine(n2, n, n3, n);
                n += 17;
            } else {
                graphics2D.drawString(this.\u00d6O0000.\u00f800000().toString(), 90, n - 4);
                graphics2D.drawLine(n2, n, n3, n);
                n += 17;
            }
            graphics2D.drawString("Profession: ", n2, n - 4);
            object = this.\u00d6O0000.\u00d800000().toString();
            if (!this.\u00d6O0000.thissuper().\u00d300000().isEmpty()) {
                object = this.\u00d6O0000.thissuper().\u00d300000();
            }
            if (this.o00000((java.lang.String)object, graphics2D) > 345.0f) {
                java.lang.String[] stringArray = ((java.lang.String)object).split(" ");
                java.lang.String string2 = "";
                for (int i3 = 0; i3 < stringArray.length; ++i3) {
                    if (this.o00000(string2, graphics2D) + this.o00000(stringArray[i3], graphics2D) > 330.0f) {
                        graphics2D.drawString(string2, 90, n - 4);
                        graphics2D.drawLine(n2, n, n3, n);
                        n += 17;
                        string2 = stringArray[i3] + " ";
                        continue;
                    }
                    string2 = string2 + stringArray[i3] + " ";
                }
                graphics2D.drawString(string2, 90, n - 4);
            } else {
                graphics2D.drawString((java.lang.String)object, 90, n - 4);
            }
            if (i2 != 0) continue;
            this.o00000(graphics2D, 10, 10, 430, n - 5, 5, 5);
        }
        graphics2D.setFont(this.o00000(10));
        return n;
    }

    private void o00000(Graphics2D graphics2D, java.lang.String string, java.lang.String string2, int n, int n2, int n3, int n4) {
        int n5 = 435;
        graphics2D.drawLine(190, n4, n5, n4);
        graphics2D.drawString(string, 190, n4 + 10);
        graphics2D.setFont(this.o00000(6));
        graphics2D.drawString(string2, 250, n4 + 10);
        graphics2D.setFont(this.o00000(8));
        graphics2D.drawString(this.new("" + n), 320, n4 + 10);
        graphics2D.drawString(this.new("" + n2), 345, n4 + 10);
        graphics2D.drawString(this.new("" + n3), 370, n4 + 10);
    }

    private int Stringsuper(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 15;
        int n4 = 435;
        int n5 = (n2 += 38) - 15;
        this.o00000(graphics2D, n3 - 5, n5, n4 - n3 + 10, 648 - n5 + 10, 5, 5);
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("Abenteuerpunkte:", n3, n2);
        this.o00000(graphics2D, "" + this.\u00d6O0000.o\u00d30000(), 150, n2);
        graphics2D.drawString("Verf\u00fcgbar:", 160, n2);
        this.o00000(graphics2D, "" + this.\u00d6O0000.\u00d400000(), 250, n2);
        graphics2D.drawString("Eingesetzt:", 255, n2);
        this.o00000(graphics2D, "" + (this.\u00d6O0000.o\u00d30000() - this.\u00d6O0000.\u00d400000()), 355, n2);
        graphics2D.drawString("Stufe: " + this.new("" + this.\u00d5O0000()) + " [" + this.\u00d8O0000() + "]", 360, n2);
        return n2;
    }

    private int \u00d300000(Graphics2D graphics2D, int n, int n2, int n3, int n4) {
        Font font = this.o00000(9).deriveFont(0);
        int n5 = n3;
        this.o00000(graphics2D, 10, n5, 430, 461 - n5, 5, 5);
        graphics2D.setFont(font);
        int n6 = 0;
        for (String string : this.\u00d3\u00d40000) {
            string.o00000(graphics2D);
            int n7 = string.\u00d600000();
            if (n4 - n3 - (n7 * 10 + 5) < 0) {
                if (n6 == this.\u00d2\u00d40000) {
                    while (n3 < n4) {
                        graphics2D.drawLine(n, n3 += 10, n2, n3);
                    }
                }
                n3 = n5;
                ++n6;
            }
            if (n6 == this.\u00d2\u00d40000) {
                for (int i2 = 0; i2 < string.\u00d400000().size(); ++i2) {
                    n3 += 10;
                    int n8 = 0;
                    if (i2 == 0) {
                        graphics2D.setFont(string.Object());
                        graphics2D.drawString(string.\u00d400000().get(0), n, (n3 += 5) - 2);
                        n8 = (int)this.o00000(string.\u00d400000().get(0), graphics2D);
                        if (string.\u00d400000().get(0).equals("")) {
                            n8 -= 5;
                        }
                        graphics2D.setFont(font);
                        graphics2D.drawString(string.\u00d400000().get(1), n + n8 + 5, n3 - 2);
                        graphics2D.drawLine(n, n3, n2, n3);
                        ++i2;
                        continue;
                    }
                    graphics2D.drawString(string.\u00d400000().get(i2), n, n3 - 2);
                    graphics2D.drawLine(n, n3, n2, n3);
                }
            } else {
                n3 += n7 * 10 + 5;
            }
            if (this.\u00d3\u00d40000.get(this.\u00d3\u00d40000.size() - 1) != string || n6 != this.\u00d2\u00d40000) continue;
            while (n3 < n4) {
                graphics2D.drawLine(n, n3 += 10, n2, n3);
            }
        }
        return n6;
    }

    private int thissuper() {
        int n = this.\u00d6O0000.\u00d3\u00d30000().do(b_0.whilewhilesuper) + this.\u00d6O0000.\u00d3\u00d30000().do(b_0.newwhilesuper) + this.\u00d6O0000.\u00d3\u00d30000().do(b_0.returnwhilesuper);
        int n2 = (int)Math.round((double)n / 5.0);
        return n2;
    }

    private int \u00d8O0000() {
        if (this.ifObject.isDsa40stufe()) {
            return HeldenMath.getStufe40(this.\u00d6O0000.o\u00d30000());
        }
        return HeldenMath.getStufe41(this.\u00d6O0000.o\u00d30000());
    }

    private int \u00d5O0000() {
        if (this.ifObject.isDsa40stufe()) {
            return HeldenMath.getStufe40(this.\u00d6O0000.o\u00d30000() - this.\u00d6O0000.\u00d400000());
        }
        return HeldenMath.getStufe41(this.\u00d6O0000.o\u00d30000() - this.\u00d6O0000.\u00d400000());
    }
}

