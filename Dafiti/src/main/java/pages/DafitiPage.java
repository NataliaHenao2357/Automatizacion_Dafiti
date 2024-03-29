package pages;

import org.openqa.selenium.By;

public class DafitiPage {
	
	private static By txtBuscadorProducto = By.xpath("//input[@id='searchInput']");
	private static By LupaBuscadorProducto = By.xpath("//button[@class='icon-magnifier searchButton sel-search-button']");
	private static By ImagenBusquedaPto;
	private static By Lblresultadoproducto;
	
	
	public static By getImagenBusquedaPto() {
		return ImagenBusquedaPto;
	}
	
	public static void setImagenBusquedaPto(String producto) {
		DafitiPage.ImagenBusquedaPto = By.xpath("//a[contains(@title,'"+producto+"')]");
	}
	
	public static By getLblresultadoproducto() {
		return Lblresultadoproducto;
	}
	
	public static void setLblresultadoproducto(String producto) {
		DafitiPage.Lblresultadoproducto = By.xpath("//h3[contains(text(),'"+producto+"')]");
	}
	
	
		public static By getTxtBuscadorProducto() {
		return txtBuscadorProducto;
	}

	public static By getLupaBuscadorProducto() {
		return LupaBuscadorProducto;
	}
	
	
}
