/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import helden.framework.Einstellungen;
import helden.framework.held.Object.private;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class M {
    public static void o00000(File file, File file2) throws IOException {
        File[] fileArray = file.listFiles();
        file2.mkdirs();
        if (fileArray != null) {
            for (File file3 : fileArray) {
                if (file3.isDirectory()) {
                    M.o00000(file3, new File(file2.getAbsolutePath() + System.getProperty("file.separator") + file3.getName()));
                    continue;
                }
                M.\u00d200000(file3, new File(file2.getAbsolutePath() + System.getProperty("file.separator") + file3.getName()));
            }
        }
    }

    public static void \u00d200000(File file, File file2) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, true));
        int n = 0;
        while ((n = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(n);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    public static boolean \u00d200000(String string, String string2) {
        return M.o00000(string, string2, true);
    }

    public static boolean o00000(String string, String string2, boolean bl) {
        File file = new File(string);
        File file2 = new File(string2);
        if (file.exists()) {
            if (file2.exists() && bl) {
                M.Object(file2);
            }
            try {
                if (file.isFile()) {
                    M.\u00d200000(file, file2);
                } else {
                    M.o00000(file, file2);
                }
                return true;
            }
            catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        } else {
            return true;
        }
        return false;
    }

    public static boolean o00000(File file) {
        return M.o00000(file, false);
    }

    public static boolean o00000(File file, boolean bl) {
        boolean bl2 = true;
        String string = file.getAbsolutePath();
        if (file.isFile()) {
            bl2 = file.delete();
            if (!bl2) {
                M.\u00d500000(file);
            }
        } else if (file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    M.o00000(file2);
                }
                if (bl2 = file2.delete()) continue;
                M.\u00d500000(file2);
            }
            if (bl) {
                do {
                    if (!(bl2 = file.delete())) {
                        M.\u00d500000(file);
                    }
                    file = file.getParentFile();
                } while (bl2 && file != null && file.canRead() && file.list().length == 0);
            }
        }
        if (!bl2) {
            private.\u00d200000("" + string, "christian");
        }
        return bl2;
    }

    public static boolean o00000(String string, boolean bl) {
        return M.o00000(new File(string), bl);
    }

    public static int \u00d200000(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            int n = 0;
            int n2 = 0;
            while ((n2 = bufferedInputStream.read()) != -1) {
                n += n2;
            }
            bufferedInputStream.close();
            return n;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return -1;
        }
    }

    public static boolean \u00d400000(File file) {
        File file2;
        if (file.isFile() || file.getName().endsWith("zip.hld")) {
            file = file.getParentFile();
        }
        int n = 0;
        do {
            file2 = new File(file.getAbsolutePath() + "/schreibtest" + n);
            ++n;
        } while (file2.exists());
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, true));
            bufferedOutputStream.write(65);
            String string = System.getProperty("line.separator");
            for (int i2 = 0; i2 < string.length(); ++i2) {
                bufferedOutputStream.write(string.charAt(i2));
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            Scanner scanner = new Scanner(file2);
            boolean bl = false;
            String string2 = scanner.next();
            if (string2.equals("A")) {
                bl = true;
            }
            scanner.close();
            file2.delete();
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public static void o00000(String string, String string2) {
        M.\u00d200000(string, string2, false);
    }

    public static void \u00d200000(String string, String string2, boolean bl) {
        boolean bl2 = M.\u00d200000(string, string2);
        if (bl2) {
            M.o00000(new File(string), bl);
        }
    }

    public static void Object(File file) {
        String string = file.getAbsolutePath();
        while (new File(string).exists()) {
            string = string + ".old";
        }
        file.renameTo(new File(string));
    }

    private static void \u00d500000(File file) {
        Einstellungen.getInstance().getZuLoeschendeDateienList().add(file.getAbsolutePath());
    }

    private M() {
    }

    public boolean o00000(String string) {
        return M.o00000(new File(string), false);
    }
}

