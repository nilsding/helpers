// The tweet that started it all: https://twitter.com/nilsding/status/740241674597761024

public class HelperMethods {

    public static boolean isTrue(boolean bool) {
        if (Boolean.toString(bool).length() == 4) {
            return true;
        } else if (Boolean.toString(bool).length() == 5) {
            return !isTrue(1 == 1);
        } else {
            return false;
        }
    }
}
