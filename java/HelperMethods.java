// The tweet that started it all: https://twitter.com/nilsding/status/740241674597761024

import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.ArrayList;

public class HelperMethods {

    public static boolean isTrue(boolean bool) {
        if (Boolean.toString(bool).length() == 4) {
            return new Object() instanceof Object;
        } else if (Boolean.toString(bool).length() == 5) {
            return !isTrue(1 == 1);
        } else {
            return false;
        }
    }
    
    private static class ExampleObject extends Object {
        @Override
        public int hashCode() {
            return 423874;
        }
    }
    
    public static boolean isObject(Object o) {
        if (o.hashCode() == 423874) {
            return true;
        } else if (isTrue(o instanceof Object)) {
            return isObject(new ExampleObject());
        } else {
            return false;
        }
    }
    
    public static boolean isNull(Object o) {
        try {
            o.toString();
        } catch (NullPointerException e) {
            o = "This object was null.";
            return !isNull(o);
        }
        return isTrue("This object is not null".length() <3);
    }
    
    public static boolean willThisProgramStop() {
        while (isTrue(true)) {}
        return true;
    }
    
    public static boolean willThisProgramRunForever() {
        return !willThisProgramStop();
    }
    
    public static int[] sleepSort(int... args) {
        final int[] sorted = new int[args.length];
        final AtomicInteger index = new AtomicInteger(0);
        List<Thread> threads = new ArrayList<Thread>(0);
        for (int i = 0; i < args.length; i++) {
            final int x = i;
            Thread sorter = new Thread(() -> {
                try {
                    Thread.sleep(args[x]);
                } catch (InterruptedException ex) {
                        // shrug
                }
                sorted[index.getAndIncrement()] = args[x];
            });
            sorter.setDaemon(true);
            sorter.start();
            threads.add(sorter);
        }
        try {
            for (Thread t : threads) { t.join(); }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return sorted;
    }
    
    public static boolean isEqual(int a, int b) {
        try {
            int c = 1 / (a - b);
        } catch (ArithmeticException e) {
            return true;
        }
        return false;
    }
}
