package com.rjtest.restservice.config;

import com.rjtest.restservice.model.Dog;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.util.Properties;

import javax.sql.DataSource;

/**
 * Created by eshcherbanova on 12/14/17.
 */
@Configuration
public class DataSourceConfig {

  @Bean
  public DataSource dataSource(){
    //jdbc:hsqldb:mem:testdb
    EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
    EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL)
        .setType(EmbeddedDatabaseType.HSQL) //.H2 or .DERBY
        .addScript("db/sql/create-db.sql")
        .addScript("db/sql/insert-data.sql")
        .build();
    return db;
  }

  @Bean
  private static FactoryBean<SessionFactory> buildSessionAnnotationFactory(DataSource dataSource) {
    LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
    localSessionFactoryBean.setDataSource(dataSource );
    localSessionFactoryBean.setPackagesToScan("com.rjtest.restservice.model");
    Properties properties = new Properties();
    properties.put("hibernate.connection.driver_class", "org.hsqldb.jdbcDriver");
    properties.put("hibernate.connection.url", "jdbc:hsqldb:mem:testdb");
    properties.put("hibernate.connection.username", "sa");
    properties.put("hibernate.connection.password", "");
    properties.put("hibernate.current_session_context_class", "thread");

    properties.put("connection.pool_size", 1);
    properties.put("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
    properties.put("show_sql", true);
    properties.put("hbm2ddl.auto", "create");

    localSessionFactoryBean.setHibernateProperties(properties);
      localSessionFactoryBean.setAnnotatedClasses(Dog.class);

    return localSessionFactoryBean;
  }
}
