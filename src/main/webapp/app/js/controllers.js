'use strict';

fourthInterviewApp.controller('appCtrl', ['$scope', function($scope) {
    $scope.appTitle = '4th Interview';
}]);

fourthInterviewApp.controller('sideMenuCtrl', ['$scope', function($scope) {
    $scope.activeSideMenuItem = 'Quick Interview';

    $scope.isSideMenuItemActive = function(sideMenuItem) {
        return $scope.activeSideMenuItem == sideMenuItem;
    };
}]);

fourthInterviewApp.controller('skillCtrl', ['$scope', 'skillService', function($scope, skillService) {
    $scope.skills = skillService.listAllSkills();
}]);