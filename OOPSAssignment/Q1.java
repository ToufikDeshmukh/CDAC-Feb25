class DataDefaults {
    // Instance variables (automatically initialized)
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    void printDefaults() {
        System.out.println("Default Values:");
        System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: [" + defaultChar + "] (empty if uninitialized)");
        System.out.println("boolean: " + defaultBoolean);
    }
}

public class Q1 {
    public static void main(String args[]) {
        DataDefaults obj = new DataDefaults();
        obj.printDefaults();
    }
}

