class Solution {
    public String intToRoman(int x) {
        String[] thousands = new String[]{"","M","MM","MMM"};
String[] hundreds = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
String[] tens = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
String[] units = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
return thousands[x/1000] + hundreds[(x%1000)/100] + tens[(x%100)/10] + units[x%10];
    }
}
