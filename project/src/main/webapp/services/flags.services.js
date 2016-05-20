function FlagsServices($http, $rootScope) {
	return {
		getCountries : function(lang) {
			return $http({
				method : "get",
				url : "http://localhost:8084/flags/api/countries?lang=" + lang
			});
		},
		getFlag : function(countryAlpha2Code) {
			return "http://localhost:8084/flags/api/" + countryAlpha2Code;
		}
	};
};