package raf.dsw.classycraft.app.MessageHandler;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.observer.ISubscriber;

import raf.dsw.classycraft.app.observer.IPublisher;
import raf.dsw.classycraft.app.MessageHandler.IMessagePublisher;
import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
public class MessageGenerator implements IMessagePublisher{
    private List<ISubscriber> messageSubscribers;
    // private EventType type;
    //String text;

    public MessageGenerator() {
        this.messageSubscribers = new ArrayList<>();

    }

    @Override
    public void addSubscriber(ISubscriber subscriber) {
        if (subscriber instanceof ISubscriber) {
            if (!messageSubscribers.contains(subscriber)) {
                messageSubscribers.add((ISubscriber) subscriber);
            }
        } else {
            // Handle error: Subscriber is not of type Logger
        }
    }

    @Override
    public void removeSubscriber(ISubscriber subscriber) {
        if (subscriber instanceof Logger) {
            messageSubscribers.remove((Logger) subscriber);
        } else {
            // Handle error: Subscriber is not of type Logger
        }
    }

    @Override
    public void notifySubscribers(Object notification) {
        for (ISubscriber subscriber : messageSubscribers) {
            subscriber.update((Message) notification);
        }
    }
    @Override
    public void generateMessage(Message message) {
        notifySubscribers(message);

/*

            if(type.equals(EventType.AUTHOR_CAN_ONLY_BE_ADDED_ON_PROJECT))
             new Message("Autor moze biti dodat samo na projekat");
            else if(type.equals(EventType.CHILD_ON_DIAGRAM))
               new Message("Dete ne moze da se doda na diagram");
            else if(type.equals(EventType.NAME_EMPTY))
                new Message("Ime ne sme biti prazno");
            else if(type.equals(EventType.PROJECT_EXPLORER_CANNOT_BE_RENAMED))
               new Message("ProjectExplorer ne moze biti rename-ovan");
            else if(type.equals(EventType.NAME_SPACES))
                new Message("Ime ne sme sadrzati razmake");
            else if(type.equals(EventType.NONE_NODE))
                new Message("Nije selektovan ni jedan node");
            else if(type.equals(EventType.PROJECT_EXPLORER_CANT_BE_DELETED))
              new Message("ProjectExplorer ne moze biti obrisan");
            else if(type.equals(EventType.SELECTED_NODE))
                new Message("Selectovani node");

*/

    }


    // public void generateMessage(EventType type) {
    //   Message message = null;

    //}
}
/*
        switch (type) {
            case PROJECT_EXPLORER_CANT_BE_DELETED:
                message = new Message("ProjectExplorer ne može biti obrisan", MessageTypes.ERROR);
               // notifySubscribers(message);
                break;
            case PROJECT_EXPLORER_CANNOT_BE_RENAMED:
                message = new Message("ProjectExplorer ne može biti preimenovan", MessageTypes.ERROR);
             //   notifySubscribers(message);
                break;
            case NAME_EMPTY:
                message = new Message("Ime ne sme biti prazno", MessageTypes.WARNING);
             //   notifySubscribers(message);
                break;
            case NAME_SPACES:
                message = new Message("Ime ne sme sadzrati razmake", MessageTypes.WARNING);
             //   notifySubscribers(message);
            case NONE_NODE:
                message = new Message("Nije selektovan node", MessageTypes.NOTIFICATION);
             //   notifySubscribers(message);
            case SELECTED_NODE:
                message = new Message("Selektovani node", MessageTypes.NOTIFICATION);
              //  notifySubscribers(message);
            case CHILD_ON_DIAGRAM:
                message = new Message("Dete ne moze da se doda na diagram", MessageTypes.ERROR);
              //  notifySubscribers(message);
            default:
                break;
        }

        //   if (message != null) {
        //   generateMessage(message);
        //   }
    }




public void generateMessage(EventType type){
    if(type.equals(EventType.AUTHOR_CAN_ONLY_BE_ADDED_ON_PROJECT))
        notifyMessageSubsribers(new Message(1,"Autor moze biti dodat samo na projekat"));
    else if(type.equals(EventType.CHILD_ON_DIAGRAM))
        notifyMessageSubsribers(new Message(2,"Dete ne moze da se doda na diagram"));
    else if(type.equals(EventType.NAME_EMPTY))
        notifyMessageSubsribers(new Message(3,"Ime ne sme biti prazno"));
    else if(type.equals(EventType.PROJECT_EXPLORER_CANNOT_BE_RENAMED))
        notifyMessageSubsribers(new Message(4,"ProjectExplorer ne moze biti rename-ovan"));
    else if(type.equals(EventType.NAME_SPACES))
        notifyMessageSubsribers(new Message(5,"Ime ne sme sadrzati razmake"));
    else if(type.equals(EventType.NONE_NODE))
        notifyMessageSubsribers(new Message(6,"Nije selektovan ni jedan node"));
    else if(type.equals(EventType.PROJECT_EXPLORER_CANT_BE_DELETED))
        notifyMessageSubsribers(new Message(7,"ProjectExplorer ne moze biti obrisan"));
    else if(type.equals(EventType.SELECTED_NODE))
        notifyMessageSubsribers(new Message(8,"Selectovani node"));
}

    @Override
    public void generateMessage(MessageTypes type) {

    }

    @Override
    public void generateMessage(MessageTypes type, ClassyNode node) {

    }

    @Override
    public void addMessageSubsriber(IMessageSubscriber subscriber) {
    }

    @Override
    public void removeMessageSubsriber(IMessageSubscriber subscriber) {

    }

    @Override
    public void notifyMessageSubsribers(Message message) {

    }

     */

