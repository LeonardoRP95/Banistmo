package com.prueba.steps;

import net.thucydides.core.annotations.Step;
import com.prueba.pageObject.AeroCivilObject;
import com.prueba.utils.Utilidades;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;

public class AerocivilStep {
    AeroCivilObject aeroCivilObject;
    Utilidades utilidades;

    @Step
    public void abrirWeb() {
        aeroCivilObject.open();
    }
    @Step
    public void ingresoALaOpcionTransparencia() throws InterruptedException {
        aeroCivilObject.getDriver().findElement(aeroCivilObject.getBtnTransparencia()).click();
    }
    public void seleccionoLaOpcionPresupuesto() throws InterruptedException {
        aeroCivilObject.getDriver().findElement(aeroCivilObject.getBtnPresupuesto()).click();
    }
    public void ingresoALaOpcionPlanDeAccion() throws InterruptedException {
        aeroCivilObject.getDriver().findElement(aeroCivilObject.getBtnPlanDeAccion()).click();
    }
    public void seleccionoLaOpcionPlanDeAccion() throws InterruptedException {
        aeroCivilObject.getDriver().findElement(aeroCivilObject.getBtnPlanDeAccion2()).click();
    }
    public void seleccionoElBotonModoLecturaDelDocumento() throws InterruptedException {
        aeroCivilObject.getDriver().findElement(aeroCivilObject.getBtnPresentacion()).click();
    }
    public void validoQueElPdfGeneradoSeaElCorrecto() throws Exception {
        String pdfUrl = aeroCivilObject.getDriver().getCurrentUrl();
        String fileName = Paths.get(new URI(pdfUrl).getPath()).getFileName().toString();
        Assert.assertEquals("Presentación a la Ciudadania.pdf",fileName);
    }

}
