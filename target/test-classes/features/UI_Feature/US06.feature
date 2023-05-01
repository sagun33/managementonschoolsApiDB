
@US06  @smoke
Feature: Dean Vice Dean hesabi oluşturabilmeli
  Background:
    Given Kullanici Dean olarak login olur.
    And   Dean Menu butonuna tiklar
    And   Dean vice dean management linkine tiklar

  Scenario:TC01 Name Kutusu


    And   Dean Name boxunu bos birakir
    And   Dean Name boxunda Required yazisini varligini dogrular
    And   Dean Name boxuna herhangi bir deger girer
    And   Dean Name boxunda uyari yazisinin gorunmedigini dogrular
    And   Dean sayfayi kapatir

  Scenario:TC02 Surname Kutusu


    And   Dean Surname boxunu bos birakir
    And   Dean Surname boxunda Required yazisini varligini dogrular
    And   Dean Surname boxuna herhangi bir deger girer
    And   Dean Surname boxunda uyari yazisinin gorunmedigini dogrular
    And   Dean sayfayi kapatir

  Scenario:TC03 Birthplace Kutusu


    And   Dean Birthplace boxunu bos birakir
    And   Dean Birthplace boxunda Required yazisini varligini dogrular
    And   Dean Birthplace boxuna herhangi bir deger girer
    And   Dean Birthplace boxunda uyari yazisinin gorunmedigini dogrular
    And   Dean sayfayi kapatir

  @S04
  Scenario Outline:TC04 DateOfBirth Kutusu


    And   Dean DateOfBirth boxunu bos birakir
    And   Dean DateOfBirth boxunda Required yazisini varligini dogrular
    And   Dean "<dateOfBirth>" boxuna herhangi bir deger girer
    And   Dean DateOfBirth boxunda uyari yazisinin gorunmedigini dogrular
    And   Dean sayfayi kapatir

    Examples: DateOfBirth
      | dateOfBirth |
      | 12/03/2000  |

  @U5
  Scenario Outline: TC05 Phone Kutusu


    And   Dean Phone boxunu bos birakir
    And   Dean Phone boxunda Required yazisini varligini dogrular
    And   Dean Phone boxuna "<phone>" bir deger girer
    And   Dean Phone boxunda uyari yazisinin gorunmedigini dogrular
    And   Dean sayfayi kapatir

    Examples:Dean_Vice_Register
      | phone        |
      | 333-222-3456 |
  @er
  Scenario Outline: TC06 Ssn Kutusu


    And   Dean Ssn boxunu bos birakir
    And   Dean Ssn boxunda Required yazisini varligini dogrular
    And   Dean ssn boxuna "<Ssn>" bir deger girer
    And   Dean Ssn boxunda uyari yazisinin gorunmedigini dogrular
    And   Dean sayfayi kapatir
    Examples: Ssn number
      | Ssn         |
      | 333-22-4444 |


  Scenario: TC07 UserName Kutusu


    And   Dean UserName boxunu bos birakir
    And   Dean UserName boxunda Required yazisini varligini dogrular
    And   Dean UserName boxuna herhangi bir deger girer
    And   Dean UserName boxunda uyari yazisinin gorunmedigini dogrular
    And   Dean sayfayi kapatir



  Scenario Outline: TC08  Password Kutusu


    And   Dean Password boxunu bos birakir
    And   Dean Password boxunda Required yazisini varligini dogrular
    And   Dean Password boxuna gecerli "<password>" bir deger girer
    And   Dean Password boxunda uyari yazisinin gorunmedigini dogrular
    And   Dean sayfayi kapatir
    Examples: password
      | password |
      | ABCabc9? |

  @TC09
  Scenario Outline: TC09_Negativ Phone  boxuna gecersiz bir deger girer.


    Then  Dean Gecerli Name girer
    Then  Dean Surname girer
    And   Dean Birth_Place girer
    Then  Dean Gender tiklar
    Then  Dean DateOfBirth "<dateOfBirth>" girer
    Then  Dean Phone kutucuguna ucuncu karakterden sonra kesme Isareti olmayacak altinci karakterden sonra kesme Isareti olacak sekilde On haneli "<phone>" girer.
    Then  Dean gecerli1 Ssn "<Ssn>" girer
    Then  Dean gecerli bir User_Name girer
    Then  Dean Gecerli bir Password "<password>" girer
    Then  Dean Submit Buttonuna tiklar
    And   Dean Assert1 Minimum oniki character  yazisini gordugunu dogrular
    And   Dean sayfayi kapatir

    Examples: Dean_Vice_Register
      | phone       | Ssn         | password | dateOfBirth |
      | 176822-5367 | 987-24-1543 | ABab12?$ | 12/Dec/2000 |
  @TC10
  Scenario Outline:TC010_Negativ Phone boxuna gecersiz bir deger girer.


    Then  Dean Gecerli Name girer
    Then  Dean Surname girer
    And   Dean Birth_Place girer
    Then  Dean Gender tiklar
    Then  Dean dateOfBirth1 "<dateOfBirth>" girer
    Then  Dean Phone kutucuguna ucuncu karakterden sonra  oalacak  altinci karakterden sonra  olmayacak sekilde on haneli "<phone>" girer.
    Then  Dean gecerli2 Ssn "<Ssn>" girer
    Then  Dean gecerli bir User_Name girer
    Then  Dean Gecerli bir Password "<password>" girer
    Then  Dean Submit Buttonuna tiklar
    And   Dean Asseert2 Minimum oniki character  yazisini gordugunu dogrular
    And   Dean sayfayi kapatir

    Examples: Dean_Vice_Register
      | phone       | Ssn         | password | dateOfBirth |
      | 176-822536 | 987-24-1543 | ABab12?$ | 12/Dec/2000 |
  @TC11
  Scenario Outline: TC11_Negativ Phone  boxuna gecersiz bir deger girer.


    Then  Dean Gecerli Name girer
    Then  Dean Surname girer
    And   Dean Birth_Place girer
    Then  Dean Gender tiklar
    Then  Dean dateOfBirth2 "<dateOfBirth>" girer
    Then  Dean Phone kutucuguna ucuncu karakterden sonra  olacak altinci karakterden sonra  olacak sekilde dokuz haneli "<phone>" girer.
    Then  Dean gecerli3 Ssn "<Ssn>" girer
    Then  Dean gecerli bir User_Name girer
    Then  Dean Gecerli bir Password "<password>" girer
    Then  Dean Submit Buttonuna tiklar
    And   Dean Assert3 Minimum oniki character  yazisini gordugunu dogrular
    And   Dean sayfayi kapatir

    Examples: Dean_Vice_Register
      | phone       | Ssn         | password | dateOfBirth |
      | 176-822-536 | 987-24-1543 | ABab12?$ | 12/Dec/2000 |

  @TC12
  Scenario Outline: TC12_Negativ Test _Ssn  gecersuz olarak girer


    Then  Dean Gecerli Name girer
    Then  Dean Surname girer
    And   Dean Birth_Place girer
    Then  Dean Gender tiklar
    Then  Dean dateOfBirth4 "<dateOfBirth>" girer
    Then  Dean gecerli Phone Numarasi "<phone>" girer
    Then  Dean Ssn kutucuguna ucuncu ve besinci karakterden sonra  olacak sekilde sekiz haneli "<Ssn>" sayi girer.
    Then  Dean gecerli bir User_Name girer
    Then  Dean Gecerli bir Password "<password>" girer
    Then  Dean Submit Buttonuna tiklar
    And   Dean Assert1 olarakMinimum onbir character  yazisini gordugunu dogrular
    And   Dean sayfayi kapatir

    Examples: Dean_Vice_Register
      | phone       | Ssn         | password | dateOfBirth |
      | 176-822-5367 | 987-24-154 | ABab12?$ | 12/Dec/2000 |

  @TC13
  Scenario Outline: TC13_Negativ Test _Ssn boxuna gecersiz bir deger girer.


    Then  Dean Gecerli Name girer
    Then  Dean Surname girer
    And   Dean Birth_Place girer
    Then  Dean Gender tiklar
    Then  Dean dateOfBirth5 "<dateOfBirth>" girer
    Then  Dean gecerli Phone Numarasi "<phone>" girer
    Then  Dean Ssn  kutucuguna ucuncu karakterden sonra  olmayacak besinci karakterden sonra  olacak sekilde dokuz haneli "<Ssn>" girer.
    Then  Dean gecerli bir User_Name girer
    Then  Dean Gecerli bir Password "<password>" girer
    Then  Dean Submit Buttonuna tiklar
    And   Dean Assert2 Minimum onbir character  yazisini gordugunu dogrular
    And   Dean sayfayi kapatir


    Examples: Dean_Vice_Register
      | phone       | Ssn         | password | dateOfBirth |
      | 176-822-5367 | 98724-1543 | ABab12?$ | 12/Dec/2000 |

  @TC14
  Scenario Outline: TC14_Negativ Test _Ssn boxuna gecersiz bir deger girer.


    Then  Dean Gecerli Name girer
    Then  Dean Surname girer
    And   Dean Birth_Place girer
    Then  Dean Gender tiklar
    Then  Dean dateOfBirth6 "<dateOfBirth>" girer
    Then  Dean gecerli Phone Numarasi "<phone>" girer
    Then  Dean Ssn  kutucuguna ucuncu karakterden sonra  olacak  besinci karakterden sonra  olmayacak sekilde dokuz haneli "<Ssn>" girer.
    Then  Dean gecerli bir User_Name girer
    Then  Dean Gecerli bir Password "<password>" girer
    Then  Dean Submit Buttonuna tiklar
    And   Dean Assert3 Minimum onbir character  yazisini gordugunu dogrular
    And   Dean sayfayi kapatir

    Examples: Dean_Vice_Register
      | phone       | Ssn         | password | dateOfBirth |
      | 176-822-5367 | 987-241543 | ABab12?$ | 12/Dec/2000 |

  Scenario Outline: TC015_Negativ Test _Ssn boxuna gecersiz bir deger girer.


    Then  Dean Gecerli Name girer
    Then  Dean Surname girer
    And   Dean Birth_Place girer
    Then  Dean Gender tiklar
    Then  Dean dateOfBirth7 "<dateOfBirth>" girer
    Then  Dean gecerli Phone Numarasi "<phone>" girer
    Then  Dean Ssn kutucuguna ucuncu ve  besinci karakterden sonra  olmayacak sekilde dokuz haneli "<Ssn>" girer.
    Then  Dean gecerli bir User_Name girer
    Then  Dean Gecerli bir Password "<password>" girer
    Then  Dean Submit Buttonuna tiklar
    And   Dean Assert4 Minimum onbir character  yazisini gordugunu dogrular
    And   Dean sayfayi kapatir

    Examples: Dean_Vice_Register
      | phone       | Ssn         | password | dateOfBirth |
      | 176-822-5367 | 987241543 | ABab12?$ | 12/Dec/2000 |




  @TC16
  Scenario Outline: TC16_Negativ Test_Gecersiz Password  girer


    Then  Dean Gecerli Name girer
    Then  Dean Surname girer
    And   Dean Birth_Place girer
    Then  Dean Gender tiklar
    Then  Dean dateOfBirth10 "<dateOfBirth>" girer
    Then  Dean gecerli Phone Numarasi "<phone>" girer
    Then  Dean gecerli5 ssn  "<Ssn>" girer
    Then  Dean gecerli bir User_Name girer
    Then  Dean passwordu yedi haneli "<password>" olarak girer
    Then  Dean Submit Buttonuna tiklar
    And   Dean Minimum sekiz character  yazisini gordugunu dogrular
    And   Dean sayfayi kapatir

    Examples: Dean_Vice_Register
      | phone        | Ssn         | password | dateOfBirth |
      | 176-822-5367 | 987-24-1543 | Abdl762  | 12/Dec/2000 |

  @US06_TC17
  Scenario Outline: TC17_Positive Test _Kullanici Gecerli bilgilerle Kayit yapar


    Then  Dean Gecerli Name girer
    Then  Dean Surname girer
    And   Dean Birth_Place girer
    Then  Dean Gender tiklar
    Then  Dean dateOfBirth11 "<dateOfBirth>" girer
    Then  Dean gecerli Phone Numarasi "<phone>" girer
    Then  Dean gecerli6 ssn "<Ssn>" girer
    Then  Dean gecerli bir User_Name girer
    Then  Dean gecerlir bir Passwordu "<Password>" girer
    Then  Dean Submit Buttonuna tiklar
    And   Dean kayit olundugunu dogrular
    And   Dean sayfayi kapatir


    Examples: Dean_Vice_Register
      | phone        | Ssn         | password | dateOfBirth |
      | 176-822-5367 | 980-24-1543 | ABab12?$ | 12/03/2000  |