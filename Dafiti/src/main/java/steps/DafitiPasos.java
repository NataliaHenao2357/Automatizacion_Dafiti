package steps;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.openqa.selenium.By;
import driver.SeleniumWebDriver;
import pages.DafitiPage;
import utils.Excel;

public class DafitiPasos {
	
	private static ArrayList<Map<String, String>> LecturaExcel = new ArrayList<Map<String, String>>();
	
	public void EscribirTexto(By elemento,String Texto) {
		   boolean validarElemento = false;
	        while (validarElemento == false) {
	            try {
	                SeleniumWebDriver.driver.findElement(elemento).sendKeys(Texto);
	                validarElemento = true;
	            } catch (Exception e) {

	            }
	     }
	
	}
    public void clicEnElemento(By elemento) {
        boolean validarElemento = false;
        while (validarElemento == false) {
            try {
                SeleniumWebDriver.driver.findElement(elemento).click();
                validarElemento = true;
            } catch (Exception e) {

            }
        }
    }
	
    public String obtenerTextoDeElemento(By elemento) {
        boolean validarElemento = false;
        String textElemento = "";
        while (validarElemento == false) {
            try {
                textElemento = SeleniumWebDriver.driver.findElement(elemento).getText();
                validarElemento = true;
            } catch (Exception e) {

            }
        }
        return textElemento;
    }
	
    public void validarTextoEnPantalla(By elemento, String texto) {
        boolean validarTexto = false;
        if(obtenerTextoDeElemento(elemento).contains(texto)) {
            validarTexto = true;
        }
        assertEquals(true, validarTexto);
    }
		
    public void buscarPalabraEnDafiti () {
        try {
         LecturaExcel = Excel.readExcel("C:\\Users\\Juan Andres\\Desktop\\Eclipe Work\\Productos.xlsx","Hoja1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < LecturaExcel.size(); i++) {         	
            EscribirTexto(DafitiPage.getTxtBuscadorProducto(), LecturaExcel.get(i).get("Producto"));
            clicEnElemento(DafitiPage.getLupaBuscadorProducto());           
            DafitiPage.setImagenBusquedaPto(LecturaExcel.get(i).get("Producto"));          
            clicEnElemento(DafitiPage.getImagenBusquedaPto());
            DafitiPage.setLblresultadoproducto(LecturaExcel.get(i).get("Producto"));
            validarTextoEnPantalla(DafitiPage.getLblresultadoproducto(), LecturaExcel.get(i).get("Producto"));
        }
    }
}
