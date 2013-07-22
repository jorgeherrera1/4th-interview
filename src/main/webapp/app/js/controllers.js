'use strict';

fourthInterviewApp.controller('appCtrl', ['$scope', '$http', function($scope, $http) {
    $scope.appTitle = '4th Interview';

    $scope.isWaitingForServer = function() {
        return $http.pendingRequests.length > 0;
    }
}]);

fourthInterviewApp.controller('sideMenuCtrl', ['$scope', function($scope) {
    $scope.activeSideMenuItem = 'Quick Interview';

    $scope.isSideMenuItemActive = function(sideMenuItem) {
        return $scope.activeSideMenuItem == sideMenuItem;
    };
}]);

fourthInterviewApp.controller('skillViewCtrl', ['$scope', 'allSkills', function($scope, allSkills) {
    $scope.allSkills = allSkills;
}]);