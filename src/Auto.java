public abstract class Auto implements Metal{
    String name;
    String model;
    String info;
    int price;
    int wight = 1200;

   public Auto(String name){
       this.name = name;
   }

   public  abstract void signal();
}
