import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Menu {
    private int balanc = 500_000;

    private int index = 0;
    private Scanner sc = new Scanner(System.in);
    private Auto [] autos = new Auto[100];
    private MetaloBaza metaloBaza = new MetaloBaza();

    public void menuStart(){
        System.out.println(balanc + "$");
        System.out.println("1 купить авто");
        System.out.println("2 показать купленные авто");
        System.out.println("3 пополнить баланс");
        System.out.println("отправить на металобазу");
        String menuchoose = sc.nextLine();
        switch (menuchoose) {
            case "1" -> {menuShopAuto();menuStart();}
            case "2" -> {menuAutoPark(); menuStart();}
            case "3" -> {popolnenieBalanc();}
            case "4" -> {metaloBaza();}
        }



        //проверку если 1 запустить метод покупки  если 2 вывести все авто из массива
    }

    public void menuShopAuto() {

        System.out.println("баланс " + balanc);
        System.out.println("Какой марки автомобиль вы хотите приобрести?" +
                "\n1 Mersedes " +
                "\n2 Bmw " +
                "\n3 Audi");
        String name = sc.nextLine();

        if (name.equals("1")) {
            autos[index] = shopMersedes();
            autos[index].signal();
            index++;
        } else if (name.equals("2")) {
            autos[index] = shopBmw();
            autos[index].signal();
            index++;
        } else if (name.equals("3")) {
            autos[index] = shopAudi();
            autos[index].signal();
            index++;
        }
    }
        public void menuAutoPark() {
            for (int i = 0; i < autos.length; i++) {
                if (autos[i] != null){
                    System.out.println( i + "номер авто "+ autos[i].name);
                }

                }
            }


        //покупку бмв и добавить еще один автомобиль

    private void popolnenieBalanc() {
        System.out.println("На какую сумму вы хотите пополнить баланс");
        int summa = sc.nextInt();
        sc.nextLine();

        if (summa<1){
            System.out.println("Операция не прошла");
            menuStart();
        }

        if (balanc > 100_000 && summa <= 50_000) {
            balanc = balanc + summa;
            menuStart();
        } else if (balanc <= 100_000 && balanc >= 50_000 && summa <= 150_000) {
            balanc = balanc + summa;
            menuStart();

        } else if (balanc < 50_000 && summa <= 250_000) {
            balanc = balanc + summa;
            menuStart();
        } else {
            System.out.println("Операция не прошла");
            popolnenieBalanc();
        }
    }

    public void metaloBaza(){
        System.out.println("выберите авто для отправки на металобазу");
        menuAutoPark();
        int otvet = sc.nextInt();
        sc.nextLine();
        balanc = balanc + metaloBaza.utilAuto(autos[otvet]);
        autos[otvet] = null;
        menuStart();

    }


    private Mercedes shopMersedes (){
        System.out.println("Какая модель Вас интересует?" +
                "\n1 GLE250 (150 000$)" +
                "\n2 GLS350 (220 000$)" +
                "\n3 S320 (350 000$)" +
                "\n4 Вернуться в меню");
        String nameAuto = sc.nextLine();
            if(nameAuto.equals("1")) {
                if (balanc >= 150_000){
                    balanc = balanc -  150_000;
                    nameAuto = "GLE250";
                }else {
                    System.out.println("недостаточно средсв на балансе");
                    menuStart();
                }

            }else if(nameAuto.equals("2")){
                if(balanc >= 220_000) {
                    balanc -= 220_000;
                    nameAuto = "GLS350";
                }else {
                    System.out.println("недостаточно средств на балансе");
                    menuStart();
                }
        }else if(nameAuto.equals("3")){
                if(balanc >= 350000) {
                    balanc -= 350000;
                    nameAuto = "S320";
                }else {
                    System.out.println("недостаточно средст на балансе");
                    menuStart();
                }

        }else if(nameAuto.equals("4")) {
                menuStart();
            }else {
                shopMersedes();
            }

        Mercedes mercedes = new Mercedes(nameAuto);

        return mercedes;



        }

    private Bmw shopBmw() {
        System.out.println("Какая модель Вас интересует?" +
                "\n1 X6 (250 000$)" +
                "\n2 X7 (320 000$)" +
                "\n3 M8 (450 000$)" +
                "\n4 Вернуться в меню");
        String nameAuto = sc.nextLine();
        if(nameAuto.equals("1")) {
            if(balanc >= 250_000) {
                balanc -= 250_000;
                nameAuto = "X6";
            }else {
                System.out.println("Недостаточно средст на балансе");
                menuStart();
            }
        }else if(nameAuto.equals("2")) {
            if (balanc >= 320_000) {
                balanc -= 320_000;
                nameAuto = "X7";
            } else {
                System.out.println("недостаточно средст на балансе");
                menuStart();
            }
        }else if(nameAuto.equals("3")){
            if(balanc >= 450_000){
                balanc -= 450_000;
                nameAuto = "M8";
            }else {
                System.out.println("недостаточно средст на балансе");
                menuStart();
            }

        }else if(nameAuto.equals("4")){
            menuStart();
        }else {
            shopBmw();
        }
        Bmw bmw = new Bmw(nameAuto);
        return bmw;


    }

    private Audi shopAudi() {
        System.out.println("Какая модель Вас интересует?" +
                "\n1 A8 (350 000$)" +
                "\n2 R8 (420 000$)" +
                "\n3 Q8 (340 000$)");
        String nameAuto = sc.nextLine();
        if(nameAuto.equals("1")) {
            if(balanc >= 350_000){
                balanc -= 350_000;
                nameAuto = "A8";
            }else {
                System.out.println("недостаточно средст на балансе");
                menuStart();
            }

        }else if(nameAuto.equals("2")){
            if(balanc >= 420_000){
                balanc -= 420_000;
                nameAuto = "R8";
            }else {
                System.out.println("недостаточно средст на балансе");
                menuStart();
            }

        }else if(nameAuto.equals("3")){
            if(balanc >= 340_000){
                balanc -= 340_000;
                nameAuto = "Q8";
            }else {
                System.out.println("недостаточно средст");
                menuStart();
            }

        }else if(nameAuto.equals("4")){
            menuStart();
        }else {
            shopAudi();
        }
        Audi audi = new Audi(nameAuto);
        return audi;
    }

    }



