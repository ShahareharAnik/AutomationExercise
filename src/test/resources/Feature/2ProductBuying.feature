Feature: Product Buying
  Scenario Outline: Product Select
    Given Go to the Product menu
    When Search '<DesiredProduct>'
    Then View Product
    Examples:
    |DesiredProduct|
    |Blue top      |

  Scenario Outline: Negative Quantity Check
    Given The Product is Selected
    When Add '<NegativeQuantity>'
    And Add to Cart and Continue shopping
    And Verified '<Price>'
    And again Verified '<Quantities>'
    And also Verified '<negative_total>'
    Then Go back to Product view page
    Examples:
      |NegativeQuantity|Price|Quantities|negative_total|
      |-2              |500  |-2        |-1000 |

  Scenario Outline: Positive Product check
    Given Go to the Product again
    When Adds '<positiveQuantity>'
    And  And Add to Cart and Continue shopping.
    And Verified product '<pPrice>'
    And Verified also'<pQuantities>'
    And again Verified'<positive_total>'
    Examples:
    |positiveQuantity|pPrice|pQuantities|positive_total|
    |10              |500   |10         |5000          |



