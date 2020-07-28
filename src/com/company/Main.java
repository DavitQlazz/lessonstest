package com.company;

public class Main {

    public static void main(String[] args) {
        string("anun", "azganaun", 22);
    }

    public static void string(String firstName, String lastName, int age) {
        String data = "Person data: " + firstName + " " + lastName + " " + age;
        StringBuilder builder = new StringBuilder("hello");
        StringBuffer builder2 = new StringBuffer("hello");
        builder.append(firstName)
                .append(lastName)
                .append(age);
        String string = builder.toString();
        System.out.println(data);
    }

    public static void string() {
        String string = "hello";
        String stringChar = new String(new char[]{'a', 'b', 'c'});
        StringBuilder builder = new StringBuilder("hello");
        StringBuilder builder2 = new StringBuilder("hello");
//        System.out.println(string == builder);
//        System.out.println(string.equals(builder));
//        System.out.println(builder.equals(builder));
    }

    public static void string1() {
        System.out.println("1" + 4 + 5);
        System.out.println(1 + 4 + "5");
    }

    public static void string2() {
        String string = "hello";
        System.out.println(string);
    }

    public static void number1() {
//        byte b = -128;
//        double sh = -32769;
//        double d = 100L;
//        double d1 = (float) 100L;
//        System.out.println(b);
//        System.out.println(sh);
//        System.out.println(d);
//        System.out.println(d1);
//        System.out.println(10d / 3d);
//        System.out.println(10f / 3f);
    }

    // package: bet.base.page
    // Class: MyMain
    // field; myField
    // FILED
    // static final String FILED;

    public static void number2() {
//        int a, b, c = 0;
//        int a, b, c;
//        int g, int h, int i = 0;
//        int d, e, FILED;
    }

    public static void number3() {
//        byte b1 = 128;
        byte b2 = 123;
//        long b3 = (short) 128;
        float b4 = (int) 128f;
        System.out.println(b4);
    }

    public static void number4() {
        double d = 0;
        for (int i = 0; i <= 100; i++) {
            d = d + 0.1;
        }
        System.out.println(10d / 3d);
    }


}
