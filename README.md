# Spring metrics demo

## Start Prometheus

Running for the root of the project:
```bash
PROMETHEUS_CONFIG_PATH=$(pwd)/prometheus.yml
docker run -d --name=prometheus -p 9090:9090 -v $PROMETHEUS_CONFIG_PATH:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml
```
