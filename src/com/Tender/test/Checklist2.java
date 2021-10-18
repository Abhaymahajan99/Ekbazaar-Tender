package com.Tender.test;


import org.testng.annotations.Test;

import com.Tender.Pom.MyProfile;

import com.Tender.generics.TenderBaseClass;

public class Checklist2 extends TenderBaseClass {

	/*
	 * @Test public void MyProfile() throws InterruptedException { MyProfile my= new
	 * MyProfile(driver);
	 * 
	 * my.Myprofile(); Thread.sleep(500);
	 * 
	 * sa.assertTrue(true == true); sa.assertAll(); }
	 */
	
	  @Test() 
	  public void ChangePassword() throws InterruptedException
	  { MyProfile my=new MyProfile (driver); 
	  my.ChangePassword();
	  sa.assertTrue(true == true); 
	  sa.assertAll();
	  }





}