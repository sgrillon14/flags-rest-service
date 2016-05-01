cd $(dirname $0)
cd ../../..

mvn clean compile
ret=$?
if [ $ret -ne 0 ]; then
exit $ret
fi
rm -rf target

./gradlew compileJava
ret=$?
if [ $ret -ne 0 ]; then
exit $ret
fi
rm -rf build

cd ../../..
mvn clean package
java -jar target/flags-rest-service-0.1.0.jar &
PID=$!
sleep 10
curl -s http://localhost:8084/flags > target/actual.json
kill -9 $PID

echo "Let's look at the actual results: `cat target/actual.json`"
echo "And compare it to: `cat ../test/expected.json`"

if diff -w ../src/test/resources/expected.json target/actual.json
    then
        echo SUCCESS
        let ret=0
    else
        echo FAIL
        let ret=255
        exit $ret
fi

rm -rf target

./gradlew build
ret=$?
if [ $ret -ne 0 ]; then
exit $ret
fi

rm -rf build
exit