package raf.dsw.classycraft.app.MessageHandler;

import raf.dsw.classycraft.app.observer.IPublisher;

public interface IMessagePublisher extends IPublisher{
    public void generateMessage(Message message);

}
