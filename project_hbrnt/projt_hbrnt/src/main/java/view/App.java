package view;

import org.hibernate.Session;

import controller.HibernateUtil;
import model.Alunos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alunos alunos = new Alunos();
        alunos.setNome("Paloma");
        alunos.setEndereco("Av Laranja da China");
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(alunos);
        session.getTransaction().commit();;
    }
}
