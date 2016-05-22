angular.module("FlagsApp", ['pascalprecht.translate', 'ngSanitize'])
.config(["$translateProvider", function($translateProvider) {
    $translateProvider.useLoader('$translatePartialLoader', {
        urlTemplate: '{part}_{lang}.json'
    });
    $translateProvider.useSanitizeValueStrategy('escape');
}])
.factory('FlagsServices',FlagsServices)
.controller("FlagsCtrl",
    function($scope, $rootScope, $translate, $translatePartialLoader, $sce, $timeout, $interval, $http, FlagsServices) {
	
		$scope.language = "en";
		$translatePartialLoader.addPart("../i18n/lang");
	    $translate.refresh();
	    $translate.use($scope.language);
        
		$scope.getCountries = function () {
	        FlagsServices.getCountries($scope.language).then(
		    function (response) {
		        if (response.status == 200) {
		            $scope.countries = response.data;
		        }
		    });
		};
		$scope.getCountries($scope.language);
		
		$scope.getFlag = function (countryAlpha2Code) {
			return FlagsServices.getFlag(countryAlpha2Code);
		};
		
		$scope.changeLang = function () {
			$translate.use($scope.language);
			$scope.getCountries($scope.language);
		};

});
		

		
