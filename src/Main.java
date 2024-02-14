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

        byte banana =5;
        byte milk = 2;
        byte iceCream = 2;
        byte egg = 4;

        byte vesOdinBanana = 80;
        byte vesOdinMilk = 105;
        byte vesOdinIcekrem = 100;
        byte vesOdinEgg = 70;

        int bananaDobavil = banana * vesOdinBanana;
        int milkDobavil = milk * vesOdinMilk;
        int icekramDobavil = iceCream * vesOdinIcekrem;
        int eggDobavil = egg * vesOdinEgg;

        float vesObsh = bananaDobavil + milkDobavil + icekramDobavil + eggDobavil;
        float vesVKg = vesObsh / 1000;

        System.out.println("Вес спорт завтрака в граммах равен " + vesObsh + ", а в кг " + vesVKg);

        // zadanie 7

        short sbrositVes = 7000;
        short vDenSmall = 250;
        short vDemBig = 500;
        int maloSbrosil = sbrositVes / vDenSmall;
        int mnogoSbrosil = sbrositVes / vDemBig;

        System.out.println("Если спортсмен будет сбрасывать в день " + vDenSmall + " гр, то он похудеет на 7 кг за " + maloSbrosil + " дней");
        System.out.println("Если спортсмен будет сбрасывать в день " + vDemBig + " гр, то он похудеет на 7 кг за " + mnogoSbrosil + " дней");
        System.out.println("В среднем спортсмену понабиться от " + mnogoSbrosil + " до " + maloSbrosil + " дней, чтобы похудеть");

        // zadanie 8

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float povishenie = 0.10F;
        int god = 12;

        float mashaDopZp = masha * povishenie;
        float denisDopZP = denis * povishenie;
        float kristinaDopZp = kristina * povishenie;

        float mashaFinalZp = mashaDopZp + masha;
        float denisFinalZp = denisDopZP + denis;
        float kristinaFinalZp = kristinaDopZp + kristina;

        int mashaGodZp = masha * 12;
        int denisGodZp = denis * 12;
        int kristinaGodZp = kristina * 12;

        float mashaGodDopZp = mashaFinalZp * god;
        float desiGodDopZp = denisFinalZp * god;
        float kristinaGodDopZp = kristinaFinalZp * god;

        float raznitsaMasha = mashaGodDopZp - mashaGodZp;
        float raznitsaDenis = desiGodDopZp - denisGodZp;
        float raznitsaKristina = kristinaGodDopZp - kristinaGodZp;

        System.out.println("Маша получит прибавку к зарплате " + mashaDopZp + " руб, разница в год равна " + raznitsaMasha + " рублей");
        System.out.println("Денис получет прибавку к зарплате " + denisDopZP + " руб, разница в год равна " + raznitsaDenis + " рублей");
        System.out.println("Крестина получет прибавку к зарплате " + kristinaDopZp + " руб, разница в год равна " + raznitsaKristina + " рублей");













    }
}