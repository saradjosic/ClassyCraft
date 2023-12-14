package raf.dsw.classycraft.app.MessageHandler;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class Message{

    //  private String nodeName;
    //   private String actionType;
    private String text;
    //  private MessageTypes type;
    MessageTypes type;
    private String timestamp;
    Message message;
    String poruka;
    EventType eventType;

    // private EventType eventType;
    public Message(String poruka,MessageTypes type){
        this.poruka=poruka;
        this.type=type;
        //  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm");
        //LocalDateTime now = LocalDateTime.now();
        //this.timestamp=dtf.format(now);
    }


    public Message(EventType eventType, MessageTypes type) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm");
        LocalDateTime now = LocalDateTime.now();


        switch (eventType) {
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
        this.type = type;
        this.timestamp = dtf.format(now);
        //   if (message != null) {
        //   generateMessage(message);
        // }
    }

    public Message(  EventType eventType,MessageTypes type,String text) {
        this.eventType = eventType;

        this.type = type;
        this.text = text;

    }

    public Message(String text) {
        this.text = text;
    }

    public Message(EventType eventType,String text) {
        this.eventType = eventType;
        this.text = text;

    }

    public Message( EventType eventType,Message message) {

        this.eventType = eventType;
        this.message = message;
    }

    @Override
    public String toString() {

        return
                " [" + eventType + "] [" + text
                        + "]["+"[" + type + "]";

    }

    public Message(MessageTypes type, LocalDateTime timestamp,String text) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm");
        LocalDateTime now = LocalDateTime.now();

        this.type = type;
        this.timestamp=dtf.format(now);
        this.text = text;
    }
}