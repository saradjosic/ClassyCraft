package raf.dsw.classycraft.app.observer;

public interface IPublisher{
    void addSubscriber(ISubscriber subscriber);
    void removeSubscriber(ISubscriber subscriber);
    void notifySubscribers(Object notification);
}
/*
pravljenje nove komponente-pravljenje novog interface a i klase koja je
implementacija tog interface a
imessage, classytree i diagram ce biti publisheri jer se kod njih
nesto menja i njih neko slusa
 */