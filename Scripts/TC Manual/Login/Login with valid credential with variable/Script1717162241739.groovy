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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('ObjSpy/HomePage/btn_menu-toggle'))

WebUI.click(findTestObject('ObjSpy/MenuToogle/menu_Login'))

WebUI.waitForElementVisible(findTestObject('ObjSpy/LoginPage/input_Username'), 0)

WebUI.verifyElementVisible(findTestObject('ObjSpy/LoginPage/btn_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ObjSpy/LoginPage/input_Username'), username)

WebUI.setEncryptedText(findTestObject('ObjSpy/LoginPage/input_Password'), password)

WebUI.click(findTestObject('ObjSpy/LoginPage/btn_Login'))

WebUI.verifyElementVisible(findTestObject('ObjSpy/Appoinment/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 
    FailureHandling.STOP_ON_FAILURE)

