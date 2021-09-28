package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int min(int nb1, int nb2) {
        return nb1 < nb2 ? nb1 : nb2;
    }

    public static int abs(int nbr1) {
        return -nbr1;
    }

    public static int sum(int Nentier) {
        int totals = 0;
        for (int i = 0; i <= Nentier; i++) {
            totals += i;
        }
        return totals;
    }

    public static int power(int Chiffre, int Puissance) {
        return (int) Math.pow(Chiffre, Puissance);

    }

    public static String Mirror(String Nom) {
        int length = Nom.length();
        System.out.println(Nom.length());
        String totalName = " ";
        for (int i = length - 1; i >= 0; i--) {
            totalName += Nom.charAt(i);
        }
        return totalName;

    }

    public static String displayMultTables(int Tables) {
        String tables = " ";
        for (int i = 1; i <= 10; i++) {
            tables = tables + i + " x " + Tables + " = " + (i * Tables) + "\n";
        }
        return tables;
    }

    public static int isLeapYear(int Years){
        if (Years % 4 == 0 && Years % 100 != 0 || Years % 400 == 0) {
            System.out.println("L'an " + Years + " est bissextile");
        } else {
            System.out.println("L'an " + Years + " n'est pas bissextile");
        }
        return Years;
    }

    public static String isCorrectDate(int year, int month, int days) {
        boolean isPairs = false;
        String JoursValible = " ";

        int Mois_Pairs[] = {4, 6, 9, 11};
        for (int i = 0; i < Mois_Pairs.length; i++) {
            if (Mois_Pairs[i] == month) {
                isPairs = true;
            }
        }

        if (isPairs) {
            System.out.println("Le mois se finis par 30");
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Le mois de février se finit par le 29");
            } else {
                System.out.println("Le mois de février se finit par le 28");
            }
        } else {
            System.out.println("Le mois se finis par 31");
        }
        if (days <= 31 && month <= 12) {
            System.out.println("On est le " + days + " " + month + " " + year);
        } else if (days > 31) {
            System.out.println("La date n'est pas valible car le jour n° " + days + " n'existe pas");
        } else if (month > 12) {
            System.out.println("La date n'est pas valible car le mois numéro n° " + month + " n'existe pas");
        }
        return JoursValible;
    }

    public static void main(String[] args) {
        System.out.println("Hello Coding Factory!");

        System.out.println( "le nombre le plus petit est " + min(2, 5));
        System.out.println("L'inverse de ce chiffre est " + abs(-5));
        System.out.println("La somme de 1 jusqu'à ce nombre est " + sum(4));
        System.out.println("La puissance de A par B est de " + power(2, 4));
        System.out.println("Le nom à l'envers est " + Mirror("Coding"));
        System.out.println("Les tables de i " + displayMultTables(5));
        System.out.println(isLeapYear(2021));
        System.out.println(isCorrectDate(1996, 2, 29));


       /* Random random = new Random();
        int r = random.nextInt(10);
        System.out.println(r);

        Random random2 = new Random();
        int r2 = random2.nextInt(15);

        Random random3 = new Random();
        int r3 = random3.nextInt(13);
        System.out.println(random3);

        int age = 23;
        float width = 14.5f;
        String name = "Baptiste";
        boolean isCorrect = true;


        System.out.println("Mon age est " + age);
        System.out.println("" + width);
        System.out.println(" " + name);
        System.out.println(" " + isCorrect);

        age = age - 2 * 4 / 3 + 5 % 50;

        int pair = 20;
        float impair = 15.33f;

        System.out.println(" " + pair / 2);
        System.out.println(" " + impair / 2);

        int v1 = r;
        int v2 = r2;
        int v3 = r3;

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        if (v1 < v2 && v1 < v3) {
            System.out.println("la variable 1 est la plus petite");
        } else if (v2 < v1 && v2 < v3) {
            System.out.println("La variable 2 est la plus petite");
        } else if (v3 < v1 && v3 < v2) {
            System.out.println("La variable 3 est la plus petite");
        }

        int num1 = 5;
        int num2 = 10;
        int result1 = num1 * num2;

        if (result1 < 0) {
            System.out.println("Le résultat est négatif");
        } else {
            System.out.println("Le résultat est positif");
        }

        Random randomA = new Random();
        int rA = randomA.nextInt(101);
        System.out.println(rA);

        if (rA >= 18) {
            System.out.println("La personne est majeur");
        } else {
            System.out.println("La personne est mineur");
        }

        Random randomB = new Random();
        int rB = randomB.nextInt(22);
        System.out.println(rB);

        if (rB < 10) {
            System.out.println("Le bachelier pars en rattrapage");
        } else if (rB < 12) {
            System.out.println("Le bachelier n'as pas de mention");
        } else if (rB < 14) {
            System.out.println("Le bachelier as une mention assez bien");
        } else if (rB < 16) {
            System.out.println("Le bachelier as une mention bien");
        } else if (rB < 18) {
            System.out.println("Le bachelier as une mention très bien");
        } else if (rB < 20) {
            System.out.println("Le bachelier as une mention d'excellence");
        } else {
            System.out.println("Le bachelier est trop fort ou est un tricheur");
        }

        Random randomM = new Random();
        int rModulo = random.nextInt(1001);
        System.out.println(rModulo);

        if (rModulo % 2 == 0) {
            System.out.println("La valeur est pair");
        } else {
            System.out.println("La valeur est impair");
        }

        Random randomYears = new Random();
        int rYears = randomYears.nextInt(5000) - (randomYears.nextInt(5000));

        if (rYears % 4 == 0 && rYears % 100 != 0 || rYears % 400 == 0) {
            System.out.println("L'an " + rYears + " est bissextile");
        } else {
            System.out.println("L'an " + rYears + " n'est pas bissextile");
        }

        Random randomDays = new Random();
        int rDays = randomDays.nextInt(36 - 1 + 1) + 1;
        Random randomMonth = new Random();
        int rMonth = randomMonth.nextInt(15 - 1 + 1) + 1;

        int jours = rDays;
        int Mois = rMonth;
        int Année = rYears;
        boolean isPairs = false;

        int Mois_Pairs[] = {4, 6, 9, 11};
        for (int i = 0; i < Mois_Pairs.length; i++) {
            if (Mois_Pairs[i] == rMonth) {
                isPairs = true;
            }
        }

        if (isPairs) {
            System.out.println("Le mois se finis par 30");
        } else if (Mois == 2) {
            if (rYears % 4 == 0 && rYears % 100 != 0 || rYears % 400 == 0) {
                System.out.println("Le mois de février se finit par le 29");
            } else {
                System.out.println("Le mois de février se finit par le 28");
            }
        } else {
            System.out.println("Le mois se finis par 31");
        }
        if (jours <= 31 && Mois <= 12) {
            System.out.println("On est le " + jours + " " + Mois + " " + Année);
        } else if (jours > 31) {
            System.out.println("La date n'est pas valible car le jour n° " + jours + " n'existe pas");
        } else if (Mois > 12) {
            System.out.println("La date n'est pas valible car le mois numéro n° " + Mois + " n'existe pas");
        }

        // BOUCLES
        for (int i = 0; i <= 100; i++) {
            System.out.println(100 - i);
        }

        for (int i = 3; i <= 100; i++) {
            if (i % 3 == 0) System.out.println(i);
        }

        int a = 5;
        for (int b = 0; b <= 10; b++) {
            System.out.println(Math.pow(a, b));
        }

        int c = 7;

        for (int d = 10; d >= 10; d++) {
            System.out.println(c * d);
        }
*/
        int n = 54;
        int m = 34;
        int total = 0; 

        for (int z = 1; z < n; z++) {
            if (total > m) {
                break;
            }
            total += z;
            System.out.println(total);
        }

        String Name = "Baptiste";
        int length = Name.length();
        System.out.println(Name.length());
        String totalName = "";
        for (int i = length-1; i >= 0; i--) {
            totalName += Name.charAt(i);
        } System.out.println(totalName);


    }

}
