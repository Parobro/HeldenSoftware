/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.B.B.A;

import helden.framework.C.I;
import helden.framework.Einstellungen;
import helden.framework.held.B.B.G;
import helden.framework.held.B.B.OoOO.M;
import helden.framework.held.B.B.oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.held.OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO;
import helden.framework.oooo.b_0;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class o0OO
extends G {
    private int \u00d2\u00d30000;

    public o0OO(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        this(oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, 0);
    }

    public o0OO(OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2, int n) {
        this.\u00d2\u00d30000 = n;
        this.\u00d6O0000 = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2;
    }

    @Override
    public void o00000(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D)graphics;
        this.o00000(graphics2D);
        File file = new File(this.\u00d6O0000.forsuper());
        int n = this.o00000(graphics2D, file.exists());
        n = this.thissuper(graphics2D, n);
        n = this.\u00d5O0000(graphics2D, n);
        this.\u00d4O0000(graphics2D, n);
        this.new(graphics2D);
    }

    @Override
    public List<G> \u00d500000() {
        ArrayList<G> arrayList = new ArrayList<G>();
        if (Einstellungen.getInstance().getSeitenEinstellungen(this.\u00d6O0000.\u00f4o0000()).isDrucken(this.new())) {
            for (int i2 = 0; i2 < this.\u00d800000(); ++i2) {
                arrayList.add(new o0OO(this.\u00d6O0000, i2));
            }
        }
        return arrayList;
    }

    @Override
    public int \u00d800000() {
        int n = 1;
        int n2 = this.\u00d500000((Graphics2D)oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().new());
        n2 += 126;
        n2 += 126;
        int n3 = (int)Math.ceil((double)this.\u00d6O0000.\u00d4o0000().\u00d200000().size() / 15.0);
        if (n3 > n) {
            n = n3;
        }
        Iterator<String> iterator = this.o00000((Graphics2D)oOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO.\u00d300000().new(), this.\u00d6O0000).iterator();
        int n4 = 1;
        int n5 = n2;
        while (iterator.hasNext()) {
            iterator.next();
            if (n5 > 650) {
                n5 = n2;
                ++n4;
            }
            n5 += 11;
        }
        if (n4 > n) {
            n = n4;
        }
        return n;
    }

    @Override
    public String \u00f400000() {
        return "Hintergrundbogen " + (this.\u00d2\u00d30000 + 1);
    }

    @Override
    public boolean \u00d300000() {
        return true;
    }

    @Override
    public boolean \u00d400000() {
        return true;
    }

    private int thissuper(Graphics2D graphics2D, int n) {
        int n2 = 0;
        boolean bl = false;
        while (true) {
            n2 = n;
            int n3 = 220;
            int n4 = n3 + 10;
            int n5 = 15;
            int n6 = 435;
            n3 = 180;
            n4 = n3 + 90;
            File file = new File(this.\u00d6O0000.forsuper());
            if (file.exists()) {
                M m = new M(this.\u00d6O0000.forsuper());
                m.o00000(graphics2D, 185, n2 - 12, 79, 140);
                graphics2D.drawRect(185, n2 - 12, 79, 140);
            }
            graphics2D.setFont(this.o00000(10));
            int n7 = n2;
            graphics2D.drawString("Geschlecht:", n5, n2 - 3);
            graphics2D.drawString(this.\u00d6O0000.\u00d300000().toString(), 90, n2 - 3);
            graphics2D.drawLine(n5, n2, n3, n2);
            graphics2D.drawString("Stand:", n4, n2 - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getStand(), n4 + 40, n2 - 3);
            graphics2D.drawLine(n4, n2, n6, n2);
            graphics2D.drawString("Geburtsdatum:", n5, (n2 += 14) - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().super().toString(), 90, n2 - 3);
            graphics2D.drawLine(n5, n2, n3, n2);
            graphics2D.drawLine(n4, n2, n6, n2);
            graphics2D.drawString("Alter:", n5, (n2 += 14) - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().\u00d200000() + " Jahre", 90, n2 - 3);
            graphics2D.drawLine(n5, n2, n3, n2);
            graphics2D.drawString("Titel:", n4, n2 - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getTitel(), n4 + 40, n2 - 3);
            graphics2D.drawLine(n4, n2, n6, n2);
            graphics2D.drawString("Gr\u00f6\u00dfe:", n5, (n2 += 14) - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getGroesse() / 2 + " Finger (" + this.\u00d6O0000.thissuper().getGroesse() + " cm)", 90, n2 - 3);
            graphics2D.drawLine(n5, n2, n3, n2);
            graphics2D.drawString("Sozialstatus:", n4, n2 - 3);
            graphics2D.drawString(this.new("" + this.\u00d6O0000.o00000(b_0.\u00f5\u00f5\u00d2000)), n4 + 70, n2 - 3);
            graphics2D.drawLine(n4, n2, n6, n2);
            graphics2D.drawString("Gewicht:", n5, (n2 += 14) - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getGewicht(this.\u00d6O0000.o00000(I.\u00f8\u00d2o000)) + " Stein", 90, n2 - 3);
            graphics2D.drawLine(n5, n2, n3, n2);
            graphics2D.drawString("Familie/Herkunft/Hintergrund", n4, n2 - 3);
            graphics2D.drawLine(n4, n2, n6, n2);
            graphics2D.drawString("Haarfarbe:", n5, (n2 += 14) - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getHaarFarbe(), 90, n2 - 3);
            graphics2D.drawLine(n5, n2, n3, n2);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getFamilieText()[0], n4, n2 - 3);
            graphics2D.drawLine(n4, n2, n6, n2);
            graphics2D.drawString("Augenfarbe:", n5, (n2 += 14) - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getAugenFarbe(), 90, n2 - 3);
            graphics2D.drawLine(n5, n2, n3, n2);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getFamilieText()[1], n4, n2 - 3);
            graphics2D.drawLine(n4, n2, n6, n2);
            graphics2D.drawString("Aussehen:", n5, (n2 += 14) - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getAussehenText()[0], 90, n2 - 3);
            graphics2D.drawLine(n5, n2, n3, n2);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getFamilieText()[2], n4, n2 - 3);
            graphics2D.drawLine(n4, n2, n6, n2);
            graphics2D.drawLine(n5, n2 += 14, n3, n2);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getAussehenText()[1], n5, n2 - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getFamilieText()[3], n4, n2 - 3);
            graphics2D.drawLine(n4, n2, n6, n2);
            graphics2D.drawLine(n5, n2 += 14, n3, n2);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getAussehenText()[2], n5, n2 - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getFamilieText()[4], n4, n2 - 3);
            graphics2D.drawLine(n4, n2, n6, n2);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getAussehenText()[3], n5, (n2 += 14) - 3);
            graphics2D.drawString(this.\u00d6O0000.thissuper().getFamilieText()[5], n4, n2 - 3);
            graphics2D.drawLine(n4, n2, n6, n2);
            n2 -= 14;
            if (bl) break;
            this.o00000(graphics2D, n5 - 5, n7 - 14, n6 - n5 + 10, n2 - n7 + 33, 5, 5);
            bl = true;
        }
        return n2 + 38;
    }

    private int o00000(Graphics2D graphics2D, boolean bl) {
        int n = 30;
        int n2 = 15;
        int n3 = 435;
        for (int i2 = 0; i2 <= 1; ++i2) {
            int n4;
            String string;
            Object object;
            n = 30;
            graphics2D.setFont(this.o00000(16));
            graphics2D.drawString("Name: ", n2, n - 4);
            if (this.o00000(this.\u00d6O0000.toString(), graphics2D) > 345.0f) {
                object = this.\u00d6O0000.toString().split(" ");
                string = "";
                for (n4 = 0; n4 < ((String[])object).length; ++n4) {
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
                for (n4 = 0; n4 < ((String[])object).length; ++n4) {
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
                for (n4 = 0; n4 < ((String[])object).length; ++n4) {
                    if (this.o00000(string, graphics2D) + this.o00000(object[n4], graphics2D) > 330.0f) {
                        graphics2D.drawString(string, 90, n - 4);
                        graphics2D.drawLine(n2, n, n3, n);
                        n += 17;
                        string = (String)object[n4] + " ";
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
            if (this.o00000((String)object, graphics2D) > 345.0f) {
                String[] stringArray = ((String)object).split(" ");
                String string2 = "";
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
                graphics2D.drawString((String)object, 90, n - 4);
            }
            if (i2 != 0) continue;
            this.o00000(graphics2D, 10, 10, 430, n - 5, 5, 5);
        }
        graphics2D.setFont(this.o00000(10));
        return n + 25;
    }

    private void \u00d4O0000(Graphics2D graphics2D, int n) {
        int n2;
        int n3 = 15;
        int n4 = 420 + n3;
        int n5 = n2 + 11;
        this.o00000(graphics2D, n3 - 5, n, n4 - n3 + 10, 668 - n, 5, 5);
        graphics2D.setFont(this.o00000(10));
        for (n2 = n; n2 < 660; n2 += 11) {
            graphics2D.drawLine(n3, n2, n4, n2);
        }
        Iterator<String> iterator = this.o00000(graphics2D, this.\u00d6O0000).iterator();
        for (int i2 = 0; i2 < this.\u00d2\u00d30000; ++i2) {
            for (int i3 = n5; i3 < 660 && iterator.hasNext(); i3 += 11) {
                iterator.next();
            }
        }
        while (iterator.hasNext() && n5 < 660) {
            graphics2D.drawString(iterator.next(), n3, n5 - 2);
            n5 += 11;
        }
    }

    private int \u00d5O0000(Graphics2D graphics2D, int n) {
        int n2 = n;
        int n3 = 14;
        int n4 = 402 + n3;
        boolean bl = true;
        this.o00000(graphics2D, n3 - 4, n - 15, n4 - n3 + 28, 98, 5, 5);
        for (int i2 = 0; i2 <= 1; ++i2) {
            int n5;
            n2 = n;
            int n6 = 14;
            int n7 = 206 + n6;
            if (!bl) {
                n6 = 228;
                n7 = 201 + n6;
            }
            if (bl) {
                graphics2D.setFont(this.o00000(10));
                graphics2D.drawString("Verbindungen", n6, n2 - 2);
                graphics2D.drawLine(n6, n2, n7, n2);
                n2 += 11;
            }
            int n8 = 7;
            graphics2D.setFont(this.o00000(8));
            Iterator<String> iterator = this.\u00d6O0000.\u00d4o0000().\u00d200000().iterator();
            for (n5 = 0; n5 < this.\u00d2\u00d30000; ++n5) {
                for (int i3 = 0; i3 < 15 && iterator.hasNext(); ++i3) {
                    iterator.next();
                }
            }
            if (!bl) {
                for (n5 = 0; n5 < 7; ++n5) {
                    if (!iterator.hasNext()) continue;
                    iterator.next();
                }
            }
            if (!bl) {
                ++n8;
            }
            while (n8 > 0 && iterator.hasNext()) {
                --n8;
                String string = iterator.next();
                graphics2D.drawString(string, n6 + 30, n2 - 1);
                graphics2D.drawString("SO:" + this.\u00d6O0000.\u00d4o0000().\u00d200000(string).o00000(), n6, n2 - 1);
                graphics2D.drawLine(n6, n2, n7, n2);
                n2 += 11;
            }
            while (n8 > 0) {
                graphics2D.drawLine(n6, n2, n7, n2);
                n2 += 11;
                --n8;
            }
            bl = false;
        }
        return n2;
    }

    public List<String> o00000(Graphics2D graphics2D, OooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2) {
        String[] stringArray;
        ArrayList<String> arrayList = new ArrayList<String>();
        graphics2D.setFont(this.o00000(9));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.thissuper().getNotiz().length; ++i2) {
            stringArray = oooOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO2.thissuper().getNotiz()[i2];
            if (stringArray == null) continue;
            stringBuilder.append((String)stringArray);
            stringBuilder.append(" ");
        }
        String string = stringBuilder.toString().replaceAll("\n", " \n ");
        stringArray = string.split(" ");
        String string2 = "";
        for (String string3 : stringArray) {
            if (string3.equals("\n")) {
                arrayList.add(string2);
                string2 = "";
            }
            if (string3.trim().equals("")) continue;
            StringBuilder stringBuilder2 = new StringBuilder();
            if (this.o00000(stringBuilder2.append(string2).append(" ").append(string3).toString(), graphics2D) < 420.0f) {
                string2 = string2 + " " + string3;
                continue;
            }
            arrayList.add(string2);
            string2 = string3;
        }
        arrayList.add(string2);
        return arrayList;
    }

    private int \u00d500000(Graphics2D graphics2D) {
        int n;
        String string;
        Object object;
        int n2 = 30;
        int n3 = 15;
        n2 = 30;
        graphics2D.setFont(this.o00000(16));
        if (this.o00000(this.\u00d6O0000.toString(), graphics2D) > 345.0f) {
            object = this.\u00d6O0000.toString().split(" ");
            string = "";
            for (n = 0; n < ((String[])object).length; ++n) {
                if (this.o00000(string, graphics2D) + this.o00000(object[n], graphics2D) > 330.0f) {
                    n2 += 17;
                    string = object[n] + " ";
                    continue;
                }
                string = string + object[n] + " ";
            }
            n2 += 17;
        } else {
            n2 += 17;
        }
        graphics2D.setFont(this.o00000(12));
        graphics2D.drawString("Rasse: ", n3, n2 - 4);
        if (this.o00000(this.\u00d6O0000.o\u00d20000().toString(), graphics2D) > 345.0f) {
            object = this.\u00d6O0000.o\u00d20000().toString().split(" ");
            string = "";
            for (n = 0; n < ((String[])object).length; ++n) {
                if (this.o00000(string, graphics2D) + this.o00000(object[n], graphics2D) > 330.0f) {
                    n2 += 17;
                    string = (String)object[n] + " ";
                    continue;
                }
                string = string + (String)object[n] + " ";
            }
            n2 += 17;
        } else {
            n2 += 17;
        }
        if (this.o00000(this.\u00d6O0000.\u00f800000().toString(), graphics2D) > 345.0f) {
            object = this.\u00d6O0000.\u00f800000().toString().split(" ");
            string = "";
            for (n = 0; n < ((String[])object).length; ++n) {
                if (this.o00000(string, graphics2D) + this.o00000((String)object[n], graphics2D) > 330.0f) {
                    n2 += 17;
                    string = (String)object[n] + " ";
                    continue;
                }
                string = string + (String)object[n] + " ";
            }
            n2 += 17;
        } else {
            n2 += 17;
        }
        object = this.\u00d6O0000.\u00d800000().toString();
        if (!this.\u00d6O0000.thissuper().\u00d300000().isEmpty()) {
            object = this.\u00d6O0000.thissuper().\u00d300000();
        }
        if (this.o00000((String)object, graphics2D) > 345.0f) {
            String[] stringArray = ((String)object).split(" ");
            String string2 = "";
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                if (this.o00000(string2, graphics2D) + this.o00000(stringArray[i2], graphics2D) > 330.0f) {
                    n2 += 17;
                    string2 = stringArray[i2] + " ";
                    continue;
                }
                string2 = string2 + stringArray[i2] + " ";
            }
        }
        return n2 + 25;
    }
}

