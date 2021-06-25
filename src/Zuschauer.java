public interface Zuschauer {

    public default void applaudieren(){
        System.out.println("Zuschauer: Applaus");
    }

}
