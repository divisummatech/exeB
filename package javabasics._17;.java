package javabasics._17;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;

        //Add the questionable funds to your bank balance and print it out!

        private static void exercise1() {
            System.out.println("Exercise 1: ");
            int myBankBalanceEuro = 500;

            String suspiciousEmailMessage =
                    """
                                Hello Sir/Madam,
                                
                                I'm a prince here in [redacted] and I need help transferring my billions into 
                                Italy, please provide your bank account details and I will pay you generously.
                                
                                Thanks
                    """;

            long questionableFundsEuro = 5_000_000_000L;

            long newBankBalanceEuro = myBankBalanceEuro + questionableFundsEuro;
            System.out.println("New bank balance: " + newBankBalanceEuro + " Euro");
        }

    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age
     *    2b: The age of a baby in months
     *    2c: Money in a hedgefund in euros
     *    2d: Price of a good in euros on amazon.com
     *    2e: The exact weight of an apple measured by scientific equipment
     *    2f: The number of kilometers from any 2 places in the world
     */

    //2a: int - int can store values from -2,147,483.648 to 2,147,483,647 that is enough to store the age of anyone, assuming a maximum age of 150 years.
    //2b: byte - The age of a baby in months can be stored in a byte, which can store values from -127 to 127. that is enough for the age of one baby in months
    //2c: double - Money in a hedgefund can have large values, so a double is a good option.can be stored up to 16 decimal places and has a wide range.
    // 2d: double - The price of a good in euros on amazon.com can also have large values, so a double is a good option. Can stored up to 16 decimal places and has a wide range.
    //2e: float - The exact weight of an apple measured by scientific equipment may require decimal precision up to 7 decimal places, so a float is a good option. It can store up to 7 decimal places and has a wide range.
    //2f: int - The number of kilometers from any 2 places in the world can be stored in an int. It can store values from -2,147,483,648 to 2,147,483,647, which is enough for most distances on Earth.

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");
    }
}

    // Print the current date
    LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

                //get day of month
                int dayOfMonth = today.getDayOfMonth();
                System.out.println("Day of month:" + dayOfMonth);

                //get day of week
                String dayOfWeek = today.getDayOfWeek().toString();
                System.out.println("Day of week:" + dayOfWeek);

                //get day of year
                int dayOfYear = today.getDayOfYear();
                System.out.println("Day of year:" + dayOfYear);

                //get month
                Month month = today.getMonth();
                System.out.println("Month:" + month);

                //get month value
                int monthValue = today.getMonthValue();
                System.out.println("Month value:" + monthValue);

                // create other dates and compare with today
                LocalDate christmas = LocalDate.of(2023, 12, 25);
                LocalDate newYears = LocalDate.of(2024, 1,1);
                boolean isChristmasBeforeToday = christmas.isBefore(today);
                boolean isNewYearsAfterToday = newYears.isAfter(today);
                System.out.println("Is Christmas before today? " +isChristmasBeforeToday);
                System.out.println("Is New Year's after today? " +isNewYearsAfterToday);
                }