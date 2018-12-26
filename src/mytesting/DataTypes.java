package mytesting;

public class DataTypes {

    public static void main(String[] args) {
        System.out.println("Hellow world!");
        System.out.println();
        byte a = 5;
        short b = -100;
        int c = 1000000;
        long d = -122335544;
        System.out.println("Целочисленные:");
        System.out.println("byte a: " + a);
        System.out.println();
        System.out.println("int c: " + c);
        System.out.println();
        System.out.println("long d: " + d);
        System.out.println();
        double doble1 = 133.155;
        System.out.println();
        System.out.println("Вещественные:");
        System.out.println("double doble1: " + doble1);
        float float1 = 150.32f;
        System.out.println("float float1: " + float1);
        System.out.println();
        System.out.println("Переменные хранящие значения true или false");
        boolean boolean1 = true; // или  true или  false
        System.out.println("boolean boolean1:" + boolean1);
        boolean boolean2 = false; // или  true или  false
        System.out.println("boolean boolean2:" + boolean2);
        System.out.println();
        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println();
        System.out.println(boolean3);
        System.out.println(boolean4);
        System.out.println();
        System.out.println("Строкавая переменная");
        String string = "String";
        System.out.println("String: " + string);
        System.out.println();
        String str = "hello";
        String str2 = "world";
        String str3 = str + " " + str2;
        System.out.println(str3);
        System.out.println();
        System.out.println("Переменная использующая один символ");
        System.out.println("char");
        char char1 = 'q';
        System.out.println(char1);
    }
}
