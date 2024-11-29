package com.Acxhange;

public class UserDetails {
	    private String positionApplied;
	    private String locationApplied;
	    private String noticePeriod;
	    private String currentAddress;
	    private String permanentAddress;
	    private int age;
	    private String maritalStatus;

	    // Getters and Setters
	    public String getPositionApplied() {
	        return positionApplied;
	    }

	    public void setPositionApplied(String positionApplied) {
	        this.positionApplied = positionApplied;
	    }

	    public String getLocationApplied() {
	        return locationApplied;
	    }

	    public void setLocationApplied(String locationApplied) {
	        this.locationApplied = locationApplied;
	    }

	    public String getNoticePeriod() {
	        return noticePeriod;
	    }

	    public void setNoticePeriod(String noticePeriod) {
	        this.noticePeriod = noticePeriod;
	    }

	    public String getCurrentAddress() {
	        return currentAddress;
	    }

	    public void setCurrentAddress(String currentAddress) {
	        this.currentAddress = currentAddress;
	    }

	    public String getPermanentAddress() {
	        return permanentAddress;
	    }

	    public void setPermanentAddress(String permanentAddress) {
	        this.permanentAddress = permanentAddress;
	    }
	    
	    public void setAge(int age) {
	        this.age = age;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String getMaritalStatus() {
	        return maritalStatus;
	    }

	    public void setMaritalStatus(String maritalStatus) {
	        this.maritalStatus = maritalStatus;
	    }

	    public static void main(String[] args) {
	        
	    	UserDetails Info = new UserDetails();
	    	Info.setPositionApplied("Software Test Engineer");
	    	Info.setLocationApplied("Chennai");
	    	Info.setNoticePeriod("30 days");
	    	Info.setCurrentAddress("AAA,BBB,CCC Street, Chennai");
	    	Info.setPermanentAddress("XYZ Street, Chennai");
	    	Info.setAge(25);
	    	Info.setMaritalStatus("Single");

	        System.out.println("Position Applied: " + Info.getPositionApplied());
	        System.out.println("Location Applied: " + Info.getLocationApplied());
	        System.out.println("Notice Period Required: " + Info.getNoticePeriod());
	        System.out.println("Current Address: " + Info.getCurrentAddress());
	        System.out.println("Permanent Address: " + Info.getPermanentAddress());
	        System.out.println("Age: " + Info.getAge());
	        System.out.println("Marital Status: " + Info.getMaritalStatus());
	    }
	}



