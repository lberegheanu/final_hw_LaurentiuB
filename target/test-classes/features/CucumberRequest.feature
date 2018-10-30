Feature: GET request


    Scenario: User calls web services in order to add a new owner
      Given Go to Owners
      When Fill the blanks
      Then Save the new owner

    Scenario: User calls web services in order to add, edit and delete a vet
      Given Go to Vets
      When Add a new vet
      And Edit one vet
      Then Delete one vet

    Scenario: User calls web services in order to add, edit and delete a pet
     Given Add a new pet
     When Edit one pet
     Then Delete the pet

    Scenario: User calls web services in order to add, edit and delete a spec
    Given Add a new spec
    When Edit one spec
    Then Delete the spec