// James Zhang
package lab4;

public class MobileServiceProvider {

    private char customerPackage;
    private int numberOfMinutesUsed;
    
    /**
       The MobileServiceProvider constructor method
       @param newCustomerPackage customer's mobile package
       @param newNumberOfMinutesUsed number of minutes the customer used their 
                                     phone
    */
    
    public MobileServiceProvider (char newCustomerPackage, 
                                  int newNumberOfMinutesUsed)
    {
        customerPackage = newCustomerPackage;
        numberOfMinutesUsed = newNumberOfMinutesUsed;
    }
    
    /**
       The getPackage method returns customer's mobile package.
       @return a mobile package
    */
    
    public char getPackage()
    {
        return customerPackage;
    }
    
    /**
       The getMinutes method returns the number of minutes
       the customer used their phone.
       @return the number of minutes the customer used their phone
    */
    
    public int getMinutes()
    {
        return numberOfMinutesUsed;
    }
    /**
       The setPackage method sets the customer's mobile package.
       @param newCustomerPackage the customer's mobile package
    */
    
    public void setPackage(char newCustomerPackage)
    {
        customerPackage = newCustomerPackage;
    }
    
    /**
       The numberOfMinutesUsed method sets the number of minutes the customer
       used their phone.
       @param newNumberOfMinutesUsed the number of minutes the customer used 
                                     their phone
    */
    
    public void setMinutes(int newNumberOfMinutesUsed)
    {
        numberOfMinutesUsed = newNumberOfMinutesUsed;
    }
    
    /**
       The totalCharges method returns the total charges based on the customer's 
       package and the number of minutes used
       @return the total charges
    */
    
    public double totalCharges()
    {
        double cost = 0;
        if ((customerPackage == 'a' || customerPackage == 'A') && 
             numberOfMinutesUsed > 450)
            cost = 39.99 + (numberOfMinutesUsed - 450) * 0.45;
        else if (customerPackage == 'a' || customerPackage == 'A')
            cost = 39.99;
        else if ((customerPackage == 'b' || customerPackage == 'B') && 
                  numberOfMinutesUsed > 900)
            cost = 59.99 + (numberOfMinutesUsed - 900) * 0.40;
        else if (customerPackage == 'b' || customerPackage == 'B')
            cost = 59.99;
        else
            cost = 69.99;
        
        return cost;
    }
    
    /**
       The str method displays the customer package and the number of minutes,
       positioned accordingly within a string.
       @return the customer package and the number of minutes
    */
    
    public String toString()
   {
       String str = "MSP Plan:" + customerPackage + " Min.: " + 
                     numberOfMinutesUsed + " $" + totalCharges();
       
       return str;
   }
    
}