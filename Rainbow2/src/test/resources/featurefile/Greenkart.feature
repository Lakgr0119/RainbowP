Feature:
  @Gk
  Scenario: search the items
    Given user enters the itemname
    When user clicks on search button
    Then user navigates to the cartpage

    @Gk1
  Scenario: iterate the products
      Given user productValue
      When user adds the products toCart
