#Feature: Checkout, Address confirmation and payment
#  Scenario: CheckOut
#    Given The Product is ready to check out
#    And Processed  to checkout
#    And Delivery Address and Billing address verified
#    Then Place order
#
#  Scenario Outline: Payment
#    Given Payment information page displayed
#    And Give the Card Holder '<name>'
#    And Give the card '<number>'
#    And The '<CVC>' number
#    And The '<Expansion>'
#    And Expired '<year>'
#    And payment Submit
#    And Download invoice Text file
#    Then logout form there
#    Examples:
#    |name|number|CVC|Expansion|year|
#    |Anik|123456789|313|22    |2025|
#
