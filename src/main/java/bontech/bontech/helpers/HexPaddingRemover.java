package bontech.bontech.helpers;

import bontech.bontech.BonTech;

import java.util.Arrays;

public class HexPaddingRemover {

    public static String remover(String input)
    {
        String result;

        char[] temp = input.toCharArray();

        if (temp[0] == '0' && temp[1] == 'x') {
            StringBuilder builder = new StringBuilder();

            for ( int x = 2 ; x < temp.length ; x++) {
                builder.append(temp[x]);
            }
            result = builder.toString();
        } else {
            result = input;
        }

        return result;
    }
}
