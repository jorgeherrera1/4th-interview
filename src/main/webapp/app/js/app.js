'use strict';

// Declare app level module which depends on filters, and services
angular.module('FourthInterview', ['FourthInterview.filters', 'FourthInterview.services', 'FourthInterview.directives', 'FourthInterview.controllers']).
  config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/view1', {templateUrl: 'partials/partial1.html', controller: 'MyCtrl1'});
    $routeProvider.when('/view2', {templateUrl: 'partials/partial2.html', controller: 'MyCtrl2'});
    $routeProvider.otherwise({redirectTo: '/view1'});
  }]);
