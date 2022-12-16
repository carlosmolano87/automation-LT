Feature: I as user of Swag Labs
  i want to add products to my shopping cart
  and create a new purchase order

  Scenario: Successful purchase order creation
    Given user in the home page
    When user create a checkout order
    Then user sees registered order