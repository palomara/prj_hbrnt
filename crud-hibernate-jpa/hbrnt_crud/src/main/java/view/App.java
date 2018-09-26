package view;

import controller.ClienteJpaDAO;
import model.Cliente;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Cliente cliente = new Cliente();
       cliente.setCpf("465.644.018-33");
       cliente.setId(1);
       cliente.setNome("Paloma Rangel Rocha");
       cliente.setRg("52.563.465-2");
       ClienteJpaDAO.getInstance().merge(cliente);
       System.out.println("Objeto salvo com s-u-c-e-s-s-o!");
    }
}
