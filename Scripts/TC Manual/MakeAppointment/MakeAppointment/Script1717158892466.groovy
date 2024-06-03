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

WebUI.waitForElementVisible(findTestObject('ObjSpy/HomePage/btn_Make Appointment'), 0)

WebUI.verifyElementVisible(findTestObject('ObjSpy/HomePage/div_CURA Healthcare Service                                Atlanta 550 Pharr Road NE Suite 525Atlanta, GA 30305                                     (678) 813-1KMS                     infokatalon.com'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ObjSpy/HomePage/title_CURA Healthcare Service'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('ObjSpy/HomePage/btn_menu-toggle'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjSpy/HomePage/btn_menu-toggle'))

WebUI.click(findTestObject('ObjSpy/MenuToogle/menu_Login'))

WebUI.waitForElementVisible(findTestObject('ObjSpy/LoginPage/input_Username'), 0)

WebUI.verifyElementVisible(findTestObject('ObjSpy/LoginPage/input_Password'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ObjSpy/LoginPage/btn_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ObjSpy/LoginPage/input_Username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('ObjSpy/LoginPage/input_Password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('ObjSpy/LoginPage/btn_Login'))

WebUI.waitForElementVisible(findTestObject('ObjSpy/Appoinment/lbl_ApplyForHospital'), 0)

WebUI.verifyElementVisible(findTestObject('ObjSpy/Appoinment/input_VisitDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ObjSpy/Appoinment/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ObjSpy/Appoinment/lbl_ApplyForHospital'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ObjSpy/Appoinment/btn_Book Appointment'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('ObjSpy/Appoinment/select_Tokyo CURA Healthcare Center                            Hongkong CURA Healthcare Center                            Seoul CURA Healthcare Center'), 
    'Hongkong CURA Healthcare Center', false)

WebUI.click(findTestObject('ObjSpy/Appoinment/lbl_ApplyForHospital'))

healthcare_program = 'Medicaid'

switch (healthcare_program) {
    case 'Medicare':
        //Select the Medicare
        WebUI.click(findTestObject('Object Repository/ObjSpy/Appointment/radio_Medicare'))

        break
    case 'Medicaid':
        //Select the Medicaid
        WebUI.click(findTestObject('Object Repository/ObjSpy/Appoinment/radio_Medicaid'))

        break
    default:
        WebUI.click(findTestObject('Object Repository/ObjSpy/Appointment/radio_None'))

        break
}

WebUI.click(findTestObject('ObjSpy/Appoinment/input_VisitDate'))

WebUI.click(findTestObject('ObjSpy/Appoinment/td_31'))

WebUI.setText(findTestObject('ObjSpy/Appoinment/textarea_Comment_comment'), 'Ini adalah Comment')

WebUI.click(findTestObject('ObjSpy/Appoinment/btn_Book Appointment'))

WebUI.waitForElementVisible(findTestObject('ObjSpy/Confirmation/h2_Appointment Confirmation'), 0)

WebUI.verifyElementVisible(findTestObject('ObjSpy/Confirmation/p_31052024'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ObjSpy/Confirmation/p_Medicaid'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('ObjSpy/Confirmation/a_Go to Homepage'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ObjSpy/Confirmation/a_Go to Homepage'))

WebUI.closeBrowser()

