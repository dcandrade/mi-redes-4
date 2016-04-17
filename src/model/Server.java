/**
 * Componente Curricular: Módulo Integrador de Concorrência e Conectividade
 * Autor: Daniel Andrade e Solenir Figuerêdo Data: 17/04/2016
 *
 * Declaramos que este código foi elaborado por nós em dupla e não contém nenhum
 * trecho de código de outro colega ou de outro autor, tais como provindos de
 * livros e apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer
 * trecho de código de outra autoria que uma citação para o não a nossa está
 * destacado com autor e a fonte do código, e estamos cientes que estes trechos
 * não serão considerados para fins de avaliação. Alguns trechos do código podem
 * coincidir com de outros colegas pois estes foram discutidos em sessões
 * tutorias.
 */
package model;

import example.Hello;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Daniel Andrade e Solenir Figuerêdo
 */
public class Server extends UnicastRemoteObject{

    public Server(Train train, int port) throws RemoteException, MalformedURLException, AlreadyBoundException {
        super();
        LocateRegistry.createRegistry(port);
        System.setProperty("java.rmi.server.hostname", "Train" + train.getBlock());
        //Train stub = (Train) exportObject(train, port);
        Registry registry = LocateRegistry.getRegistry(port);
        registry.bind("Train" + train.getBlock(), train);
        System.err.println("Server online");
    }

    public static void main(String args[]) throws RemoteException, MalformedURLException, AlreadyBoundException {
        Server server = new Server(new Train(1), 3333);
    }

}
