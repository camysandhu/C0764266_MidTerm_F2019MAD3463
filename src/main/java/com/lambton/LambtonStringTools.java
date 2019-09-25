package com.lambton;

public class LambtonStringTools {

    public String reverse(String string) {
        StringBuilder rev = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            rev.append(string.charAt(i));
        }

        return rev.toString();
    }

    public int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryMultiplier = 1;
        for (char c : reverse(binary).toCharArray()) {
            if (c == '1') {
                decimal += binaryMultiplier;
            } else if (c == '0') {

            } else {
                return -1;
            }
            binaryMultiplier *= 2;

        }
        return decimal;
    }

    public String initials(String fullName)
    {
        fullName=fullName.toUpperCase();
        String names[]=fullName.split(" ");
        if (names.length == 2)
        {
          return null;

        }
        else
        {
            String initials = " ";
            for(int i=0;i<names.length-1;i++)
            {
                initials+=names[i].toUpperCase().charAt(0)+". ";
            }
            initials+=titleCase(names[names.length-1]);
            return initials;

        }
        }

    private String titleCase(String name) {
        name = name.toLowerCase();
        String titleCasedName = "";
        titleCasedName+=Character.toString(name.charAt(0)).toUpperCase();
        titleCasedName+=name.substring(1);
        return titleCasedName;
    }

}






