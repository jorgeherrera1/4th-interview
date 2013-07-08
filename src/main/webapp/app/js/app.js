'use strict';

var fourthInterviewApp = angular.module('fourthInterviewApp', ['ngResource'])
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {
            templateUrl: 'partials/quick-interview.html'
        });

        $routeProvider.when('/tags', {
            templateUrl: 'partials/tags.html',
            controller: 'tagCtrl',
            resolve: {
                tags: function($q) {
                    var deferred = $q.defer();
                    var successCallback = function() {
                        deferred.resolve();
                    };
                }
            }
        });

        $routeProvider.otherwise({redirectTo: '/'});
    }]);
