package raf.dsw.classycraft.app.MessageHandler;
import raf.dsw.classycraft.app.MessageHandler.Logger;

public class ConsoleLogger implements Logger{




    @Override
    public void writeMessage(Message message) {
        if (message != null)
            System.out.println("["+message.getType()+"]["+message.getTimestamp()+" ]"+message.getText());


    }


    @Override
    public void update(Object message) {
        if (message != null) {
            return;

        }else {writeMessage((Message) message);}
    }
}
/*
    @Override
    public void updateMessageSubsriber(Message message) {
        if(message== null)return;
        writeMessage((Message) message);
    }

    @Override
    public void writeMessage(Message message) {
        if(message!=null)System.out.println
                ("["+message.getType()+"]["+message.getTimeStamp()+"] "+message.getMessage());
    }
}
*/