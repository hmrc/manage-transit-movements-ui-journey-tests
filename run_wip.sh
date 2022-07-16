#!/usr/bin/env bash
  sbt -Denvironment=local -Dbrowser=chrome "testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunnerWip"

