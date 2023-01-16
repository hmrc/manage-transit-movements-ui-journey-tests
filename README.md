#This is the UI journey test repository for the following frontend services:
- manage-transit-movements-frontend
- manage-transit-movements-departure-frontend
- manage-transit-movements-arrivals-frontend
- manage-transit-movements-cancellation-frontend
- manage-transit-movements-unloading-frontend

## manage-transit-movements-ui-journey-tests
UI test suite for the CTC-Traders team using WebDriver and Cucumber.  

## How to run the journey tests
Tests can be run in Chrome or Firefox using a GUI or headless browser

### Journeys Covered
```
     Legacy enrolment
     Manage transit movements
     Cancellation journeys
     End to end journeys
     Normal declaration journeys
```

### Start service manager
For all tests run -

    `sm --start CTC_TRADERS_P5_ACCEPTANCE -r`

or if using service manager 2 run - 

    `sm2 --start CTC_TRADERS_P5_ACCEPTANCE`



### Driver/Browser Config
All configuration of the browsers types we test with is handled by a dependency on the [HMRC Webdriver Factory library](https://github.com/hmrc/webdriver-factory)

We have configured a headless browser type by passing additional Chrome options in the Driver class and access this using the `-Dbrowsertype=headless` jvm option in the `~/run_headless.sh` script.

## Test execution
Run the appropriate shell script to run the full suites in a GUI browser

#### Run all tests locally
Execute `./run_tests.sh`

#### Run tests for a specific service
For isolated run for particular frontend is the runner that takes tags - append the appropriate tag in the terminal
- Execute for Departures `./run_with_tags.sh Departure` or running headless `./run_with_tags.sh Departure headless`
- Execute for Arrivals `./run_with_tags.sh Arrival` or running headless `./run_with_tags.sh Arrival headless`
- Execute for Cancellation `./run_with_tags.sh Cancellation` or running headless `./run_with_tags.sh Cancellation headless`
- Execute for Unloading `./run_with_tags.sh Unloading` or running headless `./run_with_tags.sh Unloading headless`
- Execute for Manage `./run_with_tags.sh Manage` or running headless `./run_with_tags.sh Manage headless`

#### Run Work-In-Progress tests
-Execute `./run_wip.sh` or running headless `./run_wip.sh headless`

#### ZAP testing
-Execute `./run_zap_tests.sh`

#### Accessibility testing
- Execute `./run_a11y_tests.sh`

#### Drop database manually
- Execute `./drop_arrival_frontend_data.sh`
- Execute `./drop_departure_frontend_data.sh`
- Execute `./drop_unloading_frontend_data.sh`

### Security Tests
Security tests are dependant on [HMRC Zap Automation library](https://github.com/hmrc/zap-automation) and configured to run using Zap 2.8.0.  
ZAP tests are configured to scan the request/response of the full suite of journey tests or a subsection but using the @tag.

### Jenkins
A monitor has been set up in the Phase5 space to give easy and clear visibility of the jenkins jobs available. All jobs are sutibially named.

[QA Jenkins monitor](https://build.tax.service.gov.uk/job/Common%20Transit%20Convention%20Traders%20Phase%205/view/QA%20Monitor/)


#### Jenkins Accessibility Testing
To run the accessibility tests on Jenkins run the build-jobs though the [QA Jenkins monitor](https://build.tax.service.gov.uk/job/Common%20Transit%20Convention%20Traders%20Phase%205/view/QA%20Monitor/). If you would like to run the accessibility job against your local test branch, build with paramaters and enter your branch.

## Screenshots
Screenshot utility allowing screenshots to be taken on demand. This is available to use but not currently being called in any common steps.

### To use
Add `tryTakeScreenShot()` method to steps or page object where required

Add jvm option `-Dscreenshots=true` to `~/.run` scripts to capture screenshot

Screenshots are output to `~/target/screenshots` as a .png image

### Scalafmt
 This repository uses [Scalafmt](https://scalameta.org/scalafmt/), a code formatter for Scala. The formatting rules configured for this repository are defined within [.scalafmt.conf](.scalafmt.conf).

 To apply formatting to this repository using the configured rules in [.scalafmt.conf](.scalafmt.conf) execute:

 ```
 sbt scalafmtAll
 ```

 To check files have been formatted as expected execute:

 ```
 sbt scalafmtCheckAll scalafmtSbtCheck
 ```

[Visit the official Scalafmt documentation to view a complete list of tasks which can be run.](https://scalameta.org/scalafmt/docs/installation.html#task-keys)