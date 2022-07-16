#!/usr/bin/env bash
# If you want to run the wip in headless mode execute './run_wip.sh headless'

if [ $1  =  headless ]
then
  sbt -Denvironment=local -Dbrowser=headless-chrome "testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunnerWip"
else
  sbt -Denvironment=local -Dbrowser=chrome "testOnly uk.gov.hmrc.test.ui.cucumber.runner.RunnerWip"
fi