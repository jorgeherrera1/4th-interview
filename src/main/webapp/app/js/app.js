'use strict';

var fourthInterviewApp = angular.module('fourthInterviewApp', [])
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/', {
            templateUrl: 'partials/quick-interview.html'
        });

        $routeProvider.when('/quick-interview', {
            templateUrl: 'partials/quick-interview.html'
        });

        $routeProvider.when('/candidates', {
            templateUrl: 'partials/candidates.html'
        });

        $routeProvider.when('/questions', {
            templateUrl: 'partials/questions.html'
        });

        $routeProvider.when('/skills', {
            templateUrl: 'partials/skills.html',
            controller: 'skillViewCtrl',
            resolve: {
                allSkills: ['$q', 'skillService', function($q, skillService) {
                    var deferred = $q.defer();

                    skillService.listAllSkills(function(data) {
                        deferred.resolve(data);
                    });

                    return deferred.promise;
                }]
            }
        });
    }]);
