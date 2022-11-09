public class MetaloBaza {
    int priceKg = 5;

    public int  utilAuto(Auto auto){
        System.out.println("авто утилизированно");
        return auto.wight * priceKg;
    }
}
