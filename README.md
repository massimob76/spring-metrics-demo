# Grafana, Prometheus metrics demo

1. Make sure your application is running locally (http://localhost:8080/actuator/health)

2. Start up Prometheus and Grafana:
```bash
docker/start-prometheus-and-grafana.sh
```

3. Access Prometheus:
```bash
http://localhost:9090
```

4. Access Grafana dashboard:
```bash
http://localhost:3000/d/20clfkxmz/tsys-adapter-dashboard?refresh=5s&orgId=1
```