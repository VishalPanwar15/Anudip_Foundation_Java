package com.anudip.corejava;

import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo extends Thread {
    static ConcurrentHashMap<Long, String> hmap = new ConcurrentHashMap<Long, String>();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exc) {}
            System.out.println("Child thread updating hashmap");
            hmap.putIfAbsent(9993432006L, "Ashok");
            hmap.replace(9993432006l,"Ashok","Hurrrrrrr");

    }

    public static void main(String[] args) throws InterruptedException {
        hmap.put(6264489514L, "Vishal");
        hmap.put(7869047952L, "Bhupseh");
        hmap.put(7389705502L, "Suresh");
        hmap.put(9630806503L, "Rahul");

        ConcurrentMapDemo d = new ConcurrentMapDemo();
        d.start();

        Set<Long> s = hmap.keySet();
        Iterator<Long> itr = s.iterator();
        while (itr.hasNext()) {
            Long l1 = itr.next();
            System.out.println(l1 + " : " + hmap.get(l1));
            Thread.sleep(3000);
        }
        d.join();
        System.out.println(hmap);
    }
}
