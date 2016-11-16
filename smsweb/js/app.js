'use strict';
var app = angular.module('app', [
    'ngResource',
    'ngRoute',
]);

var SERVER = 'http://localhost:8082';
var ACTIVE = '1';
var INACTIVE = '0';
app.config(['$routeProvider', '$locationProvider', function ($routeProvider, $locationProvider) {
        $routeProvider
                .when('/campaign', {
                    templateUrl: 'views/campaign/campaign.html',
                    controller: 'campaignController'
                })
                .when('/campaign/edit/:id', {
                    templateUrl: 'views/campaign/campaign_edit.html',
                    controller: 'campaignController',
                    method:'findCampaign'
                })
                .when('/persona', {
                    templateUrl: 'views/persona.html',
                    controller: 'personaController'
                })
                .otherwise({redirectTo: '/'});


    }]);
