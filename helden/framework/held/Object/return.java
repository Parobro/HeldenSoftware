/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.gui.float;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class return {
    private String \u00d400000;
    private String o00000 = "---------------------------";
    private String Object;
    private HashMap<String, _o> \u00d200000;

    public return() {
        this("multipart/form-data");
    }

    public return(String string) {
        this(string, new Long(System.currentTimeMillis()).toString());
    }

    public return(String string, String string2) {
        this.Object = string;
        this.\u00d400000 = string2;
        this.\u00d200000 = new HashMap();
    }

    public void o00000(String string, File file, String string2) throws float {
        if (!file.isFile() || !file.canRead()) {
            throw new float();
        }
        _o _o2 = new _o(string, file, string2);
        this.\u00d200000.put(string, _o2);
    }

    public void o00000(String string, File file, String string2, String string3) throws float {
        if (!file.isFile() || !file.canRead()) {
            throw new float();
        }
        _o _o2 = new _o(string, file, string2, string3);
        this.\u00d200000.put(string, _o2);
    }

    public _o o00000(String string, String string2) {
        _o _o2 = new _o(string, string2);
        this.\u00d200000.put(string, _o2);
        return _o2;
    }

    public void o00000(String string, String string2, String string3) {
        _o _o2 = new _o(string, string2, string3);
        this.\u00d200000.put(string, _o2);
    }

    public String \u00d400000() {
        return this.\u00d400000;
    }

    public Set<String> \u00d300000() {
        return this.\u00d200000.keySet();
    }

    public String o00000() {
        return this.Object;
    }

    public String new() {
        return new String(this.Object + "; boundary=" + this.o00000 + this.\u00d400000);
    }

    public void new(String string) {
        this.\u00d400000 = string;
    }

    public void o00000(String string) {
        this.Object = string;
    }

    public void o00000(OutputStream outputStream) throws IOException {
        String string;
        byte[] byArray = new byte[1024];
        for (_o _o2 : this.\u00d200000.values()) {
            string = "--" + this.o00000 + this.\u00d400000 + "\r\n";
            if (_o2.\u00d300000 == null) {
                string = string + "Content-Encoding: UTF-8\r\nContent-Disposition: " + _o2.String + "; name=\"" + _o2.\u00d200000 + "\"\r\n\r\n" + _o2.\u00d500000 + "\r\n";
                outputStream.write(string.getBytes("UTF-8"));
            } else {
                int n;
                string = string + "Content-Disposition: form-data; name=\"" + _o2.\u00d200000 + "\"; filename=\"" + _o2.\u00d500000 + "\"\r\nContent-Type: " + _o2.String + "\r\n\r\n";
                outputStream.write(string.getBytes("UTF-8"));
                FileInputStream fileInputStream = new FileInputStream(_o2.\u00d300000);
                while ((n = fileInputStream.read(byArray)) != -1) {
                    outputStream.write(byArray, 0, n);
                }
                fileInputStream.close();
                string = "\r\n\r\n";
                outputStream.write(string.getBytes("UTF-8"));
            }
            outputStream.flush();
        }
        string = "--" + this.o00000 + this.\u00d400000 + "--\r\n";
        outputStream.write(string.getBytes("UTF-8"));
        outputStream.flush();
    }

    public final class _o {
        private String \u00d200000;
        private String \u00d500000 = null;
        private File \u00d300000 = null;
        private String \u00d600000 = "";
        private String String;

        private _o(String string, File file, String string2) {
            this.\u00d200000 = string;
            this.\u00d300000 = file;
            this.\u00d500000 = file.getName();
            this.String = string2;
        }

        private _o(String string, File file, String string2, String string3) {
            this.\u00d200000 = string;
            this.\u00d300000 = file;
            this.\u00d500000 = string2;
        }

        private _o(String string, String string2) {
            this(string, string2, "form-data");
        }

        private _o(String string, String string2, String string3) {
            this.\u00d200000 = string;
            this.\u00d500000 = string2;
            this.String = string3;
        }

        public String o00000() {
            return this.\u00d600000;
        }

        public void o00000(String string) {
            this.\u00d600000 = string;
        }
    }
}

