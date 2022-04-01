import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys

WebUI.waitForElementVisible(findTestObject('Page_Login/a_register'), GlobalVariable.G_Timeout)

WebUI.click(findTestObject('Page_Login/a_register'))

WebUI.waitForElementVisible(findTestObject('Page_Register_Account_Type/div_Funder'), GlobalVariable.G_Timeout)

WebUI.click(findTestObject('Page_Register_Account_Type/div_Funder'))

WebUI.waitForElementVisible(findTestObject('Page_Register_Form/input_name'), GlobalVariable.G_Timeout)

String randomString = RandomStringUtils.randomAlphabetic(5)

String generatedName = 'SDET ' + randomString

Integer time = new Date().getTime()

String generatedEmail = ('SDET' + time) + '@alamisharia.co.id'

String generatedPhone = '08' + time

WebUI.setText(findTestObject('Page_Register_Form/input_name'), generatedName)

WebUI.setText(findTestObject('Page_Register_Form/input_email'), generatedEmail)

WebUI.setText(findTestObject('Page_Register_Form/input_phone'), generatedPhone)

WebUI.setText(findTestObject('Page_Register_Form/input_password'), 'Alami,1,2,3!')

WebUI.click(findTestObject('Page_Register_Form/label_Individual'))

WebUI.selectOptionByValue(findTestObject('Page_Register_Form/select_channel'), '1', true)

WebUI.scrollToElement(findTestObject('Page_Register_Form/button_Lanjutkan'), GlobalVariable.G_Timeout)

WebUI.click(findTestObject('Page_Register_Form/button_Lanjutkan'))

WebUI.waitForElementVisible(findTestObject('Page_Register_Form/div_scrollWrapper'), GlobalVariable.G_Timeout)

WebUI.scrollToElement(findTestObject('Page_Register_Form/p_End of scroll wrapper'), 
    GlobalVariable.G_Timeout)

WebUI.click(findTestObject('Page_Register_Form/input_Alami Info'))

WebUI.click(findTestObject('Page_Register_Form/input_Alami Agreement'))

WebUI.click(findTestObject('Page_Register_Form/button_Lanjutkan Page 2'))

