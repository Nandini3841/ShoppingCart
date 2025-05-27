// package com.shoppingcart.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.orm.jpa.JpaTransactionManager;
// import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
// import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
// import org.springframework.transaction.PlatformTransactionManager;
// import org.springframework.boot.jdbc.DataSourceBuilder;
// import javax.sql.DataSource;
// import java.util.Properties;

// @Configuration
// public class JPAConfig {

// @Bean
// public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource
// dataSource) {
// var factoryBean = new LocalContainerEntityManagerFactoryBean();
// factoryBean.setDataSource(dataSource);
// factoryBean.setPackagesToScan("com.shoppingcart.domain"); // ✅ adjust if
// needed
// factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());

// Properties props = new Properties();
// props.put("hibernate.hbm2ddl.auto", "create");
// props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
// props.put("hibernate.show_sql", "true");

// factoryBean.setJpaProperties(props);
// return factoryBean;
// }

// @Bean
// public PlatformTransactionManager
// transactionManager(LocalContainerEntityManagerFactoryBean emf) {
// return new JpaTransactionManager(emf.getObject());
// }

// @Bean
// public DataSource dataSource() {
// return DataSourceBuilder.create()
// .url("jdbc:postgresql://localhost:5432/ShoppingCartDB")
// .username("postgres")
// .password("root")
// .driverClassName("org.postgresql.Driver")
// .build();
// }
// }
