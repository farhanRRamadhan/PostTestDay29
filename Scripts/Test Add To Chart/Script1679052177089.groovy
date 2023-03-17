import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Add to Chart/Page_My Account  ToolsQA Demo Site/img_Checkout_custom-logo'))

WebUI.click(findTestObject('Object Repository/Add to Chart/Page_ToolsQA Demo Site  ToolsQA  Demo E-Com_8f3fb4/a_playboy x missguided plus size grey lips _adf89a'))

WebUI.scrollToElement(findTestObject('Add to Chart/Page_playboy x missguided plus size grey li_ba0ff0/select_Choose an optionGrey'), 
    2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add to Chart/Page_playboy x missguided plus size grey li_ba0ff0/select_Choose an optionGrey'), 
    'grey', true)

WebUI.selectOptionByIndex(findTestObject('Object Repository/Add to Chart/Page_playboy x missguided plus size grey li_ba0ff0/select_Choose an option404244'), 
    '2', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Add to Chart/Page_playboy x missguided plus size grey li_ba0ff0/i_QTY_icon_plus'))

WebUI.click(findTestObject('Object Repository/Add to Chart/Page_playboy x missguided plus size grey li_ba0ff0/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Add to Chart/Page_playboy x missguided plus size grey li_ba0ff0/a_View cart'))

WebUI.click(findTestObject('Object Repository/Page_Cart  ToolsQA Demo Site/h1_Cart'))

WebUI.scrollToElement(findTestObject('Add to Chart/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'), 0)

WebUI.click(findTestObject('Object Repository/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Checkout Order PO/Page_Checkout  ToolsQA Demo Site/div_Checkout                               _f12647'))

