package raf.dsw.classycraft.app.MessageHandler;

import raf.dsw.classycraft.app.MessageHandler.Logger;
public class LoggerFactory{
    static public Logger createLogger(String type){
        if(type.toUpperCase().equals("CONSOLE"))//
            return new ConsoleLogger();
        if(type.toUpperCase().equals("FILE"))
            return new FileLogger();
        return null;

    }
}
