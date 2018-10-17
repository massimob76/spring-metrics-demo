#!/usr/bin/env bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"

MY_IP_ADDRESS=$(ifconfig en0 | grep inet | grep -v inet6 | awk '{print $2}')

sed -e "s/HOST/$MY_IP_ADDRESS/g" $DIR/prometheus_template.yml > $DIR/prometheus.yml

docker-compose -f $DIR/docker-compose.yml up
