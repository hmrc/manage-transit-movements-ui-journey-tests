#!/bin/bash

# Run BrowserStackLocal
if ! sh run_dependencies.sh; then
    echo "Failed to start BrowserStack"
    exit 1
fi

. ./src/test/resources/browserStackConfig.properties
        browserStackUsername
        browserStackAutomateKey

#Windows These 6 tests pass
#sbt  -Dbrowserstack.os="Windows" -Dbrowserstack.osVersion="11" -Dbrowserstack.browser="Edge" -Dbrowserstack.browserVersion="latest" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="Windows" -Dbrowserstack.osVersion="11" -Dbrowserstack.browser="Edge" -Dbrowserstack.browserVersion="108" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="Windows" -Dbrowserstack.osVersion="11" -Dbrowserstack.browser="Chrome" -Dbrowserstack.browserVersion="latest" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="Windows" -Dbrowserstack.osVersion="11" -Dbrowserstack.browser="Chrome" -Dbrowserstack.browserVersion="108" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="Windows" -Dbrowserstack.osVersion="11" -Dbrowserstack.browser="Firefox" -Dbrowserstack.browserVersion="latest" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="Windows" -Dbrowserstack.osVersion="11" -Dbrowserstack.browser="Firefox" -Dbrowserstack.browserVersion="108" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'

#Mac OS X
#These 2 tests pass if you run them in staging or use "http://bs-local.com:10120/manage-transit-movements/departures/local-reference-number" locally
#sbt  -Dbrowserstack.os="OS X" -Dbrowserstack.osVersion="Ventura" -Dbrowserstack.browser="Safari" -Dbrowserstack.browserVersion="latest" -Dbrowser="browserstack" -Denvironment=staging -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} -Dbrowserstack.consoleLogs=error -Dbrowserstack.autoWait=120 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="OS X" -Dbrowserstack.osVersion="Monterey" -Dbrowserstack.browser="Safari" -Dbrowserstack.browserVersion="15" -Dbrowser="browserstack" -Denvironment=staging -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#TThese 2 tests pass
#sbt  -Dbrowserstack.os="OS X" -Dbrowserstack.osVersion="Ventura" -Dbrowserstack.browser="Chrome" -Dbrowserstack.browserVersion="latest" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="OS X" -Dbrowserstack.osVersion="Ventura" -Dbrowserstack.browser="Chrome" -Dbrowserstack.browserVersion="108" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#These 2 tests pass
#sbt  -Dbrowserstack.os="OS X" -Dbrowserstack.osVersion="Ventura" -Dbrowserstack.browser="Firefox" -Dbrowserstack.browserVersion="latest" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="OS X" -Dbrowserstack.osVersion="Ventura" -Dbrowserstack.browser="Firefox" -Dbrowserstack.browserVersion="108" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'

#iOS
#These 2 tests run if you use staging or use "http://bs-local.com:10120/manage-transit-movements/departures/local-reference-number" locally
#These 2 tests fails to recognise the page title and cannot get off the Auth page
#sbt  -Dbrowserstack.os="iOS" -Dbrowserstack.osVersion="16.0" -Dbrowserstack.deviceName="iPhone 14 Pro" -Dbrowserstack.browser="Safari" -Dbrowserstack.browserVersion="latest" -Dbrowserstack.realMobile="true" -Dbrowser="browserstack" -Denvironment=staging -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="iOS" -Dbrowserstack.osVersion="15.0" -Dbrowserstack.deviceName="iPhone XS" -Dbrowserstack.browser="Safari" -Dbrowserstack.browserVersion="15" -Dbrowserstack.realMobile="true" -Dbrowser="browserstack" -Denvironment=staging -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#These 2 tests run if you use staging or use "http://bs-local.com:10120/manage-transit-movements/departures/local-reference-number" locally
#These 2 tests fails to recognise the page title
#sbt  -Dbrowserstack.os="iOS" -Dbrowserstack.osVersion="16.0" -Dbrowserstack.deviceName="iPhone 14 Pro" -Dbrowserstack.browser="Chrome" -Dbrowserstack.browserVersion="latest" -Dbrowserstack.realMobile="true" -Dbrowser="browserstack" -Denvironment=staging -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="iOS" -Dbrowserstack.osVersion="15.0" -Dbrowserstack.deviceName="iPhone XS" -Dbrowserstack.browser="Chrome" -Dbrowserstack.browserVersion="108" -Dbrowserstack.realMobile="true" -Dbrowser="browserstack" -Denvironment=staging -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'

#Android
#These 4 tests fail to move off the Auth Wizard
#sbt  -Dbrowserstack.os="Android" -Dbrowserstack.osVersion="13.0" -Dbrowserstack.deviceName="Google Pixel 7 Pro" -Dbrowserstack.browser="Chrome" -Dbrowserstack.browserVersion="latest" -Dbrowserstack.realMobile="true" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="Android" -Dbrowserstack.osVersion="13.0" -Dbrowserstack.deviceName="Google Pixel 7 Pro" -Dbrowserstack.browser="Chrome" -Dbrowserstack.browserVersion="108" -Dbrowserstack.realMobile="true" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="Android" -Dbrowserstack.osVersion="12.0" -Dbrowserstack.deviceName="Samsung Galaxy S22" -Dbrowserstack.browserName="Samsung" -Dbrowserstack.browserVersion="latest" -Dbrowserstack.realMobile="true" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'
#sbt  -Dbrowserstack.os="Android" -Dbrowserstack.osVersion="11.0" -Dbrowserstack.deviceName="Samsung Galaxy S21 Ultra" -Dbrowserstack.browser="Samsung" -Dbrowserstack.browserVersion="11.0" -Dbrowserstack.realMobile="true" -Dbrowser="browserstack" -Denvironment=local -Dbrowserstack.project="CTCT P5" -Dbrowserstack.build="Sprint 28" -Dbrowserstack.username=${browserStackUsername} -Dbrowserstack.key=${browserStackAutomateKey} 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunBrowserStack'

killall BrowserStackLocal
