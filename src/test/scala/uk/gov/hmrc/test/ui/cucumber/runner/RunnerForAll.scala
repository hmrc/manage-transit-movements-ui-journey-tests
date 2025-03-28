/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.cucumber.runner

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("uk.gov.hmrc.test.ui.cucumber.stepdefs"),
  plugin = Array("pretty", "html:target/cucumber", "json:target/cucumber.json"),
  tags =
    "@departureGBe2e or @departureXIe2e or @departureGuaranteeDetails or @departurePreTaskList or @departureItemDetails or " +
      "@departureRouteDetails or @departureTraderDetails or @departureTransportDetails or @departureDocuments or " +
      "@arrivalE2e or @cancellation or @manageFrontEnd or @manageDraftDeparture or @unloading_remarks or @departureAmendment or @presentationNotification or @UnloadingCrossCheck"
)
class RunnerForAll {}
