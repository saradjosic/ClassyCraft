package raf.dsw.classycraft.app.core;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.MessageHandler.IMessagePublisher;
import raf.dsw.classycraft.app.MessageHandler.Logger;
import raf.dsw.classycraft.app.MessageHandler.LoggerFactory;
import raf.dsw.classycraft.app.MessageHandler.MessageGenerator;
import raf.dsw.classycraft.app.repository.implementacija.ClassyRepositoryImplementation;
import raf.dsw.classycraft.app.view.MainFrame;
@Getter
@Setter
public class ApplicationFramework{
    //sluzi da pristupamo celom modelu
    private static ApplicationFramework instance;
    private ClassyRepository classyRepository;
    //bice samo jedan
    private IMessagePublisher messagePublisher;

    private Logger consoleLogger;
    private Logger fileLogger;


    private ApplicationFramework(){

    }

    public void initialize(){
        // MainFrame.getInstance().setVisible(true);
        // classyRepository=new ClassyRepositoryImplementation();
        //bice odmah spreman koren
        classyRepository=new ClassyRepositoryImplementation();
        messagePublisher = new MessageGenerator();
        consoleLogger = LoggerFactory.createLogger("CONSOLE");
        fileLogger = LoggerFactory.createLogger("FILE");
        messagePublisher.addSubscriber(consoleLogger);
        messagePublisher.addSubscriber(fileLogger);
        messagePublisher.addSubscriber(MainFrame.getInstance());
        MainFrame.getInstance().setVisible(true);
    }

    public static ApplicationFramework getInstance(){
        if(instance==null){
            instance = new ApplicationFramework();
        }
        return instance;
    }
}