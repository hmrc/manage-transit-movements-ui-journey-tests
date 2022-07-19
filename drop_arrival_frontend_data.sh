#!/usr/bin/env bash
{
  sleep 1
  echo "use manage-transit-movements-arrival-frontend"
  echo "db['user-answers'].drop()"
} | mongo
