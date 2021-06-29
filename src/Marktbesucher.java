public class Marktbesucher implements Observer {

    /**
     * Der Name des Zuschauers
     */
    private String name;

    /**
     * Nimmt den Namen des Marktbesuchers entgegen
     * @param name Der Name des Besuchers
     */
    public Marktbesucher(String name)
    {
        this.name = name;
    }


    public void update()
    {
        int zufallszahl = (int)(Math.random() * 10);
        if(zufallszahl < 5)
            System.out.println(name + " sagt: \"Ahhh!\"");
        else
            System.out.println(name + " sagt: \"Ohhh!\"");
    }

    @Override
    public String toString()
    {
        return name;
    }
}
