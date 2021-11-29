package codefe.admin.data;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import codefe.admin.model.FoodDrink;

public class FoodDrinkDAO {
	
    /**
     * Get Product By Id
     * @param id
     * @return
     */
    public FoodDrink getFoodDrink(int id) {

        Transaction transaction = null;
        FoodDrink product = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            product = session.get(FoodDrink.class, id);
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
    public List<FoodDrink> listAllFoodDrink() {
        try {
        	return HibernateUtil.getSessionFactory().openSession().createQuery("From FoodDrink").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
    }
    public void saveMenu(FoodDrink fd) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(fd);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
}