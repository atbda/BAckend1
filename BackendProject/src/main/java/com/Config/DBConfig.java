package com.Config;


	

	import java.util.Properties;

	import javax.sql.DataSource;

	import org.hibernate.SessionFactory;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.jdbc.datasource.DriverManagerDataSource;
	import org.springframework.orm.hibernate4.HibernateTransactionManager;
	import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.Dao.CategoryDAO;
import com.Dao.CategoryDaoIMPL;
import com.Model.Category;

import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

	@Configuration
	@ComponentScan("com")
	@EnableTransactionManagement
	public class DBConfig {
	
		public DataSource getH2DataSource()
		{
			DriverManagerDataSource dataSource=new DriverManagerDataSource();
			
			dataSource.setDriverClassName("org.h2.Driver");
			dataSource.setUrl("jdbc:h2:~/Basha");
			dataSource.setUsername("sa");
			dataSource.setPassword("");
			
			System.out.println("Data Source Created");
			return dataSource;
		}
		
		@Bean(name="sessionFactory")
		public SessionFactory getSessionFactory()
		{
			
			Properties hibernateProp=new Properties();
			
			hibernateProp.setProperty("hibernate.hbm2ddl.auto", "update");
			hibernateProp.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
			
			LocalSessionFactoryBuilder factoryBuilder=new LocalSessionFactoryBuilder(getH2DataSource());
			factoryBuilder.addAnnotatedClass(Category.class);
			factoryBuilder.addProperties(hibernateProp);
			
			System.out.println("Creating SessionFactory Bean");
			return factoryBuilder.buildSessionFactory();
		}
		
		
		@Bean(name="CategoryDAO")
		public CategoryDAO getCategoryDAO()
		{
			System.out.println("DAO Implementation");
			return new CategoryDaoIMPL();
		}
		
		@Bean(name="txManager")
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
		{
			System.out.println("Transaction Manager");
			return new HibernateTransactionManager(sessionFactory);
		}
		
		
	}

