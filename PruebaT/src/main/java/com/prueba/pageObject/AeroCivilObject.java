package com.prueba.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.aerocivil.gov.co/")

public class AeroCivilObject extends PageObject {
    By btnTransparencia = By.xpath("(//span[contains(text(),'Transparencia')])[1]");
    By btnPresupuesto = By.xpath("//*[contains(text(),'4. Planeación, Presupuesto e Informes')]");
    By btnPlanDeAccion = By.xpath("//*[contains(text(),'4.3 Plan de  Acción')]");
    By btnPlanDeAccion2 = By.xpath("(//div[@class='ms-rtestate-field'])[2]");
    By btnPresentacion = By.xpath("//*[contains(text(),'PRESENTACIÓN A LA CIUDADANÍA')]");
    By shadowHost = By.cssSelector("#viewer");
    By txtTitle = By.cssSelector("head > title");

    public By getShadowHost() {
        return shadowHost;
    }

    public By getTxtTitle() {
        return txtTitle;
    }

    public By getBtnTransparencia() {
        return btnTransparencia;
    }

    public By getBtnPresupuesto() {
        return btnPresupuesto;
    }

    public By getBtnPlanDeAccion() {
        return btnPlanDeAccion;
    }

    public By getBtnPlanDeAccion2() {
        return btnPlanDeAccion2;
    }

    public By getBtnPresentacion() {
        return btnPresentacion;
    }
}
