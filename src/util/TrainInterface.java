/**
 * Componente Curricular: Módulo Integrador de Concorrência e Conectividade
 * Autor: Daniel Andrade e Solenir Figuerêdo
 * Data:  17/04/2016
 *
 * Declaramos que este código foi elaborado por nós em dupla e
 * não contém nenhum trecho de código de outro colega ou de outro autor, 
 * tais como provindos de livros e apostilas, e páginas ou documentos 
 * eletrônicos da Internet. Qualquer trecho de código de outra autoria que
 * uma citação para o não a nossa está destacado com autor e a fonte do
 * código, e estamos cientes que estes trechos não serão considerados para fins
 * de avaliação. Alguns trechos do código podem coincidir com de outros
 * colegas pois estes foram discutidos em sessões tutorias.
 */
package util;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Daniel Andrade e Solenir Figuerêdo
 */
public interface TrainInterface extends Remote {
    
    public void setSpeed(int newSpeed) throws RemoteException;
    
    public int getBlock() throws RemoteException;
    
    public int getSpeed() throws RemoteException;
    
    public int getX() throws RemoteException;
    
    public int getY() throws RemoteException;
    
    
}
