package test;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import pages.SendMailPage;
import pages.TestQuizzPage;
import pages.YopPage;

public class TestsComplet extends BaseTests {

    @Test
    public void testCliquerBonQuizz(){
        var toolboxPage = homePage.cliquerSurToolbox();
        toolboxPage.ouvrirQuizz();
        getWindowsManager().switchToTab("Test ISTQB en ligne, niveau Fondation - Hightest");
    }

    @Test
    public void testRemplirQuizz(){
        var toolboxPage = homePage.cliquerSurToolbox();
        toolboxPage.ouvrirQuizz();
        getWindowsManager().switchToTab("Test ISTQB en ligne, niveau Fondation - Hightest");

        var testquizzPage = new TestQuizzPage(driver);
        assertEquals(testquizzPage.getTextLoad(),"Bienvenue dans ce test blanc ISTQB Foundation.","Le message d'accueil attendu n'est pas affiché.");
        assertEquals(testquizzPage.getTitleQuizz(),"Test ISTQB Foundation en ligne","Pas de titre");
        testquizzPage.checkAnswer();
    }

    @Test
    public void testInputMail(){
        var toolboxPage = homePage.cliquerSurToolbox();
        toolboxPage.ouvrirQuizz();
        getWindowsManager().switchToTab("Test ISTQB en ligne, niveau Fondation - Hightest");

        var testquizzPage = new TestQuizzPage(driver);
        assertEquals(testquizzPage.getTextLoad(),"Bienvenue dans ce test blanc ISTQB Foundation.","Le message d'accueil attendu n'est pas affiché.");
        assertEquals(testquizzPage.getTitleQuizz(),"Test ISTQB Foundation en ligne","Pas de titre");
        testquizzPage.checkAnswer();

        var testinputPage = new SendMailPage(driver);
        testinputPage.setMail("hightest@yopmail.com");
        testinputPage.clickBtn();
        assertEquals(testinputPage.getText(),"Parfait !","Pas de texte presnt");
    }

    @Test
    public void testYopMail(){
        var toolboxPage = homePage.cliquerSurToolbox();
        toolboxPage.ouvrirQuizz();
        getWindowsManager().switchToTab("Test ISTQB en ligne, niveau Fondation - Hightest");

        var testquizzPage = new TestQuizzPage(driver);
        assertEquals(testquizzPage.getTextLoad(),"Bienvenue dans ce test blanc ISTQB Foundation.","Le message d'accueil attendu n'est pas affiché.");
        assertEquals(testquizzPage.getTitleQuizz(),"Test ISTQB Foundation en ligne","Pas de titre");
        testquizzPage.checkAnswer();

        var testinputPage = new SendMailPage(driver);
        testinputPage.setMail("hightest@yopmail.com");
        testinputPage.clickBtn();
        assertEquals(testinputPage.getText(),"Parfait !","Pas de texte presnt");

        var testyopmail = new YopPage(driver);
        testyopmail.goToUrl("https://yopmail.com/");
        testyopmail.autoriserCookie();
        testyopmail.setMail("hightest");
        assertEquals(testyopmail.getHundread(),"Vous avez bien répondu à 20 question(s) sur 20, soit 100 % de réussite. Félicitations, vous avez obtenu le score maximal !","Mauvais texte");
    }
}
