package codefe.admin.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import codefe.admin.data.HibernateUtil;
import codefe.admin.model.Message;

public class MessageDAO {

    /**
     * Get Product By Id
     * @param id
     * @return
     */
    public Message getMessage(int id) {

        Transaction transaction = null;
        Message product = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            product = session.get(Message.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return product;
    }

    /**
     * Get all products
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Message> listAllMessage() {
        try {
        	return HibernateUtil.getSessionFactory().openSession().createQuery("From Message").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
    }
}