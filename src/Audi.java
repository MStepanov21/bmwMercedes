public class Audi extends Auto {

    public Audi(String name){
        super(name);
    }

    @Override
    public void signal() {
        System.out.println("signalit");
    }
}
