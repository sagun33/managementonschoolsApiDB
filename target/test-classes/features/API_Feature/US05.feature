@US05
Feature: Admin, Dean leri görebilmeli ve silebilmeli ve Güncelleyebilmeli

  @US05_Post_Dean
  Scenario: Admin Dean Hesabi olusturur-PostRequest
    Given Admin Dean Post Request yapar
    Then  Admin Post  Satatus kodun ikiyuz oldugunu dogrular
    Then  Admin Dean olustugunun validate yapar

  @US05_Put_Dean
  Scenario: Admin olusturdugu Dean Hesabini güncelleyebilmelidir-PutRequest
    Given Admin Put Request yapar
    Then  Admin Put  Satatus kodun ikiyuz oldugunu dogrular
    Then  Admin Dean güncellendigini dogrular

  @US05_Get_Dean_ById
  Scenario: Admin olusturdugu dean hesabini görebilmeli-GetRequest ByID
    Given  Admin GetBy Id Request yapar
    Then   Admin Get Status Code ikiyuz oldugunu dogrular
    Then   Admin Dean hesabini görebildigini validate yapar

  @US05_Delete_Dean_ById
  Scenario: Admin olusturdugu Dean hesabini silebilmeli-DeleteRequest
    Given Admin Delete Request yapar
    Then  Admin Delete Satatus kodun ikiyuz oldugunu dogrular

  @US05_Get_AfterDelete_ById
  Scenario: Admin hesabin olmadigini dogrular
    Given  Admin  tekarar GetBy Id Request yapar
    Then   Admin Get Status Code dortyuz oldugunu dogrular
    Then   Admin Dean hesabini göremedigini  validate yapar