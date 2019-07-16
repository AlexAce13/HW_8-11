package org.avivicourses.hw10;

public class Main {
    public static void main(String[] args) {

        String avers = "otodoto sos setes";
        palindrom(avers);
//        String pal = "";
//        String revers = new StringBuffer(avers).reverse().toString();
//        if(avers.equals(revers)){
//            System.out.println("cool");
//        }
    }

    public static void palindrom(String s){
        String full = s.trim();
        String []splitArray = full.split(" ");
        int length;
        String palindrom = "";
        length = 0;
        for(int i = 0; i < splitArray.length; i++ ){
            String pal = splitArray[i];
            String pal1 = new StringBuffer(pal).reverse().toString();
            if(pal.equals(pal1)){
                if(pal.length() > length){
                    palindrom = pal;
                    length = pal.length();
                }
            }
        }
        System.out.println("The longest palindrome: " + palindrom);
        System.out.println("Its length: " + palindrom.length());
    }
}
