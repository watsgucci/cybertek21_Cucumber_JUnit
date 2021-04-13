@threads
Feature: SmartBear order process
  As a user, I should be able to place an order


  @smartbearPlaceOrder
  Scenario: User fills out an order form
    Given User is logged into SmartBear Tester account and on Order page
    Then User fills out the form as followed from the table below:
    And User selects "FamilyAlbum" from product dropdown
    And User enters "10" to quantity
    And User enters "customer name" to costumer name
    And User enters "street" to street
    And User enters "city" to city
    And User enters "state"  to state
    And User enters "zip" to zip
    And User selects "cardType" as card type
    And User enters "card number" to card number
    And User enters "expiration date" to expiration date
    And User clicks process button
    And User verifies "expected name" is in the list

  @smartbearPlaceOrderOutline
  Scenario Outline: User fills out an order form
    Given User is logged into SmartBear Tester account and on Order page
    Then User fills out the form as followed from the table below:
    And User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity
    And User enters "<customer name>" to costumer name
    And User enters "<street>" to street
    And User enters "<city>" to city
    And User enters "<state>"  to state
    And User enters "<zip>" to zip
    And User selects "<cardType>" as card type
    And User enters "<card number>" to card number
    And User enters "<expiration date>" to expiration date
    And User clicks process button
    And User verifies "<expected name>" is in the list

    Examples: Order Info
      | product     | quantity | customer name      | street      | city        | state | zip   | cardType        | card number   | expiration date | expected name      |
      | MyMoney     | 1        | Ken Adams          | Kinzie st   | Chicago     | IL    | 60004 | Visa             | 1333313133315 | 12/22           | Ken Adams          |
      | FamilyAlbum | 4        | Ken Joey Tribbiani | State st    | Chicago     | IL    | 60656 | American Express | 4746745687823 | 11/22           | Ken Joey Tribbiani |
      | ScreenSaver | 5        | Ken Rachel Green   | Michigan st | Chicago     | IL    | 60056 | MasterCard       | 5758759229384 | 10/22           | Ken Rachel Green   |
      | MyMoney     | 5        | Chandler Bing      | Erie st     | Chicago     | IL    | 60666 | Visa             | 4874375978392 | 10/22           | Chandler Bing      |
      | FamilyAlbum | 9        | Dr DrakerRamoray   | Dale st     | Arl Hgths   | IL    | 69452 | American Express | 5847242937438 | 10/22           | Dr DrakerRamoray   |
      | ScreenSaver | 10       | Monica Geller      | Euclid st   | Arl Hgths   | IL    | 60312 | MasterCard       | 4572872834927 | 11/22           | Monica Geller      |
      | MyMoney     | 3        | Ross Geller        | River st    | Des Plaines | IL    | 60666 | American Express | 5849822374383 | 12/22           | Ross Geller        |
      | MyMoney     | 1        | Ken Adams          | Kinzie st   | Chicago     | IL    | 60312 | MasterCard       | 1333313133315 | 12/22           | Ken Adams          |


