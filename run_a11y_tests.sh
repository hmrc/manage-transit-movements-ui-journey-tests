#!/usr/bin/env bash
sbt -Dbrowser=remote-chrome -Da11y=true -Denvironment=local 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunnerA11y'
