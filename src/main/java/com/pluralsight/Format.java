package com.pluralsight;

public class Format {

    public static void main(String[] args) {

    // test the method by putting it in sout
        System.out.println( formatName( "cherish", "ibeabuchi"));


        String formattedName = formatName("cherish", "ibeabuchi");
        System.out.println(formattedName);
    }



  public static String formatName(String first, String last) {
        return last + "," + first;

}

}

