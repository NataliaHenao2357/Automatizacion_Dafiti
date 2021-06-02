package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.DafitiPasos;


public class BuscadorDafitiStepDefinitions {
	
@Steps
DafitiPasos dafitiPasos = new DafitiPasos();
	

@Given("^El usuario ingresa a la pagina de Dafiti$")
public void elUsuarioIngresaALaPaginaDeDafiti() {
    SeleniumWebDriver.ChromeWebDriver("https://www.dafiti.com.co/");
   
}

@When("^Cuando busca el producto$")
public void cuandoBuscaElProducto() {
	try {		
		Thread.sleep(5000);
		dafitiPasos.buscarPalabraEnDafiti();
      
        }catch (InterruptedException e) {
}
	
   
}

@Then("^podra ver la informacion de este$")
public void podraVerLaInformacionDeEste() {
 SeleniumWebDriver.driver.quit();
  
}


}
