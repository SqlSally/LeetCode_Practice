## MCIT 594

```bash
JAVA_HOME=`/usr/libexec/java_home -v 11` mvn clean compile exec:java -Dexec.mainClass="edu.upenn.cit594.Main" -Dexec.args="json test.txt states.csv output.log"
```

## Test

```bash
grep -i flu flu_tweets.txt
```
