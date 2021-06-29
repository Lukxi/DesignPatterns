public class Gaukler implements Observable{

    /**
     * Anzahl möglicher Besucher
     */
    private int anzahl = 5;
    /**
     * Speichert die Referenzen auf die Zuschauer-Objekte
     */
    private Observer[] observer = new Observer[anzahl];
    /**
     * Index, der dabei hilft, über das Zuschauerarray zu adressieren
     */
    private int arrayIndex = 0;

    /**
     * Fügt dem Zuschauer-Array einen Zuschauer hinzu.
     * @param besucher Ein Objekt vom Typ Zuschauer
     */
    public void addObserver(Observer besucher)
    {
        if(arrayIndex < observer.length)
        {
            observer[arrayIndex] = besucher;
            arrayIndex++;
            System.out.println(besucher + " wurde registriert.");
        }
        else
            System.out.println(besucher + " wurde nicht registriert.");
    }

    /**
     * Löscht alle Zuschauer
     */
    public void deleteObservers()
    {
        observer = new Observer[5];
    }

    /**
     * Löscht einen einzelnen Zuschauer
     */
    public void deleteObserver(Observer pObserver)
    {
        for(int i = 0; i < anzahl; i++)
        {
            if(observer[i] == pObserver)
            {
                observer[i] = null;
                System.out.println(pObserver + " hat sich de-registriert");
                return;
            }
        }
    }

    /**
     * Informiert alle Zuschauer, dass eine Aktion beendet wurde
     */
    public void notifyObserver()
    {
        for(Observer temp: observer)
        {
            if(temp != null)
                temp.update();
        }
    }
}
