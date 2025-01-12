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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://olm.vn/')

WebUI.click(findTestObject('Object Repository/Page_Nn tng gio dc s OLM Hc trc tuyn thng minh/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/Page_ng nhp/input_ng nhp_username'), '12a10_phanthanhviet')

WebUI.setText(findTestObject('Object Repository/Page_ng nhp/input_ng nhp_password'), 'Vietba"123')

WebUI.click(findTestObject('Object Repository/Page_ng nhp/button_ng nhp'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Hc bi/span_PT'))

WebUI.click(findTestObject('Object Repository/Page_Hc bi/a_Thng tin'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - Phan Thanh Vit/button_Mt khu_btn btn-outline-primary p-0 px-2'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Thng tin ti khon - Phan Thanh Vit/input_Mt khu c_old-password'), 
    '+BDy0RBYkzsK2z7LKQ/q6g==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Thng tin ti khon - Phan Thanh Vit/input_Mt khu mi_password'), 
    '+BDy0RBYkzsK2z7LKQ/q6g==')

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - Phan Thanh Vit/div_Mt khu c                               _6e015a'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - Phan Thanh Vit/button_Xc nhn'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Thng tin ti khon - Phan Thanh Vit/div_Mt khu c khng chnh xc'), 
    'Mật khẩu cũ không chính xác')

