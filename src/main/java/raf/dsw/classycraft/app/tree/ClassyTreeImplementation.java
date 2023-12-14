
package raf.dsw.classycraft.app.tree;

import lombok.Getter;
import lombok.Setter;
import raf.dsw.classycraft.app.MessageHandler.EventType;
import raf.dsw.classycraft.app.MessageHandler.Message;
import raf.dsw.classycraft.app.MessageHandler.MessageTypes;
import raf.dsw.classycraft.app.core.ApplicationFramework;
import raf.dsw.classycraft.app.factoryMethod.FactoryUtils;
import raf.dsw.classycraft.app.observer.ISubscriber;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNode;
import raf.dsw.classycraft.app.repository.apstrakcija.ClassyNodeComposite;
import raf.dsw.classycraft.app.repository.implementacija.ProjectExplorer;
import raf.dsw.classycraft.app.tree.model.ClassyTreeItem;
import raf.dsw.classycraft.app.tree.view.ClassyTreeView;
import raf.dsw.classycraft.app.tree.ClassyTree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ClassyTreeImplementation implements ClassyTree{
    private ClassyTreeView treeView;
    private DefaultTreeModel treeModel;
    public List<ISubscriber> subscribers;


    @Override
    public ClassyTreeView generateTree(ProjectExplorer projectExplorer) {

        ClassyTreeItem root = new ClassyTreeItem(projectExplorer);
        treeModel = new DefaultTreeModel(root);
        treeView = new ClassyTreeView(treeModel);
        return treeView;
    }

    @Override
    public void addChild(ClassyTreeItem parent, String koji) {
        //  if (!(parent.getClassyNode() instanceof ClassyNode))
        //      return;
/*
        if (parent == null) return;
        ClassyNode child = createChild(parent.getClassyNode(), vrsta);
        parent.add(new ClassyTreeItem(child));
        ((ClassyNodeComposite) parent.getClassyNode()).addChild(child);
        treeView.expandPath(treeView.getSelectionPath());
        notifySubscribers(child);
        SwingUtilities.updateComponentTreeUI(treeView);
*/
        if(parent==null) return;
        ClassyNode child = createChild(parent.getClassyNode(),koji);
        parent.add(new ClassyTreeItem(child));
        ((ClassyNodeComposite) parent.getClassyNode()).addChild(child);
        treeView.expandPath(treeView.getSelectionPath());
        notifySubscribers(child);
        SwingUtilities.updateComponentTreeUI(treeView);
    }
    @Override
    public ClassyTreeItem getSelectedNode () {

        return (ClassyTreeItem) treeView.getLastSelectedPathComponent();
    }


    @Override
    public void addChild(ClassyTreeItem parent, String naziv, String koji) {

    }

    @Override
    public void removeChild (ClassyTreeItem selected){
        if (selected.getPath() == null) {
            ApplicationFramework.getInstance().getMessagePublisher().generateMessage(new Message(EventType.NONE_NODE, MessageTypes.ERROR));
            return;
        }
        if (selected.getClassyNode() instanceof ClassyNodeComposite && selected.getClassyNode().getParent() != null) {
            ClassyNodeComposite nodeComposite = (ClassyNodeComposite) selected.getClassyNode().getParent();
            nodeComposite.removeChild(selected.getClassyNode());
        }
        DefaultMutableTreeNode izabran = (DefaultMutableTreeNode) treeView.getSelectionPath().getLastPathComponent();
        treeModel.removeNodeFromParent(izabran);
        notifySubscribers(selected.getClassyNode());
    }




    @Override
    public ClassyTreeView returnTree () {
        return treeView;
    }
    private ClassyNode createChild (ClassyNode parent, String koji){
        //    if (parent instanceof ProjectExplorer)
        if (parent !=null)
            return FactoryUtils.returnFactory(parent, koji).returnChild(parent);

        //new Project("Project" + new Random().nextInt(100), parent);
        return null;


    }

    @Override
    public void addSubscriber (ISubscriber subscriber){
        if (subscribers == null) subscribers = new ArrayList<>();
        if (subscribers.contains(subscriber)) return;
        if (subscriber != null) subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber (ISubscriber subscriber){
        if (subscriber == null || this.subscribers == null || !this.subscribers.contains(subscriber)) return;
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers (Object notification){
        if (notification == null || this.subscribers == null || this.subscribers.isEmpty())
            return;
        for (ISubscriber subscriber : subscribers) {
            subscriber.update(notification);
        }
    }

}