package com;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.cms.deloitte.model.AmzonCustomer;
import com.cms.deloitte.model.CardDetail;
import com.cms.deloitte.model.EmployeeDetail;
import com.cms.deloitte.model.ProjectDetail;

public class OneToManyEmployeeTest {
	public static void main(String[] args) {
		AnnotationConfiguration configuration=new AnnotationConfiguration().configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		EmployeeDetail empdetail=new EmployeeDetail();
		empdetail.setEmpName("Sharath");
		empdetail.setEmpNo(98742);
		empdetail.setEmpMail("sharath@gmail.com");
		
		
		session.save(empdetail);
		
		/*CardDetail cardDetail = new CardDetail();
		cardDetail.setBankname("ICICI");
		cardDetail.setAmazonCustomer(amazoncustomer);
		
		session.save(cardDetail);
		
		
		CardDetail cardDetail2 = new CardDetail();
		cardDetail2.setBankname("HDFC");
		cardDetail2.setAmazonCustomer(amazoncustomer);
		
		session.save(cardDetail2);
		*/
		
		ProjectDetail projectDetail=new ProjectDetail();
		projectDetail.setProjectId(123);
		projectDetail.setProjectLocation("Bangalore");
		projectDetail.setProjectName("Testing");
		
		session.save(projectDetail);
		ProjectDetail projectDetail2=new ProjectDetail();
		projectDetail2.setProjectId(456);
		projectDetail2.setProjectLocation("Gurgoan");
		projectDetail2.setProjectName("Devops");
		
		session.save(projectDetail2);

		transaction.commit();
		session.close();
		System.out.println("Saved");
		
	}

}
