package stepdefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginlerPage;

import pages.ViceDeanManagementPage;
import utilities.ConfigReader;
import utilities.Driver;


public class US06_StepDef {
    LoginlerPage loginlerPage = new LoginlerPage();
    ViceDeanManagementPage viceDeanManagementPage = new ViceDeanManagementPage();
   

    @Given("Dean Menu butonuna tiklar")
    public void dean_menu_butonuna_tiklar() {
        viceDeanManagementPage.menuButon.click();
    }
    @Given("Dean vice dean management linkine tiklar")
    public void dean_vice_dean_management_linkine_tiklar() {
        viceDeanManagementPage.viceDeanManagementLink.click();
    }




    @Then("Dean Name boxunu bos birakir")
    public void dean_name_boxunu_bos_birakir() {
        viceDeanManagementPage.surName.click();
        viceDeanManagementPage.viceDeanName.click();

    }

    @Then("Dean Name boxunda Required yazisini varligini dogrular")
    public void dean_name_boxunda_required_yazisini_varligini_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.nameRequired.isDisplayed());
    }

    @Then("Dean Name boxuna herhangi bir deger girer")
    public void dean_name_boxuna_herhangi_bir_deger_girer() {
        viceDeanManagementPage.viceDeanName.sendKeys("Salih");
    }

    @Then("Dean Name boxunda uyari yazisinin gorunmedigini dogrular")
    public void dean_name_boxunda_uyari_yazisinin_gorunmedigini_dogrular() {
        Assert.assertFalse(viceDeanManagementPage.nameRequired.isDisplayed());
    }

    @Then("Dean sayfayi kapatir")
    public void dean_sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("Dean Surname boxunu bos birakir")
    public void dean_surname_boxunu_bos_birakir() {
        viceDeanManagementPage.viceDeanName.click();
        viceDeanManagementPage.surName.click();

    }

    @Then("Dean Surname boxunda Required yazisini varligini dogrular")
    public void dean_surname_boxunda_required_yazisini_varligini_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.surNameRequired.isDisplayed());
    }

    @Then("Dean Surname boxuna herhangi bir deger girer")
    public void dean_surname_boxuna_herhangi_bir_deger_girer() {
        viceDeanManagementPage.surName.sendKeys("Gunay");
    }

    @Then("Dean Surname boxunda uyari yazisinin gorunmedigini dogrular")
    public void dean_surname_boxunda_uyari_yazisinin_gorunmedigini_dogrular() {
        Assert.assertFalse(viceDeanManagementPage.surNameRequired.isDisplayed());
    }

    @Then("Dean Birthplace boxunu bos birakir")
    public void dean_birthplace_boxunu_bos_birakir() {
        viceDeanManagementPage.viceDeanName.click();
        viceDeanManagementPage.birthPlace.click();

    }

    @Then("Dean Birthplace boxunda Required yazisini varligini dogrular")
    public void dean_birthplace_boxunda_required_yazisini_varligini_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.birthPlaceRequired.isDisplayed());

    }

    @Then("Dean Birthplace boxuna herhangi bir deger girer")
    public void dean_birthplace_boxuna_herhangi_bir_deger_girer() {
        viceDeanManagementPage.birthPlace.sendKeys("istanbul");
    }

    @Then("Dean Birthplace boxunda uyari yazisinin gorunmedigini dogrular")
    public void dean_birthplace_boxunda_uyari_yazisinin_gorunmedigini_dogrular() {
        Assert.assertFalse(viceDeanManagementPage.birthPlaceRequired.isDisplayed());
    }

    @Then("Dean DateOfBirth boxunu bos birakir")
    public void dean_date_of_birth_boxunu_bos_birakir() {
        viceDeanManagementPage.viceDeanName.click();
        viceDeanManagementPage.dateOfBirth.click();

    }

    @Then("Dean DateOfBirth boxunda Required yazisini varligini dogrular")
    public void dean_date_of_birth_boxunda_required_yazisini_varligini_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.dateOfBirthRequired.isDisplayed());
    }

    @Then("Dean {string} boxuna herhangi bir deger girer")
    public void dean_boxuna_herhangi_bir_deger_girer(String string) {
        viceDeanManagementPage.dateOfBirth.sendKeys(string);
    }

    @Then("Dean DateOfBirth boxunda uyari yazisinin gorunmedigini dogrular")
    public void dean_date_of_birth_boxunda_uyari_yazisinin_gorunmedigini_dogrular() {
        Assert.assertFalse(viceDeanManagementPage.dateOfBirthRequired.isDisplayed());
    }

    @Then("Dean Phone boxunu bos birakir")
    public void dean_phone_boxunu_bos_birakir() {
        viceDeanManagementPage.viceDeanName.click();
        viceDeanManagementPage.phoneNumber.click();

    }

    @Then("Dean Phone boxunda Required yazisini varligini dogrular")
    public void dean_phone_boxunda_required_yazisini_varligini_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.phoneRequired.isDisplayed());

    }

    @Then("Dean Phone boxuna {string} bir deger girer")
    public void dean_phone_boxuna_bir_deger_girer(String string) {
        viceDeanManagementPage.phoneNumber.sendKeys(string);

    }

    @Then("Dean Phone boxunda uyari yazisinin gorunmedigini dogrular")
    public void dean_phone_boxunda_uyari_yazisinin_gorunmedigini_dogrular() {
        Assert.assertFalse(viceDeanManagementPage.phoneRequired.isDisplayed());

    }

    @Then("Dean Ssn boxunu bos birakir")
    public void dean_ssn_boxunu_bos_birakir() {
        viceDeanManagementPage.viceDeanName.click();
        viceDeanManagementPage.ssn.click();

    }

    @Then("Dean Ssn boxunda Required yazisini varligini dogrular")
    public void dean_ssn_boxunda_required_yazisini_varligini_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.ssnRequired.isDisplayed());

    }

    @Then("Dean ssn boxuna {string} bir deger girer")
    public void dean_ssn_boxuna_bir_deger_girer(String string) {
        viceDeanManagementPage.ssn.sendKeys(string);
    }

    @Then("Dean Ssn boxunda uyari yazisinin gorunmedigini dogrular")
    public void dean_ssn_boxunda_uyari_yazisinin_gorunmedigini_dogrular() {
        Assert.assertFalse(viceDeanManagementPage.ssnRequired.isDisplayed());
    }


    @Then("Dean UserName boxunu bos birakir")
    public void dean_user_name_boxunu_bos_birakir() {
        viceDeanManagementPage.viceDeanName.click();
        viceDeanManagementPage.username.click();

    }

    @Then("Dean UserName boxunda Required yazisini varligini dogrular")
    public void dean_user_name_boxunda_required_yazisini_varligini_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.userNameRequired.isDisplayed());
       
    }

    @Then("Dean UserName boxuna herhangi bir deger girer")
    public void dean_user_name_boxuna_herhangi_bir_deger_girer() {
        viceDeanManagementPage.username.sendKeys("ali");
    }

    @Then("Dean UserName boxunda uyari yazisinin gorunmedigini dogrular")
    public void dean_user_name_boxunda_uyari_yazisinin_gorunmedigini_dogrular() {
        Assert.assertFalse(viceDeanManagementPage.userNameRequired.isDisplayed());
    }


    @Then("Dean Password boxunu bos birakir")
    public void dean_password_boxunu_bos_birakir() {
        viceDeanManagementPage.viceDeanName.click();
        viceDeanManagementPage.password.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Dean Password boxunda Required yazisini varligini dogrular")
    public void dean_password_boxunda_required_yazisini_varligini_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.passwordRequired.isDisplayed());
        ReusableMethods.waitFor(1);
    }

    @Then("Dean Password boxuna gecerli {string} bir deger girer")
    public void dean_password_boxuna_gecerli_bir_deger_girer(String string) {
        viceDeanManagementPage.password.sendKeys(string);
    }

    @Then("Dean Password boxunda uyari yazisinin gorunmedigini dogrular")
    public void dean_password_boxunda_uyari_yazisinin_gorunmedigini_dogrular() {
        Assert.assertFalse(viceDeanManagementPage.passwordRequired.isDisplayed());
    }

    @Then("Dean Gecerli Name girer")
    public void dean_gecerli_name_girer() {
        viceDeanManagementPage.viceDeanName.click();
        viceDeanManagementPage.viceDeanName.sendKeys("ali");
        ReusableMethods.waitFor(1);
    }

    @Then("Dean Surname girer")
    public void dean_surname_girer() {
        viceDeanManagementPage.surName.sendKeys("veli");
        ReusableMethods.waitFor(1);
    }

    @Then("Dean Birth_Place girer")
    public void dean_birth_place_girer() {
        viceDeanManagementPage.birthPlace.sendKeys("van");
        ReusableMethods.waitFor(1);
    }

    @Then("Dean Gender tiklar")
    public void dean_gender_tiklar() {
        viceDeanManagementPage.radioButtonGenderMale.click();
        ReusableMethods.waitFor(1);
    }

    @Then("Dean DateOfBirth {string} girer")
    public void dean_date_of_birth_girer(String string) {
        viceDeanManagementPage.dateOfBirth.sendKeys(string);
    }


    @Then("Dean Phone kutucuguna ucuncu karakterden sonra kesme Isareti olmayacak altinci karakterden sonra kesme Isareti olacak sekilde On haneli {string} girer.")
    public void dean_phone_kutucuguna_ucuncu_karakterden_sonra_kesme_isareti_olmayacak_altinci_karakterden_sonra_kesme_isareti_olacak_sekilde_on_haneli_girer(String string) {
        viceDeanManagementPage.phoneNumber.sendKeys(string);
    }


    @Then("Dean gecerli1 Ssn {string} girer")
    public void dean_gecerli1_ssn_girer(String string) {
        viceDeanManagementPage.ssn.sendKeys(string);
    }



    @Then("Dean gecerli bir User_Name girer")
    public void dean_gecerli_bir_user_name_girer() {
        viceDeanManagementPage.username.sendKeys("aliveli");
    }

    @Then("Dean Gecerli bir Password {string} girer")
    public void dean_gecerli_bir_password_girer(String string) {
        viceDeanManagementPage.password.sendKeys(string);
    }

    @Then("Dean Submit Buttonuna tiklar")
    public void dean_submit_buttonuna_tiklar() {
        viceDeanManagementPage.submit.click();
        ReusableMethods.waitFor(1);

    }

    @Then("Dean Assert1 Minimum oniki character  yazisini gordugunu dogrular")
    public void dean_assert1_minimum_oniki_character_yazisini_gordugunu_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.min12Karakter.isDisplayed());
    }

    @Then("Dean dateOfBirth1 {string} girer")
    public void dean_date_of_birth_girer1 (String string) {
        viceDeanManagementPage.dateOfBirth.sendKeys(string);
    }

    @Then("Dean Phone kutucuguna ucuncu karakterden sonra  oalacak  altinci karakterden sonra  olmayacak sekilde on haneli {string} girer.")
    public void dean_phone_kutucuguna_ucuncu_karakterden_sonra_oalacak_altinci_karakterden_sonra_olmayacak_sekilde_on_haneli_girer(String string) {
        viceDeanManagementPage.phoneNumber.sendKeys(string);
    }
    @Then("Dean gecerli2 Ssn {string} girer")
    public void dean_gecerli2_ssn_girer(String string) {
        viceDeanManagementPage.ssn.sendKeys(string);
    }

    @Then("Dean Asseert2 Minimum oniki character  yazisini gordugunu dogrular")
    public void dean_asseert2_minimum_oniki_character_yazisini_gordugunu_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.min12Karakter.isDisplayed());

    }

    @Then("Dean dateOfBirth2 {string} girer")
    public void dean_date_of_birth2_girer(String string) {
        viceDeanManagementPage.dateOfBirth.sendKeys(string);
    }
    @Then("Dean Phone kutucuguna ucuncu karakterden sonra  olacak altinci karakterden sonra  olacak sekilde dokuz haneli {string} girer.")
    public void dean_phone_kutucuguna_ucuncu_karakterden_sonra_olacak_altinci_karakterden_sonra_olacak_sekilde_dokuz_haneli_girer(String string) {
        viceDeanManagementPage.phoneNumber.sendKeys(string);
    }
    @Then("Dean gecerli3 Ssn {string} girer")
    public void dean_gecerli3_ssn_girer(String string) {
        viceDeanManagementPage.ssn.sendKeys(string);
    }
    @Then("Dean Assert3 Minimum oniki character  yazisini gordugunu dogrular")
    public void dean_assert3_minimum_oniki_character_yazisini_gordugunu_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.min12Karakter.isDisplayed());
    }

    @Then("Dean dateOfBirth4 {string} girer")
    public void dean_date_of_birth4_girer(String string) {
        viceDeanManagementPage.dateOfBirth.sendKeys(string);
    }
    @Then("Dean gecerli Phone Numarasi {string} girer")
    public void dean_gecerli_phone_numarasi_girer(String string) {
        viceDeanManagementPage.phoneNumber.sendKeys(string);
    }
    @Then("Dean Ssn kutucuguna ucuncu ve besinci karakterden sonra  olacak sekilde sekiz haneli {string} sayi girer.")
    public void dean_ssn_kutucuguna_ucuncu_ve_besinci_karakterden_sonra_olacak_sekilde_sekiz_haneli_sayi_girer(String string) {
        viceDeanManagementPage.ssn.sendKeys(string);
    }
    @Then("Dean Assert1 olarakMinimum onbir character  yazisini gordugunu dogrular")
    public void dean_assert1_olarak_minimum_onbir_character_yazisini_gordugunu_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.min11Karakter.isDisplayed());
    }
    @Then("Dean dateOfBirth5 {string} girer")
    public void dean_date_of_birth5_girer(String string) {
        viceDeanManagementPage.dateOfBirth.sendKeys(string);
    }
    @Then("Dean Ssn  kutucuguna ucuncu karakterden sonra  olmayacak besinci karakterden sonra  olacak sekilde dokuz haneli {string} girer.")
    public void dean_ssn_kutucuguna_ucuncu_karakterden_sonra_olmayacak_besinci_karakterden_sonra_olacak_sekilde_dokuz_haneli_girer(String string) {
        viceDeanManagementPage.ssn.sendKeys(string);
    }
    @Then("Dean Assert2 Minimum onbir character  yazisini gordugunu dogrular")
    public void dean_assert2_minimum_onbir_character_yazisini_gordugunu_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.min11Karakter.isDisplayed());
    }

    @Then("Dean dateOfBirth6 {string} girer")
    public void dean_date_of_birth6_girer(String string) {
        viceDeanManagementPage.dateOfBirth.sendKeys(string);
    }
    @Then("Dean Ssn  kutucuguna ucuncu karakterden sonra  olacak  besinci karakterden sonra  olmayacak sekilde dokuz haneli {string} girer.")
    public void dean_ssn_kutucuguna_ucuncu_karakterden_sonra_olacak_besinci_karakterden_sonra_olmayacak_sekilde_dokuz_haneli_girer(String string) {
        viceDeanManagementPage.ssn.sendKeys(string);
    }
    @Then("Dean Assert3 Minimum onbir character  yazisini gordugunu dogrular")
    public void dean_assert3_minimum_onbir_character_yazisini_gordugunu_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.min11Karakter.isDisplayed());
    }

    @Then("Dean dateOfBirth7 {string} girer")
    public void dean_date_of_birth7_girer(String string) {
        viceDeanManagementPage.dateOfBirth.sendKeys(string);
    }
    @Then("Dean Ssn kutucuguna ucuncu ve  besinci karakterden sonra  olmayacak sekilde dokuz haneli {string} girer.")
    public void dean_ssn_kutucuguna_ucuncu_ve_besinci_karakterden_sonra_olmayacak_sekilde_dokuz_haneli_girer(String string) {
        viceDeanManagementPage.ssn.sendKeys(string);
    }
    @Then("Dean Assert4 Minimum onbir character  yazisini gordugunu dogrular")
    public void dean_assert4_minimum_onbir_character_yazisini_gordugunu_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.min11Karakter.isDisplayed());
    }

    @Then("Dean dateOfBirth10 {string} girer")
    public void dean_date_of_birth10_girer(String string) {
        viceDeanManagementPage.dateOfBirth.sendKeys(string);
    }
    @Then("Dean gecerli5 ssn  {string} girer")
    public void dean_gecerli5_ssn_girer(String string) {
        viceDeanManagementPage.ssn.sendKeys(string);

    }
    @Then("Dean passwordu yedi haneli {string} olarak girer")
    public void dean_passwordu_yedi_haneli_olarak_girer(String string) {
        viceDeanManagementPage.password.sendKeys(string);
    }
    @Then("Dean Minimum sekiz character  yazisini gordugunu dogrular")
    public void dean_minimum_sekiz_character_yazisini_gordugunu_dogrular() {
        Assert.assertTrue(viceDeanManagementPage.min8Karakter.isDisplayed());
    }


    @Then("Dean dateOfBirth11 {string} girer")
    public void dean_date_of_birth11_girer(String string) {
        viceDeanManagementPage.dateOfBirth.sendKeys(string);
    }

    @Then("Dean gecerli6 ssn {string} girer")
    public void dean_gecerli6_ssn_girer(String string) {
        viceDeanManagementPage.ssn.sendKeys(string);
    }

    @Then("Dean gecerlir bir Passwordu {string} girer")
    public void dean_gecerlir_bir_passwordu_girer(String string) {
        viceDeanManagementPage.password.sendKeys(string);
    }

    @Then("Dean kayit olundugunu dogrular")
    public void dean_kayit_olundugunu_dogrular() {
        String nametext = studentManagementPage.name.getText();
        Assert.assertEquals(nametext,"");

        ReusableMethods.waitFor(10);
    }


}