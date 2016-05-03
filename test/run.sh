cd $(dirname $0)
cd ../project
mvn clean package
java -jar target/flags-rest-service-0.1.0.jar &
PID=$!
sleep 15
curl -s http://localhost:8084/flags > target/actual_flags.json
curl -s http://localhost:8084/flags/FR > target/actual_FR.json
curl -s http://localhost:8084/flags/fr/FR > target/actual_fr_FR.json
curl -s http://localhost:8084/flags/en/FR > target/actual_en_FR.json
kill -9 $PID

echo "Let's look at the actual results: `cat target/actual_flags.json`"
echo "And compare it to: `cat ../test/expected-flags.json`"
if diff -w ../test/expected-flags.json target/actual_flags.json
    then
        echo SUCCESS
        let ret=0
    else
        echo FAIL
        let ret=255
        exit $ret
fi

echo "Let's look at the actual results: `cat target/actual_FR.json`"
echo "And compare it to: `cat ../test/expected-FR.json`"
if diff -w ../test/expected-FR-en.json target/actual_FR.json
    then
        echo SUCCESS
        let ret=0
    else
        echo FAIL
        let ret=255
        exit $ret
fi

echo "Let's look at the actual results: `cat target/actual_fr_FR.json`"
echo "And compare it to: `cat ../test/expected-FR-fr.json`"
if diff -w ../test/expected-FR-fr.json target/actual_fr_FR.json
    then
        echo SUCCESS
        let ret=0
    else
        echo FAIL
        let ret=255
        exit $ret
fi

echo "Let's look at the actual results: `cat target/actual_en_FR.json`"
echo "And compare it to: `cat ../test/expected-FR-en.json`"
if diff -w ../test/expected-FR-en.json target/actual_en_FR.json
    then
        echo SUCCESS
        let ret=0
    else
        echo FAIL
        let ret=255
        exit $ret
fi


rm -rf target

exit
