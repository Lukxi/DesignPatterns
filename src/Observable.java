public interface Observable {

    void addObserver(Observer z);
    void deleteObserver(Observer z);
    void notifyObserver();

}