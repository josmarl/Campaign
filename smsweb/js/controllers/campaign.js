'use strict';

app.controller('campaignController', ['$scope', '$rootScope', '$http', function ($scope, $rootScope, $http) {
        $scope.headingTitle = "Campaign List";
        $scope.campaigns = [];

        $scope.initialize = function () {
            $scope.loadData();
        };

        $scope.loadData = function () {
            $http({
                url: "http://localhost:8082/campaign/all",
                method: "GET"
            }).success(function (response) {
                $scope.campaigns = response;
            }).error(function (err) {
                console.log(err);
            });
        };

        $scope.initialize();

    }]);