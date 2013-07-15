'use strict';

fourthInterviewApp.controller('appCtrl', function($scope) {
    $scope.appTitle = '4th Interview';
});

fourthInterviewApp.controller('skillCtrl', function($scope, skillService) {
    $scope.skills = skillService.listAllSkills();
});