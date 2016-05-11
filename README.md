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

# Run Anywhere
![RunAnywhere](/screenshots/plateforme.png)

Flags REST Service apps run anywhere the JVM does. Deploy standalone, in an app server, on a Cloud or all of the above.

# Production URL (Example)

use cases:
* http://localhost:8084/countries return a list of countries (in English) [{"num":4,"alpha2":"AF","alpha3":"AFG","label":"Afghanistan"}, ...]
* http://localhost:8084/countries?lang=en return a list of countries (in English)
* http://localhost:8084/countries?lang=fr return a list of countries (in French)
* http://localhost:8084/fr return 200 OK and svg (French flag)
Errors cases:
* http://localhost:8084/countries?lang=fakecode return a list of countries (in English)
* http://localhost:8084/fakecode return 204 No Content

# License

BSD, See License.txt for details
