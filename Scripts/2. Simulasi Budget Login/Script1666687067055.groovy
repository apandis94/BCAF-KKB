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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper as MobileElementCommonHelper
import io.appium.java_client.MobileElement as MobileElement
import java.awt.Robot as Robot

Robot robot = new Robot()

String baseDir = System.getProperty('user.dir')

Mobile.startExistingApplication('bcaf.crm.kkb.saleskit')

Mobile.tap(findTestObject('Simulasi Kredit Login/login/check_version_button - OK'), 5, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Simulasi Kredit Login/login/kkbsk-username-textbox'), '202020', 5, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Simulasi Kredit Login/login/kkbsk-password-textbox'), 'Mobile123+', 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Simulasi Kredit Login/login/kkbsk-login-button'), 5, FailureHandling.OPTIONAL)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/kkbsk-budget-login'), 0)

//start packet data
Mobile.tap(findTestObject('Simulasi Kredit Login/kkbsk-program-dropdown'), 0)

if (program == 'Reguler') {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    MobileElement reguler = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/android.widget.CheckedTextView - Reguler'), 
        10)

    reguler.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement giias = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/android.widget.CheckedTextView - GIIAS 2021'), 
        10)

    giias.click()
}

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit Login/kkbsk-jenispembiayaan-dropdown'), 0)

if (jenis_pembiayaan == 'Mobil Baru') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement newcar = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/kkbsk-pembiayaan-dropdownlist-newcar'), 
        10)

    newcar.click()
} else if (jenis_pembiayaan == 'Mobil Bekas') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement usedcar = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/kkbsk-budget-Mobil Bekas'), 
        10)

    usedcar.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement refinancing = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/kkbsk-pembiayaan-dropdownlist-refinancing'), 
        10)

    refinancing.click()
}

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/kkbsk-budget-dropdown'), 0)

if (budget == 'dp') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement dp = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/android.widget.CheckedTextView - Total DP'), 
        10)

    dp.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement angsuran = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/android.widget.CheckedTextView - Angsuran'), 
        10)

    angsuran.click()
}

Mobile.setText(findTestObject('Object Repository/Simulasi Budget Login/kkbsk-budget-textbox'), nominal_budget, 0)

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/kkbsk-tipekons-dropdown'), 0)

if (tipe_kons == 'Perorangan') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement individu = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/android.widget.CheckedTextView - Perorangan'), 
        10)

    individu.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement corporate = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/android.widget.CheckedTextView - Badan Usaha'), 
        10)

    corporate.click()
}

if (npwp == 'ya') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement npwp_y = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/kkbsk-npwp-ya-radiobutton'), 
        10)

    npwp_y.click()
} else {
    MobileElement npwp_n = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/kkbsk-npwp-tidak-radiobutton'), 
        10)

    npwp_n.click()
}

KeywordUtil.logInfo((('capture paket data 1 matriks ' + matriks) + ' tenor : ') + tenor)

Mobile.takeScreenshotAsCheckpoint((((((baseDir + GlobalVariable.sspath_simulasi_kredit) + 'capture paket data 1 matriks =') + 
    matriks) + ' tenor = ') + tenor) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1200, 0, 400)

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/kkbsk-cluster-dropdown'), 0)

if (cluster == 'Solitare') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement s = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/android.widget.CheckedTextView - Solitaire'), 
        10)

    s.click()
} else if (cluster == 'A') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement a = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/dropdownlist/kkbsk-cluster-dropdownlist-A'), 
        10)

    a.click()
} else if (cluster == 'B') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement b = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/android.widget.CheckedTextView - B'), 
        10)

    b.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement mass = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/dropdownlist/kkbsk-cluster-dropdownlist-MASS'), 
        10)

    mass.click()
}

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/kkbsk-purpose-dropdown'), 0)

if (purpose == 'Produktif') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement produktif = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/android.widget.CheckedTextView - Produktif'), 
        10)

    produktif.click()
} else {
    MobileElement nonproduktif = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/android.widget.CheckedTextView - Non Produktif'), 
        10)

    nonproduktif.click()
}

KeywordUtil.logInfo((('capture paket data 2 matriks ' + matriks) + ' tenor : ') + tenor)

Mobile.takeScreenshotAsCheckpoint((((((baseDir + GlobalVariable.sspath_simulasi_budget) + 'capture paket data 2 matriks = ') + 
    matriks) + ' tenor = ') + tenor) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/kkbsk-lanjut-button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

//start loan data
Mobile.setText(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-otr-textbox'), otr, 0)

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-jeniskendaraan-dropdown'), 0)

if (jenis_kendaraan == 'Passenger') {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    MobileElement passenger = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/android.widget.CheckedTextView - Passenger'), 
        10)

    passenger.click()
} else if (jenis_kendaraan == 'Pick Up') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement pickup = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/android.widget.CheckedTextView - Commercial Truck'), 
        10)

    pickup.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement truck = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/android.widget.CheckedTextView - Commercial Truck'), 
        10)

    truck.click()
}

Mobile.setText(findTestObject('Object Repository/Simulasi Budget Login/kkbsk-tahunkendaraan-textbox'), year, 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-wilayah-dropdown'), 0)

if (wilayah == 'sumatera') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement sumatera = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/android.widget.CheckedTextView - Sumatra dan Sekitarnya'), 
        10)

    sumatera.click()
} else if (wilayah == 'jawa') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement jawa = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/android.widget.CheckedTextView - Jakarta, Jawa Barat dan Banten'), 
        10)

    jawa.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement lain = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/android.widget.CheckedTextView - Lain-lainnya'), 
        10)

    lain.click()
}

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-asuransi-dropdown'), 0)

if (asuransi == 'Comprehensive') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement compre = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/android.widget.CheckedTextView - Comprehensive'), 
        10)

    compre.click()
} else if (asuransi == 'Combine') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement combine = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/android.widget.CheckedTextView - Combine'), 
        10)

    combine.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement tlo = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/android.widget.CheckedTextView - TLO'), 
        10)

    tlo.click()
}

//perluasan
if ((Mobile.verifyElementNotChecked(findTestObject('Simulasi Budget Login/loan data/budget-perluasan-RSCC-checkbox'), 0, 
    FailureHandling.OPTIONAL) == true) && (rscc == '1')) {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement rscc = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-perluasan-RSCC-checkbox'), 
        10)

    rscc.click()
} else if (rscc == '0') {
    Mobile.uncheckElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-perluasan-RSCC-checkbox'), 
        0)
}

if ((Mobile.verifyElementNotChecked(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-perluasan-RSMB-checkbox'), 
    0, FailureHandling.OPTIONAL) == true) && (rsmb == '1')) {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement rsmb = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-perluasan-RSMB-checkbox'), 
        10)

    rsmb.click()
} else if (rsmb == '0') {
    Mobile.uncheckElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-perluasan-RSMB-checkbox'), 
        0)
}

if ((Mobile.verifyElementNotChecked(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-perluasan-TJH 10 JT-checkbox'), 
    0, FailureHandling.OPTIONAL) == true) && (tjh == '10')) {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement tjh = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-perluasan-TJH 10 JT-checkbox'), 
        10)

    tjh.click()

    Mobile.uncheckElement(findTestObject('Simulasi Budget Login/loan data/budget-perluasan-TJH 25 JT-checkbox'), 0)

    Mobile.uncheckElement(findTestObject('Simulasi Budget Login/loan data/budget-perluasan-TJH 50 JT-checkbox'), 0)
} else if ((Mobile.verifyElementNotChecked(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-perluasan-TJH 25 JT-checkbox'), 
    0, FailureHandling.OPTIONAL) == true) && (tjh == '25')) {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement tjh = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-perluasan-TJH 25 JT-checkbox'), 
        10)

    tjh.click()

    Mobile.uncheckElement(findTestObject('Simulasi Budget Login/loan data/budget-perluasan-TJH 10 JT-checkbox'), 0)

    Mobile.uncheckElement(findTestObject('Simulasi Budget Login/loan data/budget-perluasan-TJH 50 JT-checkbox'), 0)
} else if ((Mobile.verifyElementNotChecked(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-perluasan-TJH 50 JT-checkbox'), 
    0, FailureHandling.OPTIONAL) == true) && (tjh == '50')) {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement tjh = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-perluasan-TJH 50 JT-checkbox'), 
        10)

    tjh.click()

    Mobile.uncheckElement(findTestObject('Simulasi Budget Login/loan data/budget-perluasan-TJH 10 JT-checkbox'), 0)

    Mobile.uncheckElement(findTestObject('Simulasi Budget Login/loan data/budget-perluasan-TJH 25 JT-checkbox'), 0)
} else if (tjh == '0') {
    Mobile.uncheckElement(findTestObject('Simulasi Budget Login/loan data/budget-perluasan-TJH 10 JT-checkbox'), 0)

    Mobile.uncheckElement(findTestObject('Simulasi Budget Login/loan data/budget-perluasan-TJH 25 JT-checkbox'), 0)

    Mobile.uncheckElement(findTestObject('Simulasi Budget Login/loan data/budget-perluasan-TJH 50 JT-checkbox'), 0)
}

KeywordUtil.logInfo((('capture loan data matriks : ' + matriks) + ' tenor : ') + tenor)

Mobile.takeScreenshotAsCheckpoint((((((baseDir + GlobalVariable.sspath_simulasi_budget) + 'capture loan data matriks ') + 
    matriks) + ' tenor = ') + tenor) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-kalkulasi-button'), 0)

if (komponen == 'ADDM') {
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    MobileElement addm = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/test/kkb-addm-button'), 
        10)

    addm.click()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    KeywordUtil.logInfo('hasil simulasi addm matriks : ' + matriks)

    Mobile.takeScreenshotAsCheckpoint((((((baseDir + GlobalVariable.sspath_simulasi_budget) + 'hasil simulasi addm matriks ') + 
        matriks) + ' tenor = ') + tenor) + '.png', FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    MobileElement addb = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/test/kkb-addb-button'), 
        10)

    addb.click()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    KeywordUtil.logInfo((('hasil simulasi ' + komponen) + 'matriks : ') + matriks)

    Mobile.takeScreenshotAsCheckpoint((((((baseDir + GlobalVariable.sspath_simulasi_kredit) + 'hasil simulasi ') + komponen) + 
        'matriks = ') + matriks) + '.png', FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/loan data/budget-login-download-button'), 0)

Mobile.tap(findTestObject('Object Repository/Simulasi Budget Login/loan data/android.widget.Button - Simulasi Detail'), 
    0, FailureHandling.OPTIONAL)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

KeywordUtil.logInfo((('hasil pdf simulasi ' + komponen) + 'matriks : ') + matriks)

Mobile.takeScreenshotAsCheckpoint((((((baseDir + GlobalVariable.sspath_simulasi_kredit) + 'hasil pdf simulasi matriks = ') + 
    matriks) + ' tenor = ') + tenor) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit Login/test/android-burger-menu'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Simulasi Kredit Login/test/android-download-pdf'), 0, FailureHandling.OPTIONAL)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

