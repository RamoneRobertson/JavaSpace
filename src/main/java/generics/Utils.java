package generics;

public class Utils {
    public static <T extends Comparable <T>> T max(T first, T second ){
        return (first > second) ? first : second;
    }
}
