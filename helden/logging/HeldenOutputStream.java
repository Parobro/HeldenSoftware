/*
 * Decompiled with CFR 0.152.
 */
package helden.logging;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class HeldenOutputStream
extends FileOutputStream {
    private OutputStream super;
    private File \u00d200000;

    public HeldenOutputStream(File file, OutputStream outputStream) throws FileNotFoundException {
        super(file, true);
        this.super = outputStream;
        this.\u00d200000 = file;
    }

    @Override
    public void flush() throws IOException {
        super.flush();
        this.super.flush();
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        if (byArray == null) {
            return;
        }
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        super.write(byArray, n, n2);
        for (int i2 = n; i2 < n2; ++i2) {
            this.super.write(byArray[i2]);
        }
    }

    @Override
    public void write(int n) throws IOException {
        super.write(n);
        this.super.write(n);
    }

    protected Object clone() throws CloneNotSupportedException {
        try {
            return new HeldenOutputStream(this.\u00d200000, this.super);
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            return null;
        }
    }
}

