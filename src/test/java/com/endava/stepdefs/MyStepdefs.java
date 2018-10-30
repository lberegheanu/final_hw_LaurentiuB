package com.endava.stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;


public class MyStepdefs {

    WebDriver webDriver;
    private WebElement owners;
    private WebElement addNewOwner;
    private WebElement firstName;
    private WebElement lastName;
    private WebElement address;
    private WebElement city;
    private WebElement phone;
    private WebElement addOwner;
    private WebElement vets;
    private WebElement addNewVet;
    private WebElement type;
    private WebElement saveVetButton;
    private WebElement allvets;
    private WebElement editVet;
    private WebElement specialties;
    private WebElement saveVetButton2;
    private WebElement addAll;
    private WebElement deleteVet;
    private WebElement pets;
    private WebElement addNewPet;
    private WebElement petName;
    private WebElement savePetButton;
    private WebElement editPet;
    private WebElement editPetType;
    private WebElement updatePetType;
    private WebElement deletePet;
    private WebElement spec;
    private WebElement addNewSpec;
    private WebElement specName;
    private WebElement saveSpecButton;
    private WebElement editSpec;
    private WebElement updateSpec;
    private WebElement saveButton2;
    private WebElement deleteSpec;


    @Given("^Go to Owners$")
    public void goToOwners()  {
        webDriver=new ChromeDriver();
        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        owners=webDriver.findElement(By.xpath("//a[text()[contains(.,'Owners')]]"));
        owners.click();
        addNewOwner=webDriver.findElement(By.xpath("//a[text()[contains(.,'Owners')]]//parent::li//span[text()[contains(.,'Add')]] "));
        addNewOwner.click();
    }


    @When("^Fill the blanks$")
    public void fillTheBlanks()  {
        owners = webDriver.findElement(By.xpath("//a[text()[contains(.,'Owners')]]"));
        owners.click();
        addNewOwner = webDriver.findElement(By.xpath("//a[text()[contains(.,'Owners')]]//parent::li//span[text()[contains(.,'Add')]]"));
        addNewOwner.click();
        firstName = webDriver.findElement(By.id("firstName"));
        firstName.sendKeys("Laurentiu");
        lastName = webDriver.findElement(By.id("lastName"));
        lastName.sendKeys("Bere");
        address = webDriver.findElement(By.id("address"));
        address.sendKeys("Rotaresti");
        city = webDriver.findElement(By.id("city"));
        city.sendKeys("Bascov");
        phone = webDriver.findElement((By.id("telephone")));
        phone.sendKeys("0756349215");

    }

    @Then("^Save the new owner$")
    public void saveTheNewOwner() {
        addOwner = webDriver.findElement(By.xpath("//html/body/app-root/app-owner-add/div/div/form/div[7]/div/button[2]"));
        addOwner.click();
    }

    @Given("^Go to Vets$")
    public void goToVets()  {
        webDriver=new ChromeDriver();
        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        vets = webDriver.findElement(By.xpath("//div[1]/nav/div/ul/li[3]/a"));
        vets.click();
        addNewVet = webDriver.findElement(By.xpath("//div[1]/nav/div/ul/li[3]/ul/li[2]/a/span[2]"));
        addNewVet.click();
    }

    @When("^Add a new vet$")
    public void addANewVet()  {
        firstName = webDriver.findElement(By.xpath("//*[@id=\"firstName\"]"));
        firstName.sendKeys("Laurentiu");
        lastName = webDriver.findElement(By.xpath("//*[@id=\"lastName\"]"));
        lastName.sendKeys("Bere");
        type = webDriver.findElement(By.id("specialties"));
        Select dropdown = new Select(webDriver.findElement(By.id("specialties")));
        dropdown.selectByIndex(1);
        saveVetButton = webDriver.findElement(By.xpath("//*[@id=\"vet\"]/div[5]/div/button[2]"));
        saveVetButton.click();
    }

    @And("^Edit one vet$")
    public void editOneVet() {
        vets = webDriver.findElement(By.xpath("//div[1]/nav/div/ul/li[3]/a"));
        vets.click();
        allvets = webDriver.findElement(By.xpath("//div/ul/li[3]/ul/li[1]/a"));
        allvets.click();
        editVet = webDriver.findElement(By.xpath("//td[text()[contains(.,'Laurentiu')]]/parent::tr/td/button[text()[contains(.,'Edit')]]"));
        editVet.click();
        specialties = webDriver.findElement(By.id("spec"));
        specialties.click();

        webDriver.findElement(By.xpath("//*[@id='mat-option-5']/mat-pseudo-checkbox")).click();
        saveVetButton2 = webDriver.findElement(By.xpath("//button[text()[contains(.,'Save')]]"));
        saveVetButton2.submit();
    }

    @Then("^Delete one vet$")
    public void deleteOneVet()  {
        webDriver=new ChromeDriver();
        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        vets = webDriver.findElement(By.xpath("//div[1]/nav/div/ul/li[3]/a"));
        vets.click();
        vets = webDriver.findElement(By.xpath("//div/ul/li[3]/ul/li[1]/a/span[2]"));
        vets.click();
        addAll = webDriver.findElement(By.xpath("//td[text()[contains(.,'Laurentiu')]]/parent::tr/td/button[text()[contains(.,'Delete')]]"));
        addAll.click();
        deleteVet = webDriver.findElement(By.xpath("//*[@id=\"vets\"]/tbody/tr[8]/td[3]/button[2]"));
        deleteVet.click();
    }


    @Given("^Add a new pet$")
    public void addANewPet() {
        webDriver=new ChromeDriver();
        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        pets=webDriver.findElement(By.xpath("//a[span][contains(.,'Pet Types')]"));
        pets.click();
        addNewPet = webDriver.findElement(By.xpath("//button[text()[contains(.,'Add')]]"));
        addNewPet.click();
        petName = webDriver.findElement(By.id("name"));
        petName.sendKeys("llllllllllllllllllllll");
        savePetButton = webDriver.findElement(By.xpath("//button[text()[contains(.,'Save')]]"));
        savePetButton.click();
    }

    @When("^Edit one pet$")
    public void editOnePet()  {
        webDriver=new ChromeDriver();
        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        pets = webDriver.findElement(By.xpath("//div[1]/nav/div/ul/li[4]/a"));
        pets.click();
        editPet = webDriver.findElement(By.xpath("//*[@id=\"pettypes\"]/tbody/tr[1]/td[2]/button[1]"));
        editPet.click();
        editPetType = webDriver.findElement(By.xpath("//*[@id=\"name\"]"));
        editPetType.clear();
        editPetType.clear();
        editPetType.sendKeys("ooooooooooooooo");
        updatePetType = webDriver.findElement(By.xpath("//*[@id=\"pettype\"]/div[2]/div/button[1]"));
        updatePetType.click();
    }

    @Then("^Delete the pet$")
    public void deleteThePet()  {
        webDriver=new ChromeDriver();
        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        pets = webDriver.findElement(By.xpath("//div[1]/nav/div/ul/li[4]/a"));
        pets.click();
        deletePet = webDriver.findElement(By.xpath("//*[@id=\"pettypes\"]/tbody/tr[1]/td[2]/button[2]"));
        deletePet.click();
    }

    @Given("^Add a new spec$")
    public void addANewSpec() {
        webDriver=new ChromeDriver();
        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        spec = webDriver.findElement(By.xpath("//a[span] [contains(.,'Specialties')]"));
        spec.click();
        addNewSpec=webDriver.findElement(By.xpath("//button[text()[contains(.,'Add')]]"));
        addNewSpec.click();
        specName = webDriver.findElement(By.id("name"));
        specName.sendKeys("dentist");
        saveSpecButton=webDriver.findElement(By.xpath("//button[text()[contains(.,'Save')]]"));
        saveSpecButton.click();
    }

    @When("^Edit one spec$")
    public void editOneSpec()  {
        spec = webDriver.findElement(By.xpath("//div[1]/nav/div/ul/li[5]/a"));
        spec.click();
        editSpec = webDriver.findElement(By.xpath("//*[@id=\"specialties\"]/tbody/tr[1]/td[2]/button[1]"));
        editSpec.click();
        updateSpec = webDriver.findElement(By.xpath("//*[@id=\"name\"]"));
        updateSpec.click();
        updateSpec.clear();
        updateSpec.sendKeys("dentisttttt999");
        saveButton2 = webDriver.findElement((By.xpath("//*[@id=\"specialty\"]/div[2]/div/button[1]")));
        saveButton2.click();
    }

    @Then("^Delete the spec$")
    public void deleteTheSpec()  {
        spec = webDriver.findElement(By.xpath("//div[1]/nav/div/ul/li[5]/a"));
        spec.click();
        deleteSpec = webDriver.findElement(By.xpath("//*[@id=\"specialties\"]/tbody/tr[1]/td[2]/button[2]"));
        deleteSpec.click();
    }
}