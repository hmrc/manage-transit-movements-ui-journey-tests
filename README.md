
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

## Prerequisites
* Docker
    * [Ubuntu](https://docs.tax.service.gov.uk/mdtp-handbook/documentation/developer-set-up/install-docker.html#install-docker-ubuntu)
    * [macOS](https://docs.tax.service.gov.uk/mdtp-handbook/documentation/developer-set-up/install-docker.html#install-docker-macos)
* Docker compose
    * [Ubuntu](https://docs.tax.service.gov.uk/mdtp-handbook/documentation/developer-set-up/install-docker.html#install-the-docker-packages)
    * [macOS](https://formulae.brew.sh/formula/docker-compose) (Ensure the symlink step is followed so Docker can find the plugin)
* [Docker selenium grid](https://github.com/hmrc/docker-selenium-grid)
* [MongoDB](https://docs.tax.service.gov.uk/mdtp-handbook/documentation/developer-set-up/set-up-mongodb.html)

## How to run the journey tests
* Ensure that you have cloned docker-selenium-grid and have executed `./start.sh` to run the relevant containers
* Start the relevant services in service manager with either:
  * `sm2 --start CTC_TRADERS_P5_ACCEPTANCE` - for services in Post transition mode
  * `sm2 --start CTC_TRADERS_P5_ACCEPTANCE_TRANSITION` - for services in Transition mode
      * note - Post Transition services do not have prelodgement disabled (additional declaration type)


* Run Transition mode tests:
  * all tests with `./run_tests_for_transition.sh`
  * isolated tests with:
    * `./run_with_tags.sh DepartureTransition`
    * `./run_with_tags.sh ArrivalTransition`
    * `./run_with_tags.sh Cancellation`
    * `./run_with_tags.sh Unloading`
    * `./run_with_tags.sh Manage`


* Run Post Transition mode tests:
  * all tests with `./run_tests.sh`
  * isolated tests with:
    * `./run_with_tags.sh Departure`
    * `./run_with_tags.sh Arrival`
    * `./run_with_tags.sh Cancellation`
    * `./run_with_tags.sh Unloading`
    * `./run_with_tags.sh Manage`


* Run individual departure journey tests
  * Using the `./run_with_tags.sh` script you can add on the departure journey you want, eg:
    * `./run_with_tags.sh DepartureRouteDetails` or `./run_with_tags.sh DepartureRouteDetailsTransition`
    * The full list of runners can be found in `src/test/scala/uk/gov/hmrc/test/ui/cucumber/runner` whatever comes after the '`RunnerFor`' 
      can be appended to the `./run_with_tags.sh` script to run those tests



* To see the journey tests happening, navigate to `localhost:4444`

## Security Tests
Security testing is done through the `UITestJobBuilder` in `build-jobs`

## Accessibility Tests
Accessibility testing is also done through the `UITestJobBuilder`, and the report can be generated locally and in Jenkins by appending `testReport` when running the tests.

## Data Cleanup
`./drop_arrival_frontend_data.sh`, `./drop_departure_frontend_data.sh` and `./drop_unloading_frontend_data.sh` are cleanup scripts for dropping the `user-answers` collections in MongoDB.
