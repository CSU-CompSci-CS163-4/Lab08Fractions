public class ProperFraction{
    public int wholeNumber;
    public int numerator;
    public int denominator;


    /**
    * This constructor should take three integers and make a ProperFraction object
    * Fractions cannot have a denominator of 0! If the denominator is 0, set the whole number to 0, the numerator to 0, and the denominator to 1.
    *
    * @param wholeNumber whole number for the fraction
    * @param numerator numerator for the fraction
    * @param denominator denominator for the fraction
    */
    public ProperFraction(int wholeNumber, int numerator, int denominator){
        //TODO STUDENT
        
    }

    /**
     * This constructor should take a string such as "1 11/2" and make a ProperFraction object.
     * Integer.parseInt(), .substring(), and .indexOf() will all be useful.
     * Since this is a proper fraction, be sure to convert a fraction like "1 3/2" to "2 1/2".
     * Fractions cannot have a denominator of 0! If the denominator is 0, set the whole number to 0, the numerator to 0, and the denominator to 1.
     * 
     * @param fraction a string holding the numbers for a fraction in the form of "wholeNumber numerator/denominator"
     */
    public ProperFraction(String fraction){
        //TODO STUDENT
        
    }

    /**
     * This method will take data from the ProperFraction object to produce an ImproperFraction
     * 
     * @return a new ImproperFraction object
     */
    public ImproperFraction makeImproper(){
        //TODO STUDENT
        
    }

    /**
     * This method will simplify a fraction. For example, 2/6 will be turned into 1/3 after running this method.
     * A while loop and the % operator will both be useful here. (Don't forget to set this.numerator and this.denominator after finding the simplified fraction!)
     * To simplify a fraction, both the numerator and denominator should be divided by the greatest common factor. Using a while loop, you can check all of the
     * numbers. For an example of 4/6, you can start by checking 6, then 5, 4, 3, then 2. Since 4/2 and 6/2 are whole numbers, you can divide both the numerator and denominator to
     * simplify the fraction. Once you find this greatest common factor, you can use "return" to end the method.
     */
    public void simplify(){
        //TODO STUDENT
        
    }

    public String toString(){
        return wholeNumber + " " + numerator + "/" + denominator;
    }
}
