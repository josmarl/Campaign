'use strict';
var app = angular.module('app', [
    'ngResource',
    'ngRoute',
]);
app.config(function ($routeProvider) {
    $routeProvider
            .when('/campaign', {
                templateUrl: 'views/campaign.html',
                controller: 'campaignController'
            })
            .when('/persona', {
                templateUrl: 'views/persona.html',
                controller: 'personaController'
            })
            .otherwise(
                    {redirectTo: '/'}
            );
});