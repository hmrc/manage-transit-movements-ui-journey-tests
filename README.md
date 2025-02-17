
# manage-transit-movements-ui-journey-tests

This is the UI journey test repository for the following frontend services:
- manage-transit-movements-frontend
- manage-transit-movements-departure-frontend
  - ctc-departure-trader-details-frontend
  - ctc-departure-route-details-frontend
  - ctc-departure-transport-details-frontend
  - ctc-departure-documents-frontend
  - ctc-departure-items-frontend
  - ctc-departure-guarantee-details-frontend
- manage-transit-movements-arrivals-frontend
- manage-transit-movements-cancellation-frontend
- manage-transit-movements-unloading-frontend
- ctc-presentation-notification-frontend
- ctc-guarantee-balance-frontend-v2

## Prerequisites
* Docker
    * [Ubuntu](https://docs.tax.service.gov.uk/mdtp-handbook/documentation/developer-set-up/install-docker.html#install-docker-ubuntu)
    * [macOS](https://docs.tax.service.gov.uk/mdtp-handbook/documentation/developer-set-up/install-docker.html#install-docker-macos)
* [MongoDB](https://docs.tax.service.gov.uk/mdtp-handbook/documentation/developer-set-up/set-up-mongodb.html)

## How to run the journey tests
* Start the relevant services in service manager with either:
  * `sm2 --start CTC_TRADERS_P5_ACCEPTANCE` - for services in Post transition mode
  * `sm2 --start CTC_TRADERS_GUARANTEE_BALANCE_ACCEPTANCE_V2` - for check guarantee balance service
  * `sbt -Dplay.http.router=testOnlyDoNotUseInAppConf.Routes run` - If running frontends or customs-reference-data service locally with sbt, make sure you run them in test only mode


* Run tests:
  * all tests with `./run_tests.sh`
  * isolated tests with:
    * `./run_with_tags.sh Departure`
    * `./run_with_tags.sh Arrival`
    * `./run_with_tags.sh Cancellation`
    * `./run_with_tags.sh Unloading`
    * `./run_with_tags.sh Manage`

* Run Check Guarantee Balance tests:
  * isolated test with `./run_with_tags.sh GetGuaranteeBalance`


* Run individual departure journey tests
  * Using the `./run_with_tags.sh` script you can add on the departure journey you want, eg:
    * `./run_with_tags.sh DepartureRouteDetails`
    * The full list of runners can be found in `src/test/scala/uk/gov/hmrc/test/ui/cucumber/runner` whatever comes after the '`RunnerFor`' 
      can be appended to the `./run_with_tags.sh` script to run those tests



* To view the tests running in a browser, add `-Dbrowser.option.headless=false` to the relevant `sbt` command.

## Security Tests
Security testing is done through the `UITestJobBuilder` in `build-jobs`

## Accessibility Tests
Accessibility testing is also done through the `UITestJobBuilder`, and the report can be generated locally and in Jenkins by appending `testReport` when running the tests.

## Data Cleanup
`./drop_arrival_frontend_data.sh`, `./drop_departure_frontend_data.sh` and `./drop_unloading_frontend_data.sh` are cleanup scripts for dropping the `user-answers` collections in MongoDB.
