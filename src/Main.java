public class Main {
    public static void main(String[] args) {

        // zadanie 1

        int odin = 2000000;
        byte dva = 100;
        short tri = 30000;
        long chetire = 900000000;
        float piat = 35.2F;
        double shest = 208.2;

        System.out.println("Значениее переменной с типом int равно " + odin);
        System.out.println("Значениее переменной с типом byte равно " + dva);
        System.out.println("Значениее переменной с типом short равно " + tri);
        System.out.println("Значениее переменной с типом long равно " + chetire);
        System.out.println("Значениее переменной с типом float равно " + piat);
        System.out.println("Значениее переменной с типом double равно " + shest);

        // zadanie 2

        float verySmallDrob = 27.12F;
        long bigChislo = 987678965549L;
        float malllDrob = 2.786F;
        short shislo = 569;
        short otrChislo = -159;
        short notBigCheslo = 27897;
        byte smallChislo = 67;

        // zadanie 3

        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short listov = 480;
        int ucheniki = ludmila + anna + ekaterina;
        int listovVsem = listov / ucheniki;

        System.out.println("На каждого ученика расчитано " + listovVsem + " Листов бумаги");

        // zadanie 4

        byte bottle = 16;
        byte time = 2;
        int bottlePerMinuta = bottle / time;
        int minuti = bottlePerMinuta * 20;
        int sutki = bottlePerMinuta * 1440;
        int triDnia = bottlePerMinuta * 4320;
        int mesits = bottlePerMinuta * 42780;

        System.out.println("За 20 минут машина произвела " + minuti + " штук бутылок");
        System.out.println("За сутки машина произвела " + sutki + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + triDnia + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + mesits + " штук бутылок");

        // zadanie 5

        byte obshKraska = 120;
        byte beloy = 2;
        byte korichnevoi = 4;
        int klassovVsego = obshKraska / (beloy + korichnevoi);
        int vsegoBeloy = beloy * klassovVsego;
        int vsegoKorichevoi = korichnevoi * klassovVsego;

        System.out.println("В школе, где " + klassovVsego + " классов, нужно " + vsegoBeloy + " банок белой краски и " + vsegoKorichevoi + " банок коричневой краски.");

        // zadanie 6





    }
}