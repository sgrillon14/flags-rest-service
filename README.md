# flags-rest-service

This REST Web service contains 241 countries complies with ISO 3166-1. The country name is available in several languages (French and English for now). The Web service also included the 3 digit code of the country, the 2-letter code (used in many applications, including monetary applications ) and the 3-letter code.


For information, the information for country France , will be the following
* Code ISO 3166-1 numérique : 250
* Code ISO 3166-1 alpha2 : FR
* Code ISO 3166-1 alpha3 : FRA

# Travis CI status

[![Build Status][travis-image]][travis-url]
[travis-image]: https://travis-ci.org/sgrillon14/flags-rest-service.svg?branch=master
[travis-url]: https://travis-ci.org/sgrillon14/flags-rest-service


# Technology

* HTML
* CSS
* AngularJS 1
* Spring Boot
* Spring Web
* SVG

# Production URL (Example)

* http://localhost:8084/flags return a list of countries (in English)
* http://localhost:8084/flags/250 return {"num":250,"alpha2":"FR","alpha3":"FRA","svg":"..."}
* http://localhost:8084/flags/FR return {"num":250,"alpha2":"FR","alpha3":"FRA","svg":"..."}
* http://localhost:8084/flags/FRA return {"num":250,"alpha2":"FR","alpha3":"FRA","svg":"..."}

# License

BSD, See License.txt for details
