public class Gaukler {

    private Zuschauer[] zuschauer;

    public Gaukler(Zuschauer[] z){
        zuschauer = z;
        gaukeln();
    }

    public void gaukeln(){
        System.out.println("jonglieren");
        update();
    }
    public void update(){
        for (int i = 0; i<zuschauer.length;i++){
            zuschauer[i].applaudieren();
        }
    }


}
