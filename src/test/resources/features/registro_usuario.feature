#Autor: Johanna Munoz

@stories

Feature: User registration on Utest page

  @scenario1
  Scenario: Johanna's registration in the Utest form
    Given Johanna would like to register with Utest
    When Enter the data required by the system
      | strName | strLastName | strEmail               | strMonthBirth | strBirthDay | strYearBirth | strCity | strZipPostalCode | strCountry | strPc  | strVersion   | strLanguage | strMobileDevice | strModel | strSO      | strPassword |
      | Juan    | Perez       | johannam1903@gmail.com | Mayo          | 14          | 1981         | Bogota  | 12345            | Colombia   | Ubuntu | Ubuntu 19.04 | Spanish     | Huawei          | P20 lite | Android 10 | J84761*     |
    Then Registration is successfully completed