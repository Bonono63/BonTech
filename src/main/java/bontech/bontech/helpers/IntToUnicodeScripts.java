package bontech.bontech.helpers;

public class IntToUnicodeScripts {

    public static String convertSubScript(int i){

        //₀₁₂₃₄₅₆₇₈₉₊₋⁰¹²³⁴⁵⁶⁷⁸⁹⁺⁻AaBbCcDdEeFfGgHhJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz ᣟ //

        String s = "";
        String digit = Integer.toString(i);
        for (int y = 0 ; y < digit.length() ; y ++)
        {
            if (digit.charAt(y) == '-'){
                s += "₋";
            }else
            if (digit.charAt(y) == '+'){
                s += "₊";
            }else
            if (digit.charAt(y) == '0'){
                s += "₀";
            }else
            if (digit.charAt(y) == '1'){
                s += "₁";
            }else
            if (digit.charAt(y) == '2'){
                s += "₂";
            }else
            if (digit.charAt(y) == '3'){
                s += "₃";
            }else
            if (digit.charAt(y) == '4'){
                s += "₄";
            }else
            if (digit.charAt(y) == '5'){
                s += "₅";
            }else
            if (digit.charAt(y) == '6'){
                s += "₆";
            }else
            if (digit.charAt(y) == '7'){
                s += "₇";
            }else
            if (digit.charAt(y) == '8'){
                s += "₈";
            }else
            if (digit.charAt(y) == '9'){
                s += "₉";
            }
        }
        return s;
    }

    public static String convertSuperScript(int i){
        String s = "";
        String digit = Integer.toString(i);
        for (int y = 0 ; y < digit.length() ; y ++)
        {
            if (digit.charAt(y) == '-'){
                s += "⁻";
            }else
            if (digit.charAt(y) == '+'){
                s += "⁺";
            }else
            if (digit.charAt(y) == '0'){
                s += "⁰";
            }else
            if (digit.charAt(y) == '1'){
                s += "¹";
            }else
            if (digit.charAt(y) == '2'){
                s += "²";
            }else
            if (digit.charAt(y) == '3'){
                s += "³";
            }else
            if (digit.charAt(y) == '4'){
                s += "⁴";
            }else
            if (digit.charAt(y) == '5'){
                s += "⁵";
            }else
            if (digit.charAt(y) == '6'){
                s += "⁶";
            }else
            if (digit.charAt(y) == '7'){
                s += "⁷";
            }else
            if (digit.charAt(y) == '8'){
                s += "⁸";
            }else
            if (digit.charAt(y) == '9'){
                s += "⁹";
            }
        }
        return s;
    }
    public static String floatConvertSuperScript(float i){
        String s = "";
        String digit = Float.toString(i);
        for (int y = 0 ; y < digit.length() ; y ++)
        {
            if (digit.charAt(y) == '-'){
                s += "⁻";
            }else
            if (digit.charAt(y) == '.'){
                s += "·";
            }
            if (digit.charAt(y) == '+'){
                s += "⁺";
            }else
            if (digit.charAt(y) == '0'){
                s += "⁰";
            }else
            if (digit.charAt(y) == '1'){
                s += "¹";
            }else
            if (digit.charAt(y) == '2'){
                s += "²";
            }else
            if (digit.charAt(y) == '3'){
                s += "³";
            }else
            if (digit.charAt(y) == '4'){
                s += "⁴";
            }else
            if (digit.charAt(y) == '5'){
                s += "⁵";
            }else
            if (digit.charAt(y) == '6'){
                s += "⁶";
            }else
            if (digit.charAt(y) == '7'){
                s += "⁷";
            }else
            if (digit.charAt(y) == '8'){
                s += "⁸";
            }else
            if (digit.charAt(y) == '9'){
                s += "⁹";
            }
        }
        return s;
    }
}
