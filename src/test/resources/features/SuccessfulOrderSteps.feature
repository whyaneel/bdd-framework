Feature: Test Table Reservation Flow
    for a bootstrap app which posts the data

  @OpenBrowser @CloseBrowser
  Scenario Outline: Place a successful Order
    # user launches the app by reading qr code from theier phone
    # /#/home/0
    Given user launches the app by entering url "<AppUrl>"
    Given user is on home page of the app
    And user clicks Place Order

    # /#/orders/
    And user should see the total price
    And user clicks Confirm Order

    # /#/payment/
    And user should see an order number
    And user clicks Payment

    #/payment-done/
    Then user should see a successfull message


    Examples:
    | AppUrl |
    | http://54.169.128.207:3000/#/home/2 |
    | http://54.169.128.207:3000/#/home/3 |





