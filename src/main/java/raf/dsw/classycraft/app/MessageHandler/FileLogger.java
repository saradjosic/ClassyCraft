
package raf.dsw.classycraft.app.MessageHandler;

import raf.dsw.classycraft.app.MessageHandler.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileLogger implements Logger{
    @Override
    public void writeMessage(Message message) {
        if(message==null){
            return;
        }
        try{
            File file = new File("src/main/resources/log.txt");
            FileWriter fw = new FileWriter(file, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("["+message.getType()+"] ["+message.getTimestamp()+"] "+message.getPoruka());
            //  pw.println(new Message (message));
            pw.close();
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();//ovde isto treba napraviti message za eror
        }
    }


    @Override
    public void update(Object message) {
        if(message== null)return;
        writeMessage((Message) message);
    }
}
