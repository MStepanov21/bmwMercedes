public abstract class Auto {
    String name;
    String model;
    String info;
    int price;

   public Auto(String name){
       this.name = name;
   }

   public  abstract void signal();
}
