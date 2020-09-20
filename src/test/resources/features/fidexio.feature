
  Feature: Login feature



    @Regression
    Scenario Outline: User should be able login with correct credentials

      Given "<User>" goes to the login page
      Then "<User>" enters "<User>"'s "<username>"
      When "<User>" enters "<User>"'s "<password>" and clicks login
      And "<User>" is on the main page and sees "<User>"'s account on the right

      Examples:
      | User              |   username                   | password         |

      | Sales Manager     |   salesmanager11@info.com    | salesmanager     |
      | expense Manager   |   expensesmanager11@info.com | expensesmanager  |
      | events Manager    |  eventscrmmanager14@info.com | eventscrmmanager |
      | pos Manager       |   posmanager18@info.com      | posmanager       |
      | inventory Manager |   imm13@info.com             | inventorymanager |


