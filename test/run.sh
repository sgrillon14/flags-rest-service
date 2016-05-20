cd $(dirname $0)
cd ../project
mvn clean package
java -jar target/flags-rest-service-0.1.0.jar &
PID=$!
sleep 15
curl -s http://localhost:8084/flags/api/countries > target/actual_countries.json
curl -s http://localhost:8084/flags/api/countries?lang=en > target/actual_countries_EN.json
curl -s http://localhost:8084/flags/api/countries?lang=fr > target/actual_countries_FR.json
kill -9 $PID

echo "Let's look at the actual results: `cat target/actual_countries.json`"
echo "And compare it to: `cat ../test/expected_countries_EN.json`"
if diff -w ../test/expected_countries_EN.json target/actual_countries.json
    then
        echo SUCCESS
        let ret=0
    else
        echo FAIL
        let ret=255
        exit $ret
fi

echo "Let's look at the actual results: `cat target/actual_countries_EN.json`"
echo "And compare it to: `cat ../test/expected_countries_EN.json`"
if diff -w ../test/expected_countries_EN.json target/actual_countries_EN.json
    then
        echo SUCCESS
        let ret=0
    else
        echo FAIL
        let ret=255
        exit $ret
fi

echo "Let's look at the actual results: `cat target/actual_countries_FR.json`"
echo "And compare it to: `cat ../test/expected_countries_FR.json`"
if diff -w ../test/expected_countries_FR.json target/actual_countries_FR.json
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
