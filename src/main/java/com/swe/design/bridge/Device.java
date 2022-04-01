package com.swe.design.bridge;

/**
 * The terms implemenation (platform) and abstraction (interface) here means the
 * implementation class or the abstract class respectively but the terms
 * proposed by the GoF
 * 
 * This is the implmentation inferface which is common to all concrete
 * implementation.
 * 
 * Typically the implementation interface provides only primitive opeerations,
 * which will be use in abstraction, which define higher-level operations that
 * uses these primitive operations
 * 
 */
interface Device {

  public void toggleStatus();

  public void broadcast();

}
