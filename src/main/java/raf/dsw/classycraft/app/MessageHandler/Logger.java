package raf.dsw.classycraft.app.MessageHandler;

import raf.dsw.classycraft.app.observer.ISubscriber;

public interface Logger extends ISubscriber{
    public void writeMessage(Message message);
}
