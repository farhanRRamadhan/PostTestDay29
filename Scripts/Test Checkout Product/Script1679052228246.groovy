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

WebUI.click(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'))

WebUI.click(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'))

WebUI.setText(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company'), 
    'test')

WebUI.click(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/span_India'))

WebUI.setText(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 
    'medan')

WebUI.setText(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_address_2'), 
    'rumah')

WebUI.setText(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 
    'city')

WebUI.click(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/span_Select an option'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), 
    '1234')

WebUI.setText(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), 
    '08978775879808')

WebUI.setText(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/textarea_(optional)_order_comments'), 
    '-')

WebUI.click(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.click(findTestObject('Object Repository/Checkout Order PO/Page_Checkout  ToolsQA Demo Site/div_Thank you. Your order has been received_591085'))

WebUI.closeBrowser()

