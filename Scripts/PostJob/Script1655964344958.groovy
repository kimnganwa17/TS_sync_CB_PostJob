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

WebUI.navigateToUrl('http://admin.talentnetwork.vn/login')

WebUI.setText(findTestObject('Object Repository/PostJob/Page_Talent Solution Admin Tools/input__user'), 'qchannguyen')

WebUI.setEncryptedText(findTestObject('Object Repository/PostJob/Page_Talent Solution Admin Tools/input__pwd'), '4aUHZLRHJF4=')

WebUI.click(findTestObject('Object Repository/PostJob/Page_Talent Solution Admin Tools/input__submit'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Talent Solution Admin/a_Employers'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Talent Solution Admin/input_Keyword_chkSearchBy'))

WebUI.setText(findTestObject('Object Repository/PostJob/Page_Talent Solution Admin/input_(Emp Name, Emp Email, Onwer)_keyword'), 
    'demo')

WebUI.click(findTestObject('Object Repository/PostJob/Page_Talent Solution Admin/input_Implementer_btnSearch'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Talent Solution Admin/a_Login'))

WebUI.switchToWindowTitle('Chào mừng bạn đến với CareerBuilder Talent Network')

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/span_FAQ_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/a_Lp  Xut Tuyn Dng'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/span_Chn'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/li_Hn Nguyn HR (han.nguyenmail.careerbuilder.vn)'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/a_S Dng Vic Lm Mu C Sn Trong Th Vin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/select_To Mu Tuyn Dng                      _fad656'), 
    '461', true)

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/input_S Dng Vic Lm Mu C Sn Trong Th Vin_btn_9a003c'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/input__requiredate'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/span_Prev'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/span_Next'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/a_25'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/select_Chn                                 _0619c4'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/input_Chn Hnh nh_btnSubmit'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/span_Thao Tc'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/a_ng tuyn'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/input__job_expiredate'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/a_26'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/input_Talent Network_post_cb'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/input_Work from home_ui_btnCb'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/input_ng tuyn dng trong 30 ngy_c_pack'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/input'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/input_Ch ng_btnconfirm'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/a_Thng Bo_fancybox-close'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/span_FAQ_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Cho mng bn n vi CareerBuilder Talent Network/a_ng nhp CB.vn'))

WebUI.switchToWindowTitle('Tuyển dụng và tìm kiếm việc làm nhanh | CareerBuilder.vn')

WebUI.click(findTestObject('Object Repository/PostJob/Page_Tuyn dng v tm kim vic lm nhanh  Career_6cbee0/p_Danh Mc'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Tuyn dng v tm kim vic lm nhanh  Career_6cbee0/a_Qun L ng Tuyn'))

WebUI.click(findTestObject('Object Repository/PostJob/Page_Tuyn dng v tm kim vic lm nhanh  Career_6cbee0/a_Account Executive'))

WebUI.closeBrowser()

