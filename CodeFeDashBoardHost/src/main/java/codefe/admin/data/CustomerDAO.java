package codefe.admin.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import codefe.admin.model.Customer;
import codefe.admin.data.HibernateUtil;

public class CustomerDAO {

    /**
     * Get Product By Id
     * @param id
     * @return
     */
    public Customer getCustomer(int id) {

        Transaction transaction = null;
        Customer customer = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            customer = session.get(Customer.class, id);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return customer;
    }

    /**
     * Get all products
     * @return
     */
    @SuppressWarnings("unchecked")
    public List<Customer> listAllCustomer() {
        try {
        	return HibernateUtil.getSessionFactory().openSession().createQuery("From Customer").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
    }
}