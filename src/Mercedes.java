public class Mercedes  extends  Auto{
    public Mercedes(String name) {
        super(name);
    }

    @Override
    public void signal() {
        System.out.println("signalit");
    }
}
