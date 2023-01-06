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

package uk.gov.hmrc.test.ui.pages.Arrival.Incident

import uk.gov.hmrc.test.ui.pages.AddressPage

object IncidentAddressPage extends AddressPage {

  override def title(args: String*): String = "What is the address for the incident?"

  override val addressLine1: String = "1 Old Lane"
  override val addressLine2: String = "Hull"
  override val postalCode: String   = "H1 0AA"

}
