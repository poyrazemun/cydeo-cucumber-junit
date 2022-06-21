Feature: Web table user order feature


  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "visa"
    And user enters credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table


  Scenario Template: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity <quantity>
    And user enters customer name "<customerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipCode>"
    And user selects credit card type "<cardType>"
    And user enters credit card number "<cardNumber>"
    And user enters expiry date "<expDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

    @femaleScientist
    Examples: Famous female scientists
      | productType | quantity | customerName      | street    | city   | state   | zipCode | cardType | cardNumber       | expDate | expectedName      |
      | MoneyCog    | 2        | Marie Curie       | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Marie Curie       |
      | Familybea   | 3        | Rosalind Franklin | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Rosalind Franklin |
      | Screenable  | 5        | List Meitner      | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | List Meitner      |
      | MoneyCog    | 7        | Chien-Shiung Wu   | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Chien-Shiung Wu   |

    @maleScientist
    Examples: Famous male scientists
      | productType | quantity | customerName      | street    | city   | state   | zipCode | cardType | cardNumber       | expDate | expectedName      |
      | MoneyCog    | 2        | Charles Darwin    | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Charles Darwin    |
      | Familybea   | 3        | Omer Fatih Poyraz | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Omer Fatih Poyraz |
      | Screenable  | 5        | Blais Pascal      | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Blais Pascal      |
      | MoneyCog    | 7        | Albert Einstein   | London st | London | England | 50505   | Visa     | 1111222233334444 | 12/24   | Albert Einstein   |