package com.rjtest.restservice.web;

/**
 * Created by eshcherbanova on 11/19/17.
 */

import com.rjtest.restservice.config.SpringConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public class RjApplication extends Application
{
  private Set<Object> singletons = new HashSet<Object>();
  private Set<Class<?>> empty = new HashSet<Class<?>>();

  public RjApplication()
  {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    singletons.add(context.getBean(DogResource.class));
  }

  @Override
  public Set<Class<?>> getClasses()
  {
    return empty;
  }

  @Override
  public Set<Object> getSingletons()
  {
    return singletons;
  }

}