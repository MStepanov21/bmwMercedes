import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Какой марки автомобиль вы хотите приобрести?\nBmw или Mercedes");
        String name = sc.nextLine();

        if (name.equals("Mercedes")){
            Mercedes Mercedes = new Mercedes();
            Mercedes.name = "Mercedes";
            System.out.println("Какая модель Вас интересует?\nG200, GLE250, GLS350, S320?");
            String nameAuto = sc.nextLine();
                    if (nameAuto.equals("G200")){
                        Mercedes.priceG200 = 7500000;
                        Mercedes.infoG200 = "2.0 л\n4wd\nКомплектация: Luxe\nПробег: 5250\nАреста на машину нет";
                        System.out.println(Mercedes.infoG200);
                        boolean G = false;
                        do {
                            System.out.println("Стоимость автомобиля" + " " + Mercedes.priceG200 + "\n Введите сумму транзакции");
                            int answer = Integer.parseInt(sc.nextLine());
                            if (answer == (Mercedes.priceG200)){
                                System.out.println("Поздравляем с покупкой\nАвтомобиль будет Вас ожидать сегодня в 20:00 по адресу Пулковское шоссе 14");
                                break;
                            }
                            G = true;

                        }while (G);





                    }else if(nameAuto.equals("GLE250")){
                        Mercedes.priceGLE250 = 5000000;
                        Mercedes.infoGLE250 = "2.4 л\n4wd\nКомплектация: Elite\nПробег: 7000\nАреста на машину нет";
                        System.out.println(Mercedes.infoGLE250);
                        boolean GLE = false;
                        do {
                            System.out.println("Стоимость автомобиля" + " " + Mercedes.priceGLE250+ "\n Введите сумму транзакции");
                            int answer = Integer.parseInt(sc.nextLine());
                            if (answer == (Mercedes.priceGLE250)){
                                System.out.println("Поздравляем с покупкой\nАвтомобиль будет Вас ожидать сегодня в 20:00 по адресу Пулковское шоссе 14");
                                break;
                            }
                            GLE = true;

                        }while (GLE);

                    }else if(nameAuto.equals("GLS350")){
                        Mercedes.priceGLS350 = 4000000;
                        Mercedes.infoGLS350 = "3.0 л\n4wd\nКомплектация: Comfort\nПробег: 23586\nАреста на машину нет";
                        System.out.println(Mercedes.infoGLS350);
                        boolean GLS = false;
                        do {
                            System.out.println("Стоимость автомобиля" + " " + Mercedes.priceGLS350+ "\n Введите сумму транзакции");
                            int answer = Integer.parseInt(sc.nextLine());
                            if (answer == (Mercedes.priceGLS350)){
                                System.out.println("Поздравляем с покупкой\nАвтомобиль будет Вас ожидать сегодня в 20:00 по адресу Пулковское шоссе 14");
                                break;
                            }
                            GLS = true;

                        }while (GLS);

                    }


        }else if (name.equals("Bmw")){
            Bmw Bmw = new Bmw();
            Bmw.name1 = "Bmw";
            ;
            System.out.println("Какую модель Вы желаете?\nM8, X5, I8");
            String nameAuto = sc.nextLine();
            if (nameAuto.equals("M8")){
                Bmw.priceM8 = 12000000;
                Bmw.infoM8 = "4.0 л\n2wd\nКомплектация: Luxe\nПробег: 10546\nАреста на машину нет";
                System.out.println(Bmw.infoM8);
                boolean M = false;
                do {
                    System.out.println("Стоимость автомобиля" + " " + Bmw.priceM8 + "\n Введите сумму транзакции");
                    int answer = Integer.parseInt(sc.nextLine());
                    if (answer == (Bmw.priceM8)) {
                        System.out.println("Поздравляем с покупкой!\nАвтомобиль будет Вас ожидать сегодня в 20:00 по адресу ул. Стартовая 10");
                        break;
                    }
                    M = true;

                }while (M);

            }else if (nameAuto.equals("X5")){
                Bmw.priceX5 = 8500000;
                Bmw.infoX5 = "3.0 л\n4wd\nКомплектация: Prestige\nПробег: 2476\nАреста на машину нет";
                System.out.println(Bmw.infoX5);
                boolean X = false;
                do {
                    System.out.println("Стоимость автомобиля" + " " + Bmw.priceX5 + "\n Введите сумму транзакции");
                    int answer = Integer.parseInt(sc.nextLine());
                    if (answer == (Bmw.priceX5)) {
                        System.out.println("Поздравляем с покупкой!\nАвтомобиль будет Вас ожидать сегодня в 20:00 по адресу ул. Стартовая 10");
                        break;
                    }
                    X = true;

                } while (X);
            }else if(nameAuto.equals("I8")){
                Bmw.priceI8 = 10000000;
                Bmw.infoI8 = "6.0 л\n4wd\nКомплектация: Luxe\nПробег: 13567\nАреста на машину нет";
                System.out.println(Bmw.infoI8);
                boolean I = false;
                do {
                    System.out.println("Стоимость автомобиля" + " " + Bmw.priceI8 + "\n Введите сумму транзакции");
                    int answer = Integer.parseInt(sc.nextLine());
                    if (answer == (Bmw.priceI8)) {
                        System.out.println("Поздравляем с покупкой!\nАвтомобиль будет Вас ожидать сегодня в 20:00 по адресу ул. Стартовая 10");
                        break;
                    }
                    I = true;

                } while (I);


            }
        }

    }
}