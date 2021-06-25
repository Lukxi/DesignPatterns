public class Main {

    public static void main(String[] args) {
        Zuschauer[] zuschauer = new Zuschauer[3];
        zuschauer[0] = new Marktbesucher("Heinz");
        zuschauer[1] = new Marktbesucher("Franz");
        zuschauer[2] = new Marktbesucher("Xaver");

        new Gaukler(zuschauer);
    }

}
