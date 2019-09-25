package com.lambton;

public class C0764266_MidTerm_F2019MAD3463
{
    public static void main(String[] args)
    {
        LambtonStringTools object = new LambtonStringTools();
        System.out.println(" Lambton "+object.reverse("Lambton"));

        System.out.println("1000 "+object.binaryToDecimal("1000"));
        System.out.println("100000 "+object.binaryToDecimal("1000"));
        System.out.println("01001101 "+object.binaryToDecimal("01001101"));
        System.out.println("1000.1 "+object.binaryToDecimal("1000.1"));

        System.out.println("James tiBeriUs kiRK " + object.initials("James tiBeriUs kiRK"));
        System.out.println("camy SaNDHu SinGH " + object.initials("Camy SaNDHu SinGH"));
        System.out.println("raman dHILLon kauR " + object.initials("raman dHILLon kauR"));

        System.out.println("Harman" + object.mostFrequent("harman"));
        System.out.println("camay" + object.mostFrequent("camay"));
        System.out.println("Ramandeep" + object.mostFrequent("Ramandeep"));
        System.out.println("Jaspreet" + object.mostFrequent("Jaspreet"));
        System.out.println("Harchandbir" + object.mostFrequent("Harchandbir"));

        System.out.println("the dog jumped over the fence" +object.mostFrequent(""));

    }

}
