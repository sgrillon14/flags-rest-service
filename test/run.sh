cd $(dirname $0)
cd ../project
mvn clean package
java -jar target/flags-rest-service-0.1.0.jar &
PID=$!
sleep 15
curl -s http://localhost:8084/flags > target/actual.json
kill -9 $PID

echo "Let's look at the actual results: `cat target/actual.json`"
echo "And compare it to: `cat ../test/expected-first.json`"

if diff -w ../test/expected-first.json target/actual.json
    then
        echo SUCCESS
        let ret=0
    else
        echo FAIL
        let ret=255
        exit $ret
fi

rm -rf target

./gradlew clean build
java -jar build/libs/flags-rest-service-0.1.0.jar &
PID=$!
sleep 15
curl -s http://localhost:8084/flags > build/actual.json
kill -9 $PID

echo "Let's look at the actual results: `cat build/actual.json`"
echo "And compare it to: `cat ../test/expected-first.json`"

if diff -w ../test/expected-first.json build/actual.json
    then
        echo SUCCESS
        let ret=0
    else
        echo FAIL
        let ret=255
        exit $ret
fi

rm -rf build

exit
