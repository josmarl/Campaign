/* global SERVER */

'use strict';

app.controller('personaController', ['$scope', '$rootScope', '$http', function ($scope, $rootScope, $http) {
        $scope.headingTitle = "Persona List";
        $scope.personas = [];

        $scope.initialize = function () {
            $scope.loadData();
        };

        $scope.loadData = function () {
            $http({
                url: SERVER + "/persona/all",
                method: "GET"
            }).success(function (response) {
                $scope.personas = response;
            }).error(function (err) {
                console.log(err);
            });
        };

        $scope.initialize();

    }]);