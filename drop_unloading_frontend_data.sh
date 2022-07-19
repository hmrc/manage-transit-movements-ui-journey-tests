#!/usr/bin/env bash
{
  sleep 1
  echo "use manage-transit-movements-unloading-frontend"
  echo "db['user-answers'].drop()"
} | mongo
