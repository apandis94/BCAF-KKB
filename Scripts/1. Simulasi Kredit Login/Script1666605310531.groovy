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
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper as MobileElementCommonHelper
import io.appium.java_client.MobileElement as MobileElement

String baseDir = System.getProperty('user.dir')

Mobile.startExistingApplication('bcaf.crm.kkb.saleskit')

Mobile.tap(findTestObject('Simulasi Kredit Login/login/check_version_button - OK'), 5, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Simulasi Kredit Login/login/kkbsk-username-textbox'), '232323', 5, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Simulasi Kredit Login/login/kkbsk-password-textbox'), 'Mobile123+', 5, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Simulasi Kredit Login/login/kkbsk-login-button'), 5, FailureHandling.OPTIONAL)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit Login/kkbsk-simulasi kredit login-button'), 0)

//start cust data
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

    MobileElement usedcar = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/kkbsk-pembiayaan-dropdownlist-usedcar'), 
        10)

    usedcar.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement refinancing = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/kkbsk-pembiayaan-dropdownlist-refinancing'), 
        10)

    refinancing.click()
}

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit Login/kkbsk-tipekons-dropdown'), 0)

if (tipe_kons == 'Perorangan') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement individu = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/kkbsk-tipekons-dropdownlist-perorangan'), 
        10)

    individu.click()
} else {
    MobileElement corporate = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/kkbsk-tipekons-dropdownlist-badanusaha'), 
        10)

    corporate.click()
}

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

if (npwp == 'ya') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement npwp_y = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/kkbsk-npwp-yes-radiotbutton'), 
        10)

    npwp_y.click()
} else {
    MobileElement npwp_n = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/kkbsk-npwp-no-radiobutton'), 
        10)

    npwp_n.click()
}

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Simulasi Kredit Login/kkbsk-cluster-dropdown'), 0)

if (cluster == 'Solitare') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement newcar = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/android.widget.CheckedTextView - Solitaire'), 
        10)

    newcar.click()
} else if (cluster == 'A') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement usedcar = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/dropdownlist/kkbsk-cluster-dropdownlist-A'), 
        10)

    usedcar.click()
} else if (cluster == 'B') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement refinancing = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Budget Login/android.widget.CheckedTextView - B'), 
        10)

    refinancing.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement mass = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/dropdownlist/kkbsk-cluster-dropdownlist-MASS'), 
        10)

    mass.click()
}

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit Login/test/kkbsk-tujuanpenggunaan-dropdown'), 0)

if (purpose == 'Produktif') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement produktif = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/kkbsk-tujuan-dropdownlist-produktif'), 
        10)

    produktif.click()
} else {
    MobileElement nonproduktif = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/kkbsk-tujuan-dropdownlist-non'), 
        10)

    nonproduktif.click()
}

Mobile.takeScreenshotAsCheckpoint((((baseDir + GlobalVariable.sspath_simulasi_kredit) + 'capture packet data matriks ') + 
    matriks) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit Login/kkbsk-lanjut-button'), 0)

//start loan data
Mobile.setText(findTestObject('Simulasi Kredit Login/kkbsk-otr-textbox'), otr, 0)

Mobile.setText(findTestObject('Simulasi Kredit Login/kkbsk-dppersen-textbox'), dp, 0)

Mobile.tap(findTestObject('Simulasi Kredit Login/kkbsk-jeniskendaraan-dropdown'), 0)

if (jenis_kendaraan == 'Passenger') {
    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    MobileElement passenger = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/android.widget.CheckedTextView - Passenger (1)'), 
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

Mobile.tap(findTestObject('Simulasi Kredit Login/kkbsk-wilayah-dropdown'), 0)

if (wilayah == 'sumatera') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement sumatera = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/dropdownlist/kkbsk-wilayah-dropdownlist-Sumatera dan Sekitarnya'), 
        10)

    sumatera.click()
} else if (wilayah == 'jawa') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement jawa = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/dropdownlist/kkbsk-wilayah-dropdownlist-Jakarta, Jawa Barat dan Banten'), 
        10)

    jawa.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement lain = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/dropdownlist/kkbsk-wilayah-dropdownlist-Lain-lainnya'), 
        10)

    lain.click()
}

Mobile.tap(findTestObject('Simulasi Kredit Login/kkbsk-asuransi-dropdown'), 0)

if (asuransi == 'Comprehensive') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement compre = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/dropdownlist/kkbsk-asuransi-dropdownlist-Comprehensive'), 
        10)

    compre.click()
} else if (asuransi == 'Combine') {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement combine = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/dropdownlist/kkbsk-asuransi-dropdownlist-Combine'), 
        10)

    combine.click()
} else {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement tlo = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/dropdownlist/kkbsk-asuransi-dropdownlist-TLO'), 
        10)

    tlo.click()
}

if ((Mobile.verifyElementNotChecked(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - RSCC'), 0, FailureHandling.OPTIONAL) == 
true) && (rscc == '1')) {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement rscc = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - RSCC'), 
        10)

    rscc.click()
}
else {
	Mobile.uncheckElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - RSCC'), 0)
}

if ((Mobile.verifyElementNotChecked(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - RSMB'), 0, FailureHandling.OPTIONAL) == 
true) && (rsmb == '1')) {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement rscc = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - RSMB'), 
        10)

    rscc.click()
}
else {
	Mobile.uncheckElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - RSMB'), 0)
}

if ((Mobile.verifyElementNotChecked(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 10 JT'), 0, FailureHandling.OPTIONAL) == 
true) && (tjh == '10')) {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement tjh = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 10 JT'), 
        10)

    tjh.click()
	
	Mobile.uncheckElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 25 JT'), 0)
	
	Mobile.uncheckElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 50 JT'), 0)
} else if ((Mobile.verifyElementNotChecked(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 25 JT'), 0, FailureHandling.OPTIONAL) == 
true) && (tjh == '25'))  {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement tjh = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 25 JT'), 
        10)

    tjh.click()
	
	Mobile.uncheckElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 10 JT'), 0)
	
	Mobile.uncheckElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 50 JT'), 0)
	
} else if ((Mobile.verifyElementNotChecked(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 50 JT'), 0, FailureHandling.OPTIONAL) == 
true) && (tjh == '50')) {
    Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

    MobileElement tjh = MobileElementCommonHelper.findElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 50 JT'), 
        10)

    tjh.click()
	
	Mobile.uncheckElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 10 JT'), 0)
	
	Mobile.uncheckElement(findTestObject('Object Repository/Simulasi Kredit Login/test/perluasan/android.widget.CheckBox - TJH 25 JT'), 0)
}

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint((((baseDir + GlobalVariable.sspath_simulasi_kredit) + 'capture loan data matriks ') + 
    matriks) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Simulasi Kredit Login/kkbsk-kalkulasi-button'), 0)

if (komponen == 'ADDM') {
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    MobileElement addm = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/test/kkb-addm-button'), 
        10)

    addm.click()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshotAsCheckpoint((((baseDir + GlobalVariable.sspath_simulasi_kredit) + 'hasil simulasi addm matriks ') + 
        matriks) + '.png', FailureHandling.STOP_ON_FAILURE)
} else {
    Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

    MobileElement addb = MobileElementCommonHelper.findElement(findTestObject('Simulasi Kredit Login/test/kkb-addb-button'), 
        10)

    addb.click()

    Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

    Mobile.takeScreenshotAsCheckpoint((((baseDir + GlobalVariable.sspath_simulasi_kredit) + 'hasil simulasi addb matriks ') + 
        matriks) + '.png', FailureHandling.STOP_ON_FAILURE)
}

Mobile.tap(findTestObject('Simulasi Kredit Login/test/kkb-download-simulasi-button'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint((((baseDir + GlobalVariable.sspath_simulasi_kredit) + 'hasil pdf simulasi matriks ') + 
    matriks) + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit Login/test/android-burger-menu'), 0)

Mobile.tap(findTestObject('Simulasi Kredit Login/test/android-download-pdf'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

