package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.cms.deloitte.model.AmzonCustomer;
import com.cms.deloitte.model.CardDetail;

public class OneToManyAmazonTest {
	public static void main(String[] args) {
		AnnotationConfiguration configuration=new AnnotationConfiguration().configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		AmzonCustomer amazoncustomer=new AmzonCustomer();
		amazoncustomer.setCustomer("Zubin");
		amazoncustomer.setEmailId("zubin@gmail.com");
		
		session.save(amazoncustomer);
		
		CardDetail cardDetail = new CardDetail();
		cardDetail.setBankname("ICICI");
		cardDetail.setAmazonCustomer(amazoncustomer);
		
		session.save(cardDetail);
		
		
		CardDetail cardDetail2 = new CardDetail();
		cardDetail2.setBankname("HDFC");
		cardDetail2.setAmazonCustomer(amazoncustomer);
		
		session.save(cardDetail2);
		
		transaction.commit();
		session.close();
		System.out.println("Saved");
		
	}

}
