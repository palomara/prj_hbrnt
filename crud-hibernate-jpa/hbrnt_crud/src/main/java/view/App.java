package view;

import controller.ClienteJpaDAO;
import controller.PedidoJpaDAO;
import model.Cliente;
import model.Pedido;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
       

	     Pedido pedido = new Pedido();
	     pedido.setIdCliente(1);
	     pedido.setProduto("Caderno");
	     pedido.setVlr_unitario(8.60);
	     pedido.setQtd(1);
	     pedido.setPreco_total(8.60);
	     PedidoJpaDAO.getInstance().merge(pedido);
	     System.out.println("Pedido salvo");
       
     
    }
}
