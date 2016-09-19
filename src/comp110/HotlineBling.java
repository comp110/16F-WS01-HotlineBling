package comp110;

public class HotlineBling {
  public static void main(String[] args) {
    /*
     * Create new instance of Phone, name it testPhone, and pass in any brand, a
     * power of 0.5 (meaning 50%), and PIN of 110. Note: do this before the
     * print statement
     */
    // TODO: A.4 Declare a variable named testPhone of type Phone.
    // TODO: A.4 Uncomment this next line:
    // System.out.println("A new phone of brand " + testPhone.getBrand() + " has been constructed. Current power: "
    //    + testPhone.getPower() + ".");

    /*
     * charge() Charge your phone for 10 minutes and print your power.
     */
    // TODO: B.0.2 test charge here
    System.out.println("The power after charging for 10 minutes is:");
    System.out.println(); // TODO: call getPower method on your phone and print the power

    /*
     * charge() Charge your test phone for 50 minutes and print your power.
     */
    // TODO: B.0.2 test charge here
    System.out.println("The power after charging for another 50 minutes is:");
    System.out.println(); // TODO: print power here

    /*
     * drain() Drain your test phone's power by 60 percent and print its power.
     */
    // TODO: B.1.1 decrease power here
    System.out.println("The power after decreasing the power by 60 percent is:");
    System.out.println(); // TODO: print power here

    // TODO: Print your own debug messages for the next lines:
    // TODO: B.1.1 drain power past 0.0 and check to ensure power is 0.0
    // TODO: B.0.2 increase power back up to a useful amount

    /*
     * unlock() Unlock your phone with the PIN 121. How did this affect your
     * phone's power?
     */
    // TODO: B.2.2 unlock phone with 121
    System.out.println("The power after using 121 to unlock phone: ");
    System.out.println(); // TODO: print whether the phone is unlocked
    System.out.println(); // TODO: print power

    /*
     * unlock() Unlock your phone with the PIN 110. How did this affect your
     * phone's power?
     */
    // TODO: B.2.2 unlock phone with 110
    System.out.println("The power after using 110 to unlock phone: ");
    System.out.println(); // TODO: print whether the phone is unlocked
    System.out.println(); // TODO: print power

    // TODO: B.3.1 test the lock method

    /*
     * changePin() Change your phone's PIN to any number! Remember the power
     * should be decreasing.
     * 
     * How would you check to be sure that your PIN changed?
     */
    // TODO: B.4.2 change PIN
    System.out.println("The power after chainging PIN: ");
    System.out.println(); // TODO: print power
    // TODO: B.4.2 change PIN with the wrong old PIN and test for yourself

    /*
     * sendText() Send a nice message to any number you would like to brighten
     * their day by calling sendText.
     */
    // TODO: call sendText method
  }
}
