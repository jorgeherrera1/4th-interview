'use strict';

fourthInterviewApp.controller('appCtrl', ['$scope', function($scope) {
    $scope.appTitle = '4th Interview';
}]);

fourthInterviewApp.controller('skillCtrl', ['$scope', 'skillService', function($scope, skillService) {
    $scope.skills = skillService.listAllSkills();
}]);