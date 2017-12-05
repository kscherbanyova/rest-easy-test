package com.rjtest.restservice.web;

/**
 * Created by eshcherbanova on 11/19/17.
 */

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
    singletons.add(new DogResource());
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