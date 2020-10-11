package TugasPBO1;

import java.util.Scanner;

public class Suhu {
    static int  y;
    static double c, f, k, r;

    static class celcius {
        public void convertion() {
            c = y;
            f = y * 1.8 + 32;
            k = y + 273;
            r = y * 0.8;
        }

        public void hasil() {
            System.out.println("Celcius : " + c);
            System.out.println("Fahrenheit : " + f);
            System.out.println("Kelvin : " + k);
            System.out.println("Reamur : " + r);
        }
    }
    static class fahrenheit{
        public void convertion(){
            c = 0.56 * (y-32);
            f = y;
            k = c + 273;
            r = 0.44 * (y-32);
        }
        public void hasil(){
            System.out.println("Celcius : " + c);
            System.out.println("Fahrenheit : " + f);
            System.out.println("Kelvin : " + k);
            System.out.println("Reamur : " + r);
        }
    }
    static class kelvin{
        public void convertion(){
            c = y - 273;
            f = 1.8 * c + 32;
            k = y;
            r = 0.8 * c;
        }
        public void hasil(){
            System.out.println("Celcius : " + c);
            System.out.println("Fahrenheit : " + f);
            System.out.println("Kelvin : " + k);
            System.out.println("Reamur : " + r);
        }
    }
    static class reamur{
        public void convertion(){
            c = 1.25 * y;
            f = 2.25 * y + 32;
            k = c + 273;
            r = y;
        }
        public void hasil(){
            System.out.println("Celcius : " + c);
            System.out.println("Fahrenheit : " + f);
            System.out.println("Kelvin : " + k);
            System.out.println("Reamur : " + r);
        }
    }

    public static void main(String[] args) {
        int z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Konversi Suhu Dari : ");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.println("4. Reamur");
        System.out.println("Pilihan : ");
        z = scanner.nextInt();
        System.out.println("Berapa Derajat : ");
        y = scanner.nextInt();
        switch (z) {
            case 1 :
                celcius cel = new celcius();
                cel.convertion();
                cel.hasil();
                break;
            case 2 :
                fahrenheit fah = new fahrenheit();
                fah.convertion();
                fah.hasil();
                break;
            case 3 :
                kelvin kel = new kelvin();
                kel.convertion();
                kel.hasil();
                break;
            case 4 :
                reamur rea = new reamur();
                rea.convertion();
                rea.hasil();
                break;
        }
    }
}

