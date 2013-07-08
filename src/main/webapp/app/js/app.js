'use strict';

var fourthInterviewApp = angular.module('fourthInterviewApp', ['ngResource'])
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {
            templateUrl: 'partials/quick-interview.html'
        });

        $routeProvider.when('/skills', {
            templateUrl: 'partials/skills.html',
            controller: 'skillCtrl'
        });

        $routeProvider.otherwise({redirectTo: '/'});
    }]);
