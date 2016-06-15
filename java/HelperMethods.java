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
    
    public static class ExampleObject extends Object {
        @Override
        public int hashCode() {
            return 423874;
        }
    }
    
    public static boolean isObject(Object thing) {
        if (thing.hashCode() == 423874) {
            return true;
        } else if (isTrue(object instanceof Object)) {
            return isObject(new ExampleObject());
        } else {
            return false;
        }
    }
    
}
