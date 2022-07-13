
This is the UI journey test repository for the following frontend services:
- manage-transit-movements-frontend
- manage-transit-movements-departure-frontend
- manage-transit-movements-arrivals-frontend
- manage-transit-movements-cancellation-frontend
- manage-transit-movements-unloading-frontend

# manage-transit-movements-ui-journey-tests
UI test suite for the CTC-Traders team using WebDriver and Cucumber.  

## How to run the journey tests
Tests can be run in Chrome or Firefox using a GUI or headless browser, either locally or in a docker container (described later).

### Journeys Covered

     Legacy enrolment
     Manage transit movements
     Cancellation journeys
     End to end journeys
     Normal declaration journeys

### Start service manager
For Departure and Cancellation tests run -

    sm --start CTC_TRADERS_DEPARTURE_ACCEPTANCE -r

For all other tests (Arrivals, Manage, Unloading) run -

    sm --start CTC_TRADERS_ALL_ACCEPTANCE -r


### Driver/Browser Config
All configuration of the browsers types we test with is handled by a dependency on the [HMRC Webdriver Factory library](https://github.com/hmrc/webdriver-factory)

We have configured a headless browser type by passing additional Chrome options in the Driver class and access this using the `-Dbrowsertype=headless` jvm option in the `~/run_headless.sh` script.

## Test execution
Run the appropriate shell script to run the full suites in a GUI browser
Append the below with _local, _zap, _jenkins, _a11y.

    ./run_departures_local.sh
    ./run_arrivals_local.sh
    ./run_cancellation_local.sh
    ./run_unloading_local.sh
    ./run_manage_local.sh
### Security Tests
Security tests are dependant on [HMRC Zap Automation library](https://github.com/hmrc/zap-automation) and configured to run using Zap 2.8.0.  
ZAP tests are configured to scan the request/response of the full suite of journey tests or a subsection but using the @tag.

### Jenkins
A monitor has been set up in the Phase5 space to give easy and clear visibility of the jenkins jobs available. All jobs are sutibially named.

[QA Jenkins monitor](https://build.tax.service.gov.uk/job/Common%20Transit%20Convention%20Traders%20Phase%205/view/QA%20Monitor/)



## Accessbility Tests
To support accessibility tests we can run the tests with an additional parameter which will force each page into a failure state, allowing us to capture the html of the error messages.

### Test execution

#### Jenkins
To run the accessibility tests on Jenkins run the build-jobs though the [QA Jenkins monitor](https://build.tax.service.gov.uk/job/Common%20Transit%20Convention%20Traders%20Phase%205/view/QA%20Monitor/). If you would like to run the accessibility job against your local test branch, build with paramaters and enter your branch.

#### Locally
    Accessibility tests cannot be run locally

### Config
* Extent: ~/src/test/resources/extent-config.xml
* Suites: ~/src/test/scala/suites/Runner.scala & Runner_WIP.scala
* Before: Setup test reports directory
* After:  Write report using junit source
* Frequency - Report written on suite execution

### Output
Reports are written to ~/target/test-reports/html-report/index.html

## Data Cleanup
Cleanup script to drop the 'user-answers' mongo collection.

`./drop_departure_frontend_data.sh`
`./drop_arrival_frontend_data.sh`

## Screenshots
Screenshot utility allowing screenshots to be taken on demand. This is available to use but not currently being called in any common steps.

### To use
Add `tryTakeScreenShot()` method to steps or page object where required

Add jvm option `-Dscreenshots=true` to `~/.run` scripts to capture screenshot

Screenshots are output to `~/target/screenshots` as a .png image

## Installing and running the tests in Docker

### Install Docker
* Linux: https://docs.docker.com/install/linux/docker-ce/ubuntu/ followed by
  https://docs.docker.com/install/linux/linux-postinstall/
* Mac (install docker desktop): https://docs.docker.com/docker-for-mac/install/

### Start service manager
For Departure tests run -

    sm --start CTC_TRADERS_DEPARTURE_ACCEPTANCE -r

For all other tests run -

    sm --start CTC_TRADERS_ALL_ACCEPTANCE -r

### Change to the docker/chrome directory

    cd $WORKSPACE/manage-transit-movements-acceptance-tests/docker/chrome/

### Build the chrome instance (including the . at the end)
*You only need to do this once:*

     docker build -t chrome .

### Start the Docker container

*This will map service manager, chrome and vnc viewer ports to a Docker alias on the container instance.*

`./rundocker.sh` or

`./rundocker.sh smenv`

**Note - Passing the "smenv" argument is required if you are running a service manager virtualenv.**

### Run the journey tests

    cd $WORKSPACE/manage-transit-movements-acceptance-tests
    ./run_departures_headless_remote.sh (runs in remote container using headless browser)
    ./run_cancellation_headless_remote.sh (runs in remote container using headless browser)
    ./run_manage_headless_remote.sh (runs in remote container using headless browser)
Or

    ./run_departures_jenkins.sh (runs in remote container using GUI browser)
    ./run_cancellation_jenkins.sh (runs in remote container using GUI browser)
    ./run_manage_jenkins.sh (runs in remote container using GUI browser)

### Connect to the VNC server (View running tests)

Connect to the image on `vnc://localhost:5900` with your favorite vnc client (if you're on a mac just use Safari)

When prompted for a password, enter: `secret`

### Updating selenium version

Edit  `~/docker/chrome/Dockerfile`

Update `FROM selenium/standalone-chrome-debug:<version>` to reflect [Selenium version](https://github.com/SeleniumHQ/docker-selenium/releases)

### Useful docker commands

    docker ps                                   # Lists all running containers
    docker stop $(docker ps -a -q)              # Stops all running containers
    docker exec -it <container id> /bin/bash    # Bash access to container


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