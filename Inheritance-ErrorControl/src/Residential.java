    //A residential class which extends customer that has:
    //A constant rate at $6 per 1000 square feet
    //A senior field
    //A method that calculates weekly charges, if the senior field is set to true then provide a 15% discount. The
    // method should display all information about the customer, the property, and the weekly charge.


    // REFERENCE: Residential customer = new Residential(customerFName,customerLName,customerAddress,customerPhone,squareFootage,senDiscount);
    //
    public class Residential extends  Customer{

        // I had a lot trouble in the next step. Auto generating the  constructor is important here


        public Residential(String customerName, long customerPhone, String customerAddress, Double squareFootage, Boolean senDiscount) {
            super(customerName, customerPhone, customerAddress, squareFootage, senDiscount);
        }



            public void resCalc(){
                double rate = .006; // per square foot
                double senDisc = .015;
                double weekly;
                // call in the information for calculation
                Boolean senDiscount = getSenDiscount();
                Double squareFootage = getSquareFootage();



                if (senDiscount) {
                    weekly = (squareFootage * rate) - ((squareFootage * rate)*senDisc);

                } else {
                    weekly = (squareFootage * rate);
                }

                super.display(weekly);

        }


    }

