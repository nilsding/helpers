// The tweet that started it all: https://twitter.com/nilsding/status/740241674597761024

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
    
}
