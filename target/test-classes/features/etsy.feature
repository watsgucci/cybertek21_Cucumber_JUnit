Feature: Etsy search feature

  @etsy
  Scenario: Etsy title verification
    Given user is on the Etsy landing page
    Then user should see Etsy title as expected
    # Expected: Etsy -Shop for handmade, vintage, custom, and unique gifts for everyone

  @etsySearchVerification
  Scenario: Etsy search functionality title verification
    Given user is on the Etsy landing page
    When user searches "Wooden spoon" in the search field
    Then user should see "Wooden spoon" in the Etsy title
#
