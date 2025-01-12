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

WebUI.sendKeys(findTestObject('Object Repository/Page_ng nhp/input_ng nhp_password'), Keys.chord(Keys.ENTER))

WebUI.mouseOver(findTestObject('Object Repository/Page_Hc bi/span_PT'))

WebUI.click(findTestObject('Object Repository/Page_Hc bi/a_Thng tin'))

WebUI.click(findTestObject('Object Repository/Page_Thng tin ti khon - Phan Thanh Vit/span_Ci t ti khon'))

WebUI.click(findTestObject('Object Repository/Page_Ci t ti khon - Phan Thanh Vit/span_Huyn Khoi Chu_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Page_Ci t ti khon - Phan Thanh Vit/input_concat(id(, , select2-z92l-container,_c9466c'), 
    'Phù cừ')

WebUI.sendKeys(findTestObject('Object Repository/Page_Ci t ti khon - Phan Thanh Vit/input_concat(id(, , select2-z92l-container,_c9466c'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyTextPresent('Cập nhật quận/huyện thành công', false)

WebUI.verifyTextPresent('Vui lòng chọn giá trị', false)

WebUI.closeBrowser()

