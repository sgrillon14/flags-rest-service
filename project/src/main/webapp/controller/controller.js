angular.module("FlagsApp", [])
.factory('FlagsServices',FlagsServices)
.controller("FlagsCtrl",
    function($scope, $rootScope, $sce, $timeout, $interval, $http, FlagsServices) {
	
        $scope.lang = "en";
		$scope.getCountries = function () {
	        FlagsServices.getCountries($scope.lang).then(
		    function (response) {
		        if (response.status == 200) {
		            $scope.countries = response.data;
		        }
		    });
		};
		$scope.getCountries($scope.lang);
		
		$scope.getFlag = function (countryAlpha2Code) {
			return FlagsServices.getFlag(countryAlpha2Code);
		};
		
		$scope.changeLang = function () {
			$scope.getCountries($scope.lang);
		};

});
		

		
