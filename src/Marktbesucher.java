public class Marktbesucher implements Zuschauer{

    private String name;
    public Marktbesucher(String name){
        this.name= name;
    }

    @Override
    public void applaudieren() {
        System.out.println("Marktbesucher " + name +": Applaus");
    }
}
