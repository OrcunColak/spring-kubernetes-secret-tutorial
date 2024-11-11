# Build-pack.io

The original idea is from  
https://boottechnologies-ci.medium.com/lab4-spring-boot-k8s-using-kubernetes-secrets-in-spring-boot-4a10d3c89623
Run

```
mvn spring-boot:build-image
```

Run

```
kubectl apply -f project.yaml
```

Go to
http://localhost:8080/api/greeting/greet

