package raf.dsw.classycraft.app.view;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.MessageHandler.Message;
import raf.dsw.classycraft.app.MessageHandler.MessageTypes;
import raf.dsw.classycraft.app.controller.ActionManager;
import raf.dsw.classycraft.app.diagram.DiagramImplementation;
import raf.dsw.classycraft.app.observer.ISubscriber;
import raf.dsw.classycraft.app.tree.ClassyTree;
import raf.dsw.classycraft.app.tree.ClassyTreeImplementation;
import raf.dsw.classycraft.app.core.ApplicationFramework;

import javax.swing.*;
import java.awt.*;
@Getter
@Setter
public class MainFrame extends JFrame implements ISubscriber{
    private static MainFrame instance=null;
    private ActionManager actionManager;
    private ClassyTree classyTree;
    private DiagramImplementation diagram;



    private MainFrame(){}

    public void initialize(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ClassyCraft");

        actionManager= new ActionManager();
        diagram=new DiagramImplementation();
        JPanel diagramPanel= diagram.createPanel();


        MyMenyBar menu=new MyMenyBar();
        setJMenuBar(menu);



        ToolBar toolbar=new ToolBar();
        add(toolbar, BorderLayout.NORTH);

        ToolBarDesno toolBar2=new ToolBarDesno();
        add(toolBar2,BorderLayout.EAST);
        classyTree=new ClassyTreeImplementation();
        classyTree.addSubscriber(diagram);

        // JPanel levo=new JPanel();
        //   JPanel desno=new JPanel();
        //   JSplitPane jSplitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,desno,levo);

        JTree projectExplorer = classyTree.generateTree(ApplicationFramework.getInstance().getClassyRepository().getRoot());

        JScrollPane scroll=new JScrollPane(projectExplorer);
        scroll.setMinimumSize(new Dimension(200,150));
        JSplitPane split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,scroll,diagramPanel);
        getContentPane().add(split,BorderLayout.CENTER);
        split.setDividerLocation(250);
        split.setOneTouchExpandable(true);


    }



    public static MainFrame getInstance(){
        if(instance==null){
            instance = new MainFrame();
            instance.initialize();
        }
        return instance;
    }

    @Override
    public void update(Object notification){
        if(notification ==null)return;
        if(notification instanceof Message){
            Message poruka = (Message) notification;
            if(poruka.getType().equals(MessageTypes.ERROR))JOptionPane.showMessageDialog(null,poruka.getText(),"ERROR",JOptionPane.ERROR_MESSAGE);
            else if (poruka.getType().equals(MessageTypes.NOTIFICATION)) JOptionPane.showMessageDialog(null,poruka.getText(),"INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            else if (poruka.getType().equals(MessageTypes.WARNING)) JOptionPane.showMessageDialog(null,poruka.getText(),"WARNING",JOptionPane.WARNING_MESSAGE);
        }
    }
    public String  package_diagram (){
        String[] options={"Package","Diagram"};
        int choice = JOptionPane.showOptionDialog(
                null,
                "Choose between package or diagram",
                "Option Dialog",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0] // Default option (optional)
        );
        if(choice == -1)return null;
        return options[choice];
    }
}

