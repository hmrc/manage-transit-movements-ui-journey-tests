#!/usr/bin/env bash

sbt -Denvironment=local -Dbrowser=chrome -Dbrowser.option.headless=false "testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunnerWip"