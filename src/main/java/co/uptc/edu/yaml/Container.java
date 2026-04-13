package co.uptc.edu.yaml;

public class Container {

    public int getBlanks(String value) {
        return value.length() - value.stripLeading().lastIndexOf(value);
    }
}
