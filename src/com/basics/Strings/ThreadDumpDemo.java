/*
Thread Dump is the snapshot of all threads that are part of the process.
* Illustrates difference in processing time of String v/s StringBuilder
* when subjected to multiple additions/ editing.
I used heaphero.io for visualising values of thread dump.
* */
package com.basics.Strings;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class ThreadDumpDemo {
    //Method 2
    private static String threadDump(boolean lockedMonitors, boolean lockedSynchronizers) {
        StringBuffer threadDump = new StringBuffer(System.lineSeparator());
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        for(ThreadInfo threadInfo : threadMXBean.dumpAllThreads(lockedMonitors, lockedSynchronizers)) {
            threadDump.append(threadInfo.toString());
        }
        return threadDump.toString();
    }
    public static void main(String[] args) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        //Method 1
        System.out.println("Method 1");
        ThreadInfo[] threads = ManagementFactory.getThreadMXBean()
                .dumpAllThreads(true, true);
        for (ThreadInfo info : threads) {
            System.out.print(info);
        }
        long strStart = System.currentTimeMillis();
        for (int i = 0; i<100000; i++){
            str += "a";
        }
        // Method 2 (conti...)
        System.out.println("-------------------------");
        System.out.println("Method 2");
        System.out.println(threadDump(true,true));
        long strEnd = System.currentTimeMillis();
        System.out.println("Timen taken by String: "+(strEnd-strStart)/60);
        long sbStart = System.currentTimeMillis();
        for (int i = 0; i<100000; i++){
            sb.append("a");
        }
        long sbEnd = System.currentTimeMillis();
        // Method 2 (conti...)
        System.out.println("-------------------------");
        System.out.println("Method 2");
        System.out.println(threadDump(true,true));
        System.out.println("Timen taken by StringBuilder: "+(sbEnd-sbStart)/60);
    }
}

/*
* Another method:
* for(int i=0;i< 50000;i++){

if(i%4000 == 0){

HotSpotDiagnosticMXBean mxBean = ManagementFactory.newPlatformMXBeanProxy(ManagementFactory.getPlatformMBeanServer(),
"com.sun.management:type=HotSpotDiagnostic", HotSpotDiagnosticMXBean.class);
mxBean.dumpHeap("/Users/prathika-0814/heap/heap"+i+".bin", true);
}

str = str+i;

System.out.println(""+str);

}
Can't find dumpHeap symbol in mxBean error
* */
