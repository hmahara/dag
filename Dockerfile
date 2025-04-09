FROM registry.access.redhat.com/ubi8/openjdk-21
COPY target/dag-1.0.0-runner.jar/ /deployments/
ENTRYPOINT ["java", "-jar", "/deployments/dag-1.0.0-runner.jar"]
