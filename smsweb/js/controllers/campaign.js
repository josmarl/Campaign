/* global SERVER, ACTIVE */

'use strict';

app.controller('campaignController', ['$scope', '$rootScope', '$http', '$location', '$routeParams', function ($scope, $rootScope, $http, $location, $routeParams) {

        $scope.headingTitle = "Configuración de Campañas";
        $scope.campaigns = [];
        $scope.campaign = {};
        $scope.idCampaign = $routeParams.id;

        $scope.initialize = function () {
            $scope.loadData();
            if ($scope.idCampaign) {
                $scope.findCampaign();
            }
        };

        $scope.loadData = function () {
            $http({
                url: SERVER + "/campaign/all",
                method: "GET"
            }).success(function (response) {
                $scope.campaigns = response;
            }).error(function (err) {
                console.log(err);
            });
        };

        $scope.editCampaign = function (obj) {
            $http({
                url: SERVER + "/campaign/edit/" + obj.id,
                method: "GET"
            }).success(function (response) {
                $scope.loadData();
            }).error(function (err) {
                console.log(err);
            });
        };

        $scope.removeCampaign = function (obj) {
            $http({
                url: SERVER + "/campaign/remove/" + obj.id,
                method: "GET"
            }).success(function (response) {
                $scope.loadData();
            }).error(function (err) {
                console.log(err);
            });
        };

        $scope.findCampaign = function () {
            $http({
                url: SERVER + "/campaign/find/" + $scope.idCampaign,
                method: "GET"
            }).success(function (response) {
                $scope.campaign = response;
            }).error(function (err) {
                console.log(err);
            });
        };

        $scope.initialize();
    }]);


