
import Model.CashRegister;
import Model.Employee;
import Model.Personal;
import Repositories.CashRegisterRepository;
import Repositories.LoginRepository;
import Repositories.PersonalRepository;
import View.ViewDashboard;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author georgeborsato
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SCASPU");
        //EntityManager em = emf.createEntityManager();
        //CashRegisterRepostiry cashRegisterRepostiry = new CashRegisterRepostiry();
        //CashRegister cashRegister = cashRegisterRepostiry.verifyOpenCashRegister();
        //System.out.println(cashRegister.toString());
    }
}
