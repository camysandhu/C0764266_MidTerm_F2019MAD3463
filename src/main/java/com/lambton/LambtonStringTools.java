package com.lambton;

public class LambtonStringTools {

    public String reverse(String string)
    {
        StringBuilder rev = new StringBuilder();
        for (int i = string.length() - 1; i >=0; i--)
        {
            rev.append(string.charAt(i));
        }

        return rev.toString();
    }
     public int binaryToDecimal(String binary)
     {
         int decimal = 0;
         int binaryMultiplier = 1;
         for(char c:reverse(binary).toCharArray())
         {

         }

     }
    }


