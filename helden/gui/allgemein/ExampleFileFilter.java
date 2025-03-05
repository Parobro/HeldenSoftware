/*
 * Decompiled with CFR 0.152.
 */
package helden.gui.allgemein;

import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.filechooser.FileFilter;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ExampleFileFilter
extends FileFilter {
    private Hashtable<String, ExampleFileFilter> \u00d200000 = new Hashtable();
    private String super = null;
    private String \u00d400000 = null;
    private boolean \u00d300000 = false;

    public ExampleFileFilter() {
    }

    public ExampleFileFilter(String string) {
        this(string, null);
    }

    public ExampleFileFilter(String string, String string2) {
        this();
        if (string != null) {
            this.addExtension(string);
        }
        if (string2 != null) {
            this.setDescription(string2);
        }
    }

    public ExampleFileFilter(String string, String string2, String string3) {
        this();
        if (string != null) {
            this.addExtension(string);
        }
        if (string2 != null) {
            this.addExtension(string2);
        }
        if (string3 != null) {
            this.setDescription(string3);
        }
    }

    public ExampleFileFilter(String string, String string2, String string3, String string4) {
        this();
        if (string != null) {
            this.addExtension(string);
        }
        if (string2 != null) {
            this.addExtension(string2);
        }
        if (string3 != null) {
            this.addExtension(string3);
        }
        if (string4 != null) {
            this.setDescription(string4);
        }
    }

    public ExampleFileFilter(String[] stringArray) {
        this(stringArray, null);
    }

    public ExampleFileFilter(String[] stringArray, String string) {
        this();
        for (String string2 : stringArray) {
            this.addExtension(string2);
        }
        if (string != null) {
            this.setDescription(string);
        }
    }

    @Override
    public boolean accept(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                return true;
            }
            Enumeration<String> enumeration = this.\u00d200000.keys();
            while (enumeration != null && enumeration.hasMoreElements()) {
                String string = file.getName().toLowerCase();
                String string2 = enumeration.nextElement();
                if (!string.endsWith("." + string2)) continue;
                return true;
            }
        }
        return false;
    }

    public void addExtension(String string) {
        if (this.\u00d200000 == null) {
            this.\u00d200000 = new Hashtable(5);
        }
        this.\u00d200000.put(string.toLowerCase(), this);
        this.\u00d400000 = null;
    }

    @Override
    public String getDescription() {
        if (this.\u00d400000 == null) {
            if (this.super == null || this.isExtensionListInDescription()) {
                this.\u00d400000 = this.super == null ? "(" : this.super + " (";
                Enumeration<String> enumeration = this.\u00d200000.keys();
                if (enumeration != null) {
                    this.\u00d400000 = this.\u00d400000 + "." + enumeration.nextElement();
                    while (enumeration.hasMoreElements()) {
                        this.\u00d400000 = this.\u00d400000 + ", " + enumeration.nextElement();
                    }
                }
                this.\u00d400000 = this.\u00d400000 + ")";
            } else {
                this.\u00d400000 = this.super;
            }
        }
        return this.\u00d400000;
    }

    public String getExtension(File file) {
        String string;
        int n;
        if (file != null && (n = (string = file.getName()).lastIndexOf(46)) > 0 && n < string.length() - 1) {
            return string.substring(n + 1).toLowerCase();
        }
        return null;
    }

    public boolean isExtensionListInDescription() {
        return this.\u00d300000;
    }

    public void setDescription(String string) {
        this.super = string;
        this.\u00d400000 = null;
    }

    public void setExtensionListInDescription(boolean bl) {
        this.\u00d300000 = bl;
        this.\u00d400000 = null;
    }
}

