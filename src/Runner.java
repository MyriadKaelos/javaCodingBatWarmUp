public class Runner {
    public static void main(String[] args) {
        System.out.println(cigarParty(50,false));
        System.out.println(squirrelPlay(98,true));
        System.out.println(old35(33));
        System.out.println(firstHalf("WhatHave"));
        System.out.println(twoAsOne(5,8,3));
        System.out.println(in1To10(5,false));
        System.out.println(redTicket(1,2,1));
        System.out.println(answerCell(true,true,false));
        System.out.println(hasBad("xbadxx"));
        System.out.println(delDel("ddelel"));

    }
    public static boolean cigarParty(int x, boolean y) {
        return (x >= 40 && x <= 60) || (x >= 40 && y);
    }
    public static boolean squirrelPlay(int x, boolean y) {
        return x >=60 && x <= 90+(y ? 10 : 0);
    }
    public static boolean old35(int x) {
        return x % 5 == 0 ^ x % 3 == 0;
    }
    public static String firstHalf(String str) { return str.substring(str.length()/2); }
    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }
    public static boolean in1To10(int n, boolean outsideMode) {
        return ((n >= 1 && n <= 10) && !outsideMode) || (outsideMode && (n <= 1 || n >= 10));
    }
    public static int redTicket(int a, int b, int c) {
        if(b != a) {
            return c != b ? 1 : 0;
        } else if(a == c) {
            return a == 2 ? 10 : 5;
        } else {return 0;}
    }
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(!isAsleep) {
            if(isMorning) {
                if(isMom) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static boolean hasBad(String str) {
        return str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad");
    }
    public static String delDel(String str) {
        if(str.length() > 3) {
            if(str.substring(1,4).equals("del")) {
                return str.substring(0,1) + str.substring(4,str.length());
            }
        }
        return str;
    }




}
