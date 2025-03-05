/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.A;

import helden.Version;
import java.util.Date;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class A {
    public static final String \u00d5o0000 = "Eigenschaft steigern";
    public static final String \u00d4o0000 = "Geld";
    public static final String \u00d8o0000 = "Eigenschafts-Modifikator steigern";
    public static final String \u00d3O0000 = "Start-Eigenschaft steigern";
    public static final String nullsuper = "Eigenschaft R\u00fcckkauf";
    public static final String \u00f4o0000 = "Talent steigern";
    public static final String \u00d3o0000 = "Nahkampftalent steigern";
    public static final String oo0000 = "Zauber aktivieren";
    public static final String thissuper = "Zauber entfernt";
    public static final String new = "Hauszauber ver\u00e4ndert";
    public static final String \u00d4\u00d20000 = "Zauber steigern";
    public static final String \u00d800000 = "Talent aktivieren";
    public static final String \u00f5O0000 = "Sonderfertigkeit hinzugef\u00fcgt";
    public static final String forsuper = "Sonderfertigkeit entfernt";
    public static final String \u00d4O0000 = "Abenteuerpunkte";
    public static final String \u00d400000 = "Nachteile senken";
    public static final String \u00d300000 = "Vor-/Nachteil hinzugef\u00fcgt";
    public static final String \u00d3\u00d20000 = "Vor-/Nachteil entfernt";
    public static final String if = "Talent entfernt";
    public static final String \u00f8o0000 = "Rasse";
    public static final String \u00f5o0000 = "Profession";
    public static final String while = "Kultur";
    public static final String privatesuper = "Ereignis eingeben";
    private static Integer \u00f8O0000 = 0;
    public static final Integer \u00f4O0000 = -1;
    private String O\u00d20000;
    private Object \u00f400000;
    private String o00000;
    private String oO0000;
    private Integer \u00d8O0000;
    private Integer \u00d5O0000;
    private Integer \u00f500000;
    private Integer return;
    private String \u00d500000;
    private String \u00f800000;
    private Integer Stringsuper;
    private String OO0000;
    private Date newnew;
    private boolean Oo0000;
    private String o\u00d20000;

    public static Integer for() {
        Integer n = \u00f8O0000;
        Integer n2 = \u00f8O0000 = Integer.valueOf(\u00f8O0000 + 1);
        return \u00f8O0000;
    }

    public A(String string, Object object, String string2) {
        this(string, object, string2, (Integer)0, (Integer)0, (Integer)0, (Integer)0, "", "");
    }

    public A(String string, Object object, String string2, Integer n, Integer n2, Integer n3, Integer n4) {
        this(string, object, string2, n, n2, n3, n4, "", "");
    }

    public A(String string, Object object, String string2, Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6) {
        this(string, object, string2, n, n2, n3, n4, "" + n5, "" + n6);
    }

    public A(String string, Object object, String string2, Integer n, Integer n2, Integer n3, Integer n4, String string3, String string4) {
        this.o00000 = string2;
        this.O\u00d20000 = string;
        this.\u00d8O0000 = n;
        this.\u00d5O0000 = n2;
        this.\u00f500000 = n3;
        this.return = n4;
        this.\u00f800000 = string4;
        this.\u00d500000 = string3;
        this.\u00f400000 = object;
        this.Stringsuper = \u00f4O0000;
        this.OO0000 = (string + " " + object).trim();
        this.newnew = new Date();
        this.Oo0000 = false;
        this.oO0000 = "";
        this.o\u00d20000 = "HS " + Version.getVersion();
    }

    public A(String string, String string2, Integer n, Integer n2, Integer n3, Integer n4) {
        this(string, (Object)"", string2, n, n2, n3, n4, "", "");
    }

    public String \u00d3O0000() {
        return this.O\u00d20000;
    }

    public String \u00f800000() {
        return this.\u00d500000;
    }

    public Integer o00000() {
        return this.\u00f500000;
    }

    public Integer \u00d5O0000() {
        return this.return;
    }

    public String \u00d600000() {
        return this.oO0000;
    }

    public Date \u00d800000() {
        return this.newnew;
    }

    public Integer String() {
        return this.Stringsuper;
    }

    public Integer \u00d200000() {
        return this.\u00d8O0000;
    }

    public String private() {
        return this.o00000;
    }

    public Integer oO0000() {
        return this.\u00d5O0000;
    }

    public String \u00f600000() {
        return this.\u00f800000;
    }

    public Object \u00d2O0000() {
        return this.\u00f400000;
    }

    public String \u00f500000() {
        return this.\u00f400000.toString();
    }

    public String null() {
        return this.OO0000;
    }

    public String \u00d300000() {
        return this.o\u00d20000;
    }

    public boolean \u00d500000() {
        return this.Oo0000;
    }

    public void \u00d300000(String string) {
        this.O\u00d20000 = string;
    }

    public void \u00d200000(String string) {
        this.\u00d500000 = string;
    }

    public void \u00d300000(Integer n) {
        this.\u00f500000 = n;
    }

    public void String(Integer n) {
        this.return = n;
    }

    public void \u00d500000(String string) {
        this.oO0000 = string;
    }

    public void o00000(Date date) {
        this.newnew = date;
    }

    public void o00000(Integer n, String string) {
        this.Stringsuper = n;
        this.OO0000 = string;
    }

    public void o00000(Integer n) {
        this.\u00d8O0000 = n;
    }

    public void o00000(String string) {
        this.o00000 = string;
    }

    public void \u00d200000(Integer n) {
        this.\u00d5O0000 = n;
    }

    public void \u00d600000(String string) {
        this.\u00f800000 = string;
    }

    public void o00000(Object object) {
        this.\u00f400000 = object;
    }

    public void o00000(boolean bl) {
        this.Oo0000 = bl;
    }

    public void String(String string) {
        this.o\u00d20000 = string;
    }

    public void o00000(String string, String string2) {
        this.\u00f800000 = string2;
        this.\u00d500000 = string;
    }
}

