package _01_Encapsulate_the_Data;

public class EncapsulateTheData {
	
	
	
		
		
	
    /*
     * itemsReceived cannot negative. All negative parameters should set
     * itemsReceived to 0.
     */

    private int itemsReceived;
    public void setItemsReceived(int number) {
		if(number<0) {
			this.itemsReceived=0;
		}
		else {
    	this.itemsReceived=number;
		}
	}
	
	public int getItemsReceived() {
		return itemsReceived;
	}

    /*
     * degreesTurned must be locked between 0.0 and 360.0 inclusive. All
     * parameters outside this range should set degreesTurned to the nearest
     * bound.
     */

   private double degreesTurned;
    public void setDegreesTurned(double number) {
    	if(number>=0.0 && number<=360.0) {
    		this.degreesTurned=number;
    	}
    	else {
    		if(number<0.0) {
    			this.degreesTurned=0.0;
    		}
    		else if(number>360.0) {
    			this.degreesTurned=360.0;
    		}
    	}
    }
    public double getDegreesTurned() {
    	return degreesTurned;
    }
    /*
     * nomenclature must not contain an empty String. An empty String parameter
     * should set nomenclature to a String with a single space.
     */

    private String nomenclature;
    public void setNomenclature(String input) {
    	if(!input.isEmpty()) {
    		this.nomenclature=input;
    	}
    	else {
    		String space=" ";
    		this.nomenclature=space;
    	}
    }
    public String getNomenclature() {
    	return nomenclature;
    }

    /*
     * memberObj must not be a String. A String parameter should set memberObj
     * to a new Object(); Hint: Use the instanceof operator.
     */

    private Object memberObj;
    public void setMemberObj(Object object) {
    	if(object instanceof String) {
    		this.memberObj=new Object();
    	}
    	else {
    		this.memberObj=object;
    	}
    }
    public Object getMemberObj() {
    	return memberObj;
    }
	

}
