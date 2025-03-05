/*
 * Decompiled with CFR 0.152.
 */
package helden.framework.held.Object;

import java.lang.management.ManagementFactory;
import javax.swing.JProgressBar;

public class Z
implements Runnable {
    private JProgressBar o00000;

    public Z(JProgressBar jProgressBar) {
        this.o00000 = jProgressBar;
    }

    @Override
    public void run() {
        while (true) {
            long l2 = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getMax();
            long l3 = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage().getUsed();
            int n = (int)(l2 / 1024L / 1024L);
            int n2 = (int)(l3 / 1024L / 1024L);
            this.o00000.setMaximum(n);
            this.o00000.setValue(n2);
            this.o00000.setString(n2 + "MB of " + n + "MB");
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
            }
        }
    }
}

