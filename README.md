Fork of Jersey 1.19.1

To build the server module use:

```
jenv exec ./mvnw install -pl jersey-server -am
```

Or the entire project:
```
jenv exec ./mvnw -Dmaven.test.skip=true -DlocalRepositoryPath=/tmp/jersey install
```
