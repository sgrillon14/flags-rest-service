# flags-rest-service

This REST Web service contains 241 countries complies with ISO 3166-1. The country name is available in seven languages (French,  English, ...). The Web service also included the 3 digit code of the country, the 2-letter code (used in many applications, including monetary applications ) and the 3-letter code.

For information, the information for country France , will be the following
* Code ISO 3166-1 numérique : 250
* Code ISO 3166-1 alpha2 : FR
* Code ISO 3166-1 alpha3 : FRA

# Supported languages

These are the currently supported languages

* Czech
* German
* English
* Spanish
* French
* Italian
* Dutch
	
Does flags-rest-service not support your language? Please help us with a PR!

# Travis CI status

[![Build Status][travis-image]][travis-url]
[travis-image]: https://travis-ci.org/sgrillon14/flags-rest-service.svg?branch=master
[travis-url]: https://travis-ci.org/sgrillon14/flags-rest-service

# Gitter chat
[![Join the chat at https://gitter.im/sgrillon14/flags-rest-service](https://badges.gitter.im/sgrillon14/flags-rest-service.svg)](https://gitter.im/sgrillon14/flags-rest-service?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

# Technology

* HTML
* CSS
* AngularJS 1
* AngularJS 2 in progress...
* Spring Boot <b style='color:red'>(Caution: This application use 1.4.0.BUILD-SNAPSHOT)</b>
* Spring Web
* SVG
* TestNG
* Travis CI

# Run Anywhere
![RunAnywhere](/screenshots/plateforme.png)

Flags REST Service apps run anywhere the JVM does. Deploy standalone, in an app server, on a Cloud or all of the above.

# Production URL (Example)

UX (AngularJS 1):
* http://localhost:8084/angular1/views/index.html

![sampleAngularjs1](/screenshots/sampleAngularjs1.png)

use cases:
* http://localhost:8084/flags/api/countries return a list of countries (in English) 
* http://localhost:8084/flags/api/countries?lang=en return a list of countries (in English)
* http://localhost:8084/flags/api/countries?lang=fr return a list of countries (in French)
* http://localhost:8084/flags/api/fr return 200 OK and svg (French flag)
* http://localhost:8084/flags/api/fr/40/40 return 200 OK and png (French flag)

Errors cases:
* http://localhost:8084/flags/api/countries?lang=fakecode return a list of countries (in English)
* http://localhost:8084/flags/api/fakecode return 204 No Content
* http://localhost:8084/flags/api/fakecode/40/40 return 204 No Content

UX (sample CORS with public_client in 8085 server):
* http://localhost:8085

![CORSOK](/screenshots/CORS_OK.png)

UX (sample CORS with public_client out 8085 server):
* http://localhost:xxxx

![CORSKO](/screenshots/CORS_KO.png)

# JSON response (Example)

[...,{"num":250,"alpha2":"FR","alpha3":"FRA","label":"France"},...]

# License

BSD, See License.txt for details
